package ducksim

import java.awt.Color

class RubberDuck : Duck() {

    override val color: Color = Color.YELLOW

    override fun display() = "Rubber"
}