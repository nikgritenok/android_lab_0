fun findMinMaxAndProductFor(arr: IntArray) {
    var product = 1
    var min = arr[0]
    var max = arr[0]

    for (i in arr) {
        product *= i
        if (i < min) min = i
        if (i > max) max = i
    }

    println("Произведение: $product")
    println("Минимум: $min")
    println("Максимум: $max")
}

fun main() {
    val arr = intArrayOf(1, 3, 5, -2, 7)
    findMinMaxAndProductFor(arr)
}