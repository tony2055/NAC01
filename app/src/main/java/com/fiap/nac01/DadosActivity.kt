package com.fiap.nac01

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class DadosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dados)

        Toast.makeText(this, "nome:"+ inputNome.toString(), Toast.LENGTH_SHORT).show()
    }
}
