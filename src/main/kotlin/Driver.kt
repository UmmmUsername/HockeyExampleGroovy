import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.sqlite.driver.asJdbcDriver
import com.zaxxer.hikari.HikariDataSource

val jdbcDriver: SqlDriver =
    HikariDataSource().apply {
        jdbcUrl = "jdbc:postgresql://localhost:5432/Hockey"
        driverClassName = "org.postgresql.Driver"
        username = "postgres"
        password = "password"
    }
        .asJdbcDriver()
