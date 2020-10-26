package lab.main

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import lab.main.guess.GuesingGameFragment
import lab.main.quadratic.QuadraticFragment
import lab.main.random.RandomArrayFragment

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		val quadraticFragment = QuadraticFragment()
		val guessingGameFragment = GuesingGameFragment()
		val randomArrayFragment = RandomArrayFragment()
		val buttonToGuessingGame = findViewById<Button>(R.id.buttonToGuessingGame)
		val buttonToQuadratic = findViewById<Button>(R.id.buttonToQuadraticEquation)
		val buttonToRandomArray = findViewById<Button>(R.id.buttonToRandomArray)

		supportFragmentManager.beginTransaction().apply {
			replace(R.id.frameLayout, quadraticFragment)
			commit()
		}
		buttonToQuadratic.visibility = View.GONE

		buttonToGuessingGame.setOnClickListener {
			buttonToGuessingGame.visibility = View.GONE
			buttonToQuadratic.visibility = View.VISIBLE
			buttonToRandomArray.visibility = View.VISIBLE
			supportFragmentManager.beginTransaction().apply {
				replace(R.id.frameLayout, guessingGameFragment)
				commit()
			}
		}
		buttonToQuadratic.setOnClickListener {
			buttonToGuessingGame.visibility = View.VISIBLE
			buttonToQuadratic.visibility = View.GONE
			buttonToRandomArray.visibility = View.VISIBLE
			supportFragmentManager.beginTransaction().apply {
				replace(R.id.frameLayout, quadraticFragment)
				commit()
			}
		}
		buttonToRandomArray.setOnClickListener {
			buttonToGuessingGame.visibility = View.VISIBLE
			buttonToQuadratic.visibility = View.VISIBLE
			buttonToRandomArray.visibility = View.GONE
			supportFragmentManager.beginTransaction().apply {
				replace(R.id.frameLayout, randomArrayFragment)
				commit()
			}
		}
	}
}