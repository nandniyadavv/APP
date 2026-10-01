import java.sql.*;
import java.util.Scanner;

public class BookJDBC {
    static final String URL = "jdbc:mysql://localhost:3306/library";
    static final String USER = "root";
    static final String PASSWORD = "password";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("Database connected.");
            System.out.println("1. Insert Book  2. Search Book  3. Available Books  4. Issue Book");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Book ID: "); int id = sc.nextInt(); sc.nextLine();
                    System.out.print("Title: "); String title = sc.nextLine();
                    System.out.print("Author: "); String author = sc.nextLine();
                    System.out.print("Price: "); double price = sc.nextDouble();
                    String sql = "INSERT INTO Book(BookID,Title,Author,Price,Availability) VALUES(?,?,?,?,?)";
                    try (PreparedStatement ps = con.prepareStatement(sql)) { ps.setInt(1,id); ps.setString(2,title); ps.setString(3,author); ps.setDouble(4,price); ps.setBoolean(5,true); ps.executeUpdate(); }
                    System.out.println("Book inserted.");
                }
                case 2 -> {
                    System.out.print("Book ID: "); int id = sc.nextInt();
                    try (PreparedStatement ps = con.prepareStatement("SELECT * FROM Book WHERE BookID=?")) { ps.setInt(1,id); ResultSet rs=ps.executeQuery(); if(rs.next()) System.out.println(rs.getInt("BookID")+" | "+rs.getString("Title")+" | "+rs.getString("Author")+" | "+rs.getDouble("Price")+" | "+rs.getBoolean("Availability")); else System.out.println("Book not found."); }
                }
                case 3 -> {
                    try (PreparedStatement ps=con.prepareStatement("SELECT * FROM Book WHERE Availability=true")) { ResultSet rs=ps.executeQuery(); while(rs.next()) System.out.println(rs.getInt("BookID")+" | "+rs.getString("Title")+" | "+rs.getString("Author")); }
                }
                case 4 -> {
                    System.out.print("Book ID to issue: "); int id=sc.nextInt();
                    try(PreparedStatement ps=con.prepareStatement("UPDATE Book SET Availability=false WHERE BookID=?")){ ps.setInt(1,id); System.out.println(ps.executeUpdate()>0 ? "Book issued." : "Book not found."); }
                }
                default -> System.out.println("Invalid choice.");
            }
        } catch (SQLException e) { System.out.println("Database error: " + e.getMessage()); }
        sc.close();
    }
}