// Scrivere una funzione che controlli se un carattere è un numero altrimenti
// lanciare una eccezione.

public class Main {
    public static void main(String[] args) {
        checkChar('F');
    }
    public static void checkChar(char myChar){
        if (Character.isDigit(myChar)){
            System.out.println("il carattere corrisponde al numero " + myChar);
        } else {
            throw new IllegalArgumentException("il carattere non è un numero");
        }
    }
}