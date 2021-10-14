package demoh2.demoh2.service;

import demoh2.demoh2.Modelo.Motorbike;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import demoh2.demoh2.repository.MotorbikeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MotorbikeService {

    @Autowired
    private MotorbikeRepository motorbikeRepository;

    public List<Motorbike> getAll(){

        return motorbikeRepository.getAll();
    }

    public Optional<Motorbike> getMotorbike(int id){

        return motorbikeRepository.getMotorbike(id);
    }

    public Motorbike save(Motorbike m){
        if (m.getId()==null){
            return motorbikeRepository.save(m);
        }else {
            Optional<Motorbike> maux=motorbikeRepository.getMotorbike(m.getId());
            if(maux.isEmpty()){
                return motorbikeRepository.save(m);
            }else {
                return m;
            }
        }
    }
}
