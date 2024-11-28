

class MovieBookApp {

	int total_seats = 10;

	 synchronized void bookSeats(int seats) {
		if (total_seats >= seats) {
			System.out.println(seats + ": seats book successfully");
			total_seats = total_seats - seats;
			System.out.println("seats left: " + total_seats);
		} else {
			System.out.println("seats cannot be booked");
			System.out.println("seats left: " + total_seats);
		}
	}
}

class BookTheaterApp extends Thread {
	static MovieBookApp b;
	int seats;

	public void run() {
		b.bookSeats(seats);
	}

	public static void main(String args[]) {
		b = new MovieBookApp();
		BookTheaterApp sam = new BookTheaterApp();
		sam.seats = 7;
		sam.start();
		BookTheaterApp preeti = new BookTheaterApp();
		preeti.seats = 6;
		preeti.start();
	}
}
