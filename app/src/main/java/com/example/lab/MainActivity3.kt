package com.example.lab
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.view.Gravity
import android.util.TypedValue
import android.widget.TextView
import android.widget.ImageView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { //Начало выполнения активити
        super.onCreate(savedInstanceState) //Выполнение стандартных инициализаций
        val maLay =LinearLayout(this) //Используется для размещения элементов интерфейса
        maLay.layoutParams=LinearLayout.LayoutParams( //Определение размещения в контейнере
            LinearLayout.LayoutParams.MATCH_PARENT, //
            LinearLayout.LayoutParams.MATCH_PARENT //
        )
        maLay.orientation = LinearLayout.VERTICAL //Вертикальное положение


        val tView= TextView(this) //Экземпляр для текста
        tView.text=getString(R.string.HelloWorld) //Установка текста
        tView.layoutParams=LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
            0,1.0f //Текст займёт 1/3 высоты от LinearLayout
        )
        tView.gravity=Gravity.CENTER //Выравнивание на середину
        val tSize= resources.getDimension(R.dimen.text_size) //Получение размера текста
        tView.setTextSize(TypedValue.COMPLEX_UNIT_PX , tSize) //Применение размера


        val iView=ImageView(this) //Экземпляр для картинки
        iView.layoutParams=LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
            0, 1.0f //Картинка займёт 1/3 высоты от LinearLayout
        )
        iView.setImageResource(R.drawable.hello_world)
        iView.scaleType=ImageView.ScaleType.CENTER_INSIDE //То же самое


        maLay.addView(tView)
        maLay.addView(iView)
        setContentView(maLay) //Передача всего на экран
    }
}