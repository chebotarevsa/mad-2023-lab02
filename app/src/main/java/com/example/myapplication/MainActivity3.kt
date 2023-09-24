package com.example.myapplication
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.view.Gravity
import android.util.TypedValue
import android.widget.TextView
import android.widget.ImageView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val maLay =LinearLayout(this)
        maLay.layoutParams=LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.MATCH_PARENT
        )
        maLay.orientation = LinearLayout.VERTICAL


        val tView= TextView(this)
        tView.text=getString(R.string.HelloWorld)
        tView.layoutParams=LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
            0,1.0f
        )
        tView.gravity=Gravity.CENTER
        val tSize= resources.getDimension(R.dimen.text_size)
        tView.setTextSize(TypedValue.COMPLEX_UNIT_PX , tSize)


        val iView=ImageView(this)
        iView.layoutParams=LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
            0, 1.0f
        )
        iView.setImageResource(R.drawable.hello_world)
        iView.scaleType=ImageView.ScaleType.CENTER_INSIDE


        maLay.addView(tView)
        maLay.addView(iView)
        setContentView(maLay)
    }
}