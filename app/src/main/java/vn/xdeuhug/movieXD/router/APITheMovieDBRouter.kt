package vn.xdeuhug.movieXD.router

/**
 * @Author: NGUYEN XUAN DIEU
 * @Date: 31 / 01 / 2024
 */
object APITheMovieDBRouter {
    const val HOST_THE_MOVIE_DB = "https://api.themoviedb.org/3/"
    const val HOST_THE_MOVIE_DB_TV = "https://api.themoviedb.org/3/tv/"
    const val HOST_THE_MOVIE_DB_MOVIE = "https://api.themoviedb.org/3/movie/"
    const val API_KEY = "b7c3309b3ea8fdf5c9afa62154eefc7f"



//    https://www.2embed.cc/embedtv/tt3107288&s=1&e=1 SERIES


    const val HOST_IMAGE = "https://image.tmdb.org/t/p/original"
    const val HOST_IMAGE_BIG_SIZE = "https://image.tmdb.org/t/p/w500"

    fun API_POPULAR(): String {
        return "popular"
    }

    fun API_VIDEO(id: Int): String {
        return "$id"
    }

    fun API_TV_VIDEO(id: Int): String {
        return "$id"
    }

    fun API_TRENDING(): String {
        return "trending/all/day"
    }

    fun API_SEARCH_MOVIE(): String {
        return "search/multi"
    }

    fun API_TV_SERIES(idIMDB: String):String {
        return idIMDB
    }
}