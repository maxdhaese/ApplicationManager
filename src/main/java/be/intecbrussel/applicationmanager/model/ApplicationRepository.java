package be.intecbrussel.applicationmanager.model;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public interface ApplicationRepository extends JpaRepository<Application, Long> {
}
