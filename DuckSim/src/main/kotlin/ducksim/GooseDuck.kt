package ducksim

import java.awt.Color

class GooseDuck: Duck() {
    override val color: Color = Color.BLUE

    override open var quackText: String = getHonk()

    override fun display() = getName()

    fun getHonk(): String {
        return Goose().honkText
    }

    fun getName(): String {
        return Goose().name
    }
}