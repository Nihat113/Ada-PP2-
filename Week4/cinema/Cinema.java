package Week4.cinema;

public class Cinema {
    private String movieName;
    private boolean[] seats;


    public Cinema(String movieName, int numberOfSeats){
        this.movieName = movieName;
        this.seats = new boolean[numberOfSeats];
    }

    public String getMovieName(){
        return movieName;
    }
    public boolean[] seats(){
        return seats;
    }


    public void displaySeats(){
        for (int i = 0; i < seats.length; i++) {

        if (seats[i] == false) {
            System.out.println("Seat " + (i + 1) + ": Available");
        } else {
            System.out.println("Seat " + (i + 1) + ": Booked");
        }

        }
    }

    public void bookSeat(int seatNumber){

        if (seatNumber < 1 || seatNumber > seats.length) {
            System.out.println("Invalid Number!!!");
        }
        else if (seats[seatNumber - 1] == true) {
            System.out.println("This seat is already booked");
        }
        else{
            seats[seatNumber - 1] = true;
            System.out.println("Booking successful!");
        }
    }

    public void cancelBooking(int seatNumber) {

        if (seatNumber < 1 || seatNumber > seats.length) {
            System.out.println("Invalid seat number!");

        } else if (seats[seatNumber - 1] == false) {
            System.out.println("This seat is not booked!");

        } else {
            seats[seatNumber - 1] = false;
            System.out.println("Booking cancelled!");
        }
    }

    public int getAvailableSeats() {

        int count = 0;

        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == false) {
                count++;
            }
        }

        return count;
    }



    public static void main(String[] args) {
        
        Cinema cinema = new Cinema("Avatar", 7);
        cinema.displaySeats();

        cinema.bookSeat(2);
        cinema.bookSeat(6);

        System.out.println("\nFinal seat status:");
        cinema.displaySeats();


    }

}


