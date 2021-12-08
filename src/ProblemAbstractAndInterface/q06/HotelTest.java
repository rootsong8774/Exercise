package ProblemAbstractAndInterface.q06;

class Hotel {

    private static class Room {

        int number;
        String client;

        public Room(int number, String client) {
            this.number = number;
            this.client = client;
        }
    }

    final private Room[] rooms = new Room[10];

    public void add(int number, String client) {
        number = Math.max(0, Math.min(9, number));
        if (rooms[number] == null) {
            rooms[number] = new Room(number, client);
        }
    }

    public void show() {
        for (Room room : rooms) {
            if (room != null) {
                System.out.println((room.number) + 1 + " 번 방을 " + room.client + "님께서 예약하셨습니다.");
            }

        }
    }
}


public class HotelTest {

    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        hotel.add(11, "호돌이");
        hotel.add(5, "RootSong");
        hotel.add(5, "룻송");
        hotel.add(7, "길동이");
        hotel.show();
    }

}
