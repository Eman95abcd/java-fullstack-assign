import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SalvainCSV2 {

    public static void main(String[] args) {

        Connection conn = null;
        try {
            // Carico il driver JDBC di SQLite
            Class.forName("org.sqlite.JDBC");

            // Creo una connessione al database
            String url = "jdbc:sqlite:database_collegato2.db";
            conn = DriverManager.getConnection(url);

            System.out.println("Connessione a SQLite stabilita.");

            // Eseguo la query JOIN
            String sql = "SELECT prodottiRegioni.nome AS nome_prodotto, prodottiRegioni.prezzo, regioni.nome AS nome_categoria " +
                         "FROM prodottiRegioni " +
                         "JOIN regioni ON prodottiRegioni.id_categoria = regioni.id;";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            // Preparo il file CSV
            FileWriter fileWriter = new FileWriter("prodottiRegioni_Regioni.csv");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("Nome Prodotto, Prezzo, Categoria");  // Intestazione del CSV

            // Stampo i risultati nel file CSV
            while (rs.next()) {
                String nomeProdotto = rs.getString("nome_prodotto");
                double prezzo = rs.getDouble("prezzo");
                String nomeCategoria = rs.getString("nome_categoria");

                printWriter.println(nomeProdotto + ", " + ", " + prezzo + ", " + nomeCategoria);
            }

            printWriter.close();
            System.out.println("I dati sono stati salvati nel file 'prodotti_categorie.csv'.");

        } catch (SQLException | ClassNotFoundException | IOException e) {
            System.out.println(e.getMessage());
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