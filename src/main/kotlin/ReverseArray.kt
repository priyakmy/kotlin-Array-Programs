fun main(){
        val originalArray = intArrayOf(1, 2, 3, 4, 5, 6)

        reverseArrayInPlace(originalArray)

        println("Reversed array:")
        for (element in originalArray) {
            print("$element ")
        }
    }

    fun reverseArrayInPlace(arr: IntArray) {
        var left = 0
        var right = arr.size - 1

        while (left < right) {
            // Swap elements at left and right indices
            val temp = arr[left]
            arr[left] = arr[right]
            arr[right] = temp

            // Move to the next pair of elements
            left++
            right--
        }
    }

