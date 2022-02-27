package uz.shokirov.model

data class CarsItem(
    var horsepower: Int,
    var id: Int,
    var img_url: String,
    var make: String,
    var model: String,
    var price: Double,
    var year: Int
)