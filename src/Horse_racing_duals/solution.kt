package Horse_racing_duals

import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val input = Scanner(System.`in`)
    val n = input.nextInt()
    val horses: ArrayList<Int> = arrayListOf()
    for (i in 0..<n) {
        horses.add(input.nextInt())
    }
    horses.sort()
    var d = horses.max()
    for (i in 0 until n-1) {
        d = minOf(d,horses[i+1] - horses[i])
    }

    println(d)
}