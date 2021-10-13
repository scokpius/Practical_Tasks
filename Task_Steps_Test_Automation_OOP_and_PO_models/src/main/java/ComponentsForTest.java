import object.Hotel;

import java.math.BigDecimal;
import java.util.List;

class ComponentsForTest {


    static boolean isCheckSortingOfListByCost(List<Hotel> hotelList) {
        for (int i = 0; i < hotelList.size() - 1; i++) {
            BigDecimal sumFirst = hotelList.get(i).getPricePerNight().getSum();
            BigDecimal sumSecond = hotelList.get(i + 1).getPricePerNight().getSum();
            if (sumSecond.compareTo(sumFirst) < 0 && sumSecond.compareTo(sumFirst) == 0) {
                System.out.println(sumSecond.compareTo(sumFirst));
                return false;
            }
        }
        return true;
    }

    static boolean isCheckSortingOfListByClass(List<Hotel> hotelList) {
        for (int i = 0; i < hotelList.size() - 1; i++)
            if (hotelList.get(i + 1).getClassHotel() != hotelList.get(i).getClassHotel()) {
                return false;
            }
        return true;
    }

    static boolean isCheckFirstItemFromListForHotelClass(List<Hotel> hotelList, String classHotel) {// перименовать что первый элемент из списка имеет
       int enteringClassHotel = Integer.parseInt(classHotel.substring(0, 1));
        return hotelList.get(0).getClassHotel() == enteringClassHotel;
    }

    static boolean isCompareListWithModifiedParametersWithOriginalList(List<Hotel> hotelListOne, List<Hotel> hotelListSecond) {


        for (int i = 0; i < hotelListOne.size(); i++) {
            if (hotelListOne.contains(hotelListSecond)){
                return false;
            }
        }
       return true;



//        for (Hotel hotel : hotelListSecond) {
//            for (Hotel hotel1 : hotelListOne) {
//                if (hotel.(hotel1)) {
//                    flag = false;
//                    break;
//                } else {
//                    flag = true;
//                }
//            }
//        }
//        return flag;
    }


}
