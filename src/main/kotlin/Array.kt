
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

        println("Array elements:")
        for (element in array) {
            println(element)
        }
    }



