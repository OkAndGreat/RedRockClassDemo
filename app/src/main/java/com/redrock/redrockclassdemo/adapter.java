package com.redrock.redrockclassdemo;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

/**
 * Author by OkAndGreat，Date on 2021/9/3.
 */
public class adapter extends RecyclerView.Adapter<adapter.InnerHolder> {
    private ArrayList<fruit> data;

    public adapter(ArrayList<fruit> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public adapter.InnerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new InnerHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv, parent, false));
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull adapter.InnerHolder holder, int position) {
        holder.tvFruitName.setText(data.get(position).getFruitName());
        holder.tvFruitPrice.setText(data.get(position).getFruitPrice().toString());
    }

    //这个方法返回总共要生产多少个View的数量
    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class InnerHolder extends RecyclerView.ViewHolder {
        //第一步：在这里把一个item里面的View找到方便我们后面对它设置数据
        TextView tvFruitName;
        TextView tvFruitPrice;

        public InnerHolder(@NonNull View itemView) {
            super(itemView);
            tvFruitName = (TextView) itemView.findViewById(R.id.tv_fruit_name);
            tvFruitPrice = (TextView) itemView.findViewById(R.id.tv_fruit_price);
        }
    }
}
