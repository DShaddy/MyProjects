
fun main() {
    val playerfield = Array(10) {CharArray(10){'.'} }

    //ставим корабль размера 4 горизонтально в позицию (3, 2)
    playerfield[3][2] = '#'
    playerfield[3][3] = '#'
    playerfield[3][4] = '#'
    playerfield[3][5] = '#'

    val enemyfield = Array(10) {CharArray(10){'.'} }
    enemyfield[5][7] = '#'
    enemyfield[6][7] = '#'
    enemyfield[7][7] = '#'


    println("=== Ваше поле ===                          === Поле противника ===")


    print("   ")
    for(c in 0 .. 9) print("$c")
    print("     ")
    print("   ")
    for(c in 0 .. 9) print("$c")
    println()


    for (r in 0..9) {
        print("$r")
        for(c in 0 .. 9) print("${playerfield[r][c]}")


        print("     ")


        print("$r ")
        for(c in 0 .. 9) print("${enemyfield[r][c]}")

        println()
    }

}