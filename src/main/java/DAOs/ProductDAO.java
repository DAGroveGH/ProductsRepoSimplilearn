package DAOs;

import entities.Product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class ProductDAO {
    public Product getProduct(int productId) {

        Product product = new Product();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/simplilearn","root","root");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM products WHERE productId=" + productId);
            if(rs.next()) {
                product.setId(rs.getInt("productId"));
                product.setName(rs.getString("productName"));
                product.setManufacturer(rs.getString("manufacturer"));
                product.setPrice(rs.getFloat("price"));
                product.setWeight(rs.getFloat("weight"));
                product.setAvailable(rs.getBoolean("available"));
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return product;
    }
}
