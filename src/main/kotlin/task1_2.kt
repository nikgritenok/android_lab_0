fun main() {
    var count = 0
    var sum = 0.0

    while (true) {
        println("Введите число (для завершения введите 0):")
        val input = readln().toInt()

        if (input == 0) {
            break
        }

        count++
        sum += input
    }

    if (count > 0) {
        val average = sum / count
        println("Количество введённых чисел: $count")
        println("Общая сумма чисел: $sum")
        println("Среднее арифметическое: $average")
    } else {
        println("Числа не были введены.")
    }
}