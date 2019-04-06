package com.fiap.nac01

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCadastrar.setOnClickListener {
            Cadastrar()
        }


    }

    fun Cadastrar(){

        val nome:String;
        val time:String = arrayListOf<String>("A", "B", "C", "D", "E").toString()

        nome = inputNome.text.toString();

        Toast.makeText(this, "Nome: "+ nome, Toast.LENGTH_SHORT).show()
    }

}
