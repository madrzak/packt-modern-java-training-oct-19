/**
 * Created by Lukasz Madrzak on 16/10/2019.
 */
public class City {

    private String name;
    private String region;
    private Integer avgSalary;

    public City(String name, String region, Integer avgSalary) {
        this.name = name;
        this.region = region;
        this.avgSalary = avgSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Integer getAvgSalary() {
        return avgSalary;
    }

    public void setAvgSalary(Integer avgSalary) {
        this.avgSalary = avgSalary;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", avgSalary=" + avgSalary +
                '}';
    }
}
