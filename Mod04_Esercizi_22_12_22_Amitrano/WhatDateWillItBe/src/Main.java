import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci un numero di seconti secondi per ottenere una quantità" +
                " di giorni, ore, minuti e secondi.");
        int seconds = input.nextInt();

            int giorni = seconds / 86400;
            seconds %= 86400;
            int ore = seconds / 3600;
            seconds %= 3600;
            int minuti = seconds / 60;
            seconds %= 60;
            int secondi = seconds;

        System.out.println("In totale i giorni sono: " + giorni);
        System.out.println("In totale le ore sono: " + ore);
        System.out.println("In totale i minuti sono: " + minuti);
        System.out.println("In totale i secondi sono: " + secondi);

        input.close();
    }
}