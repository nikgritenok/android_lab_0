fun findMinMaxAndProductWhile(arr: IntArray) {
    var product = 1
    var min = arr[0]
    var max = arr[0]
    var i = 0

    while (i < arr.size) {
        product *= arr[i]
        if (arr[i] < min) min = arr[i]
        if (arr[i] > max) max = arr[i]
        i++
    }

    println("Произведение: $product")
    println("Минимум: $min")
    println("Максимум: $max")
}

fun main() {
    val arr = intArrayOf(1, 3, 5, -2, 7)
    findMinMaxAndProductWhile(arr)
}