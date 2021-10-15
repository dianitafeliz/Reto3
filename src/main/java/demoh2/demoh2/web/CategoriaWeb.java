package demoh2.demoh2.web;
import java.util.List;
import java.util.Optional;

import demoh2.demoh2.Modelo.Categoria;
import demoh2.demoh2.service.servicioCategoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Category")
public class CategoriaWeb {
    @Autowired
    private servicioCategoria servicio;
    @GetMapping("/all")
    public List<Categoria> getMotorbike(){
        return servicio.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Categoria> getCategoria(@PathVariable("id") int categoriaId) {
        return servicio.getCategoria(categoriaId);
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Categoria save(@RequestBody Categoria categoria) {
        return servicio.save(categoria);
    }

}
