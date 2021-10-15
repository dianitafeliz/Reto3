package demoh2.demoh2.service;

import java.util.List;
import java.util.Optional;

import demoh2.demoh2.Modelo.Categoria;
import demoh2.demoh2.repository.CategoriaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class servicioCategoria {
    @Autowired
    private CategoriaRepositorio metodosCrud;

    public List<Categoria> getAll(){
        return metodosCrud.getAll();
    }
    public Optional<Categoria> getCategoria(int id) {
        return metodosCrud.getCategoria(id);
    }

    public Categoria save(Categoria categoria){
        if(categoria.getId()==null){
            return metodosCrud.save(categoria);
        }else{
            Optional<Categoria> e=metodosCrud.getCategoria(categoria.getId());
            if(e.isEmpty()){
                return metodosCrud.save(categoria);
            }else{
                return categoria;
            }
        }
    }

    public Categoria update(Categoria categoria){
        if(categoria.getId()!=null){
            Optional<Categoria>g=metodosCrud.getCategoria(categoria.getId());
            if(!g.isEmpty()){
                if(categoria.getDescription()!=null){
                    g.get().setDescription(categoria.getDescription());
                }
                if(categoria.getName()!=null){
                    g.get().setName(categoria.getName());
                }
                return metodosCrud.save(g.get());
            }
        }
        return categoria;
    }
    public boolean deleteCategoria(int categoriaId){
        Boolean d=getCategoria(categoriaId).map(categoria -> {
            metodosCrud.delete(categoria);
            return true;
        }).orElse(false);
        return d;
    }
}
