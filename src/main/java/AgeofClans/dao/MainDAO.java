package AgeofClans.dao;

import AgeofClans.db.DbConnect;
import org.springframework.beans.factory.annotation.Autowired;

import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.SQLException;

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
}
