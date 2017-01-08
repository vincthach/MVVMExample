package com.example.thachnguyenit.mvvmexample.databinding;

import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by thachnguyenit on 1/8/17.
 */
public class ImageBindingUtil {
    @BindingAdapter({"image_url","place_holder"})
    public static void loadImage(ImageView imageView, String url, Drawable drawable) {
        if (url != null) {
            Glide.with(imageView.getContext()).load(url).placeholder(drawable).into(imageView);
        }
    }
}
