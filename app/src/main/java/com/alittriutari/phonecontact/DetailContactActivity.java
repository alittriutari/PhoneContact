package com.alittriutari.phonecontact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

public class DetailContactActivity extends AppCompatActivity {
    @BindView(R.id.ivProfile)
    ImageView imgContact;
    @BindView(R.id.txtName)
    TextView txtName;
    @BindView(R.id.tvNumber)
    TextView txtNumber;
    @BindView(R.id.ivFvorite)
    ImageView imgFavorite;

    FavoriteDatabase favoriteDatabase;
    Contact contactEntity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_contact);

        ButterKnife.bind(this);

        Intent i = getIntent();
        String name = i.getStringExtra("name");
        String image = i.getStringExtra("image");
        String number = i.getStringExtra("number");
        txtName.setText(name);
        txtNumber.setText(number);
        Glide.with(DetailContactActivity.this).load(image).into(imgContact);

        favoriteDatabase = DatabaseHelper.getFavoriteDatabase(getApplicationContext());
        favoriteById = favoriteDatabase.contactDao().getById(contactEntity.getId());
        if (contactEntity.isFavorite()){
            imgFavorite.setImageResource(R.drawable.favorite);
        }else {
            imgFavorite.setImageResource(R.drawable.favorite_outline);
        }

        imgFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean fav = false;
                if (contactEntity == null){

                }

            }
        });
    }

}
