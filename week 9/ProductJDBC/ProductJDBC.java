import java.sql.*;
import java.util.Scanner;

public class ProductJDBC {
    static final String URL="jdbc:mysql://localhost:3306/store", USER="root", PASSWORD="password";
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try(Connection con=DriverManager.getConnection(URL,USER,PASSWORD)) {
            System.out.println("1. Insert  2. Retrieve  3. Update Quantity  4. Low Stock");
            int choice=sc.nextInt();
            switch(choice) {
                case 1 -> { System.out.print("Product ID: "); int id=sc.nextInt(); sc.nextLine(); System.out.print("Name: "); String name=sc.nextLine(); System.out.print("Price: "); double price=sc.nextDouble(); System.out.print("Quantity: "); int qty=sc.nextInt(); try(PreparedStatement ps=con.prepareStatement("INSERT INTO Product VALUES(?,?,?,?)")){ps.setInt(1,id);ps.setString(2,name);ps.setDouble(3,price);ps.setInt(4,qty);ps.executeUpdate();} System.out.println("Product inserted."); }
                case 2 -> { System.out.print("Product ID: "); int id=sc.nextInt(); try(PreparedStatement ps=con.prepareStatement("SELECT * FROM Product WHERE ProductID=?")){ps.setInt(1,id);ResultSet rs=ps.executeQuery();if(rs.next())System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getDouble(3)+" | "+rs.getInt(4));else System.out.println("Product not found.");} }
                case 3 -> { System.out.print("Product ID: "); int id=sc.nextInt(); System.out.print("New quantity: "); int qty=sc.nextInt(); try(PreparedStatement ps=con.prepareStatement("UPDATE Product SET Quantity=? WHERE ProductID=?")){ps.setInt(1,qty);ps.setInt(2,id);System.out.println(ps.executeUpdate()>0?"Quantity updated.":"Product not found.");} }
                case 4 -> { try(PreparedStatement ps=con.prepareStatement("SELECT * FROM Product WHERE Quantity < 10")){ResultSet rs=ps.executeQuery();while(rs.next())System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | Qty: "+rs.getInt(4));} }
                default -> System.out.println("Invalid choice.");
            }
        } catch(SQLException e){System.out.println("Database error: "+e.getMessage());}
        sc.close();
    }
}