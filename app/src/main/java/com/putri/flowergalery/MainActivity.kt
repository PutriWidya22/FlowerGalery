package com.putri.flowergalery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

// membuat class MainActivity untuk mengakses file activity_main.xml
class MainActivity : AppCompatActivity() {

    // berikut merupakan adapter untuk menampilkan data menggunakan RecyclerView
    private lateinit var Adapter: AdapterRecyclerView

    // mengakses layout activity_main saat pertama kali dijalankan
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // deklarasi variabel
        initRecyclerView()
        addDataSet()
    }

    // function addDataSet untuk membuat data list bunga
    private fun addDataSet(){
        val data = SumberData.createDataSet()
        Adapter.submitList(data)
    }

    // function initRecyclerView untuk menampilkan RecyclerView yang berisi data bunga melalui
    // adapter, dan paddingnya 30.
    private fun initRecyclerView(){
        recycler_view.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            val topSpacingDecorator = Tambahan(30)
            addItemDecoration(topSpacingDecorator)
            Adapter = AdapterRecyclerView()
            adapter = Adapter
        }
    }
}























