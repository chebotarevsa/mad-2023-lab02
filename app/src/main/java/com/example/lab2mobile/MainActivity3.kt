package com.example.lab2mobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
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

        val textView = TextView(this)
        textView.text = resources.getString(R.string.hello_world)
        val tSize= resources.getDimension(R.dimen.sizeSp)
        textView.setTextSize(TypedValue.COMPLEX_UNIT_PX , tSize)

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
            resources.getDimensionPixelSize(R.dimen.size),
            resources.getDimensionPixelSize(R.dimen.size)
        )
        imageViewParams.gravity = android.view.Gravity.CENTER_HORIZONTAL
        imageViewParams.topMargin = resources.getDimensionPixelSize(R.dimen.image_margin_top)
        imageView.layoutParams = imageViewParams

        linearLayout.addView(textView)
        linearLayout.addView(imageView)

        setContentView(linearLayout)
    }
}
