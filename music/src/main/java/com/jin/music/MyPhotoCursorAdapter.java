package com.jin.music;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

class ViewHolder {
    @BindView(R.id.image_view)
    ImageView imageView;
    @BindView(R.id.title_text_view)
    TextView titleTextView;
    @BindView(R.id.artist_text_view)
    TextView artistTextView;

    ViewHolder(View view) {
        ButterKnife.bind(this, view);
    }
}
