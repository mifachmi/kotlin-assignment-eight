package model

import kotlin.math.PI

class CircleShape(_radius: Double): Shape() {
    private val radius = _radius

    override fun hitungKeliling() {
        println("Menghitung Keliling Lingkaran")
        val result = 2 * PI * radius
        println("Keliling Lingkaran = $result")
    }

    override fun hitungLuas() {
        println("Menghitung Luas Lingkaran")
        val result = PI * radius * radius
        println("Luas Lingkaran = $result")
    }
}