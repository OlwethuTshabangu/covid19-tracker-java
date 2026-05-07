package src.ProvinceInfo;

import java.io.Serializable;
import java.math.BigDecimal;

public class ProvinceInfo implements Serializable { // Olwethu Tshabangu
    int id; // Unique identifier for the province
    String Prov; // Name of the province
    int totalcases; // Total COVID-19 cases
    BigDecimal perctotal; // Percentage of total cases

    public ProvinceInfo() {

    }
    // Constructors
    public ProvinceInfo(int id, String Prov, int totalcases, BigDecimal perctotal) {
    this.id = id;
    this.Prov = Prov;
    this.totalcases = totalcases;
    this.perctotal = perctotal;

    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProv() {
        return Prov;
    }

    public void setProv(String Prov) {
        this.Prov = Prov;
    }

    public Integer getTotalcases() {
        return totalcases;
    }

    public void setTotalcases(Integer totalcases) {
        this.totalcases = totalcases;
    }

    public BigDecimal getperctotal() {
        return perctotal;
    }

    public void setperctotal(BigDecimal perctotal) {
        this.perctotal = perctotal;
    }

    // Static Factory Method to Create ProvinceInfo Objects
    public static ProvinceInfo create(int id, String Prov, int totalcases, BigDecimal perctotal) {
        ProvinceInfo pI = new ProvinceInfo();
        pI.setId(id);
        pI.setProv(Prov);
        pI.setTotalcases(totalcases);
        pI.setperctotal(perctotal);
        return pI;
    }

    @Override
    public String toString() {
        return "Province: " + Prov +
                "\nTotal Cases: " + totalcases +
                "\nTotal Percentage: " + perctotal + "\n";
    }

}
