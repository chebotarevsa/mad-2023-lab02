package ru.bsuedu.lab2
import android.content.Context

import android.graphics.Color
import android.os.Bundle
import android.util.TypedValue
import android.view.Gravity
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DynamicActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val linearLayout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
            )
        }

        with(linearLayout) {
            addView(TextView(this@DynamicActivity).apply {
                text = "Hello World!"
                textSize = 40f 
                setTextColor(Color.BLACK)
                layoutParams = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
                )
            })

            addView(ImageView(this@DynamicActivity).apply {
                setImageResource(R.drawable.hello_world)
                layoutParams = LinearLayout.LayoutParams(
                    300.dpToPx(this@DynamicActivity),
                    300.dpToPx(this@DynamicActivity)
                )
            })
        }

        setContentView(linearLayout)
    }
}

fun Int.dpToPx(context: Context): Int = TypedValue.applyDimension(
    TypedValue.COMPLEX_UNIT_DIP,
    this.toFloat(),
    context.resources.displayMetrics
).toInt()
