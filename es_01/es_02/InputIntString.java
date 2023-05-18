/*
 Utilizzo di classe Scanner e variabili di testo e numeriche + condizione if

 Instanzio un oggetto di nome input di classe Scanner con il metodo costruttore new che riceve input dall'utente.
 Stampo la scritta "Inserisci il tuo nome: " nella console.
 Creo una variabile chiamata nome di tipo Stringa a cui assegno come valore il metodo next() dell'oggetto input.
 Stampo la scritta "Inserisci la tua età: " nella console.
 Creo una variabile di nome eta di tipo Int a cui assegno come valore il metodo nextInt() dell'oggetto input.
 Creo una variabile di nome soglia di tipo Int a cui assegno il valore di 18.
 Inserisco una condizione per cui se soglia > eta il programma stampa "non hai 18 anni" nella console 
 se no stampa ("Ciao, " + nome + "! Hai " + eta + " anni.") nella console.
 Se si inserisce un valore di tipo diverso da quello String o Int nelle relative fasi di Input il programma presenta delle eccezioni non gestite.
 Verifico che sia tutto formattato con le parentesi graffe in linea una sopra l'altra.
 */


import java.util.Scanner; //importa la classe Scanner dal package java.util

import javax.lang.model.util.ElementScanner14;

public class InputIntString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // crea un oggetto Scanner che legge l'input dalla console (System.in)

        System.out.print("Inserisci il tuo nome: "); // stampa "inserisci il tuo nome " nella console
        String nome = input.next(); // legge la prossima stringa dall'input

        System.out.print("inserisci la tua età: "); // stampa "inserisci la tua età " nella console
        int eta = input.nextInt(); // legge il prossimo intero dall'input

        // imposto il valore di threshold

        int soglia = 18;

        // inserisco una condizione che verifica l'età dell'utente
        if (soglia > eta) {

            // se l'input é <18 l'utente riceve un messaggio d'errore ed esce dal ciclo if

            System.out.println("non hai 18 anni");
        } 
        else
        {
            // se l'input é >=18 l'utente è autorizzato e riceve un messaggio di benvenuto

            System.out.println("Ciao, " + nome + "! Hai " + eta + " anni.");

        }

        input.close(); // chiude lo Scanner (non è obbligatorio)
    }
}

/*
note per i collaboratori
 */