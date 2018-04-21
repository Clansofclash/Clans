package AgeofClans.dao;

public class ClanDao {

    private static String tableCreatecmd = "CREATE TABLE POI(\n" +
            "   ID INT PRIMARY KEY      NOT NULL,\n" +
            "   NAME           CHAR(50) NOT NULL,\n" +
            "   LEVEL          INT      NOT NULL\n" +
            "   TC_ID          INT      NOT NULL\n" +
            "   GOLD           INT      NOT NULL\n" +
            "   GOLD_RATE      INT      NOT NULL\n" +
            "   GOD_ID         INT      NOT NULL\n" +
            "   HAPPINESS      FLOAT    NOT NULL\n" +
            ");";
}
