import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);
        // boolean valore = false;

        String opzione;

        //while (valore == false)
        do
        {

            System.out.println("Seleziona un'opzione: ");
            System.out.println("1: Crea il database e le tabelle");
            System.out.println("2: Inserisci i dati nelle tabelle");
            System.out.println("3: Visualizza i dati");
            System.out.println("4: Modifica i dati");
            System.out.println("5: Cancella i dati");
            System.out.println("6: Salva i dati in un file CSV");

            int scelta = scanner.nextInt();
            scanner.nextLine(); // Rimuove il new line rimanente

            switch(scelta)
            {
                case 1:
                    System.out.println("Inserisci il nome del database da creare:");
                    break;
                case 2:
                    System.out.println("Inserisci il nome del database nel quale inserire i dati:");
                    break;
                case 3:
                    System.out.println("Inserisci il nome del database dal quale estrarre i dati:");
                    break;
                case 4:
                    System.out.println("Inserisci il nome del database del quale modificare i dati");
                    break;
                case 5:
                    System.out.println("Inserisci il nome del database dal quale cancellare i dat:");
                    break;
                case 6:
                    System.out.println("Inserisci il nome del database dal quale estrarre i dati:");
                    break;
                default:
                    System.out.println("Scelta non valida. Inserisci 1, 2 o 3, 4, 5, 6.");
            }

            String dbName = scanner.nextLine();


            switch(scelta)
            {
                case 1:
                    CreaDBCollegato.main(new String[]{dbName});
                    break;
                case 2:
                    inserisciDatiCollegati.main(new String[]{dbName});
                    break;
                case 3:
                    VisualizzaDati.main(new String[]{dbName});
                    break;
                case 4:
                    ModificaDati.main(new String[]{dbName});
                    break;
                case 5:
                    CancellaDati.main(new String[]{dbName});
                    break;
                case 6:
                    SalvainCSV.main(new String[]{dbName});
                    break;

                default:
                    System.out.println("Scelta non valida. Inserisci 1, 2 o 3.");
            }

           /*  if (scelta == 3)
            {
                break;
            }   */

            System.out.println("Vuoi Continuare?Si/No");
            opzione =  scanner.nextLine();

        /*  if (opzione.equalsIgnoreCase("No"))
            {
                valore = true;
            }       */

        } while(opzione.equalsIgnoreCase("Si"));

        scanner.close();
    }
}

