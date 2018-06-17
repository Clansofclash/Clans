package AgeofClans.domain;

import java.math.BigInteger;

public class Monster {
    private BigInteger ID;
    private String Name;
    private BigInteger Instances;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public BigInteger getInstances() {
        return Instances;
    }

    public void setInstances(BigInteger Instances) {
        this.Instances = Instances;
    }

    public BigInteger getID() {
        return ID;
    }

    public Monster(BigInteger ID, String name, BigInteger instances) {
        this.ID = ID;
        Name = name;
        Instances = instances;
    }
}