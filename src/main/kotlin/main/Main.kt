package main

import model.CircleShape
import model.RectangleShape

fun main() {
    val rectangle = RectangleShape(3, 5)
    rectangle.hitungKeliling()
    rectangle.hitungLuas()
    println("====================================")
    val circle = CircleShape(5.0)
    circle.hitungKeliling()
    circle.hitungLuas()
}