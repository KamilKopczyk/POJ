import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {

    public boolean authenticateUser(String username, String pin, String role) throws SQLException {

        String sql = "SELECT * FROM users WHERE username = ? AND pin = ? AND role = ?";
        try(Connection conn = DataBaseConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setString(1, username);
            stmt.setString(2, pin);
            stmt.setString(3, role);

            ResultSet rs = stmt.executeQuery();
            return rs.next();

        }

    }

    public void addUser(String username, String pin) throws SQLException {

        String sql = "INSERT INTO users (username, pin, balance, role) VALUES (?, ?, 0, 'user')";
        try(Connection conn = DataBaseConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, username);
            stmt.setString(2, pin);
            stmt.executeUpdate();
            System.out.println("Użytkownik dodany pomyślnie.");

        }

    }

    public void deposit(String username, double amount) throws SQLException {

        String sql = "UPDATE users SET balance = balance + ? WHERE username = ?";
        try(Connection conn = DataBaseConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setDouble(1, amount);
            stmt.setString(2, username);
            stmt.executeUpdate();
            System.out.println("Wpłata pomyślna.");
        }

    }
    public void withdraw(String username, double amount) throws SQLException {

        String checkSql = "SElECT balance FROM users WHERE username = ?";
        String updateSql = "UPDATE users SET balance = balance - ? WHERE username = ?";
        try(Connection conn = DataBaseConnection.getConnection();
            PreparedStatement checkStmt = conn.prepareStatement(checkSql)){
            checkStmt.setString(1, username);
            ResultSet rs = checkStmt.executeQuery();
            if(rs.next() && rs.getDouble("balance") >= amount){

                try(PreparedStatement updateStmt = conn.prepareStatement(updateSql)){
                    updateStmt.setDouble(1, amount);
                    updateStmt.setString(2, username);
                    updateStmt.executeUpdate();
                    System.out.println("Wypłata pomyślna.");
                }
            } else {
                System.out.println("Nie masz wystarczających środków na koncie.");
            }



        }

    }
    public void changePin(String username, String newPin) throws SQLException {

        String sql = "UPDATE users SET pin = ? WHERE username = ?";
        try(Connection conn = DataBaseConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, newPin);
            stmt.setString(2, username);
            stmt.executeUpdate();
            System.out.println("PIN zmieniony pomyślnie.");
        }


    }
    public void showBalance(String username) throws SQLException {

        String sql = "SELECT balance FROM users WHERE username = ?";
        try(Connection conn = DataBaseConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                double balance = rs.getDouble("balance");
                System.out.println("Stan konta: " + balance);
            } else {
                System.out.println("Nie znaleziono użytkownika.");
            }
        }



    }


}
