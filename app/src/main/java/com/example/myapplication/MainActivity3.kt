package com.example.myapplication

import android.os.Bundle
import android.view.Gravity
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Create a LinearLayout to hold the dynamic views
        val mainLayout = LinearLayout(this)
        mainLayout.layoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.MATCH_PARENT
        )
        mainLayout.orientation = LinearLayout.VERTICAL
        mainLayout.gravity = Gravity.CENTER

        // Create a TextView dynamically
        val textView = TextView(this)
        textView.layoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        textView.text = "res.values.string.helloworld"
        textView.setTextColor(resources.getColor(R.color.black))
        textView.textSize = 40f
        textView.gravity = Gravity.CENTER
        textView.setPadding(0, 90, 0, 150)

        // Create an ImageView dynamically
        val imageView = ImageView(this)
        imageView.layoutParams = LinearLayout.LayoutParams(300, 300)
        imageView.setImageResource(R.drawable.hello_world)
        imageView.scaleType = ImageView.ScaleType.CENTER_INSIDE
        imageView.setPadding(0, 20, 0, 20)

        // Add the dynamically created views to the main layout
        mainLayout.addView(textView)
        mainLayout.addView(imageView)

        // Set the mainLayout as the content view for this activity
        setContentView(mainLayout)
    }
}
