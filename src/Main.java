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
                jubel();
                running = false;
            } else {
                System.out.println("Skriv lige fck");
            }
        }
        while (running);
        }

        public static void jubel(){
            for(int i = 0; i < 6; i++){
                System.out.println("lå!");
            }
        }
    }

