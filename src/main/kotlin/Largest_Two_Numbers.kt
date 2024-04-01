import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)

    println("Enter Size of Array:")
    val size = scanner.nextInt()

    val array = IntArray(size)

    println("Enter $size elements: ")
    for (i in 0 until size) {
        array[i] = scanner.nextInt()
    }

    var largest1 = array[0]
    var largest2 = array[1]

    var temp: Int
    if (largest1 < largest2)
    {
        temp = largest1
        largest1 = largest2
        largest2 = temp
    }

    for (i in 2 until array.size) {

        if (array[i] > largest1) {
            largest2 = largest1
            largest1 = array[i]

        } else if (array[i] > largest2 && array[i] != largest1) {
            largest2 = array[i]
        }
    }

    println("The First largest is $largest1")
    println("The Second largest is $largest2")
}
