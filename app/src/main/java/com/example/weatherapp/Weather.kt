package com.example.weatherapp

data class Weather (
    val data: List<Datum>,
    val count: Long,
    val city_name: String,
    val country_code: String
)

data class Datum (
    val rh: Long,
    val pod: String,
    val lon: Double,
    val pres: Double,
    val timezone: String,
    val obTime: String,
    val clouds: Long,
    val ts: Long,
    val solarRAD: Double,
    val state_code: String,
    val windSpd: Double,
    val windCdirFull: String,
    val windCdir: String,
    val slp: Double,
    val vis: Double,
    val hAngle: Long,
    val sunset: String,
    val dni: Double,
    val dewpt: Double,
    val snow: Long,
    val uv: Double,
    val precip: Double,
    val windDir: Long,
    val sunrise: String,
    val ghi: Double,
    val dhi: Double,
    val aqi: Long,
    val lat: Double,
    val weather: WeatherClass,
    val datetime: String,
    val temp: Double,
    val station: String,
    val elevAngle: Double,
    val app_temp: Double
)

data class WeatherClass (
    val icon: String,
    val code: Int,
    val description: String
)