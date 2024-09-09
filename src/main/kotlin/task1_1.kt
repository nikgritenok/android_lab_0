fun main() {
    println("Введите целое положительное число:")
    val input = readln()

    // Получаем первую и последнюю цифры
    val firstDigit = input.first().digitToInt()
    val lastDigit = input.last().digitToInt()

    // Вычисляем сумму
    val sum = firstDigit + lastDigit

    // Выводим результат
    println("Сумма первой и последней цифры: $sum")
}