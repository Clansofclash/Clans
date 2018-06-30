package AgeofClans.dao;

import AgeofClans.domain.POI;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PoiDao {

    public static ResultSet getPoiByID(Long id) throws SQLException {
        Connection conn = MainDAO.connect();
        if(conn == null) return null;

        String query = "select * from poi where \"ID\" = "+id;
        Statement statement = conn.createStatement();

        return statement.executeQuery(query);

    }


}
