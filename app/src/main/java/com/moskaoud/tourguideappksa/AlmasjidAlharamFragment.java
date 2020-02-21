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
public class AlmasjidAlharamFragment extends Fragment {


    public AlmasjidAlharamFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_almasjid_alharam, container, false);
        ArrayList<KSAData> ksaData = new ArrayList<>();
        ksaData.add(new KSAData(R.drawable.almasjidalharam1, getActivity().getString(R.string.mh1)));
        ksaData.add(new KSAData(R.drawable.almasjidalharam2, getActivity().getString(R.string.mh2)));
        ksaData.add(new KSAData(R.drawable.almasjidalharam3, getActivity().getString(R.string.mh3)));
        MyFragmentAdapter almasjidAlharamFA = new MyFragmentAdapter(view.getContext(), ksaData);
        ListView almasjidAlharamLV = view.findViewById(R.id.almasjid_alharam_listview);
        almasjidAlharamLV.setAdapter(almasjidAlharamFA);
        return view;
    }
}
