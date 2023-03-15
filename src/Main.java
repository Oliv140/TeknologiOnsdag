import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("Hey");
        //Her er en kommentar i koden ;)
        //Ny kommentar
        Scanner in = new Scanner(System.in);
        System.out.println("Brøndby eller fck?");
        String svar = in.nextLine();
        if (svar.equalsIgnoreCase("Brøndby")){
            System.out.println("forkert");
        } else if (svar.equalsIgnoreCase("Fck")) {
            System.out.println("korrekt");

        } else {
            System.out.println("Skriv lige fck");
        }
    }
}
