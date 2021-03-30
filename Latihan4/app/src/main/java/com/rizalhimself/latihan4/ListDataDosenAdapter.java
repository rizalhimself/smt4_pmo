package com.rizalhimself.latihan4;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListDataDosenAdapter extends RecyclerView.Adapter<ListDataDosenAdapter.MyHolder>{
    private Context context;
    ArrayList<String> mFoto = new ArrayList<>();
    ArrayList<String> mNama = new ArrayList<>();
    ArrayList<String> mAlamat = new ArrayList<>();
    ArrayList<String> mEmail = new ArrayList<>();

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class MyHolder extends RecyclerView.ViewHolder {
        ImageView ivFoto;
        TextView tvNama, tvAlamat, tvEmail;
        RelativeLayout lyListDosen;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
            ivFoto= itemView.findViewById(R.id.ivFoto);
            tvNama=itemView.findViewById(R.id.tvNama);
            tvAlamat=itemView.findViewById(R.id.tvAlamat);
            tvEmail=itemView.findViewById(R.id.tvEmail);
            lyListDosen=itemView.findViewById(R.id.lyListDosen);
        }
    }
}
