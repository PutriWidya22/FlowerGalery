package com.putri.flowergalery.models

// class Data yang berisi fields yaitu judul, gambar, dan warna.
data class Data(
    var judul: String,
    var gambar: String,
    var warna: String // Author of blog post
    ) {

    // function toString yang memberikan nilai string.
    override fun toString(): String {
        return "Data(judul='$judul', gambar='$gambar', nama='$warna')"
    }


}
























