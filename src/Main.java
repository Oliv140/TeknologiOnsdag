import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       boolean running = true;


        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Brøndby eller Fck");
            String svar = in.nextLine();
            if (svar.equalsIgnoreCase("Brøndby")) {
                System.out.println("Forkert!");
            } else if (svar.equalsIgnoreCase("Fck")) {
                System.out.println("Korrekt!");
                running = false;

            } else {
                System.out.println("Skriv lige fck");
            }
        }
        while (running);
        } else {
            System.out.println("Skriv lige fck");
        } ///////EYO CHANGED TODO HURB/////////////////////////////////////////////////////////////////////////////////////////////////////
    }
}
