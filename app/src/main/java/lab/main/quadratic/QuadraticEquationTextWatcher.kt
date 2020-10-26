package lab.main.quadratic

import android.text.Editable
import android.text.TextWatcher

class QuadraticEquationTextWatcher(private val quadraticEquationUpdater: QuadraticEquationUpdater) :
	TextWatcher {

	override fun afterTextChanged(s: Editable?) {
	}

	override fun beforeTextChanged(
		s: CharSequence?, start: Int,
		count: Int, after: Int
	) {
	}

	override fun onTextChanged(
		sequence: CharSequence?, start: Int,
		before: Int, count: Int
	) {
		quadraticEquationUpdater.update()
	}
}