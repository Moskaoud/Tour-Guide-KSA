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
public class MountArafatFragment extends Fragment {


    public MountArafatFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mount_arafat, container, false);
        ArrayList<KSAData> ksaData = new ArrayList<>();
        ksaData.add(new KSAData(R.drawable.arafat1, getActivity().getString(R.string.m1)));
        ksaData.add(new KSAData(R.drawable.arafat2, getActivity().getString(R.string.m2)));
        ksaData.add(new KSAData(R.drawable.arafat3, getActivity().getString(R.string.m3)));
        ksaData.add(new KSAData(R.drawable.arafat4, getActivity().getString(R.string.m4)));

        MyFragmentAdapter mountAfafatFA = new MyFragmentAdapter(view.getContext(), ksaData);
        ListView mountAfafatLV = view.findViewById(R.id.mount_arafat);
        mountAfafatLV.setAdapter(mountAfafatFA);

        return view;
    }

}
