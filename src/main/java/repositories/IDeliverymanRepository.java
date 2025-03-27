package repositories;

import com.example.demo.models.Deliveryman;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDeliverymanRepository extends JpaRepository<Deliveryman, Integer> {
}
