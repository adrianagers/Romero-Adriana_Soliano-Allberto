package DAO;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BDexam {

    private static final Logger logger= Logger.getLogger(BDexam.class);
    private static final String SQL_DROP_CREATE_ODONTOLOGOS="DROP TABLE IF EXISTS ODONTOLOGOS; " +
            "CREATE TABLE ODONTOLOGOS (ID INT AUTO_INCREMENT PRIMARY KEY,MATRICULA INT NOT NULL, NOMBRE VARCHAR(100) NOT NULL, APELLIDO VARCHAR(100) NOT NULL) ";
    private static final String SQL_PRUEBA="INSERT INTO ODONTOLOGOS (MATRICULA ,NOMBRE, APELLIDO) VALUES( 124578,'Adriana','Romero'),(236985,'Alberto','soriano'), (894523,'Marta','Forero')";

    public static void crearTablas(){
        Connection connection= null;
        try{
            connection= getConnection();
            Statement statement= connection.createStatement();
            statement.execute(SQL_DROP_CREATE_ODONTOLOGOS);
            statement.execute(SQL_PRUEBA);
            logger.info("tabla odontologos creada con exito");

        }catch (Exception e){
            logger.warn(e.getMessage());
        }

    }
    public static Connection getConnection() throws Exception{
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:~/G5examenOdontologia","sa", "sa");
    }
}
