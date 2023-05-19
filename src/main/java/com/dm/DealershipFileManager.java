package com.dm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class DealershipFileManager {
    String dealerShipFileLocation = ("./src/main/java/com/dm/inventory.txt");
    public Dealership getDealership() {

        try {
            FileInputStream dealerShipFile = new FileInputStream("./src/main/java/com/dm/inventory.txt");
            Scanner scanner = new Scanner(dealerShipFile);

            String firstLine_dealershipData = scanner.nextLine();
            String[] dealerShipArr = firstLine_dealershipData.split(Pattern.quote("|"));
            Dealership initialDealership = new Dealership(dealerShipArr[0], dealerShipArr[1], dealerShipArr[2]);

            String vehicleData;
            while (scanner.hasNextLine()) {
                vehicleData = scanner.nextLine();
                String[] vehicleDataArr = vehicleData.split(Pattern.quote("|"));

                Vehicle currentVehicle = new Vehicle(
                        Integer.parseInt(vehicleDataArr[0]),
                        Integer.parseInt(vehicleDataArr[1]),
                        vehicleDataArr[2],
                        vehicleDataArr[3],
                        vehicleDataArr[4],
                        vehicleDataArr[5],
                        Integer.parseInt(vehicleDataArr[6]),
                        Double.parseDouble(vehicleDataArr[7])
                        );
                initialDealership.addVehicle(currentVehicle);
            }

            scanner.close();
            return initialDealership;

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
    public void saveDealership(Dealership dealership){

        try{
            FileWriter fileWriter = new FileWriter(dealerShipFileLocation);
            fileWriter.write(dealership.getName() + "|" + dealership.getAddress() + "|" + dealership.getPhone() + "\n");

            for(Vehicle vehicle: dealership.getAllVehicle()){
                fileWriter.write(
                        vehicle.getVin() + "|" +
                                vehicle.getVin() + "|" +
                                vehicle.getYear() + "|" +
                                vehicle.getMake() + "|" +
                                vehicle.getModel() + "|" +
                                vehicle.getVehicleType() + "|" +
                                vehicle.getColor() + "|" +
                                vehicle.getOdometer() + "|" +
                                vehicle.getPrice() + "|" + "\n"
                );
            }
            fileWriter.close();
        }catch (IOException e) {
            throw new RuntimeException(e);  // this method writes dealership info to file
        }
    }
}