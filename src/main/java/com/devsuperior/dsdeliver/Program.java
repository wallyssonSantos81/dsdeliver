package com.devsuperior.dsdeliver;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.devsuperior.db.DB;
import com.devsuperior.entiteis.Order;
import com.devsuperior.entiteis.OrderStatus;
import com.devsuperior.entiteis.Product;

@SuppressWarnings("java:S106")
public class Program {

	public static void main(String[] args) throws SQLException {

		Connection conn = DB.getConnection();
	
		Statement st = conn.createStatement();
			
		ResultSet rs = st.executeQuery("select*from tb_order");
	
		while (rs.next()) {

			Order order = instantiateOrder(rs);

			System.out.println(order);
			
			}
	}
		private static Order instantiateOrder(ResultSet rs) throws SQLException {

				Order order = new Order();
				order.setId(rs.getLong("id"));
				order.setLatitude(rs.getDouble("latitude"));
				order.setLongitude(rs.getDouble("longitude"));
				order.setMoment(rs.getTimestamp("moment").toInstant());
				order.setStatus(OrderStatus.values()[rs.getInt("status")]);
				return order;
	
			}
	
	private static Product instantiateProduct(ResultSet rs) throws SQLException {

		Product p = new Product();

			p.setId(rs.getLong("id"));
			p.setDescription(rs.getString("description"));
			p.setName(rs.getString("name"));
			p.setImgeUrl(rs.getString("image_uri"));
			p.setPrice(rs.getDouble("price"));
			return p;
		}
	
}

