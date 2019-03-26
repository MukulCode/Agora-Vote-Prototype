package com.example.agoravoteprototype;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class DashboardFragment extends Fragment {


    Button create_election_btn;
    TextView pending_txtview, active_txtview,finished_txtview,total_txtview;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_dashboard,null);
        pending_txtview=(TextView)v.findViewById(R.id.pending_txtview);
        active_txtview=(TextView)v.findViewById(R.id.active_txtview);
        finished_txtview=(TextView)v.findViewById(R.id.finished_txtview);
        total_txtview=(TextView)v.findViewById(R.id.total_txtview);
        create_election_btn=(Button)v.findViewById(R.id.create_election_btn);
        create_election_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),Election1.class);
                startActivity(intent);
            }
        });
        pending_txtview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentpending=new Intent(getActivity(),PendingElections.class);
                startActivity(intentpending);
            }
        });
        active_txtview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentactive=new Intent(getActivity(),ActiveElections.class);
                startActivity(intentactive);
            }
        });
        finished_txtview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentfinished=new Intent(getActivity(),FinishedElections.class);
                startActivity(intentfinished);
            }
        });
        total_txtview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenttotal =new Intent(getActivity(),TotalElections.class);
                startActivity(intenttotal);
            }
        });

        return v;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



            }


}
