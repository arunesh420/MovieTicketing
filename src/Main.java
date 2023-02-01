import Models.Movie;
import Models.Seat;
import Models.Ticket;
import Models.User;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> genres = new ArrayList<>();
        genres.add("Fiction");
        genres.add("Asian");
        genres.add("Drama");
        genres.add("War");
        genres.add("Action");
        genres.add("Suspense");
        genres.add("Conedy");
        genres.add("Romance");

        ArrayList<String> Cirkus = new ArrayList<>();
        Cirkus.add(genres.get(0));
        Cirkus.add(genres.get(2));
        Cirkus.add(genres.get(4));
        Cirkus.add(genres.get(6));
        Cirkus.add(genres.get(1));

        ArrayList<String> SVR = new ArrayList<>();
        SVR.add(genres.get(2));
        SVR.add(genres.get(5));
        SVR.add(genres.get(4));
        SVR.add(genres.get(7));

        ArrayList<String> Pathaan = new ArrayList<>();
        Pathaan.add(genres.get(1));
        Pathaan.add(genres.get(2));
        Pathaan.add(genres.get(3));
        Pathaan.add(genres.get(4));
        Pathaan.add(genres.get(7));

        Movie m1 = new Movie(true, true, Cirkus, "Cirkus", "XY ZY", "16:00 PM", 550, 350);
        Movie m2 = new Movie(true, true, SVR, "SVR: The Return of Surya", "Ab Cd", "19:30 PM", 750, 500);
        Movie m3 = new Movie(true, true, Pathaan, "Pathaan: The Mission", "Selmon Bhei", "16:15 PM", 550, 300);


        m1.getMovieDetail();
        for (String singleCirkus: Cirkus){
            System.out.println("-"+singleCirkus);
        }

        m2.getMovieDetail();
        for (String singleSVR: SVR){
            System.out.println("-"+singleSVR);
        }

        m3.getMovieDetail();
        for (String singlePathaan: Pathaan){
            System.out.println("-"+singlePathaan);
        }

        System.out.println("\n\n-----------------------Movies And Showtime-----------------------");
        m1.getMovies();
        m2.getMovies();
        m3.getMovies();

        System.out.println("\n\n-----------------------Specific Showtime-----------------------");
        m1.getSpecificMovie("14:00 PM");

        User u1 = new User("Sucky Shresth", 1001, "sckyshth@gmail.com");
        User u2 = new User("Subash Rin", 1002, "subasrin@gmail.com");
        User u3 = new User("Ttsi Pandit", 1003, "panditatsi@gmail.com");

        ArrayList<Seat> seatsCirkus = new ArrayList<>();
        seatsCirkus.add(new Seat("H",10));
        seatsCirkus.add(new Seat("H",11));
        seatsCirkus.add(new Seat("H",12));
        seatsCirkus.add(new Seat("H",13));

        ArrayList<Seat> seatsSVR = new ArrayList<>();
        seatsSVR.add(new Seat("J",12));
        seatsSVR.add(new Seat("J",13));
        seatsSVR.add(new Seat("J",14));
        seatsSVR.add(new Seat("J",15));
        seatsSVR.add(new Seat("J",16));
        seatsSVR.add(new Seat("J",17));

        ArrayList<Seat> seatsPathaan = new ArrayList<>();
        seatsPathaan.add(new Seat("G", 5));
        seatsPathaan.add(new Seat("G", 6));
        seatsPathaan.add(new Seat("G", 7));

        Ticket t1 = new Ticket(u1.getUser_id(), m1.getName(), m1.getShowTime(), seatsCirkus);
        Ticket t2 = new Ticket(u2.getUser_id(), m2.getName(), m2.getShowTime(), seatsSVR);
        Ticket t3 = new Ticket(u3.getUser_id(), m3.getName(), m3.getShowTime(), seatsPathaan);

    }
}