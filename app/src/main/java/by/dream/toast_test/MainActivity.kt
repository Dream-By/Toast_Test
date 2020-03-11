package by.dream.toast_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener{
            val toast = Toast.makeText(applicationContext,"Пора покормить кота!",Toast.LENGTH_LONG)
            toast.setGravity(Gravity.CENTER,0,0)
            toast.show();
        }
    }
}
