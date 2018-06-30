package AgeofClans.Services;

import AgeofClans.dao.PoiDao;
import AgeofClans.domain.POI;

import java.sql.ResultSet;
import java.sql.SQLException;

public class POIServices {



    public static POI getPoiByID(long id) throws SQLException {

        ResultSet result = PoiDao.getPoiByID(id);
        POI poi = new POI();

        while(result.next())
        {
            poi = getPOIFromResultSet(result);
        }

        return poi;

    }

    private static POI getPOIFromResultSet(ResultSet result) throws SQLException {
        POI poi = new POI();

        poi.setX_Val(result.getString("x_val"));
        poi.setY_Val(result.getString("y_val"));
        poi.setClan_Id(result.getLong("clan_id"));
        poi.setHitpoints(result.getInt("hitpoints"));
        poi.setMonster_Id(result.getInt("monster_id"));
        poi.setOwner_Id(result.getLong("owner_id"));
        poi.setGuardian_Id(result.getLong("guardian_id"));
        poi.setGplaces_Json(result.getString("GPLACES_JSON"));
        poi.setDisplay_Name(result.getString("display_name"));
        poi.setGplaces_Id(result.getString("gplaces_id"));
        poi.setGamepoi_Type(result.getInt("gamePOI_type"));
        poi.setPoi_Type(result.getInt("poi_type"));

        return poi;
    }
}
