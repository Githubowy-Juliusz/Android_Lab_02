package lab.main.random

fun createRandomArray(): IntArray {
	val arrayLength = (6..15).random()
	val randomList = mutableListOf<Int>()
	for(i in (0..arrayLength)) {
		randomList.add((0..100).random())
	}
	return randomList.toIntArray()
}