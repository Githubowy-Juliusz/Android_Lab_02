package lab.main.quadratic

import lab.main.round


class QuadraticEquationResult(
	val delta: Double,
	val x1: Double? = null,
	val x2: Double? = null
) {
	fun getRoundedDeltaString(): String {
		val rounded = round(delta, 2)
		return "$rounded"
	}

	fun getResultsAsStrings(): String {
		if(x1 == null)
			return "None"
		if(x1 == Double.NEGATIVE_INFINITY && x2 == Double.POSITIVE_INFINITY && delta == 0.0)
			return "(-inf, inf)"
		val x1Rounded = round(x1!!, 2)
		if(x1 == x2)
			return "x = $x1Rounded"
		val x2Rounded = round(x2!!, 2)
		return "x1 = $x1Rounded; x2 = $x2Rounded"
	}
}