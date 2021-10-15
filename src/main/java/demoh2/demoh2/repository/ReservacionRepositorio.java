package demoh2.demoh2.repository;
import java.util.List;
import java.util.Optional;

import demoh2.demoh2.Modelo.Reservacion;
import demoh2.demoh2.repository.crud.interfaceReservacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ReservacionRepositorio {
    @Autowired
    private interfaceReservacion crud4;

    public List<Reservacion> getAll(){
        return (List<Reservacion>) crud4.findAll();
    }
    public Optional<Reservacion> getReservation(int id){
        return crud4.findById(id);
    }
    public Reservacion save(Reservacion reservation){
        return crud4.save(reservation);
    }
}
