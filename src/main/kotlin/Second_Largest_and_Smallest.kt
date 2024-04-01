import java.util.Scanner
    fun main() {
        val n: Int
        var temp: Int
        val s = Scanner(System.`in`)
        print("Enter no. of elements you want in array:")
        n = s.nextInt()
        val a = IntArray(n)
        println("Enter all the elements:")
        for (i in 0 until n) {
            a[i] = s.nextInt()
        }
        for (i in 0 until n) {
            for (j in i + 1 until n) { //Sorting the Array
                if (a[i] > a[j]) {
                    temp = a[i]
                    a[i] = a[j]
                    a[j] = temp
                }
            }
        }

      /*      println()
            print("Sorted Array is:")
            for (i in 0..n) {
                println(a[i])
            } */

                println("Second Largest:" + a[n - 2])
                println("Smallest:" + a[0])


    }