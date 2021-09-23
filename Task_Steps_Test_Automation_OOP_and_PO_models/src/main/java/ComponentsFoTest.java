import object.Hotel;

import java.util.List;

public class ComponentsFoTest {

    public static boolean compareTwoLists(List<Hotel> hotelListOne, List<Hotel> hotelListSecond){
        boolean flag = true;
        for (Hotel hotel : hotelListSecond) {
            for (Hotel hotel1 : hotelListOne) {
                if (hotel.equals(hotel1) == true) {
                    flag = false;
                    break;
                } else {
                    flag = true;
                }
            }
        }
        return flag;
    }

}
