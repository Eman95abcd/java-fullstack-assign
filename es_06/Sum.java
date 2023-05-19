/*
 titolo dell'esercitazione e breve spiegazione
 */


import java.util.Scanner;

public class Sum 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci il tuo nome: ");
        String nome = input.nextLine();
        System.out.print("Inserisci il primo numero: ");
        int num1 = input.nextInt();
        System.out.print("Inserisci il secondo numero: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println(nome + ", La somma dei due numeri é: " + sum);

    }
}

/*
note per i collaboratori
 */