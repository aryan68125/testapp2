package com.aditya.testapp;


import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.ListFragment;

public class fragment2 extends ListFragment {

    String[] AndroidApps = new String[] //string array
            {
                    "Microsoft",
                    "Macintosh",
                    "Linux",
                    "IOS",
                    "Android",
                    "Solaris"
            };

    String[] Discription = new String[]
            {
                    "Tatti os built by billgates",
                    "Derived from UNIX Most productive Os on this planet I Love it but expensive",
                    "Most productive Os that is for free to use I love it but difficult to operate for beginners",
                    "Derived from macOs",
                    "Derived from linux and just like linux its open source",
                    "Unix based systems used in servers with databases where high security is needed"
            };


    public fragment2() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState )
    {   //this adapter will pass the data to the lisview
        View view = inflater.inflate(R.layout.fragment_fragment2, container, false);
        ArrayAdapter<String> adapter  = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, AndroidApps);
        setListAdapter(adapter);
        return view;
    }

    // setting up on click listener on the list of items in the fragment 2
    @Override
    public void onListItemClick(ListView listView, View view, int position, long id)
    {
        fragment1 txt = (fragment1) getFragmentManager().findFragmentById(R.id.fragment1);
        txt.change(AndroidApps[position], "Verson : "+Discription[position]);
        getListView().setSelector(android.R.color.holo_blue_dark);
    }

}
