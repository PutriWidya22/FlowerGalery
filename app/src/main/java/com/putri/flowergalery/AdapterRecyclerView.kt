package com.putri.flowergalery

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.putri.flowergalery.models.Data
import kotlin.collections.ArrayList

// membuat class AdapterRecyclerView sebagai penghubung untuk menampilkan data bunga.
class AdapterRecyclerView : RecyclerView.Adapter<RecyclerView.ViewHolder>()
{

    // deklarasi variabel TAG dengan nilai AppFlower.
    private val TAG: String = "AppFlower"

    // deklarasi variabel items untuk list array yang berisi data
    private var items: List<Data> = ArrayList()

    // function onCreateViewHolder untuk mengembalikan nilai DataViewHolder dan mengakses layout
    // list_item.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return DataViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        )
    }

    // function onBindViewHolder untuk menangkap data list.
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {
            is DataViewHolder -> {
                holder.bind(items.get(position))
            }

        }
    }

    // function getItemCount untuk mengatur ukuran items
    override fun getItemCount(): Int {
        return items.size
    }

    // function submitList untuk menampilkan gambar dalam bentuk list
    fun submitList(dataList: List<Data>){
        items = dataList
    }

    // class DataViewHolder yang berisi contruktor dengan deklarasi data_gambar,
    // data_judul, dan data warna dengan memanggil text pada layout.
    class DataViewHolder
    constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView){

        val data_gambar = itemView.gambarBunga
        val data_judul = itemView.judulBunga
        val data_warna = itemView.warnaBunga

        // function bind untuk menampilkan icon jika terjadi error, dan placeholder.
        fun bind(dataPost: Data){

            val requestOptions = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)

            // menggunakan metode Glide untuk menampilkan data dari internet.
            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOptions)
                .load(dataPost.gambar)
                .into(data_gambar)
            data_judul.setText(dataPost.judul)
            data_warna.setText(dataPost.warna)

        }

    }

}
