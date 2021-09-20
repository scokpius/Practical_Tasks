package object;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Location {
    private String countryName;
    private String regionName;
    private String townName;
}
