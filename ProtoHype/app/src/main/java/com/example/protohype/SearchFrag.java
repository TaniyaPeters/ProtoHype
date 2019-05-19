package com.example.protohype;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.InputStream;
import java.util.Scanner;


public class SearchFrag extends Fragment implements View.OnClickListener {

    private DatabaseReference mDatabase;
    JSONObject jsonDatabase;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_search, container, false);
        Button searchButton = v.findViewById(R.id.search_button);
        searchButton.setOnClickListener(this);

        Context context = this.getContext();
        InputStream inputStream = context.getResources().openRawResource(R.raw.database);
        String jsonString = new Scanner(inputStream).useDelimiter("\\A").next();

        try{
            jsonDatabase = new JSONObject(jsonString);
        }
        catch(JSONException e){
            Log.w("Creating JSON", "Failed");
        }

        return v;

    }

    @Override
    public void onClick(View v){


    }
}

