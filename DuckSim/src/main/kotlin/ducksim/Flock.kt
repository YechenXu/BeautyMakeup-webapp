package ducksim

class Flock(val children: List<Duck>): Duck(){

    override var quackText: String = "Noise!"

    override var joinDSCW= object : DuckMenuItem {
        override fun invoke(){
            children.forEach() {
                it.doRegister()
            }
        }
    }


    override var quitDSCW= object : DuckMenuItem {
        override fun invoke(){
            children.forEach() {
                it.doRemove()
            }
        }
    }


    override val capture= object : DuckMenuItem {
        override fun invoke() {
            children.forEach(){
                it.doCapture()
            }
            doCapture()
        }
    }

    override val release = object : DuckMenuItem {
        override fun invoke() {
            children.forEach(){
                it.doRelease()
            }
            doRelease();
        }
    }

    override fun display(): String {
        var displayText = "Flock"
        for (duck in children) {
            displayText += ":" + duck.display()[0]
        }
        return displayText
    }

}