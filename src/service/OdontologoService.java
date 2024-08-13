package service;

import dao.Idao;
import model.Odontologo;

import java.util.List;

public class OdontologoService {
    private Idao<Odontologo> odontologoIdao;

    public OdontologoService(Idao<Odontologo> odontologoIdao) {
        this.odontologoIdao = odontologoIdao;
    }

    public Odontologo guardarOdontologo (Odontologo odontologo){
        return odontologoIdao.guardar(odontologo);
    }

    public List<Odontologo> buscarTodos(){
        return odontologoIdao.listarTodos();
    }

}
