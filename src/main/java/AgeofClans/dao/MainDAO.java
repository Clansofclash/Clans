package AgeofClans.dao;

import AgeofClans.db.DbConnect;
import org.apache.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;

import javax.xml.ws.Response;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class MainDAO {


    public static Connection connect()
    {
        Connection connection = null;
        try {
            connection = DbConnect.getConnection();
            return connection;
        }

        catch (Exception e)
        {
            System.out.println("Error in db conn = "+e);
            return null;
        }

    }

    //TODO replace return types with responses
    public String dropTable(String tableName) throws URISyntaxException, SQLException {

        Connection connection = DbConnect.getConnection();
        Statement statement = connection.createStatement();
        try
        {
            String cmd = "DROP TABLE "+tableName;//+" IF EXISTS";
            statement.executeUpdate(cmd);
            return "Done";
        }
        catch (Exception e)
        {
            return "Failure!! "+e.toString();
        }
    }
}
