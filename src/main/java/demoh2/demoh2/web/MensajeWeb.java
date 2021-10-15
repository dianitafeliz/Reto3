package demoh2.demoh2.web;
import demoh2.demoh2.Modelo.Mensaje;
import demoh2.demoh2.service.ServicioMensaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Message")
public class MensajeWeb {
    @Autowired
    private ServicioMensaje servicioMensaje;
    @GetMapping("/all")
    public List<Mensaje> getMessages(){
        return servicioMensaje.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Mensaje> getMessage(@PathVariable("id") int messageId) {
        return servicioMensaje.getMessage(messageId);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Mensaje save(@RequestBody Mensaje message) {
        return servicioMensaje.save(message);
    }
}
