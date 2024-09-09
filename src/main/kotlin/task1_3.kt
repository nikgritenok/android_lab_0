import kotlin.random.Random

fun main() {
    val secretNumber = Random.nextInt(0, 11)  // Генерируем число от 0 до 10

    println("Компьютер загадал число от 0 до 10. Попробуй угадать!")

    while (true) {
        print("Введи свой вариант: ")
        val userGuess = readLine()?.toIntOrNull()  // Читаем ввод пользователя

        if (userGuess == null) {
            println("Пожалуйста, введи корректное число.")
            continue  // Если ввод некорректный, просим ввести снова
        }

        when {
            userGuess > secretNumber -> println("Много")
            userGuess < secretNumber -> println("Мало")
            else -> {
                println("Угадал!")
                break  // Прерываем цикл, если число угадано
            }
        }
    }
}