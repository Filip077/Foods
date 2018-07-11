package com.example.filip101891.myfoods

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.food_item.view.*

class FoodAdapter(var items: ArrayList<Food>, var context: Context) : RecyclerView.Adapter<FoodAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): FoodAdapter.MyViewHolder {
        return MyViewHolder(LayoutInflater.from(context).inflate(R.layout.food_item, parent, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: FoodAdapter.MyViewHolder, position: Int) {
//       holder.bindItems(items[position])
        val food: Food = items.get(position)
        holder.itemView.name.text = food.name
        holder.itemView.image.setImageResource(food.image!!)


        holder.itemView.setOnClickListener(View.OnClickListener {
            val intent = Intent(holder.itemView.context, DetailsActivity::class.java)
            intent.putExtra("name", food.name)
            intent.putExtra("description", food.description)
            intent.putExtra("image", food.image!!)
            context.startActivity(intent)
        })

    }


    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {


    }
}