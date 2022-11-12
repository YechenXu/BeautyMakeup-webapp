package ducksim

interface Subject : Observer{

    fun registerObserver(observer: Observer)

    fun removeObserver(observer: Observer)

    fun notifyObservers()
}