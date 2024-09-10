import kotlin.math.sqrt

fun sieveOfEratosthenes(limit: Int): List<Int> {
    val primes = BooleanArray(limit + 1) { true }
    primes[0] = false
    primes[1] = false

    for (i in 2..sqrt(limit.toDouble()).toInt()) {
        if (primes[i]) {
            for (j in i * i..limit step i) {
                primes[j] = false
            }
        }
    }

    // Собираем все простые числа в список
    val primeList = mutableListOf<Int>()
    for (i in primes.indices) {
        if (primes[i]) {
            primeList.add(i)
        }
    }
    return primeList
}

fun main() {
    println("Введите количество простых чисел:")
    val n = readlnOrNull()?.toIntOrNull() ?: return

    // Предположительно выбираем число больше n для поиска простых чисел
    var limit = 30 // начальное предположение
    var primes = listOf<Int>()

    while (primes.size < n) {
        primes = sieveOfEratosthenes(limit)
        limit *= 2 // увеличиваем предел, если не нашли достаточно простых
    }

    // Выводим первые n простых чисел
    for (i in 0..<n) {
        println("${i + 1}-е число: ${primes[i]}")
    }
}