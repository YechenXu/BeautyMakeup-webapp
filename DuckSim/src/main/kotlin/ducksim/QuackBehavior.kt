package ducksim

interface QuackBehavior {

    val quackText: String
        get() = ""

    fun getQuack(): String {
        return quackText;
    }
}