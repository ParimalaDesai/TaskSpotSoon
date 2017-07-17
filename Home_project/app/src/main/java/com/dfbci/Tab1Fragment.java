package com.dfbci;



import android.support.v4.app.Fragment;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


public class Tab1Fragment extends Fragment {

    // TODO: Rename and change types and number of parameters
    public static Tab1Fragment newInstance() {
        Tab1Fragment fragment = new Tab1Fragment();

        return fragment;
    }

    private ListView listView;
    private String names[] = {
            "Video1",
            "Video2",
            "Video3",
            "Video4",
            "Video5",
            "Video6",
            "Video7",
            "Video8"
    };

    private String desc[] = {
            "EMPTINESS FT.JUSTIN TIBLEKAR",
            "I'M FALLING LOVE WITH YOU",
            "BABY FT.JUSTIN BABER",
            "EMPTINESS FT.JUSTIN TIBLEKAR",
            "I'M FALLING LOVE WITH YOU",
            "BABY FT.JUSTIN BABER",
            "EMPTINESS FT.JUSTIN TIBLEKAR",
            "I'M FALLING LOVE WITH YOU",
            "BABY FT.JUSTIN BABER",

    };


    private Integer imageid[] = {
            R.drawable.pic11,
            R.drawable.pic11,
            R.drawable.pic11,
            R.drawable.pic11,
            R.drawable.pic11,
            R.drawable.pic11,
            R.drawable.pic11,
            R.drawable.pic11
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View myFragmentView = inflater.inflate(R.layout.fragment_tab1, container, false);




        CustomList customList = new CustomList(getActivity(), names, desc, imageid);

        listView = (ListView) myFragmentView.findViewById(R.id.listView);
        listView.setAdapter(customList);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getActivity(),"You Clicked "+names[i],Toast.LENGTH_SHORT).show();
            }
        });

        return myFragmentView;
    }



   /* @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/
}

