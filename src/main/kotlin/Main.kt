import com.example.HockeyDatabase
import org.slf4j.Logger
import org.slf4j.LoggerFactory

fun main() {
    val players = jdbcDriver.use { driver ->
        with(HockeyDatabase(driver = driver).hockeyPlayerQueries) {
            insert(name = "Sidney Crosby")
            selectAll().executeAsList()
        }
    }

    LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME)
        .debug(players.toString())
}
