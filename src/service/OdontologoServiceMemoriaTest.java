package service;

import dao.impl.OdontologoDaoMemoria;
import model.Odontologo;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OdontologoServiceMemoriaTest {
    static Logger logger = Logger.getLogger(OdontologoServiceMemoriaTest.class);
    OdontologoService odontologoService = new OdontologoService(new OdontologoDaoMemoria());
    @Test
    @DisplayName("testear que se listen los odontologos")
    void caso1(){
        //dado
        Odontologo odontologo = new Odontologo(514,"Sebastian", "Varela");
        Odontologo odontologo2 = new Odontologo(544,"Adriana", "Diaz");
        odontologoService.guardarOdontologo(odontologo);
        odontologoService.guardarOdontologo(odontologo2);
        //cuando
        List<Odontologo> odontologos = odontologoService.buscarTodos();
        //entoncces
        assertTrue(odontologos.size()!=0);
    }

}