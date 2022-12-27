import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Quadrato
        System.out.println("Inserisci il lato del quadtrato per ottenerne il perimetro e l'area!");
        Scanner input = new Scanner(System.in);
        int lato = input.nextInt();
        System.out.println("Il perimetro vale: " + 4 * lato + " e l'area vale: " + lato * lato);

        //Rettangolo
        System.out.println("Inserisci la base e l'altezza del rettangolo per ottenerne il perimetro e l'area!");
        int base = input.nextInt();
        int altezza = input.nextInt();
        System.out.println("Il perimetro vale: " + ((2 * base) + (2 * altezza))
                + " e l'area vale: " + (base * altezza));

        //Triangolo
        System.out.println("Inserisci la base e l'altezza del triangolo per ottenerne il perimetro e l'area!");
        int baset = input.nextInt();
        int altezzat = input.nextInt();
        System.out.println("Il perimetro vale: " + 3 * baset
                + " e l'area vale: " + (baset * altezzat));

        //Cerchio
        System.out.println("Inserisci il raggio del cerchio per ottenerne la circonferenza e l'area!");
        int raggio = input.nextInt();
        System.out.println("Il perimetro vale: " + 2 * raggio * Math.PI + " e l'area vale: " + raggio * raggio * Math.PI);

        input.close();
    }
}