package AgeofClans.db;


import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnect {

//    @Value("${spring.datasource.url}")
//    private String dbURL;
//
//    @Autowired
//    private DataSource dataSource;

    public static Connection getConnection() throws URISyntaxException, SQLException {
       // URI dbUri = new URI(System.getenv("DATABASE_URL"));
        URI dbUri = new URI("postgres://xuufvuklvwghms:7a6732d0ab21b9f10dfae50faf02f59b10748c385d21ec9aee0a599743208eed@ec2-54-243-28-109.compute-1.amazonaws.com:5432/dchioe3ocivf0i");
        String username = dbUri.getUserInfo().split(":")[0];
        String password = dbUri.getUserInfo().split(":")[1];
        String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + dbUri.getPath()+"?ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory";

        return DriverManager.getConnection(dbUrl, username, password);
    }

}
