package day3;

import java.util.Scanner;

public class tryfunc {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il tuo nome");
        String nome = scanner.nextLine(); 
        //salvo il nome inserito da utente nella variabile nome di tipo stringa
        saluta(nome);

        double x, y, area;
        x=7.4;
        y=8.3;
        area = calcolaArea(x,y);
        System.out.println("l'area è: "+ area);

    }

    // creare una funzione che saluta
    // al posto dell'argomento nome posso mettere anche abc
    // void perchè faccio solo un print, non lo salva - non c'è return

    public static void saluta(String nome){

        System.out.println("ciao "+ nome + " !");

    }

    //non posso usare un nome di funzione che già c'è

    public static double calcolaArea(double b, double h){
        double area = b*h;
        return area;
    }

    
}
