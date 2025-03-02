package com.galassini.tecnology.kotlin_lab

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


/*class Usuario {
    companion object {
        val nome: Int = 0
    }
}*/

class MainActivity : AppCompatActivity() {

    private lateinit var btnExecutar: Button
    private lateinit var textResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnExecutar = findViewById( R.id.btn_executar )
        textResultado = findViewById( R.id.text_resultado )

        /*btnExecutar.setOnClickListener { botao ->
            textResultado.text = "Priscila Galassini"
        }*/

    }

    fun cliqueBotao( view: View){

        Toast.makeText(
            this,
            "Sucesso ao fazer algo",
            Toast.LENGTH_LONG
        ).show()


        textResultado.text = "Priscila Galassini"
    }

}