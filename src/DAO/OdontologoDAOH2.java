package DAO;

import model.Odontologos;
import org.apache.log4j.Logger;
import java.sql.*;
import java.util.List;

public class OdontologoDAOH2 implements iDAO<Odontologos>  {


    private static final Logger logger= Logger.getLogger(OdontologoDAOH2.class);
    private static final String SQL_INSERT="INSERT INTO ODONTOLOGO (MATRICULA, NOMBRE, APELLIDO) VALUES( ?,?,?)";


    @Override
    public Odontologos guardar(Odontologos odontologos) {
        logger.info("inicando la operación de guardado");

        Connection connection=null;
        try{
            connection= BDexam.getConnection();
            PreparedStatement psInsert= connection.prepareStatement(SQL_INSERT, Statement.RETURN_GENERATED_KEYS);
            psInsert.setInt(1, odontologos.getMatricula());
            psInsert.setString(2, odontologos.getNombre());
            psInsert.setString(3, odontologos.getApellido());
            psInsert.execute();
            ResultSet result= psInsert.getGeneratedKeys();
            while (result.next()){
                odontologos.setId(result.getInt(1));
            }

        }catch (Exception e){
            logger.warn(e.getMessage());
        }
        return odontologos;
    }

    @Override
    public List<Odontologos> ListarTodos() {
        return List.of();
    }
}
