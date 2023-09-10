package za.ac.cput.repository;

//Ferdouz code

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.DeliveryVehicle;
import java.util.List;

@Repository
public interface DeliveryVehicleRepository extends JpaRepository<DeliveryVehicle,String> {
}
