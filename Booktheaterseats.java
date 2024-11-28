class MovieBookApp1 {

	int total_seats = 10;
	 void bookSeats(int seats) {
		System.out.println("Hello"+Thread.currentThread().getName());
		System.out.println("Hello"+Thread.currentThread().getName());
		System.out.println("Hello"+Thread.currentThread().getName());
		synchronized(this) {
		if(total_seats>=seats) {
			System.out.println(seats+": seats book successfully");
			total_seats = total_seats-seats;
			System.out.println("seats left: " + total_seats);
		}
		else {
			System.out.println("seats cannot be booked");
			System.out.println("seats left: " + total_seats);
		}
		}
		System.out.println("Hello"+Thread.currentThread().getName());
		System.out.println("Hello"+Thread.currentThread().getName());
		System.out.println("Hello"+Thread.currentThread().getName());
	}
}

public class Booktheaterseats extends Thread {
	static MovieBookApp1 b;
	int seats;
	public void run() {
		b.bookSeats(seats);
	}
	public static void main(String args[]) {
		b= new MovieBookApp1();
		Booktheaterseats sam= new Booktheaterseats();
		sam.seats = 7;
		sam.start();
		Booktheaterseats preeti= new Booktheaterseats();
		preeti.seats=6;
		preeti.start();
	}
}
