import object.Hotel;

import java.math.BigDecimal;
import java.util.List;

public class ComponentsForTest {


    public static boolean isCheckSortingOfListByCost(List<Hotel> hotelList) {
        for (int i = 0; i < hotelList.size() - 1; i++) {
            BigDecimal sumFirst = hotelList.get(i).getPricePerNight().getSum();
            BigDecimal sumSecond = hotelList.get(i + 1).getPricePerNight().getSum();
            if (sumSecond.compareTo(sumFirst) >= 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isCheckSortingOfListByClass(List<Hotel> hotelList) {
        boolean flag = true;
        for (int i = 0; i < hotelList.size() - 1; i++) {
            if (hotelList.get(i + 1) != hotelList.get(i)) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static boolean isCheckClassHotel(List<Hotel> hotelList, String classHotel) {
       int enteringClassHotel = Integer.parseInt(classHotel.substring(0, 1));
        return hotelList.get(0).getClassHotel() == enteringClassHotel;
    }

    public static boolean compareTwoLists(List<Hotel> hotelListOne, List<Hotel> hotelListSecond) {
        boolean flag = true;
        for (Hotel hotel : hotelListSecond) {
            for (Hotel hotel1 : hotelListOne) {
                if (hotel.equals(hotel1)) {
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
