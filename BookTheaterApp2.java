
class MovieBookApp2 {

	static int total_seats = 20;

	static synchronized void bookSeats(int seats) {
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

class Mythread1 extends Thread {
	MovieBookApp2 b;
	int seats;

	Mythread1(MovieBookApp2 b, int seats) {
		this.b = b;
		this.seats = seats;
	}

	public void run() {
		b.bookSeats(seats);
	}
}

class Mythread2 extends Thread {
	MovieBookApp2 b;
	int seats;

	Mythread2(MovieBookApp2 b, int seats) {
		this.b = b;
		this.seats = seats;
	}

	public void run() {
		b.bookSeats(seats);
	}
}

public class BookTheaterApp2 {

	public static void main(String args[]) {
		MovieBookApp2 b1 = new MovieBookApp2();
		Mythread1 t1 = new Mythread1(b1, 7);
		t1.start();
		Mythread2 t2 = new Mythread2(b1, 6);
		t2.start();

		MovieBookApp2 b2 = new MovieBookApp2();
		Mythread1 t3 = new Mythread1(b2, 5);
		t3.start();
		Mythread2 t4 = new Mythread2(b2, 9);
		t4.start();

	}
}
