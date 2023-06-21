package polimorfismo;

// Nel Main creo gli oggetti delle classi
public class MainE {
    public static void main(String[] args) {
        Elettrodomestici elettrodomestico = new Elettrodomestici("Philips", "Magic");
//applico i metodi all’oggetto
        System.out.println("Marca dell'elettrodomestico: " +elettrodomestico.getMarca());
        System.out.println("Modello dell'elettrodomestico: " + elettrodomestico.getModello());
        elettrodomestico.accendere();
        elettrodomestico.off();

        Lavatrice lavatrice = new Lavatrice("LG", "LavatricePower", 500);
        
 
        //dalla stampa verifico che i metodi sono stati sovrascritti       
        System.out.println("Marca della lavatrice: " + lavatrice.getMarca());
        System.out.println("Modello della lavatrice: " + lavatrice.getModello());
        System.out.println("potenza della lavatrice: " + lavatrice.getPotenza ());
        lavatrice.accendere();
        lavatrice.off();
        lavatrice.getPotenza();
    }
}


