import java.util.*

val scan = Scanner(System.`in`)

fun main() {
    val colorsMap = mutableMapOf<Int, Colors>()

    for (color in Colors.values()) {
        colorsMap[color.id] = color
    }

    print("Please enter id of color to get it: ")

    try {
        val result = colorsMap[scan.nextInt()] ?: "There is no color with that id"
        print(result)
    } catch (e: InputMismatchException) {
        println("$e Please restart the app and enter the number")
    }
}