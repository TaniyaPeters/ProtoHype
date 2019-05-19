package com.example.protohype;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class SettingsFrag extends Fragment implements View.OnClickListener {

    private FirebaseAuth mAuth;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_settings, container, false);

        // Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();

        Button logoutButton = v.findViewById(R.id.sign_out_button);
        logoutButton.setOnClickListener(this);

        Button profileButton = v.findViewById(R.id.sign_out_button);
        profileButton.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.sign_out_button:
                mAuth.signOut();
                startActivity(new Intent(getActivity(), MainActivity.class));
                getActivity().finish();
                break;
            case R.id.view_profile_button:
                mAuth.signOut();
                startActivity(new Intent(getActivity(), PersonalActivity.class));
                getActivity().finish();
                break;
        }
    }
}
