package lab.main.quadratic

import android.widget.EditText
import android.widget.TextView

class Solver(
	private val inputA: EditText,
	private val inputB: EditText,
	private val inputC: EditText,
	private val deltaText: TextView,
	private val resultText: TextView
) {
	fun update() {
		val a = inputA.text.toString().toDoubleOrNull()
		val b = inputB.text.toString().toDoubleOrNull()
		val c = inputC.text.toString().toDoubleOrNull()

		if(a == null || b == null || c == null) {
			deltaText.text = "Delta: -"
			resultText.text = "Results: -"
			return
		}
		val solution = solveQuadraticEquation(a, b, c)
		deltaText.text = "Delta: " + solution.getRoundedDeltaString()
		resultText.text = "Results: " + solution.getResultsAsStrings()
	}
}