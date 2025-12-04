import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/java_db";
        String user = "java_user";
        String password = "securepassword";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Verbindung erfolgreich!");

            createTable(conn);

            insertData(conn);

            selectData(conn);

            updateAgeByName(conn, "Karlos", 77);

            selectData(conn);

            updateAgeById(conn, 2, 88);

            selectData(conn);

            deleteByName(conn, "Karlos");

            selectData(conn);

            deleteById(conn, 1);

            selectData(conn);

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    /**
     * Tabelle person erstellen
     * @param conn
     */
    public static void createTable(Connection conn) {
        // SQL-Statement zum Erstellen der Tabelle, falls sie noch nicht existiert
        String createTableSQL = "CREATE TABLE IF NOT EXISTS person (" +
                "id INT AUTO_INCREMENT PRIMARY KEY, " +  // Automatisch inkrementierende ID als Primärschlüssel
                "name VARCHAR(100), " +  // Spalte für den Namen des Benutzers
                "age INT)";  // Spalte für das Alter des Benutzers

        try (Statement stmt = conn.createStatement()) {
            // Ausführen der SQL-Anweisung zum Erstellen der Tabelle
            stmt.executeUpdate(createTableSQL);
            System.out.println("Tabelle 'person' erstellt.\n");
        } catch (SQLException e) {
            // Fehlerbehandlung, falls das Erstellen der Tabelle fehlschlägt
            e.printStackTrace();
        }
    }

    /**
     * Datensätze in die Tabelle person einfügen
     * TODO: Methode so ändern, dass Daten als Arrays übergeben werden können
     * @param conn
     */
    public static void insertData(Connection conn) {
        // SQL-Statement für das Einfügen von Daten
        String insertSQL = "INSERT INTO person (name, age) VALUES (?, ?)";

        try (PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {
            // Einfügen eines Datensatzes mit dem Namen 'Karlos' und dem Alter 27
            pstmt.setString(1, "Karlos");
            pstmt.setInt(2, 27);
            pstmt.executeUpdate();

            // Einfügen eines Datensatzes mit dem Namen 'Berta' und dem Alter 52
            pstmt.setString(1, "Berta");
            pstmt.setInt(2, 52);
            pstmt.executeUpdate();

            System.out.println("Daten eingefügt.\n");
        } catch (SQLException e) {
            // Fehlerbehandlung, falls das Einfügen von Daten fehlschlägt
            e.printStackTrace();
        }
    }

    /**
     * Alle Datensätze der Tabelle person anzeigen
     * @param conn
     */
    public static void selectData(Connection conn) {
        // SQL-Statement zum Auswählen aller Daten aus der Tabelle
        String selectSQL = "SELECT * FROM person";

        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(selectSQL)) {

            System.out.println("Alle Benutzerdaten:");

            // Iteriere über alle Zeilen im ResultSet und zeige die Daten an
            while (rs.next()) {
                // Ausgabe der ID, des Namens und des Alters für jede Zeile
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Alter: " + rs.getInt("age"));
            }
        } catch (SQLException e) {
            // Fehlerbehandlung, falls das Abrufen der Daten fehlschlägt
            e.printStackTrace();
        }
    }

    /**
     * Alter aller Datensätze ändern, in denen der übergebene Name steht
     * @param conn
     * @param name
     * @param age
     */
    public static void updateAgeByName(Connection conn, String name, int age) {
        // SQL-Statement für das Aktualisieren von Daten
        String updateSQL = "UPDATE person SET age = ? WHERE name = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(updateSQL)) {
            // NOTE: *Alle* Datensätze, wo der übergebenen Name steht werden geändert!
            pstmt.setInt(1, age);
            pstmt.setString(2, name);
            pstmt.executeUpdate();

            System.out.println("\nAlle Alter der Datensätze mit " + name + " wurden aktualisiert:\n");
        } catch (SQLException e) {
            // Fehlerbehandlung, falls das Aktualisieren von Daten fehlschlägt
            e.printStackTrace();
        }
    }

    /**
     * Alter per übergebener ID aktualisieren
     * @param conn
     * @param id
     * @param age
     */
    public static void updateAgeById(Connection conn, int id, int age) {
        // SQL-Statement für das Aktualisieren von Daten
        String updateSQL = "UPDATE person SET age = ? WHERE id = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(updateSQL)) {
            pstmt.setInt(2, id);
            pstmt.setInt(1, age);
            pstmt.executeUpdate();
            System.out.println("\nNur der Datensatz mit der ID " + id + " wurde aktualisiert:\n");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Alle Datensätze mit übergebenem Namen löchen
     * @param conn
     * @param name
     */
    public static void deleteByName(Connection conn, String name) {
        // NOTE: *Alle* Datensätze mit übergebenenm Namen werden gelöscht!
        String deleteSQL = "DELETE FROM person WHERE name = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(deleteSQL)) {
            pstmt.setString(1, name);
            pstmt.executeUpdate();
            System.out.println("Alle Datensätze mit Namen " + name + " wurden gelöscht:\n");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Datensatz per übergebener ID löchen
     * @param conn
     * @param id
     */
    public static void deleteById(Connection conn, int id) {
        // SQL-Statement für das Löschen von Daten per ID
        String deleteSQL = "DELETE FROM person WHERE id = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(deleteSQL)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();

            System.out.println("Nur der Datensatz mit der ID " + id + " wurde gelöscht:\n");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}