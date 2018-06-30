package AgeofClans.domain;


public class Places {

  private long id;
  private String x_Val;
  private String y_Val;
  private long clan_Id;
  private long hitpoints;
  private long monster_Id;
  private long owner_Id;
  private long guardian_Id;
  private String gplaces_Json;
  private String display_Name;
  private String gplaces_Id;
  private long gamepoi_Type;
  private long poi_Type;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getX_Val() {
    return x_Val;
  }

  public void setX_Val(String x_Val) {
    this.x_Val = x_Val;
  }


  public String getY_Val() {
    return y_Val;
  }

  public void setY_Val(String y_Val) {
    this.y_Val = y_Val;
  }


  public long getClan_Id() {
    return clan_Id;
  }

  public void setClan_Id(long clan_Id) {
    this.clan_Id = clan_Id;
  }


  public long getHitpoints() {
    return hitpoints;
  }

  public void setHitpoints(long hitpoints) {
    this.hitpoints = hitpoints;
  }


  public long getMonster_Id() {
    return monster_Id;
  }

  public void setMonster_Id(long monster_Id) {
    this.monster_Id = monster_Id;
  }


  public long getOwner_Id() {
    return owner_Id;
  }

  public void setOwner_Id(long owner_Id) {
    this.owner_Id = owner_Id;
  }


  public long getGuardian_Id() {
    return guardian_Id;
  }

  public void setGuardian_Id(long guardian_Id) {
    this.guardian_Id = guardian_Id;
  }


  public String getGplaces_Json() {
    return gplaces_Json;
  }

  public void setGplaces_Json(String gplaces_Json) {
    this.gplaces_Json = gplaces_Json;
  }


  public String getDisplay_Name() {
    return display_Name;
  }

  public void setDisplay_Name(String display_Name) {
    this.display_Name = display_Name;
  }


  public String getGplaces_Id() {
    return gplaces_Id;
  }

  public void setGplaces_Id(String gplaces_Id) {
    this.gplaces_Id = gplaces_Id;
  }


  public long getGamepoi_Type() {
    return gamepoi_Type;
  }

  public void setGamepoi_Type(long gamepoi_Type) {
    this.gamepoi_Type = gamepoi_Type;
  }


  public long getPoi_Type() {
    return poi_Type;
  }

  public void setPoi_Type(long poi_Type) {
    this.poi_Type = poi_Type;
  }

}
