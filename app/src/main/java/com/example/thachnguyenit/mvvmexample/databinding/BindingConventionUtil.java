package com.example.thachnguyenit.mvvmexample.databinding;

import android.databinding.BindingConversion;

/**
 * Created by thachnguyenit on 1/8/17.
 */

public class BindingConventionUtil {
    public enum MyColor {RED, WHITE, BLACK};

    @BindingConversion
    public static int convertMyColor(MyColor myColor) {
        if (myColor.equals(MyColor.RED)) {
            return android.R.color.holo_red_dark;
        }
        if (myColor.equals(MyColor.WHITE)) {
            return android.R.color.white;
        }
        if (myColor.equals(MyColor.BLACK)) {
            return android.R.color.black;
        }
        return android.R.color.darker_gray;
    }
}
