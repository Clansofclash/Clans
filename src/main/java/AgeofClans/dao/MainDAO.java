package AgeofClans.dao;

import AgeofClans.db.DbConnect;
import org.springframework.beans.factory.annotation.Autowired;

import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.SQLException;

public class MainDAO {

    @Autowired
    DbConnect dbConnect;

    public String test()
    {
//        try {
//            Connection connection = dbConnect.getConnection();
//            return "Succes";
//        } catch (URISyntaxException e) {
//            //e.printStackTrace();
//            return e.toString();
//        } catch (SQLException e) {
//            //e.printStackTrace();
//            return e.toString();
//        }
        return "no joy";
    }
}
