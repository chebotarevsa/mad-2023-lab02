package com.example.mad_2023_lab02

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val linearLayout = LinearLayout(this)
        linearLayout.orientation = LinearLayout.VERTICAL
        val layoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.MATCH_PARENT
        )
        linearLayout.layoutParams = layoutParams
        linearLayout.setBackgroundColor(Color.WHITE)

        val textView = TextView(this)
        textView.text = "Hello, world!"
        textView.textSize = 40f
        textView.setTextColor(Color.BLACK)
        val textViewParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        textViewParams.gravity = android.view.Gravity.CENTER_HORIZONTAL
        textViewParams.topMargin = resources.getDimensionPixelSize(R.dimen.text_top_margin)
        textView.layoutParams = textViewParams

        imageView = ImageView(this)
        imageView.setImageResource(R.drawable.hello_world)
        val imageViewParams = LinearLayout.LayoutParams(
            resources.getDimensionPixelSize(R.dimen.image_width),
            resources.getDimensionPixelSize(R.dimen.image_height)
        )
        imageViewParams.gravity = android.view.Gravity.CENTER_HORIZONTAL
        imageViewParams.topMargin = resources.getDimensionPixelSize(R.dimen.image_top_margin)
        imageView.layoutParams = imageViewParams

        linearLayout.addView(textView)
        linearLayout.addView(imageView)

        setContentView(linearLayout)
    }
}