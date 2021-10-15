package demoh2.demoh2.service;
import java.util.List;
import java.util.Optional;

import demoh2.demoh2.Modelo.Mensaje;
import demoh2.demoh2.repository.MensajeRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioMensaje {
    @Autowired
    private MensajeRepositorio metodosCrud;

    public List<Mensaje> getAll(){
        return metodosCrud.getAll();
    }

    public Optional<Mensaje> getMessage(int messageId) {
        return metodosCrud.getMessage(messageId);
    }

    public Mensaje save(Mensaje message){
        if(message.getIdMessage()==null){
            return metodosCrud.save(message);
        }else{
            Optional<Mensaje> e= metodosCrud.getMessage(message.getIdMessage());
            if(e.isEmpty()){
                return metodosCrud.save(message);
            }else{
                return message;
            }
        }
    }
}
