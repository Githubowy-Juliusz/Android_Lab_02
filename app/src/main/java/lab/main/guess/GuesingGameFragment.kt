package lab.main.guess

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import lab.main.R

class GuesingGameFragment : Fragment(R.layout.fragment_guessing_game) {
	private var guessingGame = GuessingGame()
	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		val input = view.findViewById<EditText>(R.id.guessingGameInput)
		val result = view.findViewById<TextView>(R.id.guessingGameResult)
		val guessButton = view.findViewById<Button>(R.id.guessButton)
		val rollNewButton = view.findViewById<Button>(R.id.rollNewButton)
		fun guess() {
			val int = input.text.toString().toIntOrNull() ?: return
			
			val output = guessingGame.guess(int)
			val counter = guessingGame.Counter()
			if(output == -1) {
				result.text = "Tries: $counter"
				return
			}
			result.text = "You wan after $counter tries."
			guessingGame = GuessingGame()
		}

		fun rollNew() {
			guessingGame = GuessingGame()
			result.text = "Tries: 0"
		}

		guessButton.setOnClickListener { guess() }
		rollNewButton.setOnClickListener { rollNew() }
	}
}