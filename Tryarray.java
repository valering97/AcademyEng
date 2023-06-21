import java.util.ArrayList;
import java.util.Scanner;

public class Tryarray {
    public static void main(String[] args){
        //creo ArrayList
        /* ArrayList<Integer> listaNum = new ArrayList<>();
        listaNum.add(3);
        listaNum.add(4);
        listaNum.add(6);
        // stampo primo e ultimo elem
        System.out.println(listaNum.get(0));
        System.out.println(listaNum.get(2));

        //stampo tutto array
        for (int i=0; i<listaNum.size(); i++){
            System.out.println(listaNum.get(i));
    
        }

        // array di numeri

        int[] numeri = {5, 2, 9, 7, 1};

        // stampo tutto l'array
    
        for (int i = 0; i < numeri.length; i++){
            System.out.println(numeri[i]);
    
        }

        //crea arraylist di interi e aggiunga numeri da 1-10 e li stampi

        ArrayList<Integer> listaInt = new ArrayList<>();
        for (int i = 0; i < 11; i++){
            listaInt.add(i);
        } listaInt.remove(5); //rimuove elem in posizione 5
        for (int k = 0; k < listaInt.size(); k++){ 
            // se metto solo istrux di stampa senza for, mi stampa lista finale
            //invece iterando anche la stampa mi viene un num per volta
            //servono 2 indici diversi per i for 
            System.out.println(listaInt.get(k));
        }

        //crea un array di numeri interi 
        //trovi il valore massimo presente nell'array + stampa

        int[] arrInt = {3, 7, 1, 9, 5};
        int varMax = arrInt[0]; //inizializzo il valore max al primo elem così lo aggiorno se non è il max
        for (int i=1; i<arrInt.length; i++){
            if (arrInt[i] > varMax){
                varMax = arrInt[i];
            } 
        }
        System.out.println("il valore massimo è: "+varMax);
        
        //Scrivi un programma che crei un'ArrayList di stringhe
        // aggiunga cinque colori (ad esempio "rosso", "verde", "blu", "giallo", "arancione") all'ArrayList
        //Stampare tutti gli elementi dell'ArrayList in ordine inverso.

        ArrayList<String> listaStringhe = new ArrayList<>();
        listaStringhe.add("rosso");
        listaStringhe.add("verde");
        listaStringhe.add("blu");
        listaStringhe.add("giallo");
        listaStringhe.add("arancione");
        //parto dalla fine quindi size(-1) finchè ho elementi quindi i>=0
        for (int i= listaStringhe.size()-1; i>=0; i--){
            System.out.println(listaStringhe.get(i));
        } */

        //Scrivi un programma in Java che esamini un array di numeri interi 
        //identifichi tutti i numeri pari presenti nell'array. 
        //Successivamente, stampa i numeri pari trovati utilizzando un ciclo while.
        //num pari quando divisibile % per 2 il resto deve essere 0

        /*int[] numeri = {2, 7, 4, 1, 9};
        for (int i=0; i<numeri.length; i++){
            if (numeri[i]%2 == 0){
                System.out.println(numeri[i]);
            }
        } */

        /* ArrayList<Integer> numeri = new ArrayList<>();
        numeri.add(2);
        numeri.add(7);
        numeri.add(4);
        numeri.add(1);
        numeri.add(9);
        for (int i = 0; i < numeri.size(); i++){
            if (numeri.get(i) % 2 == 0){
                System.out.println(numeri.get(i));
            }
        } */

        /*int[] numeri = {2, 7, 4, 1, 9};
        ArrayList<Integer> numeriPari = new ArrayList<>();
        for (int i=0; i<numeri.length; i++){
            if (numeri[i]%2 == 0){
                System.out.println(numeri[i]);
                numeriPari.add(numeri[i]);
            }
        }

        int i=0;
        while (numeriPari.size()!=0){
            System.out.println(numeriPari.get(i));
            i++;
        } */
/* 
        int[] numeri = {2, 7, 4, 1, 9};         
        ArrayList<Integer> numeriPari = new ArrayList<>(); 
    // Utilizziamo un ciclo for per scorrere gli elementi dell'array numeri        
        for (int i = 0; i < numeri.length; i++) {             
        // Utilizziamo un'istruzione if per verificare se l'elemento è pari            
            if (numeri[i] % 2 == 0) {                 
            numeriPari.add(numeri[i]);             
            }         
        }         
    // Utilizziamo un ciclo while per stampare gli elementi dell'ArrayList numeriPari        
        int index = 0;         
        while (index < numeriPari.size()) {             
            System.out.println(numeriPari.get(index));             
        index++;         
        } */


        //System.out.print("Inserisci una sequenza di numeri separati da spazio: ");
        //usa .split()

        //devo leggere un elenco di int da input
        /* Scanner sc = new Scanner(System.in);
        //int elenco= sc.nextInt();    
        System.out.print("Inserisci una sequenza di numeri separati da spazio: ");
        String input = sc.nextLine(); 
        String[] numeriString = input.split(" ");
        

        int[] numeri = new int[numeriString.length];
        for (int i = 0; i < numeriString.length; i++) {             
            numeri[i] = Integer.parseInt(numeriString[i]);         
        }
 */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci una seq di numeri interi separati da spazio: ");
        String input = scanner.nextLine();

        // Dividi la stringa in numeri individuali
        String[] numeriString = input.split(" ");
        int[] numeri = new int[numeriString.length];

        for(int i = 0; i < numeriString.length; i++){
            numeri[i]=Integer.parseInt(numeriString[i]);
        }

        //conteggio positivi - neg - 0
        int positivi = 0;
        int zero = 0;
        ArrayList<Integer> negativi = new ArrayList<>();

        for (int numero: numeri){
            if (numero > 0){
                positivi++;
            } else if (numero < 0){
                negativi.add(numero);
            } else {
                zero++;
            }
        }

        System.out.println("Numeri positivi: "+ positivi);
        System.out.println("Numeri negativi: "+ negativi.size());
        System.out.println("Numeri uguali a zero: "+ zero);

        /*for (int i=0; i<numeri.length(); i++){
            if (numeri[i]=Integer.parseInt(numeri[i])>0){
                positivi++;
            } else if (numeri[i]=Integer.parseInt(numeri[i])==0){
                zero++;
            } else {
                negativi.add(Integer.parseInt(numeri[i]));
            }
        }*/



        







        



    }
}