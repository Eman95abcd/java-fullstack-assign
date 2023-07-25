import java.sql.Connection; // Crea la connessione con il database
import java.sql.DriverManager; // ci mette in connessione con il db
import java.sql.SQLException; // come gestisce le eccezioni sqlite
import java.sql.Statement; // serve per creare le query

public class CreaDB
{
    public static void main(String[] args) {
        
      
        Connection conn = null;
        try {
            // Carico il driver JDBC di SQLite
            Class.forName("org.sqlite.JDBC");

            // Creo una connessione al database
            String url = "jdbc:sqlite:database.db";
            conn = DriverManager.getConnection(url);

            System.out.println("Connessione a SQLite stabilita.");

            // Creo la tabella
            String sql = "CREATE TABLE IF NOT EXISTS prodotti (\n"
                    + " nome_prodotto text NOT NULL,\n"
                    + " quantita integer NOT NULL\n"
                    + ");";

            Statement stmt = conn.createStatement();
            stmt.execute(sql);

            System.out.println("Tabella 'prodotti' creata.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

}