class NumberArray(private val numbers: Array<Double>) {

    // Метод для вычисления суммы положительных элементов массива
    fun sumOfPositiveElements(): Double {
        return numbers.filter { it > 0 }.sum()
    }

    // Метод для вычисления произведения всех элементов массива
    fun productOfElements(): Double {
        return numbers.fold(1.0) { acc, number -> acc * number }
    }

    // Метод для вычисления среднего арифметического значения элементов массива
    fun averageOfElements(): Double {
        return if (numbers.isNotEmpty()) numbers.average() else 0.0
    }
}

fun main() {
    val array = arrayOf(1.0, -2.0, 3.0, 4.0, -5.0) // Пример массива
    val numberArray = NumberArray(array)

    println("Сумма положительных элементов: ${numberArray.sumOfPositiveElements()}")
    println("Произведение всех элементов: ${numberArray.productOfElements()}")
    println("Среднее арифметическое значение: ${numberArray.averageOfElements()}")
}