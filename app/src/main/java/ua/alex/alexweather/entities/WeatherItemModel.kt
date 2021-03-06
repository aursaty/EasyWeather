//package ua.alex.alexweather.entities
//
//import android.arch.persistence.room.*
//
//
//@Entity(foreignKeys = [ForeignKey(
//        entity = WeatherItemEntity::class,
//        parentColumns = [("uid")],
//        childColumns = [("uid")]
//)])
//data class WeatherItemModel (
//
//        @Embedded
//        var weatherItemRelation: WeatherItemEntity,
//
//        @Relation(parentColumn = "uid", entity = Weather::class, entityColumn = "uid")
//        @ColumnInfo(name = "weather")
//        var weather: List<Weather>? = listOf()
//)
package ua.alex.alexweather.entities

import com.google.gson.annotations.SerializedName
import javax.annotation.Generated

@Generated("com.robohorse.robopojogenerator")
class WeatherItemModel {

    @SerializedName("dt")
    var dt: Int = 0

    @SerializedName("rain")
    var rain: Rain? = null

    @SerializedName("dt_txt")
    var dtTxt: String? = null

    @SerializedName("weather")
    var weather: List<Weather>? = null

    @SerializedName("main")
    var main: Main? = null

    @SerializedName("clouds")
    var clouds: Clouds? = null

    @SerializedName("wind")
    var wind: Wind? = null

    override fun toString(): String {
        return "WeatherItemModel{" +
                "dt = '" + dt + '\''.toString() +
                ",rain = '" + rain + '\''.toString() +
                ",dt_txt = '" + dtTxt + '\''.toString() +
                ",weather = '" + weather + '\''.toString() +
                ",main = '" + main + '\''.toString() +
                ",clouds = '" + clouds + '\''.toString() +
                ",wind = '" + wind + '\''.toString() +
                "}"
    }
}