package __PACKAGE__.configs

import dev.alpas.Environment
import dev.alpas.ozone.DatabaseConfig
import dev.alpas.ozone.MySqlConnection
import dev.alpas.ozone.SqliteConnection
import me.liuwj.ktorm.support.mysql.MySqlDialect
import me.liuwj.ktorm.support.sqlite.SQLiteDialect

@Suppress("unused")
class DatabaseConfig(env: Environment) : DatabaseConfig(env) {
    init {
        // Uncomment the following line to add database support in your app
        // addConnections(env)
    }

    private fun addConnections(env: Environment) {
        addConnection(
            "mysql",
            lazy { MySqlConnection(env, dev.alpas.ozone.ConnectionConfig(sqlDialect = MySqlDialect())) })
        addConnection(
            "sqlite",
            lazy { SqliteConnection(env, dev.alpas.ozone.ConnectionConfig(sqlDialect = SQLiteDialect())) })
    }
}

