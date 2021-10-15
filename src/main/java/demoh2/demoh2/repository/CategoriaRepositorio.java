package demoh2.demoh2.repository;
import java.util.List;
import java.util.Optional;

import demoh2.demoh2.Modelo.Categoria;
import demoh2.demoh2.repository.crud.interfaceCategoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Repository;

@Repository
public class CategoriaRepositorio {
    @Autowired
    private interfaceCategoria crud2;

    public List<Categoria> getAll(){
        return (List<Categoria>) crud2.findAll();
    }
    public Optional<Categoria> getCategoria(int id){
        return crud2.findById(id);
    }

    public Categoria save(Categoria categoria){
        return crud2.save(categoria);
    }
    public void delete(Categoria categoria){
        crud2.delete(categoria);
    }
}
