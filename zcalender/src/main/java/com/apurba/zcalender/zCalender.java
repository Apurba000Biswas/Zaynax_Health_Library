package com.apurba.zcalender;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

public class zCalender extends LinearLayout {
    public zCalender(Context context) {
        super(context);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.z_calender, this);
    }


}
