public class Calcolo{
    public static void main(String[] args){
        Numero primo = new Numero(50);

        int somma = primo.sommaM(50);

        System.out.print("numero sommato: ");
        System.out.println(somma);

        primo.aggiungi(100);

        System.out.print("numero aggiunto: ");
        System.out.println(primo.n);
    }
}