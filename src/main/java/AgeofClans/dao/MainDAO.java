package AgeofClans.dao;

import AgeofClans.db.DbConnect;
import org.springframework.beans.factory.annotation.Autowired;

import javax.xml.ws.Response;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class MainDAO {


    DbConnect dbConnect;

    public MainDAO()
    {
        this.dbConnect = new DbConnect();
    }


    public String test()
    {

        try {
            Connection connection = dbConnect.getConnection();
            return "Succes";
        } catch (URISyntaxException e) {

            return "Syntax fucked!! "+e.toString();
        } catch (SQLException e) {

            return "SQL Fucked!! "+e.toString();
        }
        //return "no joy";
    }

    //TODO replace return types with responses
    public String dropTable(String tableName) throws URISyntaxException, SQLException {

        Connection connection = dbConnect.getConnection();
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
