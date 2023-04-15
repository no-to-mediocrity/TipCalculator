import com.example.tipcalculator.MainActivity
import org.junit.Assert.assertEquals
import org.junit.Test
import com.example.tipcalculator.R

class MainActivityTest {

    @Test
    fun testCalculateTip() {
        // Create a new MainActivity object
        val activity = MainActivity()

        // Set up the input values
        val amount = 100.0
        val selectedTip = R.id.tip_option_twenty_percent
        val roundUp = true

        // Call the calculateTip() method and store the result
        activity.binding.costOfService.setText(amount.toString())
        activity.binding.tipOptions.check(selectedTip)
        activity.binding.roundUpSwitch.isChecked = roundUp
        activity.calculateTip()
        val tipResult = activity.binding.tipResult.text.toString()

        // Check that the result matches the expected value
        assertEquals("$20.00", tipResult)
    }
}