package ducksim

class NewDuckController(val duckPond: DuckPond, val view:DuckSimView) {

    fun createNewDuck() {

        if (duckPond.noSelectedDucks()) {
            val makeDuckDialog = MakeDuckDialog(duckPond, view)
            makeDuckDialog.setSize(300, 200)
            makeDuckDialog.isVisible = true
        } else {
            // get the selected ducks from the model
            val ducks = duckPond.selectedDucks.filterNot { it is Flock }
//            // filter the selected ducks by removing any flocks
//            ducks.filterNot { duck -> duck is Flock }
            // if there is more than one duck after removing flocks,
            if (ducks.size < 1) return
            // create a new flock with the selected ducks
            val flock = Flock(ducks)
            duckPond.addNewDuck(flock)
            view.repaint()
        }
    }

}