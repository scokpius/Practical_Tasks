import javax.xml.crypto.Data;

public class HotelSearch {
    private Location location;
    private Data arriveDate;
    private Data departureDate;
    private Room rooms[];


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

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] room) {
        System.arraycopy(room, 0, rooms, 0, rooms.length);
    }

    // На сайте так устроенно что в 1 комнату могут заселиться только 4 гостя разного возраста
    // если гостей 5 то автомотически увелисивается количество комнот до 2
    public int countNumberRooms(Room room) {
        int countNumberRooms = 0;
        if (room.getGuests().length > 0) {
            if (room.getGuests().length % 4 > 0) {
                countNumberRooms = room.getGuests().length / 4 + 1;
            } else {
                if ((room.getGuests().length / 4) > 0 && (room.getGuests().length / 4) < 4) {
                    countNumberRooms = 1;
                } else {
                    countNumberRooms = room.getGuests().length / 4;
                }
            }

        }
        return countNumberRooms;
    }

    public int countGuest() {
        int countGuest = 0;
        for (Room room : rooms) {
            countGuest = room.getGuests().length;
        }
        return countGuest;
    }


}
