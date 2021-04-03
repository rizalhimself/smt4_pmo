package com.rizalhimself.latihan4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ListDataDosenAdapter extends RecyclerView.Adapter<ListDataDosenAdapter.MyHolder> {
    private final Context context;
    ArrayList<String> mFoto = new ArrayList<>();
    ArrayList<String> mNama = new ArrayList<>();
    ArrayList<String> mAlamat = new ArrayList<>();
    ArrayList<String> mEmail = new ArrayList<>();

    public ListDataDosenAdapter(Context context, ArrayList<String> mFoto, ArrayList<String> mNama, ArrayList<String> mAlamat, ArrayList<String> mEmail) {
        this.context = context;
        this.mFoto = mFoto;
        this.mNama = mNama;
        this.mAlamat = mAlamat;
        this.mEmail = mEmail;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_data_dosen, parent, false);
        MyHolder holder = new MyHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        Glide.with(context).asBitmap().load(mFoto.get(position)).error(R.drawable.ic_android_black_24dp).into(holder.ivFoto);
        holder.tvNama.setText(mNama.get(position));
        holder.tvAlamat.setText(mAlamat.get(position));
        holder.tvEmail.setText(mEmail.get(position));
        holder.lyListDosen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, mNama.get(position), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return mNama.size();
    }

    class MyHolder extends RecyclerView.ViewHolder {
        ImageView ivFoto;
        TextView tvNama, tvAlamat, tvEmail;
        RelativeLayout lyListDosen;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
            ivFoto = itemView.findViewById(R.id.ivFoto);
            tvNama = itemView.findViewById(R.id.tvNama);
            tvAlamat = itemView.findViewById(R.id.tvAlamat);
            tvEmail = itemView.findViewById(R.id.tvEmail);
            lyListDosen = itemView.findViewById(R.id.lyListDosen);
        }
    }
}
