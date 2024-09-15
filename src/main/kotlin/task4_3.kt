import kotlin.math.sqrt

class Vector(private val x: Double, private val y: Double, private val z: Double) {

    // Метод для вычисления длины вектора
    fun length(): Double {
        return sqrt(x * x + y * y + z * z)
    }

    // Метод для вычисления скалярного произведения векторов
    fun dotProduct(other: Vector): Double {
        return x * other.x + y * other.y + z * other.z
    }

    // Инфиксная запись для скалярного произведения векторов
    infix fun dot(other: Vector): Double {
        return dotProduct(other)
    }

    // Переопределение оператора * для скалярного произведения
    operator fun times(other: Vector): Double {
        return dotProduct(other)
    }
}

// Внешняя функция для скалярного произведения двух векторов
fun dotProduct(v1: Vector, v2: Vector): Double {
    return v1 * v2
}

fun main() {
    val vector1 = Vector(1.0, 2.0, 3.0)
    val vector2 = Vector(3.0, 2.0, 1.0)

    // Вывод длины вектора
    println("Длина вектора 1: ${vector1.length()}")
    println("Длина вектора 2: ${vector2.length()}")

    // Скалярное произведение через метод
    println("Скалярное произведение (через метод): ${vector1.dotProduct(vector2)}")

    // Скалярное произведение через инфиксную запись
    println("Скалярное произведение (инфиксная запись): ${vector1 dot vector2}")

    // Скалярное произведение через оператор *
    println("Скалярное произведение (оператор *): ${vector1 * vector2}")

    // Скалярное произведение через внешнюю функцию
    println("Скалярное произведение (внешняя функция): ${dotProduct(vector1, vector2)}")
}