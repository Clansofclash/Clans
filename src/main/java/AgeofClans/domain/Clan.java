package AgeofClans.domain;

import java.math.BigInteger;
import java.util.List;

public class Clan {
    private BigInteger ID;
    private String name;
    private List<Long> playerIDs;
    private BigInteger towncenterID;
    private Integer level;
    private double goldAmt;
    private double rateOfGold;
    private Integer godID;
    private List<BigInteger>pois;
    private float happiness;

    public BigInteger getID() {
        return ID;
    }

    public void setID(BigInteger ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Long> getPlayerIDs() {
        return playerIDs;
    }

    public void setPlayerIDs(List<Long> playerIDs) {
        this.playerIDs = playerIDs;
    }

    public BigInteger getTowncenterID() {
        return towncenterID;
    }

    public void setTowncenterID(BigInteger towncenterID) {
        this.towncenterID = towncenterID;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public double getGoldAmt() {
        return goldAmt;
    }

    public void setGoldAmt(double goldAmt) {
        this.goldAmt = goldAmt;
    }

    public double getRateOfGold() {
        return rateOfGold;
    }

    public void setRateOfGold(double rateOfGold) {
        this.rateOfGold = rateOfGold;
    }

    public Integer getGodID() {
        return godID;
    }

    public void setGodID(Integer godID) {
        this.godID = godID;
    }

    public List<BigInteger> getPois() {
        return pois;
    }

    public void setPois(List<BigInteger> pois) {
        this.pois = pois;
    }

    public float getHappiness() {
        return happiness;
    }

    public void setHappiness(float happiness) {
        this.happiness = happiness;
    }

    public Clan(BigInteger ID, String name, List<Long> playerIDs, BigInteger towncenterID, Integer level, double goldAmt, double rateOfGold, Integer godID, List<BigInteger> pois, float happiness) {
        this.ID = ID;
        this.name = name;
        this.playerIDs = playerIDs;
        this.towncenterID = towncenterID;
        this.level = level;
        this.goldAmt = goldAmt;
        this.rateOfGold = rateOfGold;
        this.godID = godID;
        this.pois = pois;
        this.happiness = happiness;
    }
}
