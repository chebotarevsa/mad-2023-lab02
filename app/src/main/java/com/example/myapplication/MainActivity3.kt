package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.view.Gravity
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val linearLayout = setLayout()

        linearLayout.addView(setTextView())
        linearLayout.addView(setImageView())

        setContentView(linearLayout)
    }

    /**
     * Настроить LinearLayout
     */
    private fun setLayout(): LinearLayout {
        val linearLayout = LinearLayout(this)

        linearLayout.orientation = LinearLayout.VERTICAL

        val layoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.MATCH_PARENT
        )
        linearLayout.layoutParams = layoutParams

        return linearLayout
    }

    /**
     * Настроить TextView
     */
    private fun setTextView(): TextView {
        val textView = TextView(this)

        textView.text = resources.getString(R.string.hello_world)
        val tSize = resources.getDimension(R.dimen.textSize)
        textView.setTextSize(TypedValue.COMPLEX_UNIT_PX, tSize)

        val textViewParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        textViewParams.gravity = Gravity.CENTER_HORIZONTAL
        textViewParams.topMargin = resources.getDimensionPixelSize(R.dimen.text_top_margin)

        textView.layoutParams = textViewParams

        return textView
    }

    /**
     * Добавить ImageView
     */
    private fun setImageView(): ImageView {
        val imageView = ImageView(this)

        imageView.setImageResource(R.drawable.hello_world)

        val imageViewParams = LinearLayout.LayoutParams(
            resources.getDimensionPixelSize(R.dimen.layout_width),
            resources.getDimensionPixelSize(R.dimen.layout_height)
        )
        imageViewParams.gravity = Gravity.CENTER_HORIZONTAL
        imageViewParams.topMargin = resources.getDimensionPixelSize(R.dimen.image_margin_top)

        imageView.layoutParams = imageViewParams

        return imageView
    }
}
