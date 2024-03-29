package ru.androidschool.intensiv.data

import com.google.gson.annotations.SerializedName
import ru.androidschool.intensiv.BuildConfig
import ru.androidschool.intensiv.extensions.toFloatRating

data class TvShow(
    @SerializedName("id")
    val id: Int,
    @SerializedName("vote_average")
    val voteAverage: Double,
    @SerializedName("name")
    val title: String
) {
    @SerializedName("poster_path")
    val posterPath: String? = null
        get() = "${BuildConfig.IMAGE_URL}$field"

    val rating: Float
        get() = voteAverage.toFloatRating()
}
