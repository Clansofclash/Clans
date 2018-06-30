package AgeofClans.domain;


public class Player {

  private long id;
  private long health;
  private long upgrade_Level;
  private double private_Gold;
  private long role;
  private double amt_Of_Gold_Spent;
  private double devotion_To_God;
  private long clan_Id;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getHealth() {
    return health;
  }

  public void setHealth(long health) {
    this.health = health;
  }


  public long getUpgrade_Level() {
    return upgrade_Level;
  }

  public void setUpgrade_Level(long upgrade_Level) {
    this.upgrade_Level = upgrade_Level;
  }


  public double getPrivate_Gold() {
    return private_Gold;
  }

  public void setPrivate_Gold(double private_Gold) {
    this.private_Gold = private_Gold;
  }


  public long getRole() {
    return role;
  }

  public void setRole(long role) {
    this.role = role;
  }


  public double getAmt_Of_Gold_Spent() {
    return amt_Of_Gold_Spent;
  }

  public void setAmt_Of_Gold_Spent(double amt_Of_Gold_Spent) {
    this.amt_Of_Gold_Spent = amt_Of_Gold_Spent;
  }


  public double getDevotion_To_God() {
    return devotion_To_God;
  }

  public void setDevotion_To_God(double devotion_To_God) {
    this.devotion_To_God = devotion_To_God;
  }


  public long getClan_Id() {
    return clan_Id;
  }

  public void setClan_Id(long clan_Id) {
    this.clan_Id = clan_Id;
  }

}
