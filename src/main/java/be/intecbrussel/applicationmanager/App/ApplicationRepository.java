package be.intecbrussel.applicationmanager.App;


import be.intecbrussel.applicationmanager.App.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public interface ApplicationRepository extends JpaRepository<Application, Long> {
}
