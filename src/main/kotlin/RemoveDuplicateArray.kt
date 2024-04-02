fun main() {
    val nums = intArrayOf(1, 1, 2, 2, 3, 3, 4, 5, 5,6,8,6,8)
    val uniqueCount = removeDuplicates(nums)
    println("Unique count: $uniqueCount")
    println("Array after removing duplicates:")
    for (i in 0 until uniqueCount) {
        print("${nums[i]} ")
    }
}
fun removeDuplicates(nums: IntArray): Int {
    if (nums.isEmpty()) return 0

    var currentIndex = 0 // Index to keep unique elements

    for (i in 1 until nums.size) {
        if (nums[i] != nums[currentIndex]) {
            currentIndex++
            nums[currentIndex] = nums[i] // Store the unique element
        }
    }

    return currentIndex + 1 // Number of unique elements
}
