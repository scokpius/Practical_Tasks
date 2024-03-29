package object;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Guests {

    private String rooms;
    private String adults;
    private String children;

    @Override
    public String toString() {
        return rooms + " Room, " + adults + " Adults, " + children + " Children";
    }
}
