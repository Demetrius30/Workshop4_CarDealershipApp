package com.dm;

import java.util.ArrayList;

public class Dealership {

    private String name;
    private String address;
    private String phone;

    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<Vehicle> getVehicleByPrice(float min, float max) {
        ArrayList<Vehicle> vehiclesToDisplay = new ArrayList<>();

        for (Vehicle vehicle : this.inventory) {
            if (vehicle.getPrice() > min && vehicle.getPrice() < max) {
                vehiclesToDisplay.add(vehicle);
            }
        }
        return vehiclesToDisplay;
    }

    public ArrayList<Vehicle> getVehicleByMake(String make) {
        ArrayList<Vehicle> vehiclesToDisplay = new ArrayList<>();

        for(Vehicle vehicle : this.inventory) {
            if(vehicle.getMake().equalsIgnoreCase(make)){
                vehiclesToDisplay.add(vehicle);
            }
        }
        return vehiclesToDisplay;
    }

    public ArrayList<Vehicle> getVehicleByModel(String model) {
        ArrayList<Vehicle> vehiclesToDisplayModel = new ArrayList<>();

        for(Vehicle vehicle : this.inventory){
            if(vehicle.getModel().equalsIgnoreCase(model)){
                vehiclesToDisplayModel.add(vehicle);
            }
        }
        return vehiclesToDisplayModel;
    }

    public ArrayList<Vehicle> getVehicleByYear(int year) {
        ArrayList<Vehicle> vehiclesToDisplayYear = new ArrayList<>();

        for(Vehicle vehicle : this.inventory){
            if(vehicle.getYear() == year){
                vehiclesToDisplayYear.add(vehicle);
            }
        }
        return vehiclesToDisplayYear;
    }

    public ArrayList<Vehicle> getVehicleByColor(String color) {
        return new ArrayList<>();
    }

    public ArrayList<Vehicle> getVehicleByMileage(String mileage) {
        return new ArrayList<>();
    }

    public ArrayList<Vehicle> getVehicleByType(String type) {
        return new ArrayList<>();
    }

    public ArrayList<Vehicle> getAllVehicle() {
        return this.inventory;
    }

    public void addVehicle(Vehicle vehicle) {
        this.inventory.add(vehicle);
    }

    public void removeVehicle(int vehicleIndex) {
        this.inventory.remove(vehicleIndex);
    }

    @Override
    public String toString() {
        return "Dealership{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", inventory=" + inventory +
                '}';
    }
}
