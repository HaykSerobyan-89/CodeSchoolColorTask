import java.util.*

fun main() {

    val scan = Scanner(System.`in`)
    val result = ColorsEnum.getColorById(scan.nextInt())

    println(result)
    println(ColorsEnum.getColorById(1))
    println(ColorsEnum.getColorById(11))
    println(ColorsEnum.getColorById(33))
    println(ColorsEnum.getColorById(100))
}