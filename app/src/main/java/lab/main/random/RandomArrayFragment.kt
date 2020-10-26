package lab.main.random

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import lab.main.R
import lab.main.round

class RandomArrayFragment : Fragment(R.layout.fragment_random_array) {
	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)
		val arrayContentText = view.findViewById<TextView>(R.id.randomArrayContent)
		val arrayMinText = view.findViewById<TextView>(R.id.randomArrayMin)
		val arrayMaxText = view.findViewById<TextView>(R.id.randomArrayMax)
		val arrayAvgText = view.findViewById<TextView>(R.id.randomArrayAverage)
		val arraySumText = view.findViewById<TextView>(R.id.randomArraySum)
		val button = view.findViewById<Button>(R.id.randomArrayCreateNewArrayButton)

		fun updateFields(array: IntArray) {
			val arrayContent = array.contentToString()
			println(arrayContent)
			val min = array.min().toString()
			val max = array.max().toString()
			val avg = round(array.average(), 4).toString()
			val sum = array.sum().toString()
			arrayContentText.text = "Array: $arrayContent"
			arrayMinText.text = "Min: $min"
			arrayMaxText.text = "Max: $max"
			arrayAvgText.text = "Average: $avg"
			arraySumText.text = "Sum: $sum"
		}
		updateFields(createRandomArray())
		button.setOnClickListener {
			updateFields(createRandomArray())
		}
	}
}