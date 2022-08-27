import com.example.HockeyDatabase

fun main() {
    jdbcDriver.use { driver -> HockeyDatabase.Schema.migrate(driver = driver, oldVersion = 0, newVersion = 1) }
}
