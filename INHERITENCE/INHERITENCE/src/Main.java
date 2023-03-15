import model.Movies;
import model.Seats;
import model.Ticket;
import model.User;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int movie_input;

        Movies movie1 = new Movies(50,true,"Thriller","Megan",12,"Gerard Johnstone",200);
        Movies movie2 = new Movies(50,true,"Adventure","Black Panther",6,"Ryan Coogler",200);
        Movies movie3 = new Movies(50,true,"Action","John Wick",2,"Chad Stahelski",200);
        Movies movie4 = new Movies(50,true,"Horror","Lulluby",8,"John R. Leonetti",200);

        ArrayList<Movies> movies = new ArrayList<Movies>();
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);

        ArrayList<User> userlist = new ArrayList<User>();
        User user1 = new User("Ram","ram@123.com");
        User user2 = new User("Shyam","Shyam@123.com");
        User user3 = new User("Hari","Hari@123.com");
        userlist.add(user1);
        userlist.add(user2);
        userlist.add(user3);


        Seats seats1 = new Seats("Good",1);
        Seats seats2 = new Seats("Good",2);
        Seats seats3 = new Seats("Good",3);
        Seats seats4 = new Seats("Good",4);
        Seats seats5 = new Seats("Good",5);
        Seats seats6 = new Seats("Good",6);
        Seats seats7 = new Seats("Good",7);
        Seats seats8 = new Seats("Good",8);
        Seats seats9 = new Seats("Good",9);

        ArrayList<Seats> seatlist = new ArrayList<>();
        seatlist.add(seats1);
        seatlist.add(seats2);
        seatlist.add(seats3);
        seatlist.add(seats4);
        seatlist.add(seats5);
        seatlist.add(seats6);
        seatlist.add(seats7);
        seatlist.add(seats8);
        seatlist.add(seats9);

        Ticket t1 = new Ticket(userlist,seatlist,movies);
        System.out.println("Select the movie you want to watch");
        System.out.println("1"); movie1.getInfo();
        System.out.println("2"); movie2.getInfo();
        System.out.println("3"); movie3.getInfo();
        System.out.println("4"); movie4.getInfo();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the number based on the number you want to watch");
        movie_input = scanner1.nextInt();
        if(movie_input== 1){
            System.out.println("Enter the number of seats you will be needing");
            int numberofseats = scanner1.nextInt();
            System.out.println("The movie you want to watch is"+ movie1.getMovie_name());
            System.out.println("would you like to purchase sofa seat?");
            boolean sofa = scanner1.nextBoolean();
            if(sofa == true){
                System.out.println("Your bill:");
                System.out.println("movie ticket price:" + movie1.getPrice());
                System.out.println("Sofa price: 200");
                System.out.println("Total number of seats :"+numberofseats);
                System.out.println("Total :" + (movie1.getPrice()+(200*numberofseats)));

            }
            else{
                System.out.println("Your bill:");
                System.out.println("movie ticket price:" + movie1.getPrice());
                System.out.println("Seat price: 50");
                System.out.println("Total number of seats :"+numberofseats);
                System.out.println("Total :" + (movie1.getPrice()+(50*numberofseats)));

            }
        }
        if(movie_input== 2){
            System.out.println("Enter the number of seats you will be needing");
            int numberofseats = scanner1.nextInt();
            System.out.println("The movie you want to watch is"+ movie2.getMovie_name());
            System.out.println("would you like to purchase sofa seat?");
            boolean sofa = scanner1.nextBoolean();
            if(sofa == true){
                System.out.println("Your bill:");
                System.out.println("movie ticket price:" + movie2.getPrice());
                System.out.println("Sofa price: 200");
                System.out.println("Total number of seats :"+numberofseats);
                System.out.println("Total :" + (movie2.getPrice()+(200*numberofseats)));

            }
            else{
                System.out.println("Your bill:");
                System.out.println("movie ticket price:" + movie2.getPrice());
                System.out.println("Seat price: 50");
                System.out.println("Total number of seats :"+numberofseats);
                System.out.println("Total :" + (movie2.getPrice()+(50*numberofseats)));

            }
        }
        if(movie_input== 3){
            System.out.println("Enter the number of seats you will be needing");
            int numberofseats = scanner1.nextInt();
            System.out.println("The movie you want to watch is"+ movie3.getMovie_name());
            System.out.println("would you like to purchase sofa seat?");
            boolean sofa = scanner1.nextBoolean();
            if(sofa == true){
                System.out.println("Your bill:");
                System.out.println("movie ticket price:" + movie3.getPrice());
                System.out.println("Sofa price: 200");
                System.out.println("Total number of seats :"+numberofseats);
                System.out.println("Total :" + (movie3.getPrice()+(200*numberofseats)));

            }
            else{
                System.out.println("Your bill:");
                System.out.println("movie ticket price:" + movie3.getPrice());
                System.out.println("Seat price: 50");
                System.out.println("Total number of seats :"+numberofseats);
                System.out.println("Total :" + (movie3.getPrice()+(50*numberofseats)));

            }
        }
        if(movie_input== 4){
            System.out.println("Enter the number of seats you will be needing");
            int numberofseats = scanner1.nextInt();
            System.out.println("The movie you want to watch is"+ movie4.getMovie_name());
            System.out.println("would you like to purchase sofa seat?");
            boolean sofa = scanner1.nextBoolean();
            if(sofa == true){
                System.out.println("Your bill:");
                System.out.println("movie ticket price:" + movie4.getPrice());
                System.out.println("Sofa price: 200");
                System.out.println("Total number of seats :"+numberofseats);
                System.out.println("Total :" + (movie4.getPrice()+(200*numberofseats)));

            }
            else{
                System.out.println("Your bill:");
                System.out.println("movie ticket price:" + movie4.getPrice());
                System.out.println("Seat price: 50");
                System.out.println("Total number of seats :"+numberofseats);
                System.out.println("Total :" + (movie4.getPrice()+(50*numberofseats)));

            }
        }

    }
}