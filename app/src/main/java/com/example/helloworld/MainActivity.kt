package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txt_num1: EditText = findViewById(R.id.txtNum1)
        val txt_num2: EditText = findViewById(R.id.txtNum2)
        val boton_sumar: Button = findViewById(R.id.button)
        val boton_restar: Button = findViewById(R.id.btnRestar)
        val respuesta: TextView = findViewById(R.id.textView2)

        boton_sumar.setOnClickListener{
            // Toast.makeText(this,"Hello world", Toast.LENGTH_SHORT).show()
            var num1:Int = txt_num1.text.toString().toInt()
            var num2:Int = txt_num2.text.toString().toInt()

            var resultado = num1+num2

            respuesta.text = "$resultado"
        }

        boton_restar.setOnClickListener{
            var num1:Int = txt_num1.text.toString().toInt()
            var num2:Int = txt_num2.text.toString().toInt()

            var resultado = num1-num2

            respuesta.text = "$resultado"
        }
    }
}