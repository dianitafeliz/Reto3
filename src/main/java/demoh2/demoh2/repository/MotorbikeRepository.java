package demoh2.demoh2.repository;

import demoh2.demoh2.Modelo.Motorbike;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import demoh2.demoh2.repository.crud.MotorbikeCrudRepository;

import java.util.List;
import java.util.Optional;

@Repository
public class    MotorbikeRepository {

    @Autowired
    private MotorbikeCrudRepository motorbikeCrudRepository;

        public List<Motorbike> getAll(){
           return (List<Motorbike>) motorbikeCrudRepository.findAll();
        }
        public Optional<Motorbike> getMotorbike(int id){
            return motorbikeCrudRepository.findById(id);
        }

        public Motorbike save(Motorbike m){
            return motorbikeCrudRepository.save(m);
        }
    }

