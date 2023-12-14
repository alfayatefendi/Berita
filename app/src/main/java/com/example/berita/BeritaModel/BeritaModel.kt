package com.example.berita.BeritaModelclass

import com.example.berita.R

class news(val title: String, val desc: String, val photo: Int)

object BeritaModel {
    val newsList = listOf<news>(
        news(
            "Pasar ramai dikunjungi warga meskipun wabah covid 19 belum dinyatakan usai",
            "detikcom | 1 jam yang lalu",
            R.drawable.img_news1
        ),
        news(
            "Kapal nelayan menyalurkan bansos masyarakat Sumatra Barat",
            "detikcom | 1 jam yg lalu",
            R.drawable.img_news2
        ),
        news(
            "Macet mulai terjadi di wilayah jalur pemudik Semarang",
            "detikcom | 2 jam yg lalu",
            R.drawable.img_news3
        ),
        news(
            "Jelang new normal Jakarta macet lagi",
            "detikcom | 3 jam yg lalu",
            R.drawable.img_news4
        ),
        news(
            "Jelang new normal Jakarta macet lagi",
            "detikcom | 4 jam yg lalu",
            R.drawable.img_news5
        ),
        news(
            "Saat risma jelaskan soal penanganan corona pada kepala BNPB dan Menkes",
            "detikcom | 5 jam yg lalu",
            R.drawable.img_news6
        ),
        news(
            "Banjir kritik ke trump yang kerahkan militer usai demo George Floyd",
            "detikcom | 6 jam yg lalu",
            R.drawable.img_news7
        ),
        news(
            "Mengapa aksi demo damai kasus George Floyd bisa berubah menjadi kerusuhan?",
            "detikcom | 8 jam yg lalu",
            R.drawable.img_news8
        ),
        news(
            "2 opsi bagi calon jemaah haji yang tidak jadi berangkat tahun ini",
            "detikcom | 1 menit yg lalu",
            R.drawable.img_news9
        )
    )
}
