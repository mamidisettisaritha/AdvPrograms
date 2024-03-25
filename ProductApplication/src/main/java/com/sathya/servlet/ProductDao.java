	package com.sathya.servlet;
	import java.util.*;
	import java.sql.*;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;


	public class ProductDao {
		public int save(Product product)
		{
			int saveResult=0;
			try(Connection connection=DatabaseUtils.createConnection();
					PreparedStatement preparedStatement=connection.prepareStatement("insert into product_data values(?,?,?,?,?,?,?,?)"))
			{
						preparedStatement.setString(1,product.getProId());
						preparedStatement.setString(2,product.getProName());
						preparedStatement.setDouble(3,product.getProPrice());
						preparedStatement.setString(4,product.getProBrand());
						preparedStatement.setString(5,product.getProMadeIn());
						preparedStatement.setDate(6,product.getProMfgDate());
						preparedStatement.setDate(7,product.getProExpDate());
						preparedStatement.setBytes(8,product.getProImage());
						
						saveResult=preparedStatement.executeUpdate();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			return saveResult;
		}

		public List<Product> findAll()
		{
			List<Product> productList=new ArrayList<Product>();
			try
			{
				Connection connection=DatabaseUtils.createConnection();
				Statement statement=connection.createStatement();
				ResultSet resultSet=statement.executeQuery("select * from product_data");
				while(resultSet.next()) {
					Product product=new Product();
					product.setProId(resultSet.getString("proId"));
					product.setProName(resultSet.getString("proName"));
					product.setProPrice(resultSet.getDouble("proPrice"));
					product.setProBrand(resultSet.getString("proBrand"));
					product.setProMadeIn(resultSet.getString("proMadeIn"));
					product.setProMfgDate(resultSet.getDate("proMfgDate"));
					product.setProExpDate(resultSet.getDate("proExpDate"));
					product.setProImage(resultSet.getBytes("proImage"));
					
					productList.add(product);
					
			}
			}
				catch(SQLException e)
				{
					e.printStackTrace();
				}

			return productList;				
				
			}
		    //deleteById
					public int deleteById(String proId)
					{
						int result=0;
						try(Connection connection=DatabaseUtils.createConnection();
								PreparedStatement preparedStatement=connection.prepareStatement("delete from product_data where proId=?"))
						{
							preparedStatement.setString(1,proId);
							result=preparedStatement.executeUpdate();
							
							
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						return result;
					}				
		}
