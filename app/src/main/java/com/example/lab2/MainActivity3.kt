package com.example.lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.example.lab2.R

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

        val textView = TextView(this)
        textView.text = resources.getString(R.string.hello_world_text)
        val tSize= resources.getDimension(R.dimen.text_size)
        textView.setTextSize(TypedValue.COMPLEX_UNIT_PX , tSize)

        val textViewParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        textViewParams.gravity = android.view.Gravity.CENTER_HORIZONTAL
        textViewParams.topMargin = resources.getDimensionPixelSize(R.dimen.margin_size)
        textView.layoutParams = textViewParams

        imageView = ImageView(this)
        imageView.setImageResource(R.drawable.hello_world)

        val imageViewParams = LinearLayout.LayoutParams(
            resources.getDimensionPixelSize(R.dimen.image_size),
            resources.getDimensionPixelSize(R.dimen.image_size)
        )
        imageViewParams.gravity = android.view.Gravity.CENTER_HORIZONTAL
        imageViewParams.topMargin = resources.getDimensionPixelSize(R.dimen.margin_size)
        imageView.layoutParams = imageViewParams

        linearLayout.addView(textView)
        linearLayout.addView(imageView)

        setContentView(linearLayout)
    }
}