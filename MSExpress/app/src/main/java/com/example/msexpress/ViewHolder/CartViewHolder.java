package com.example.msexpress.ViewHolder;

import android.widget.TextView;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.msexpress.InterFace.itemClickListner;
import com.example.msexpress.R;

public class CartViewHolder extends RecyclerView.ViewHolder implements  View.OnClickListener
{
    public TextView  txtProductName , txtProductPrice , txtProductQuantity;
    private itemClickListner itemClickListner;

    public CartViewHolder(View itemView) {
        super(itemView);

        txtProductName = itemView.findViewById(R.id.cart_product_name);
        txtProductPrice = itemView.findViewById(R.id.cart_product_price);
        txtProductQuantity = itemView.findViewById(R.id.cart_product_quantity);
    }

    @Override
    public void onClick(View view) {
            itemClickListner.onClick(view , getAdapterPosition() , false);
    }

    public void setItemClickListner(com.example.msexpress.InterFace.itemClickListner itemClickListner) {
        this.itemClickListner = itemClickListner;
    }
}
