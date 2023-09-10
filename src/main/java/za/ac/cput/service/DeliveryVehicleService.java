package za.ac.cput.service;
//Ferdouz code
import za.ac.cput.domain.DeliveryVehicle;

import java.util.List;
import java.util.Set;
public interface DeliveryVehicleService {
    DeliveryVehicle create(DeliveryVehicle deliveryVehicle);
    DeliveryVehicle read(String vehicleId);
    DeliveryVehicle update(DeliveryVehicle deliveryVehicle);
    boolean delete (String vehicleId);
    public List<DeliveryVehicle> getAll();
}
