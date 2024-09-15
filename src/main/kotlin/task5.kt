// Суперкласс Vehicle
open class Vehicle {
    // Свойства для переопределения в наследниках
    open val name: String = "Транспортное средство"
    open val speed: Int = 0

    // Метод start для начала движения
    open fun start() {
        println("$name начал движение со скоростью $speed км/ч")
    }

    // Метод stop для остановки
    open fun stop() {
        println("$name остановился")
    }
}

// Класс-наследник Boat (Лодка)
class Boat : Vehicle() {
    override val name: String = "Лодка"
    override val speed: Int = 30

    override fun start() {
        println("$name начала плыть со скоростью $speed км/ч")
    }

    override fun stop() {
        println("$name остановилась")
    }
}

// Класс-наследник Plane (Самолет)
class Plane : Vehicle() {
    override val name: String = "Самолет"
    override val speed: Int = 900

    override fun start() {
        println("$name взлетел со скоростью $speed км/ч")
    }

    override fun stop() {
        println("$name приземлился")
    }
}

// Класс-наследник Tank (Танк)
class Tank : Vehicle() {
    override val name: String = "Танк"
    override val speed: Int = 40

    override fun start() {
        println("$name начал движение по полю со скоростью $speed км/ч")
    }

    override fun stop() {
        println("$name остановился на месте")
    }
}

fun main() {
    // Создаем объекты классов-наследников
    val boat = Boat()
    val plane = Plane()
    val tank = Tank()

    // Начало движения и остановка для каждого транспортного средства
    boat.start()
    boat.stop()

    plane.start()
    plane.stop()

    tank.start()
    tank.stop()
}