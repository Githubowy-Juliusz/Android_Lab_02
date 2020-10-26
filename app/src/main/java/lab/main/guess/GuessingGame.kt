package lab.main.guess

class GuessingGame(val min: Int = 0, val max: Int = 20) {
	private val winningNumber = (min..max).random()
	private var counter = 0
	fun Counter(): Int {
		return counter
	}

	fun guess(guessedNumber: Int): Int {
		counter++
		if(guessedNumber == winningNumber)
			return counter
		return -1
	}
}