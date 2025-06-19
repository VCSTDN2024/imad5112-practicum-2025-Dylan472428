package com.playlist.manager


object PlaylistManager {
    val songs = ArrayList<String>()
    val artists = ArrayList<String>()
    val ratings = ArrayList<Int>()
    val comments = ArrayList<String>()

    fun addSong(song: String, artist: String, rating: Int, comment: String): Boolean {
        return if (rating in 1..5) {
            songs.add(song)
            artists.add(artist)
            ratings.add(rating)
            comments.add(comment)
            true
        } else {
            false // invalid rating
        }
    }

    fun getAverageRating(): Double {
        return if (ratings.isNotEmpty()) ratings.sum().toDouble() / ratings.size else 0.0
    }

    fun getAllDetails(): List<String> {
        return songs.indices.map {
            "Song: ${songs[it]}, Artist: ${artists[it]}, Rating: ${ratings[it]}, Comment: ${comments[it]}"
        }
    }
}


