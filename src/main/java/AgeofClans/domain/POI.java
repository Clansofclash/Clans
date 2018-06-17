package AgeofClans.domain;

public class POI {

    Long  ID ;
    Point point;
    Integer type;
    Long clanID ;
    Integer hitPoints ;
    Integer monsterID;
    Integer ownerID;
    Long guardianID;

    public POI(Long ID, Point point, Integer type, Long clanID, Integer hitPoints, Integer monsterID, Integer ownerID, Long guardianID) {
        this.ID = ID;
        this.point = point;
        this.type = type;
        this.clanID = clanID;
        this.hitPoints = hitPoints;
        this.monsterID = monsterID;
        this.ownerID = ownerID;
        this.guardianID = guardianID;
    }

    public Long getGuardianID() {
        return guardianID;
    }

    public void setGuardianID(Long guardianID) {
        this.guardianID = guardianID;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getClanID() {
        return clanID;
    }

    public void setClanID(Long clanID) {
        this.clanID = clanID;
    }

    public Integer getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(Integer hitPoints) {
        this.hitPoints = hitPoints;
    }

    public Integer getMonsterID() {
        return monsterID;
    }

    public void setMonsterID(Integer monsterID) {
        this.monsterID = monsterID;
    }

    public Integer getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(Integer ownerID) {
        this.ownerID = ownerID;
    }
}
