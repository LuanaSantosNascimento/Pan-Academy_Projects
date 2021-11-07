package com.aws.lambda.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.aws.lambda.mysql.data.RequestDetails;
import com.aws.lambda.mysql.data.ResponseDetails;
import com.amazonaws.services.lambda.runtime.Context;

public class MySqlConect implements RequestHandler<RequestDetails, ResponseDetails> 
{
												//Conecta e retorna a conexão.
	private Connection getConnection() throws SQLException 
	{
		String url = "URL_DO_BANCO_AWS";
		String username = "username";
		String password = "password";
		Connection conn = DriverManager.getConnection(url, username, password);
		return conn;
	}

			//Usa a conexao para inserir os dados na tabela
	private void insertDetails(RequestDetails requestDetails, ResponseDetails responseDetails) throws SQLException 
	{
		//Pega a conexão
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
																//Pega a instância
		Connection connection = getConnection();
																//Cria o estado de conexão
		Statement statement = connection.createStatement();
																//Passa a query de baixo
		String query = getquery(requestDetails);
		int responseCode = statement.executeUpdate(query);
		if (1 == responseCode) {
			responseDetails.setMessageID(String.valueOf(responseCode));
			responseDetails.setMessageReason("Atualizados com sucesso");
		}
	}
														//Monta e retorna a query de inserção
	private String getquery(RequestDetails requestDetails) {

		String query = "INSERT INTO dblambda.tb_luana(id, message) VALUES (";

		query = query.concat("'" + requestDetails.getId() + "','" + requestDetails.getMessage() + "')");

		// INSERT INTO dblambda.colaboradores(id, nome) VALUES (' getID ', 'getNome');

		return query;
	}
	//Chama o metodo que insere e retorna a mensagem de sucesso ou falha.
	public ResponseDetails handleRequest(RequestDetails requestDetails, Context arg1) 
	{
		ResponseDetails responseDetails = new ResponseDetails();
		try {
			insertDetails(requestDetails, responseDetails);
		} catch (SQLException sqlException) {
			responseDetails.setMessageID("\n=(");
			responseDetails.setMessageReason("Putz, deu erro.\n\n" + sqlException);
		}
		return responseDetails;
	}
}