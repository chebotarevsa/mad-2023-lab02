package com.agroinvest.farming.lab2

import android.os.Bundle
import android.util.TypedValue
import android.view.Gravity.CENTER
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.LinearLayout.VERTICAL
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Main3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val ll = LinearLayout(this).apply {
            layoutParams = LinearLayout.LayoutParams(MATCH_PARENT, MATCH_PARENT)
            gravity = CENTER
            orientation = VERTICAL
        }
        val tw = TextView(this).apply {
            layoutParams = LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT)
            text = resources.getString(R.string.hello_world)
            setTextSize(TypedValue.COMPLEX_UNIT_PX, resources.getDimension(R.dimen._40sp))
            y = resources.getDimension(R.dimen._100dp)
        }
        val iw = ImageView(this).apply {
            layoutParams = LinearLayout.LayoutParams(
                resources.getDimension(R.dimen._300dp).toInt(),
                resources.getDimension(R.dimen._300dp).toInt(), 1f
            )
            setImageResource(R.drawable.hello_world)
        }
        ll.addView(tw)
        ll.addView(iw)
        this.addContentView(ll, ll.layoutParams)
    }
}