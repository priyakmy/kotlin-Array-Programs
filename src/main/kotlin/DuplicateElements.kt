fun main() {
    val arr = arrayOf(2, 3, 4, 2, 1, 3, 5, 6, 6)

    println("Duplicate elements in the given array:")
    for (i in arr.indices) {
        for (j in i + 1 until arr.size) {
            if (arr[i] == arr[j]) {
                print("${arr[i]} ")
                break
            }
        }
    }
}

