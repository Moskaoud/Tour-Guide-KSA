package com.moskaoud.tourguideappksa;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class OthersFragment extends Fragment {


    public OthersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_others, container, false);
        ArrayList<KSAData> ksaData = new ArrayList<>();
        ksaData.add(new KSAData(R.drawable.kabaa1, getActivity().getString(R.string.o1)));
        ksaData.add(new KSAData(R.drawable.kabaa2, getActivity().getString(R.string.o2)));
        ksaData.add(new KSAData(R.drawable.kabaa3, getActivity().getString(R.string.o3)));
        ksaData.add(new KSAData(R.drawable.ebrahim, getActivity().getString(R.string.o4)));
        MyFragmentAdapter othersFA = new MyFragmentAdapter(view.getContext(), ksaData);
        ListView othersLV = view.findViewById(R.id.other);
        othersLV.setAdapter(othersFA);
        return view;
    }

}
