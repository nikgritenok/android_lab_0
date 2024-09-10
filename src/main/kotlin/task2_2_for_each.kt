fun printElementsGreaterThanNeighborsForEach(arr: IntArray) {
    arr.forEachIndexed { i, element ->
        if (i > 0 && i < arr.size - 1 && element > arr[i - 1] && element > arr[i + 1]) {
            println(element)
        }
    }
}

fun main() {
    val arr = intArrayOf(1, 3, 5, 4, 2, 6, 8, 7)
    printElementsGreaterThanNeighborsForEach(arr)
}