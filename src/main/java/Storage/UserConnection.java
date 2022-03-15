package Storage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


//Single Design Pattern
// ---> a design through which you only ever create ONE SINGLE instance
public class UserConnection {

    private final Logger log = LogManager.getLogger(UserRepo.class);

    private static Connection instance;

    // "jdbc:<dialect>://<host name>:<port>/<database name>?currentSchema=<schema name>"
    private static final String url =
            "jdbc:postgresql://java-react.cghbrlmpd8rj.us-east-1.rds.amazonaws.com:5432/postgres?currentSchema=tonberrybank";

    // username and password set
    private static final String username = "postgres";
    private static final String password = "kQ5s628vVwW42Q5";


    public static Connection getConnection() throws SQLException {
        if (instance == null) {
            // url, username, password >
            instance = DriverManager.getConnection(url, username, password);
        }

        return instance;
    }

    private UserConnection() {}
}
