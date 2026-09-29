//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//1.1
fun main() {
    print("Введите строку:")
    val input = readln()

    if (input.isEmpty())
    {
        println("Результат:")
        return
    }

    val result = StringBuilder()

    var curChar = input[0]
    var count = 1

    for (i in 1 until input.length) {
        if(input[i] == curChar)
        {
            count++
        }else{
            result.append(curChar)

            if(count >= 2)
            {
                result.append(count)
            }
            curChar = input[i]
            count = 1
        }
    }
    result.append(count)

    if (count >= 2){
        result.append(count)
    }
    println("Результат: $result" )
}