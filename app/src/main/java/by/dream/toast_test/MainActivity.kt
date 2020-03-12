package by.dream.toast_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)

        button.setOnClickListener{

            val toast = Toast.makeText(applicationContext,"Пора покормить кота!",Toast.LENGTH_LONG)
            toast.setGravity(Gravity.CENTER,0,0)

            val toastContainer = toast.view as LinearLayout
            val catImage = ImageView(this)
            catImage.setImageResource(R.drawable.hungry_cat)
            toastContainer.addView(catImage,0)
            toast.show();
        }
    }
}
