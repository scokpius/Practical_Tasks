package object;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Location {
    private String countryName;
    private String regionName;
    private String townName;

    public Location(String countryName, String regionName, String townName) {
        this.countryName = countryName;
        this.regionName = regionName;
        this.townName = townName;
    }
}
