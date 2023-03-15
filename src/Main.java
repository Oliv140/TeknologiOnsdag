import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       boolean running = true;


        System.out.println("Hey");
        //Her er en kommentar i koden ;)
        //Ny kommentar
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
    }
}
