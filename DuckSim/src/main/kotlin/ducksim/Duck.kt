package ducksim

import java.awt.Color

abstract class Duck: Observer {

    val defaultFlyBehavior: FlyBehavior = FlyWithWings()
    val defaultQuackBehavior: QuackBehavior = QuackNormal()
    // values that can be overridden

    open val color: Color = Color.BLACK
    open var quackText: String = defaultQuackBehavior.getQuack()

    // variables that can be changed only by functions in this class

    var state = State.SWIMMING
        private set
    var isFree = true
        private set
    var isOnDSWC = false
        private set
    var flyBehavior: FlyBehavior = defaultFlyBehavior
        private set
    var quackBehavior: QuackBehavior = defaultQuackBehavior
    // function for setting the state back to its default (swimming)


    fun swim() {
        state = State.SWIMMING
    }

    // functions from the context menu

    open fun fly() {
        state = flyBehavior.state
    }

    open fun quack() {
        state = State.QUACKING
    }

    open val joinDSCW = object : DuckMenuItem {
        override fun invoke() {
            doRegister()
        }
    }
    fun doRegister(){
        isOnDSWC = true
        DuckFactory.registerObserver(this)
    }

    open val quitDSCW = object : DuckMenuItem {
        override fun invoke() {
            doRemove()
        }
    }
    fun doRemove(){
        isOnDSWC = false
        DuckFactory.removeObserver(this)
    }

    open val capture = object : DuckMenuItem {
        override fun invoke() {
            doCapture();
        }
    }

    fun doCapture(){
        isFree = false;
        flyBehavior = FlyNoWay();
        quackBehavior = QuackNoWay()
        quackText = quackBehavior.getQuack()
    }


    open val release = object : DuckMenuItem {
        override fun invoke() {
            doRelease();
        }
    }

    fun doRelease(){
        isFree = true
        flyBehavior = defaultFlyBehavior
        quackBehavior = defaultQuackBehavior
        quackText = quackBehavior.getQuack()
    }

    override fun update() {
        state = State.WELCOMING;
    }
    // abstract display function that must be implemented by concrete classes

    abstract fun display(): String
}