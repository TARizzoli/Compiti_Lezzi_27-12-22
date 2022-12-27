import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Data una data in formato GG HH MM SS
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci una data immettendo prima i giorni, poi le ore," +
                " poi i minuti e infine i secondi");
        int giorni = input.nextInt();
        int ore = input.nextInt();
        int minuti = input.nextInt();
        int secondi = input.nextInt();

        int totsecondi = secondi + 60 * minuti + 3600 * ore + 86400 * giorni;

        System.out.println("In totale i secondi sono: " + totsecondi);
        input.close();
    }
}