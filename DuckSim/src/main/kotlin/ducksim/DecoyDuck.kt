package ducksim

import java.awt.Color

class DecoyDuck : Duck() {

    override val color: Color = Color.ORANGE

    override fun fly() {
        //do nothing
    }

    override fun quack() {
        //do nothing
    }
    override fun display() = "Decoy"
}
