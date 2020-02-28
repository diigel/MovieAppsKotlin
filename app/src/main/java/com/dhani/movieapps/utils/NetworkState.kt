package com.dhani.movieapps.utils

enum class Status {
    RUNNING,
    SUCCESS,
    FAILED,
    ENDOFPAGE,
    NULLKEYWORLD
}


class NetworkState(val status: Status,val message: String) {

    companion object {
        val LOADED: NetworkState = NetworkState(Status.SUCCESS, "Berhasil")
        val LOADING: NetworkState = NetworkState(Status.RUNNING, "Berjalan")
        val ERROR: NetworkState = NetworkState(Status.FAILED, "Maaf Terjadi Kesalahann !")
        val END_OF_PAGE: NetworkState = NetworkState(Status.ENDOFPAGE, "Udah semuanya nih !.")
        val NULL_KEYWORD: NetworkState = NetworkState(Status.NULLKEYWORLD, "Produk yang kamu cari belum tersedia !")
    }
}