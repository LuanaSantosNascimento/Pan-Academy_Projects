package com.aws.lambda.mysql.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao 
{
	public static void main(String[] args) throws SQLException, ClassNotFoundException 
	{
								//Criando e inicializando as vari�veis de conex�o.
		Connection con = null;
		String hostName = null;
		String userName = null;
		String password = null;
		String url = null;
		String jdbcDriver = null;
		String dataBaseName = null;
		String dataBasePrefix = null;
		String dabaBasePort = null;

		hostName = "url_database";
		userName = "userName";
		password = "password";
		jdbcDriver = "com.mysql.cj.jdbc.Driver";
		dataBaseName = "dataBaseName";
		dataBasePrefix = "jdbc:mysql://";
		dabaBasePort = "3306";

																				//Monta a url de conex�o.
		url = dataBasePrefix + hostName + ":" + dabaBasePort + "/" + dataBaseName;

		Class.forName(jdbcDriver);
		con = DriverManager.getConnection(url, userName, password);
					//Fecha a conex�o
		con.close();
	}
}