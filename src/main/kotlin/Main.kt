import com.example.HockeyDatabase
import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.sqlite.driver.asJdbcDriver
import com.zaxxer.hikari.HikariDataSource
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
