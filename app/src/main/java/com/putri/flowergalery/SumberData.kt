package com.putri.flowergalery

import com.putri.flowergalery.models.Data

// membuat class SumberData
class SumberData{

    // deklarsi objek yang ada di dalam sebuah kelas
    companion object{

        // function createDatabase yang berisi array list data, berisi judul, gambar, dan warna dari
        // fields di file Data.kt
        fun createDataSet(): ArrayList<Data>{
            val list = ArrayList<Data>()
            list.add(
                Data(
                    "Bunga Matahari",
                    "https://cdn.wikifarmer.com/wp-content/uploads/2022/06/sunflower-history-plant-information.jpg",
                    "Orange"
                )
            )
            list.add(
                Data(
                    "Bunga Mawar Putih",
                    "https://asset.kompas.com/crops/umcRSmX-ZczHF0ByxNQyFg93oqU=/0x0:720x480/750x500/data/photo/2022/10/15/6349b25a6989d.jpg",
                    "Putih"
                )
            )
            list.add(
                Data(
                    "Bunga Mawar Merah",
                    "https://asset.kompas.com/crops/EqG2_ReSkiDbwFtzKDCAD5BZBcE=/115x42:1860x1205/750x500/data/photo/2021/08/19/611de363d61d1.jpg",
                    "Merah"
                )
            )
            list.add(
                Data(
                    "Bunga Anggrek",
                    "https://asset.kompas.com/crops/hMHNN2f2gqN0fjHbf3eN4D9aGTs=/0x0:1920x1280/750x500/data/photo/2022/02/02/61fa8689dc71f.jpg",
                    "Merah Muda"
                )
            )
            list.add(
                Data(
                    "Bunga Tulip",
                    "https://asset.kompas.com/crops/hBr7HxFVR63_G5nW9NtOTJZosWk=/220x123:1700x1111/375x240/data/photo/2021/02/04/601c208862dc0.jpg",
                    "Merah Muda"
                )
            )
            list.add(
                Data(
                    "Bunga Melati",
                    "https://assets.promediateknologi.com/crop/0x0:0x0/x/photo/2022/06/26/3470058045.jpg",
                    "Putih"
                )
            )
            list.add(
                Data(
                    "Bunga Edelwis",
                    "http://phinemo.com/wp-content/uploads/2016/06/Edelweis-3.jpg",
                    "Putih"
                )
            )
            list.add(
                Data(
                    "Bunga Teratai",
                    "https://www.ruparupa.com/blog/wp-content/uploads/2021/08/Screenshot-2021-08-06-201929.png",
                    "Merah Muda"
                )
            )
            return list
        }
    }
}