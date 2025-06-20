package river_one

import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    var r1 = input.nextLong()
    var r2 = input.nextLong()

    while (r1 != r2) {
        if (r1 < r2) r1 = advance(r1)
        else r2 = advance(r2)
    }
    print(r1)
}

fun advance(n: Long): Long {
    return n + n.toString().sumOf { it.toString().toInt() }
}