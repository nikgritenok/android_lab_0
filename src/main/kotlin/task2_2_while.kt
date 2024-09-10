fun printElementsGreaterThanNeighborsWhile(arr: IntArray) {
    var i = 1
    while (i < arr.size - 1) {
        if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
            println(arr[i])
        }
        i++
    }
}

fun main() {
    val arr = intArrayOf(1, 3, 5, 4, 2, 6, 8, 7)
    printElementsGreaterThanNeighborsWhile(arr)
}