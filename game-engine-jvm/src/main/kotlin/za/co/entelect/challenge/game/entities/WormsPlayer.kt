package za.co.entelect.challenge.game.entities

import za.co.entelect.challenge.game.contracts.game.GamePlayer

class WormsWrapperPlayer(val id: Int): GamePlayer {
    val dead: Boolean = false

    override fun getHealth(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getScore(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}