package app;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import java.sql.*;
public class LambdaRdsMySqlHandler implements RequestHandler<Object, String> {
    public String handleRequest(Object input, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("");
        String currentTime = "unavailable";
        try {
            String username = "username";
            String password = "password";
            String dbName = "dbName";
            Connection conn = DriverManager.getConnection("jdbc:mysql://"+ "URL_DATABASE" + ":" + "PORTA UTILIZADA" + "/" + dbName + "?useSSL=false", username, password);
            Statement stmt = conn.createStatement();
            ResultSet resultSet = stmt.executeQuery("SELECT NOW()");
            if (resultSet.next()) {
                currentTime = resultSet.getObject(1).toString();
            }
            logger.log("Succeeded! Result: " + currentTime + "\n");
        } catch (SQLException e) {
            logger.log("Caught Exception: " + e.getMessage() + "\n");
        }
        return currentTime;
    }
}