package kupluk.smk.coding.api

import kupluk.smk.coding.data.artiayat.Arti
import kupluk.smk.coding.data.ayat.Ayat
import kupluk.smk.coding.data.surat.Surat
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiServices {
    @GET("quran/format/json/surat")
    fun getSurat(): Call<Surat>

    @GET("quran/format/json/surat/{surat}/ayat/1-10")
    fun getAyat(@Path("surat") surat: String): Call<Ayat>

    @GET("quran/format/json/surat/{surat}/ayat/1-10}/bahasa/id")
    fun getTranslate(@Path("surat")surat: String): Call<Arti>
}