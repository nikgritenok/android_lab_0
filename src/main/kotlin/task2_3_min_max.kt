fun findMinMaxAndProduct(arr: IntArray) {
    val product = arr.reduce { acc, i -> acc * i }
    val min = arr.minOrNull() ?: 0
    val max = arr.maxOrNull() ?: 0

    println("Произведение: $product")
    println("Минимум: $min")
    println("Максимум: $max")
}

fun main() {
    val arr = intArrayOf(1, 3, 5, -2, 7)
    findMinMaxAndProduct(arr)
}