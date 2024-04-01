
import java.util.Scanner

fun main() {


    val scanner = Scanner(System.`in`)

    println("Enter the size of the array:")
    val size = scanner.nextInt()

    val array = IntArray(size)


    println("Enter $size elements:")
    for (i in 0 until size) {
        array[i] = scanner.nextInt()
    }

    var max = array[0]
    for (i in 0 until size) {

        if (max < array[i]) {
            max = array[i]
        }
    }
    println("Maximum value: $max ")
}

