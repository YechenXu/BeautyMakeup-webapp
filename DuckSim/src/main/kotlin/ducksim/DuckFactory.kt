package ducksim

import java.util.ArrayList
private val observers: MutableList<Observer> = ArrayList<Observer>()

object DuckFactory: Subject {

    open fun createDuck(baseDuck: Duck, starCount: Int, moonCount: Int, crossCount: Int): Duck {
        var resultDuck: Duck = baseDuck
        repeat(starCount) {
            resultDuck = StarBling(resultDuck)
        }
        repeat(moonCount) {
            resultDuck = MoonBling(resultDuck)
        }
        repeat(crossCount) {
            resultDuck = CrossBling(resultDuck)
        }
        notifyObservers()
        return resultDuck
    }



    override fun registerObserver(observer:  Observer) {
        observers.add(observer)
    }

    override fun removeObserver(observer:  Observer) {
        val index = observers.indexOf(observer)
        observers.removeAt(index)
    }

    override fun notifyObservers() {
        for (observer in observers) {
            observer.update()
        }
    }

    override fun update() {

    }


}