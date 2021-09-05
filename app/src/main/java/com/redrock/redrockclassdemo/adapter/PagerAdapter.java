package com.redrock.redrockclassdemo.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.redrock.redrockclassdemo.R;

import java.util.ArrayList;

/**
 * Author by OkAndGreat，Date on 2021/9/5.
 */
public class PagerAdapter extends RecyclerView.Adapter<PagerAdapter.InnerHolder> {
    private ArrayList<Character> data;

    public PagerAdapter(ArrayList<Character> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public PagerAdapter.InnerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new InnerHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_vp, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PagerAdapter.InnerHolder holder, int position) {
        holder.textView.setText(data.get(position).toString());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class InnerHolder extends RecyclerView.ViewHolder {
        private TextView textView;

        public InnerHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv_vp2);
        }
    }
}
