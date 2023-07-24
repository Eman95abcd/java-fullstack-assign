import java.io.FileWriter;
import java.io.IOException;

public class fileCSV {

    public static void main(String[] args) {
        
        String csvFile = "nomeEpunteggio.csv";
        String header ="Manche,Punteggio_Giocatore,Punteggio_Computer";
        String[] data = {
                
        };

        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(csvFile);

            fileWriter.append(header);

            for (String line : data)
            {
                fileWriter.append(line);
                fileWriter.append("\n");
            }

            System.out.println("File CSV creato con successo.");
        }
        catch (Exception e)
        {
            System.out.println("Errore in CsvFileWriter.");
            e.printStackTrace();
        }
        finally
        {
            try
            {
                fileWriter.flush();
                fileWriter.close();
            }
            catch (IOException e)
            {
                System.out.println("Errore durante il flush/close del fileWriter.");
                e.printStackTrace();
            }
        }
    }
    
}
