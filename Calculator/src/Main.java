import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Inserire i numeri
        System.out.println("Inserisci due numeri per ottenere somma, prodotto, differenza e divisione:");
        Scanner input = new Scanner(System.in);
        int numero1 = input.nextInt();
        int numero2 = input.nextInt();

        int somma = numero1 + numero2;
        int prodotto = numero1 * numero2;
        int differenza = numero1 - numero2;
        float divisione = numero1 / numero2;

        System.out.println("La somma vale: " + somma);
        System.out.println("Il prodotto vale: " + prodotto);
        System.out.println("La differenza vale: " + differenza);
        System.out.println("La divisione vale: " + divisione);

    }
}