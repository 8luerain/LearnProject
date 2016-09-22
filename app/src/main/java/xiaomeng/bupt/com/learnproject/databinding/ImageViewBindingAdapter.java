package xiaomeng.bupt.com.learnproject.databinding;

import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Project: LearnProject.
 * Data: 2016/9/22.
 * Created by 8luerain.
 * Contact:<a href="mailto:8luerain@gmail.com">Contact_me_now</a>
 */

public class ImageViewBindingAdapter {
    @BindingAdapter({"app:image_url", "app:place_holder"})
    public static void loadToImageView(ImageView imageView, String imageUrl, Drawable placeHolderDrawable) {
        Glide.with(imageView.getContext()).load(imageUrl).crossFade().placeholder(placeHolderDrawable).into(imageView);
    }
}
