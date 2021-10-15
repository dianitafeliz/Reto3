package demoh2.demoh2.repository;

import demoh2.demoh2.Modelo.Mensaje;
import demoh2.demoh2.repository.crud.interfaceMensaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MensajeRepositorio {
    @Autowired
    private interfaceMensaje crud3;
    public List<Mensaje> getAll(){

        return (List<Mensaje>) crud3.findAll();
    }
    public Optional<Mensaje> getMessage(int id){

        return crud3.findById(id);
    }
    public Mensaje save(Mensaje message){

        return crud3.save(message);
    }
}
