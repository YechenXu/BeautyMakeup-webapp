package ducksim

class QuackNoise: QuackBehavior {

    override val quackText: String
        get() = "Noise!"

    override fun getQuack(): String {
        return "Noise!";
    }
}