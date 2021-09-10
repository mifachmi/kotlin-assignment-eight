package model

class RectangleShape(_length: Int, _width: Int): Shape() {
    private var length = _length
    private var width = _width

    override fun hitungKeliling() {
        println("Menghitung Keliling Persegi Panjang")
        val result = 2 * (length + width)
        println("Keliling Persegi Panjang = $result")
    }

    override fun hitungLuas() {
        println("Menghitung Luas Persegi Panjang")
        val result = length * width
        println("Luas Persegi Panjang = $result")
    }
}