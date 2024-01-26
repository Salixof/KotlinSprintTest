package org.example.lesson_1

fun main() {
    val departureTime = 939 // время выезда в формате ЧЧММ
    val duration = 457 // время пути в минутах

    val hours = (departureTime / 100 + duration / 60) % 24 // подсчет часа прибытия
    val minutes = (departureTime % 100 + duration % 60) % 60 // подсчет минуты прибытия

    println("Время прибытия поезда: ${String.format("%02d", hours)}:${String.format("%02d", minutes)}")
}