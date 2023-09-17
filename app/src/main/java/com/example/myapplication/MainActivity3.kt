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

        val mainLayout = LinearLayout(this)
        mainLayout.layoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.MATCH_PARENT
        )
        mainLayout.orientation = LinearLayout.VERTICAL
        mainLayout.gravity = Gravity.CENTER

        val textView = TextView(this)
        val textSize = resources.getDimension(R.dimen.text_size)

        textView.layoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            0,
            1.0f
        )
        textView.text = getString(R.string.helloworld)
        textView.setTextColor(getColor(R.color.black))
        textView.textSize = textSize
        textView.gravity = Gravity.CENTER

        val imageView = ImageView(this)
        imageView.layoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.WRAP_CONTENT,
            0,
            1.0f
        )
        imageView.setImageResource(R.drawable.hello_world)
        imageView.scaleType = ImageView.ScaleType.CENTER_INSIDE

        mainLayout.addView(textView)
        mainLayout.addView(imageView)

        setContentView(mainLayout)
    }
}
