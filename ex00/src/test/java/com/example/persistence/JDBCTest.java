package com.example.persistence;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTest {
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println(e); 
		}
	}
	
	@Test
	public void connectionTest() {
		try(Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/web0315", "root", "1234")) {
			log.info(conn);
		} catch(Exception e) {
			log.warn(e);
		}
	}
	
}
