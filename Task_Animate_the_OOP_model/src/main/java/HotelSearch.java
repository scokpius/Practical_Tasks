import javax.xml.crypto.Data;
import java.util.List;

public class HotelSearch {
    private Location location;
    private Data arriveDate;
    private Data departureDate;
    private List<Room> rooms;


    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location1) {
        location = location1;
    }

    public Data getArriveDate() {
        return arriveDate;
    }

    public void setArriveDate(Data arriveDate) {
        this.arriveDate = arriveDate;
    }

    public Data getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Data departureDate) {
        this.departureDate = departureDate;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> room) {
        this.rooms.addAll(room);
    }

    // На сайте так устроенно что в 1 номер могут заселиться только 4 гостя разного возраста
    // если гостей 5 то автомотически увелисивается количество номеров до 2
    // функция нужна для определения количества номеров (может понадобиться для проверки)
    public int countNumberRooms(List<Guest> guests) {  //расчитывает минимальный размер List<Room>
        int countNumberRooms = 0;
        if (guests.size() > 0) {
            if (guests.size() % 4 > 0) {
                countNumberRooms = guests.size() / 4 + 1;
            } else {
                countNumberRooms = guests.size() / 4;
            }
        }
        return countNumberRooms;
    }

    public int countGuest() {
        int countGuest = 0;
        for (Room room : rooms) {
            countGuest += room.getGuests().size();
        }
        return countGuest;
    }
}
