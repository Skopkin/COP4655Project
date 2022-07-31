package cop4655.summer.rps.types

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "scoreboard")
data class Player (
    @PrimaryKey(autoGenerate = true) var playerId: Long = 0,
    var playerName: String,
    var wins: Int = 0,
    var losses: Int = 0,
    var location: String
        )