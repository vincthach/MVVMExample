package com.example.thachnguyenit.mvvmexample.databinding;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by thachnguyenit on 1/8/17.
 */
public class ImageBindingUtil {
    @BindingAdapter("image_url")
    public static void loadImage(ImageView imageView, String url) {
        if (url != null) {
            Glide.with(imageView.getContext()).load(url).into(imageView);
        }
    }
}
