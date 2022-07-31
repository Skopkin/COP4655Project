package cop4655.summer.rps.ui.play

import cop4655.summer.rps.types.rpsOption

class PlayHandler {

    var isRoundActive = false;

    var playerChoice: rpsOption = rpsOption.NULL

    var computerChoice: rpsOption = rpsOption.NULL

    // checks player choice versus computer choice and evaluates results
    fun evaluateRound(){}

    // calls the dao object to update the player's score
    fun updateScore(){}

    // randomizes the cpu's choice
    fun computerChoice(){}

    // enables/disables the rps buttons
    fun toggleInputButtons(){}

    // starts a round
    fun startRound(){}

    // delay between interactions
    fun roundDelay(){}


}