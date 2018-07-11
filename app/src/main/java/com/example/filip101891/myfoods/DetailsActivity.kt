package com.example.filip101891.myfoods

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        val bunle = intent.extras

        nameFood.text = bunle.getString("name")
        descriptionFood.text = bunle.getString("description")
        imageFood.setImageResource(bunle.getInt("image"))
    }
}
