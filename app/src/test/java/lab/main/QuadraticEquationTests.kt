package lab.main

import lab.main.quadratic.solveQuadraticEquation
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class QuadraticEquationTests {
	@Test
	fun roundingTest1() {
		val result = round(13.523423, 2)
		assertTrue(13.52 == result)
	}

	@Test
	fun roundingTest2() {
		val result = round(935.0126, 2)
		assertTrue(935.01 == result)
	}

	@Test
	fun roundingTest3() {
		val result = round(11.8726731, 1)
		assertTrue(11.9 == result)
	}

	@Test
	fun roundingTest4() {
		val result = round(841.09544123, 4)
		assertTrue(841.0954 == result)
	}

	@Test
	fun quadraticEquationTest1() {
		val result = solveQuadraticEquation(0.0, 3.0, 12.0)
		assertEquals(9.0, result.delta, 0.0)
		assertEquals(-4.0, result.x1!!, 0.0)
		assertEquals(-4.0, result.x2!!, 0.0)
		assertEquals("x = -4.0", result.getResultsAsStrings())
		assertEquals("9.0", result.getRoundedDeltaString())
	}

	@Test
	fun quadraticEquationTest2() {
		val result = solveQuadraticEquation(0.0, 0.0, 12.0)
		assertEquals(0.0, result.delta, 0.0)
		assertEquals(null, result.x1)
		assertEquals(null, result.x2)
		assertEquals("None", result.getResultsAsStrings())
		assertEquals("0.0", result.getRoundedDeltaString())
	}

	@Test
	fun quadraticEquationTest3() {
		val result = solveQuadraticEquation(17.0, 0.0, -1.0)
		assertEquals(68.0, result.delta, 0.0)
		assertEquals(0.242535625, result.x1!!, 0.0000001)
		assertEquals(-0.242535625, result.x2!!, 0.0000001)
		assertEquals("x1 = 0.24; x2 = -0.24", result.getResultsAsStrings())
		assertEquals("68.0", result.getRoundedDeltaString())
	}

	@Test
	fun quadraticEquationTest4() {
		val result = solveQuadraticEquation(2.0, 3.0, 3.0)
		assertEquals(-15.0, result.delta, 0.0)
		assertEquals(null, result.x1)
		assertEquals(null, result.x2)
		assertEquals("None", result.getResultsAsStrings())
		assertEquals("-15.0", result.getRoundedDeltaString())
	}

	@Test
	fun quadraticEquationTest5() {
		val result = solveQuadraticEquation(2.0, 4.0, 2.0)
		assertEquals(0.0, result.delta, 0.0)
		assertEquals(-1.0, result.x1)
		assertEquals(-1.0, result.x2)
		assertEquals("x = -1.0", result.getResultsAsStrings())
		assertEquals("0.0", result.getRoundedDeltaString())
	}

	@Test
	fun quadraticEquationTest6() {
		val result = solveQuadraticEquation(0.0, 0.0, 0.0)
		assertEquals(0.0, result.delta, 0.0)
		assertEquals(Double.NEGATIVE_INFINITY, result.x1)
		assertEquals(Double.POSITIVE_INFINITY, result.x2)
		assertEquals("(-inf, inf)", result.getResultsAsStrings())
		assertEquals("0.0", result.getRoundedDeltaString())
	}

	@Test
	fun quadraticEquationTest7() {
		val result = solveQuadraticEquation(0.0, 0.0, 0.01)
		assertEquals(0.0, result.delta, 0.0)
		assertEquals(null, result.x1)
		assertEquals(null, result.x2)
		assertEquals("None", result.getResultsAsStrings())
		assertEquals("0.0", result.getRoundedDeltaString())
	}

	@Test
	fun quadraticEquationTest8() {
		val result = solveQuadraticEquation(15.39, 6.365, 0.61)
		assertEquals(2.961625, result.delta, 0.0000001)
		assertEquals(-0.150879232, result.x1!!, 0.0000001)
		assertEquals(-0.262701015, result.x2!!, 0.0000001)
		assertEquals("x1 = -0.15; x2 = -0.26", result.getResultsAsStrings())
		assertEquals("2.96", result.getRoundedDeltaString())
	}
}