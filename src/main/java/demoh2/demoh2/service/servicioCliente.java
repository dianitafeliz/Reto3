package demoh2.demoh2.service;
import java.util.List;
import java.util.Optional;

import demoh2.demoh2.Modelo.Cliente;
import demoh2.demoh2.repository.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class servicioCliente {
    @Autowired
    private ClienteRepositorio metodosCrud;

    public List<Cliente> getAll(){
        return metodosCrud.getAll();
    }

    public Optional<Cliente> getClient(int clientId) {
        return metodosCrud.getCliente(clientId);
    }

    public Cliente save(Cliente client){
        if(client.getIdClient()==null){
            return metodosCrud.save(client);
        }else{
            Optional<Cliente> e= metodosCrud.getCliente(client.getIdClient());
            if(e.isEmpty()){
                return metodosCrud.save(client);
            }else{
                return client;
            }
        }
    }
}
