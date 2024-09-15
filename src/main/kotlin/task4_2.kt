class NumberArray(private val numbers: Array<Int>) {

    // Свойство для получения суммы элементов массива
    val sumOfElements: Int
        get() = numbers.sum()

    // Метод для возвращения массива с удвоенными четными и утроенными нечетными элементами
    fun modifyArray(): Array<Int> {
        return numbers.map { 
            if (it % 2 == 0) it * 2 else it * 3 
        }.toTypedArray()
    }

    // Метод для нахождения максимального элемента массива
    fun maxElement(): Int? {
        return numbers.maxOrNull()
    }

    // Метод для нахождения минимального элемента массива
    fun minElement(): Int? {
        return numbers.minOrNull()
    }
}

fun main() {
    val array = arrayOf(1, 2, 3, 4, 5) // Пример массива
    val numberArray = NumberArray(array)

    println("Исходный массив: ${array.joinToString()}")
    println("Модифицированный массив: ${numberArray.modifyArray().joinToString()}")
    println("Максимальный элемент: ${numberArray.maxElement()}")
    println("Минимальный элемент: ${numberArray.minElement()}")
    println("Сумма элементов массива: ${numberArray.sumOfElements}")
}