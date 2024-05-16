package Service;

import DAO.BDexam;
import org.junit.jupiter.api.Test;

public class OdontoloService {

    @Test

        public void crearOdontologo(){
            BDexam.crearTablas();
            OdontoloService odontoloService = new OdontoloService();
        }
}
