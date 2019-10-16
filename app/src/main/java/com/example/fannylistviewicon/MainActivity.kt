package com.example.fannylistviewicon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fannylistviewicon.adapter.adaptercode
import com.example.fannylistviewicon.model.Coded
import com.example.fannylistviewicon.model.listcode

class MainActivity : AppCompatActivity() {
    private lateinit var vCode: RecyclerView
    private var list: ArrayList<Coded> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vCode = findViewById(R.id.revcode)
        vCode.setHasFixedSize(true)
        list.addAll(listcode.listofcode)
        showcode()
    }

    private fun showcode() {
        vCode.layoutManager = LinearLayoutManager(this)
        val codeAdapter = adaptercode(list)
        vCode.adapter = codeAdapter
    }
}
