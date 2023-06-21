package polimorfismo;
// Classe padre:
public class Elettrodomestici {
    private String marca;
    private String modello;
    //costruttore 
    public Elettrodomestici(String marca, String modello) {
        this.marca = marca;
        this.modello = modello;
    }
    //metodi getter pubblici per accedere gli attributi della classe [incapsulamento]
    public String getMarca() {
        return marca;
    }
    
    public String getModello() {
        return modello;
    }

    public void accendere(){
        System.out.println("l'elettrodomestico è On");
    }

    public void off(){
        System.out.println("l'elettrodomestico è Off");
    }
}
 


// Definisco la classe  come figlia/sottoclasse della classe Elettrodomestici
//Lavatrice eredita attributi e metodi della classe Elettrodomestici
//[ereditarietà]

class Lavatrice extends Elettrodomestici {
    private int potenza;
     //la classe figlia aggiunge un attributo
    public Lavatrice(String marca, String modello, int potenza) {
        super(marca, modello); //uso super per ereditare il costruttore di Veicolo
        this.potenza =potenza;
    }
   
    public int getPotenza() {
        return potenza;
    }
    //[polimorfismo]
//con override sovrascrivo i metodi generici della classe Elettrodomestici con metodi che si specializzano x la classe derivata

    @Override
    public void accendere() {
        System.out.println("La lavatrice è accesa.");
    }
    
    @Override
    public void off() {
        System.out.println("La lavatrice ha finito.");
    }
}

