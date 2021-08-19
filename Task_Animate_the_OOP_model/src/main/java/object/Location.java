package object;

public class Location {
    private String countryName;
    private String regionName;
    private String townName;

    public Location(String countryName, String regionName, String townName) {
        this.countryName = countryName;
        this.regionName = regionName;
        this.townName = townName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getTownName() {
        return townName;
    }

    public void setTownName(String townName) {
        this.townName = townName;
    }
}
