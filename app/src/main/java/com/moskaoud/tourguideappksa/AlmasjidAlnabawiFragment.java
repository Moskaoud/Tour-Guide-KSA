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
public class AlmasjidAlnabawiFragment extends Fragment {


    public AlmasjidAlnabawiFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_almasjid_alnabawi, container, false);
        ArrayList<KSAData> ksaData = new ArrayList<>();
        ksaData.add(new KSAData(R.drawable.masjidalnabawi1, getActivity().getString(R.string.mn1)));
        ksaData.add(new KSAData(R.drawable.masjidalnabawi2, getActivity().getString(R.string.mn2)));
        ksaData.add(new KSAData(R.drawable.masjidalnabawi3, getActivity().getString(R.string.mn3)));
        ksaData.add(new KSAData(R.drawable.masjidalnabawi4, getActivity().getString(R.string.mn4)));
        ksaData.add(new KSAData(R.drawable.masjidalnabawi5, getActivity().getString(R.string.mn5)));
        ksaData.add(new KSAData(R.drawable.masjidalnabawi6, getActivity().getString(R.string.mn6)));
        ksaData.add(new KSAData(R.drawable.masjidalnabawi7, getActivity().getString(R.string.mn7)));

        MyFragmentAdapter almasjidAlnabawiFA = new MyFragmentAdapter(view.getContext(), ksaData);
        ListView almasjidAlnabawiLV = view.findViewById(R.id.almasjid_alnabawi_listview);
        almasjidAlnabawiLV.setAdapter(almasjidAlnabawiFA);
        return view;
    }

}
