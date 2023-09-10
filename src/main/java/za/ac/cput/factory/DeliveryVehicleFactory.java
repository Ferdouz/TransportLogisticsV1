package za.ac.cput.factory;

import za.ac.cput.util.Helper;
import za.ac.cput.domain.DeliveryVehicle;
//Ferdouz code's
public class DeliveryVehicleFactory {
    public static DeliveryVehicle createDeliveryVehicle(String vehicleId, String vehicleName,String vehicleLicenceExpiry, double vehicleLoadCapacity, boolean isAvailable) {
        vehicleId = Helper.generateID();
        vehicleLoadCapacity = Double.parseDouble(String.valueOf(vehicleLoadCapacity));
        isAvailable = Boolean.parseBoolean(String.valueOf(isAvailable));

        if (Helper.isNullOrEmpty(vehicleId) || Helper.isNullOrEmpty(vehicleName) || Helper.isNullOrEmpty(vehicleLicenceExpiry)|| Helper.isNullOrEmpty(String.valueOf(vehicleLoadCapacity))
                || Helper.isNullOrEmpty(String.valueOf(isAvailable))) {
            return null;
        }
        return new DeliveryVehicle.Builder()
                .setVehicleId(vehicleId)
                .setVehicleName(vehicleName)
                .setVehicleLicenceExpiry(vehicleLicenceExpiry)
                .setVehicleLoadCapacity(vehicleLoadCapacity)
                .setAvailable(isAvailable)
                .build();

    }
}

