package lab.main

import lab.main.random.createRandomArray
import org.junit.Assert.assertTrue
import org.junit.Test

class RandomArrayTests {
	@Test
	fun testArrayCreation() {
		val array = createRandomArray()
		assertTrue(array.size >= 5)
		assertTrue(array.size <= 15)
		for(num in array) {
			assertTrue(num >= 0)
			assertTrue((num <= 100))
		}
	}
}