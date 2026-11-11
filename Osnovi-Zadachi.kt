//1.
fun main() {
    println("Введите строку из символов (например, AAADSSSRRTTHAAAA):")
    val input = readlnOrNull()

    if (input.isNullOrBlank()) {
        println("Ошибка: Вы ввели пустую строку.")
        return
    }

    val result = StringBuilder()
    var count = 1

    for (i in 1 until input.length) {
        if (input[i] == input[i - 1]) {
            count++
        } else {
            result.append(input[i - 1])
            if (count > 1) result.append(count)
            count = 1
        }
    }

    result.append(input.last())
    if (count > 1) result.append(count)

    println("Результат сжатия: $result")
}


//2.
//fun main() {
//    println("Введите строку для подсчета символов (например, AASADDSS):")
//    val input = readlnOrNull()
//
//    if (input.isNullOrEmpty()) {
//        println("Ошибка: Строка не должна быть пустой.")
//        return
//    }
//
//    val charCounts = sortedMapOf<Char, Int>()
//    for (char in input) {
//        charCounts[char] = charCounts.getOrDefault(char, 0) + 1
//    }
//
//    println("Количество различных символов:")
//    for ((char, count) in charCounts) {
//        println("$char - $count")
//    }
//}


//3.
//fun main() {
//    println("Введите натуральное число (целое число больше 0):")
//    val input = readlnOrNull()?.trim()
//
//    val number = input?.toIntOrNull()
//    if (number == null || number <= 0) {
//        println("Ошибка: Необходимо ввести целое положительное число больше нуля.")
//        return
//    }
//
//    var temp = number
//    val binary = StringBuilder()
//    while (temp > 0) {
//        binary.append(temp % 2)
//        temp /= 2
//    }
//
//    println("Число $number в двоичной системе: ${binary.reverse()}")
//}


//4.
//fun main() {
//    println("Введите два числа и знак операции через пробел (формат: ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ).")
//    println("Доступные операции: + , - , * , / . Пример: 12.5 4 /")
//
//    val input = readlnOrNull()?.trim()
//    if (input.isNullOrEmpty()) {
//        println("Ошибка: Введена пустая строка.")
//        return
//    }
//
//    val parts = input.split(" ")
//    if (parts.size != 3) {
//        println("Ошибка: Неверный формат ввода. Ожидалось 3 элемента через один пробел, получено: ${parts.size}.")
//        return
//    }
//
//    val num1 = parts[0].replace(',', '.').toDoubleOrNull()
//    val num2 = parts[1].replace(',', '.').toDoubleOrNull()
//    val operator = parts[2]
//
//    if (num1 == null || num2 == null) {
//        println("Ошибка: Первые два значения должны быть числами.")
//        return
//    }
//
//    if (operator.length != 1 || operator !in listOf("+", "-", "*", "/")) {
//        println("Ошибка: Неизвестная операция '$operator'. Используйте только +, -, * или /.")
//        return
//    }
//
//    val result = when (operator) {
//        "+" -> num1 + num2
//        "-" -> num1 - num2
//        "*" -> num1 * num2
//        "/" -> {
//            if (num2 == 0.0) {
//                println("Ошибка: Деление на ноль невозможно.")
//                return
//            }
//            num1 / num2
//        }
//        else -> 0.0
//    }
//
//    println("Результат: $result")
//}


//5.
//fun main() {
//    print("Введите целое число n: ")
//    val n = readlnOrNull()?.trim()?.toLongOrNull()
//    if (n == null) {
//        println("Ошибка: n должно быть целым числом.")
//        return
//    }
//
//    print("Введите основание степени x (целое число): ")
//    val x = readlnOrNull()?.trim()?.toLongOrNull()
//    if (x == null) {
//        println("Ошибка: x должно быть целым числом.")
//        return
//    }
//
//    when {
//        x == 0L -> {
//            if (n == 0L) println("Показатель степени y: любое положительное целое число (например, 1)")
//            else println("Целочисленный показатель не существует")
//            return
//        }
//        x == 1L -> {
//            if (n == 1L) println("Показатель степени y: любое целое число (например, 1)")
//            else println("Целочисленный показатель не существует")
//            return
//        }
//        x == -1L -> {
//            when (n) {
//                1L -> println("Показатель степени y: 0 (или любое четное число)")
//                -1L -> println("Показатель степени y: 1 (или любое нечетное число)")
//                else -> println("Целочисленный показатель не существует")
//            }
//            return
//        }
//        n == 1L -> {
//            println("Показатель степени y: 0")
//            return
//        }
//    }
//
//    var current = 1L
//    var y = 0
//
//    while (kotlin.math.abs(current) < kotlin.math.abs(n)) {
//        if (Long.MAX_VALUE / kotlin.math.abs(x) < kotlin.math.abs(current)) {
//            break
//        }
//        current *= x
//        y++
//    }
//
//    if (current == n) {
//        println("Целочисленный показатель степени y = $y")
//    } else {
//        println("Целочисленный показатель не существует")
//    }
//}


//6.
//fun main() {
//    println("Введите первую цифру (от 0 до 9):")
//    val digit1 = readlnOrNull()?.trim()?.toIntOrNull()
//    if (digit1 == null || digit1 !in 0..9) {
//        println("Ошибка: Необходимо ввести одну цифру от 0 до 9.")
//        return
//    }
//
//    println("Введите вторую цифру (от 0 до 9), отличную от первой:")
//    val digit2 = readlnOrNull()?.trim()?.toIntOrNull()
//    if (digit2 == null || digit2 !in 0..9) {
//        println("Ошибка: Необходимо ввести одну цифру от 0 до 9.")
//        return
//    }
//
//    if (digit1 == digit2) {
//        println("Ошибка: Цифры должны быть различными.")
//        return
//    }
//
//    val isFirstOdd = digit1 % 2 != 0
//    val isSecondOdd = digit2 % 2 != 0
//
//    when {
//        !isFirstOdd && !isSecondOdd -> {
//            println("Создать нечетное число невозможно")
//        }
//        isSecondOdd && digit1 != 0 -> {
//            println("Полученное нечетное число: $digit1$digit2")
//        }
//        isFirstOdd && digit2 != 0 -> {
//            println("Полученное нечетное число: $digit2$digit1")
//        }
//        else -> {
//            val oddDigit = if (isFirstOdd) digit1 else digit2
//            println("Полученное нечетное число (без ведущего нуля): $oddDigit")
//        }
//    }
//}