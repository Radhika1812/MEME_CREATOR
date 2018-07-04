package com.example.shree1.myapplication;
import android.os.Bundle;
import  android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
public class bottomPictureFragment extends Fragment {
    private static TextView textView3;
    private static TextView textView4;


    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(                      //this is the method to say this is what layout we are using for this fragment
                R.layout.bottom_picture_fragment, container, false            //to refer to xml file
        );
        textView3=(TextView)view.findViewById(R.id.textView3);
        textView4=(TextView)view.findViewById(R.id.textView4);
        return view;

    }

    public static void setMemeText(String top, String bottom)
    {
        textView3.setText(top);
        textView4.setText(bottom);

    }
    }

