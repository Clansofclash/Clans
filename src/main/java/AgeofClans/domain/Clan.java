package AgeofClans.domain;


public class Clan {

  private long id;
  private String name;
  private long poi_Tc_Id;
  private long level;
  private double gold;
  private double gold_Reap_Rate;
  private long god_Id;
  private long poi_Clan_Hybrid_Id;
  private double happiness_Level;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public long getPoi_Tc_Id() {
    return poi_Tc_Id;
  }

  public void setPoi_Tc_Id(long poi_Tc_Id) {
    this.poi_Tc_Id = poi_Tc_Id;
  }


  public long getLevel() {
    return level;
  }

  public void setLevel(long level) {
    this.level = level;
  }


  public double getGold() {
    return gold;
  }

  public void setGold(double gold) {
    this.gold = gold;
  }


  public double getGold_Reap_Rate() {
    return gold_Reap_Rate;
  }

  public void setGold_Reap_Rate(double gold_Reap_Rate) {
    this.gold_Reap_Rate = gold_Reap_Rate;
  }


  public long getGod_Id() {
    return god_Id;
  }

  public void setGod_Id(long god_Id) {
    this.god_Id = god_Id;
  }


  public long getPoi_Clan_Hybrid_Id() {
    return poi_Clan_Hybrid_Id;
  }

  public void setPoi_Clan_Hybrid_Id(long poi_Clan_Hybrid_Id) {
    this.poi_Clan_Hybrid_Id = poi_Clan_Hybrid_Id;
  }


  public double getHappiness_Level() {
    return happiness_Level;
  }

  public void setHappiness_Level(double happiness_Level) {
    this.happiness_Level = happiness_Level;
  }

}
