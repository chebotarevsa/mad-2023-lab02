package com.example.laba2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.view.Gravity
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.view.marginTop

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val linearLayout = createLinearLayout()
        linearLayout.addView(createText())
        linearLayout.addView(createPicture())

        setContentView(linearLayout)

    }

    private fun createLinearLayout(): LinearLayout =
        LinearLayout(this).apply {
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT,
            )
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
        }

    private fun createText(): TextView =
        TextView(this).apply {
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT, 1f
            )
            setPadding(0, 600, 0, 0)
            setTextColor(resources.getColor(R.color.black, theme))
            text = resources.getString(R.string.hello_world)
            setTextSize(TypedValue.COMPLEX_UNIT_PX, resources.getDimension(R.dimen.text_size))
        }

    private fun createPicture(): ImageView =
        ImageView(this).apply {
            layoutParams = LinearLayout.LayoutParams(
                resources.getDimension(R.dimen.img_size).toInt(),
                resources.getDimension(R.dimen.img_size).toInt(), 1f
            )
            setImageResource(R.drawable.hello_world)
        }
}