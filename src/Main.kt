import java.awt.GridLayout
import java.nio.file.Files.move

/**
 * ------------------------------------------------------------------------
 * PROJECT NAME HERE
 * Level 2 programming project
 *
 * by Azaria
 *
 * BRIEF PROJECT DESCRIPTION HERE
 * BRIEF PROJECT DESCRIPTION HERE
 * BRIEF PROJECT DESCRIPTION HERE
 * ------------------------------------------------------------------------
 */


/**
 * Program entry point
 */
fun main() {
    println("Old Gold")
    println("------------")

    val players = mutableListOf<String>()

//    showPlayers("Add Players", players)
    setupPlayers("Add Player", players)
    showPlayers("Final Players", players)

    setupGame()

    while (true) {
        showGameState()
        getPlayer1Move()
        showGameState()
        getPlayer2Move()
        showGameState()
    }
}

fun setupPlayers(itemDesc: String, theList: MutableList<String>) {
    println("Enter 'x' to finish adding players")
    while (true) {
        print("$itemDesc: ")
        val item = readln()
        if (item == "x") break
        theList.add(item)
    }
}

fun showPlayers(description: String, theList: MutableList<String>) {
    println(description)

    // Check if we have any players
    if (theList.size == 0) {
        println("--------------------")
        println("There are no players")
        return
    }
    // Yes, so show players
    println("--------------------")
    for (i in theList.indices) {
        println("Player ${i+1} ~ ${theList[i]}")
    println("--------------------")
    }
}

fun setupGame() {
    print("How many squares in your grid? ")
    readln()
//    for (i in readln().indices) {
//        println("${i+1} - ${readln()[i]}")
    }
}

fun showGameState() {

}

fun getPlayer1Move() {
//    println("Select the coin number to move")
}

fun getPlayer2Move() {

}