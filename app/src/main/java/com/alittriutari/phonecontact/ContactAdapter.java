package com.alittriutari.phonecontact;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnItemClick;
import de.hdodenhof.circleimageview.CircleImageView;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {
    private ArrayList<ContactModel> listContact;
    private Context ctx;


    public ContactAdapter(Context ctx,ArrayList<ContactModel> dataList) {
        this.ctx=ctx;
        this.listContact = dataList;
    }

    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact, parent, false);
        return new ContactViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position) {
        ContactModel contact = listContact.get(position);
        Glide.with(holder.itemView.getContext())
                .load(contact.getImage())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgContact);
        holder.txtName.setText(contact.getName());
        holder.contact = contact;
    }

    @Override
    public int getItemCount() {
        return listContact.size();
    }

    public class ContactViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.imgContact)
        CircleImageView imgContact;
        @BindView(R.id.txtName)
        TextView txtName;
        ContactModel contact ;
        public ContactViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
//                    Log.d("Image", contact.getImage());
                    Intent intent = new Intent(ctx,DetailContactActivity.class);
                    intent.putExtra("name",contact.getName());
                    intent.putExtra("image",contact.getImage());
                    intent.putExtra("number",contact.getNumber());
                    ctx.startActivity(intent);
                }
            });
        }
    }
}
