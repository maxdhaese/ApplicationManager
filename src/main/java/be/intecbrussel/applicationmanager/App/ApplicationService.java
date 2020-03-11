package be.intecbrussel.applicationmanager.App;

import be.intecbrussel.applicationmanager.App.Application;
import be.intecbrussel.applicationmanager.App.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@Component
public class ApplicationService {

    @Autowired
    private ApplicationRepository repo;

    public List<Application> listAll(){
        return repo.findAll();
    }

    public void save(Application application){
        repo.save(application);
    }

    public Application get(long id){
        return repo.findById(id).get();
    }

    public void delete(long id){
        repo.deleteById(id);
    }
}
