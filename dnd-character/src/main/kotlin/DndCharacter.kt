import kotlin.random.Random

class DndCharacter {

    val strength = ability()
    val dexterity = ability()
    val constitution = ability()
    val intelligence = ability()
    val wisdom = ability()
    val charisma = ability()
    val hitpoints = 10 + modifier(constitution)

    companion object {

        fun ability(): Int {
            return List(4) { Random.nextInt(6) }.sorted().drop(1).sum()
        }

        fun modifier(score: Int): Int {
            return score / 2 - 5
        }
    }

}
