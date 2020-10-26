package lab.main.quadratic

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import lab.main.R

class QuadraticFragment :
	Fragment(R.layout.fragment_quadratic_equation) {
	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)

		val inputA = view.findViewById<EditText>(R.id.quadraticInputA)
		val inputB = view.findViewById<EditText>(R.id.quadraticInputB)
		val inputC = view.findViewById<EditText>(R.id.quadraticInputC)
		val deltaText = view.findViewById<TextView>(R.id.quadraticDeltaText)
		val resultText = view.findViewById<TextView>(R.id.quadraticResultsText)
		val equationSolver =
			Solver(inputA, inputB, inputC, deltaText, resultText)
		inputA.addTextChangedListener(QuadraticEquationTextWatcher(equationSolver))
		inputB.addTextChangedListener(QuadraticEquationTextWatcher(equationSolver))
		inputC.addTextChangedListener(QuadraticEquationTextWatcher(equationSolver))
	}
}