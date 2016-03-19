package isaacbmota.reader.com;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //Creating a fake array strings
        String[] data = {
                "Aula 01: Getting Started!",
                "Aula 02: How to install Android Studio",
                "Aula 03: How to create a new project on Android Studio",
                "Aula 04: What is an Activity and Fragment?",
                "Aula 05: How to create the User interface of my Android app?"
        };

        // Creating a list (Arraylist) with the above data
        List<String> listOfLastPosts = new ArrayList<String>(Arrays.asList(data));

        //Now that we got the data we want to. Let's create an Adapter (ArrayAdapter)
        ArrayAdapter<String> listOfLastPostsAdapter = new ArrayAdapter<String>(
            getActivity(), //Actual context
            R.layout.list_item_last_posts, // Layout file of each item
            R.id.list_item_post_title_textview, //The ID field to be filled
            listOfLastPosts //Source
        );

        //inflamos o layout principal
        View rootView = inflater.inflate(R.layout.fragment_main2,container,false);

        //Creating a reference to ListView
        ListView listView = (ListView) rootView.findViewById(R.id.list_last_posts);
        listView.setAdapter(listOfLastPostsAdapter);

        // Returning everything

        return rootView;
    }
}

