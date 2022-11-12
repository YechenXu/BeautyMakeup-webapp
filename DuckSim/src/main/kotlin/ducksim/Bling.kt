package ducksim
import java.awt.Color

abstract class Bling(val duck: Duck): Duck() {
    override val color: Color
        get() = duck.color
}