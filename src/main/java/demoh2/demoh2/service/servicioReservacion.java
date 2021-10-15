package demoh2.demoh2.service;

import java.util.List;
import java.util.Optional;

import demoh2.demoh2.Modelo.Reservacion;
import demoh2.demoh2.repository.ReservacionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class servicioReservacion {
    @Autowired
    private ReservacionRepositorio metodosCrud;

    public List<Reservacion> getAll(){
        return metodosCrud.getAll();
    }

    public Optional<Reservacion> getReservation(int reservationId) {
        return metodosCrud.getReservation(reservationId);
    }

    public Reservacion save(Reservacion reservation){
        if(reservation.getIdReservation()==null){
            return metodosCrud.save(reservation);
        }else{
            Optional<Reservacion> e= metodosCrud.getReservation(reservation.getIdReservation());
            if(e.isEmpty()){
                return metodosCrud.save(reservation);
            }else{
                return reservation;
            }
        }
    }
}
