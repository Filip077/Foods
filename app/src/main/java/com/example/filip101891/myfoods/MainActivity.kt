package com.example.filip101891.myfoods

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val foods = ArrayList<Food>()

        foods.add(Food("Pot for coffee", "My pot for coffee is great", R.drawable.coffee_pot))
        foods.add(Food("Espresso", "My espresso is great", R.drawable.espresso))
        foods.add(Food("French fries", "I like french fries", R.drawable.french_fries))
        foods.add(Food("Honey", "My dad's honey is great", R.drawable.honey))
        foods.add(Food("Ice Cream", "I love strawberry ice cream", R.drawable.strawberry_ice_cream))
        foods.add(Food("Sugar Cubes", "I like to put sugar cubes in my coffee", R.drawable.sugar_cubes))

        recView.layoutManager = GridLayoutManager(this,2)
        recView.adapter = FoodAdapter(foods,this)

        recView.setOnClickListener(View.OnClickListener {
            Toast.makeText(this,"Item clicked!",Toast.LENGTH_LONG).show()
        })
    }
}
