package ProblemAbstractAndInterface.q06;

class Hotel {

	private static class Room {

		private final Integer number;
		private final String client;

		public Room(Integer number, String client) {
			this.number = number;
			this.client = client;
		}
	}

	private final Room[] rooms = new Room[10];

	public Integer numberBound(Integer number) {
		if (number < 0) {
			return 0;
		}
		if (number > 9) {
			return 9;
		}

		return number;
	}

	private boolean isEmpty(Room room) {
		return room == null;
	}

	public void add(Integer number, String client) {
		number = numberBound(number);
		Room room = new Room(number, client);

		if (isEmpty(rooms[number])) {
			rooms[number] = room;
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
		hotel.add(13, "호돌이");
		hotel.add(11, "호돌이");
		hotel.add(5, "RootSong");
		hotel.add(5, "룻송");
		hotel.add(7, "길동이");
		hotel.show();
	}
}