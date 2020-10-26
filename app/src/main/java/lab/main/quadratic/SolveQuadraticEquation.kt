package lab.main.quadratic

import kotlin.math.sqrt

fun solveQuadraticEquation(
	a: Double,
	b: Double,
	c: Double
): QuadraticEquationResult {
	if(a == 0.0 && b == 0.0 && c == 0.0)
		return QuadraticEquationResult(
			0.0,
			Double.NEGATIVE_INFINITY,
			Double.POSITIVE_INFINITY
		)

	if(a == 0.0 && b == 0.0)
		return QuadraticEquationResult(0.0)

	val delta = (b * b) - (4 * a * c)

	if(a == 0.0) {
		val x = -c / b
		return QuadraticEquationResult(delta, x, x)
	}

	if(delta < 0.0)
		return QuadraticEquationResult(delta)

	if(delta == 0.0) {
		//-b +- delta /2a
		val x = (-b) / (2 * a)
		return QuadraticEquationResult(delta, x, x)
	}
	val sqrtDelta = sqrt(delta)
	val x1 = (-b + sqrtDelta) / (2 * a)
	val x2 = (-b - sqrtDelta) / (2 * a)
	return QuadraticEquationResult(delta, x1, x2)
}

