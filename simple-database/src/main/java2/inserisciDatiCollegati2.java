import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class inserisciDatiCollegati2 {

    public static void main(String[] args) {

        Connection conn = null;
        try {
            // Carico il driver JDBC di SQLite
            Class.forName("org.sqlite.JDBC");

            // Creo una connessione al database
            String url = "jdbc:sqlite:database_collegato2.db";
            conn = DriverManager.getConnection(url);

            System.out.println("Connessione a SQLite stabilita.");

            // Inserisco i dati nella tabella 'categorie'
            String sql1 = "INSERT INTO regioni (id, nome) VALUES (1, 'Liguria');";
            String sql2 = "INSERT INTO regioni (id, nome) VALUES (2, 'Piemonte');";

            Statement stmt1 = conn.createStatement();
            stmt1.execute(sql1);

            Statement stmt2 = conn.createStatement();
            stmt2.execute(sql2);

            // Inserisco i dati nella tabella 'prodotti'
            String sql3 = "INSERT INTO prodottiRegioni (id, nome, prezzo, id_categoria) VALUES (1, 'Pesto', 5, 1);";
            String sql4 = "INSERT INTO prodottiRegioni (id, nome, prezzo, id_categoria) VALUES (2, 'Focaccia', 2, 1);";
            String sql5 = "INSERT INTO prodottiRegioni (id, nome, prezzo, id_categoria) VALUES (3, 'Brasato', 12, 2);";

            Statement stmt3 = conn.createStatement();
            stmt3.execute(sql3);

            Statement stmt4 = conn.createStatement();
            stmt4.execute(sql4);

            Statement stmt5 = conn.createStatement();
            stmt5.execute(sql5);

            System.out.println("I dati sono stati inseriti nelle tabelle 'categorie' e 'prodotti'.");

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