import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class VisualizzaDati
{
    public static void main(String[] args)
    {
        try
        {
         Connection conn = null;
        // Carico il driver JDBC di SQLite
        Class.forName("org.sqlite.JDBC");

        // Creo una connessione al database
        String url = "jdbc:sqlite:database.db";
        conn = DriverManager.getConnection(url);

        System.out.println("Connessione a SQLite stabilita.");

        // Eseguo la query SELECT
        String sql = "SELECT * FROM prodotti;";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        String csvFile = "./prodotto.csv";
        String header = "Nome_Prodotto, Quantita, Categoria, Prezzo\n";
        FileWriter fileWriter = null;
        fileWriter = new FileWriter(csvFile);
        fileWriter.append(header);
        // Stampo i risultati
            while (rs.next())
            {
                String nomeProdotto = rs.getString("nome_prodotto");
                int quantita = rs.getInt("quantita");
                String categoriaProdotto = rs.getString("categoria_prodotto");
                double prezzoProdotto = rs.getDouble("prezzo_prodotto");

                System.out.println("Nome Prodotto: " + nomeProdotto + ", Quantita: " + quantita +
                        ", Categoria Prodotto: " + categoriaProdotto + ", Prezzo Prodotto: " + prezzoProdotto);
            
            fileWriter.append(nomeProdotto + "," + quantita + "," + categoriaProdotto + "," + prezzoProdotto + "\n");
            }
       

        
            fileWriter.close();
        }
        catch(Exception e){
            System.out.println("Errore in CSV FileWriter");
            e.printStackTrace();
        }
        
    }
    
}
