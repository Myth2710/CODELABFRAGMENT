package com.example.myapplication11

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    private lateinit var btnOpenSatu: Button
    private lateinit var btnOpenDua: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOpenSatu = findViewById(R.id.btnOpenSatu)
        btnOpenDua = findViewById(R.id.btnOpenDua)

        btnOpenSatu.setOnClickListener {
            replaceFragment(Satu())
        }

        btnOpenDua.setOnClickListener {
            replaceFragment(Dua())
        }

        if (savedInstanceState == null) {
            replaceFragment(Satu())
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_container, fragment)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }
}
