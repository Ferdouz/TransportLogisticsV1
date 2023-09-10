package za.ac.cput.repository;

//Ferdouz code

import za.ac.cput.domain.DeliveryVehicle;
import java.util.Set;
public interface DeliveryVehicleRepository extends IRepository<DeliveryVehicle,String> {
    public Set<DeliveryVehicle> getAll();
}
