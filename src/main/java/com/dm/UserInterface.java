package com.dm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;
    static Scanner scanner = new Scanner(System.in);
    DealershipFileManager dealershipFileManager = new DealershipFileManager();
    private void init(){
        //Read dealership from file
        this.dealership = dealershipFileManager.getDealership();
    }
    public void display(){

        init();
//        System.out.print(this.dealership);
        String input;

        do {
            System.out.println("Dealership App: ");
            System.out.println("\t1: Vehicles within price range");
            System.out.println("\t2: Vehicles by make");
            System.out.println("\t3: Vehicles by model");
            System.out.println("\t4: Vehicles by year range");
            System.out.println("\t5: Vehicles by color");
            System.out.println("\t6: Vehicles by mileage range");
            System.out.println("\t7: Vehicles by type");
            System.out.println("\t8: List All Vehicles");
            System.out.println("\t9: Add a Vehicle");
            System.out.println("\t9a: Remove a Vehicle");
            System.out.println("\tq: Quit");
            System.out.println("Command: ");
            input = scanner.nextLine();

            switch (input) {
                case "1":
                    getVehiclesByPrice();
                    System.out.println("Display Vehicles within price range");
                    break;
                case "2":
                    getVehiclesByMake();
                    System.out.println("Display Vehicles by make");

                    break;
                case "3":
                    getVehiclesByModel();
                    System.out.println("Display Vehicles by model");

                    break;
                case "4":
                    getVehicleByYear();
                    System.out.println("Display Vehicles by year range");

                    break;
                case "5":
                    getVehicleByColor();
                    System.out.println("Display Vehicles by color");

                    break;
                case "6":
                    getVehicleByMileage();
                    System.out.println("Display Vehicles by mileage range");

                    break;
                case "7":
                    getVehicleByType();
                    System.out.println("Display Vehicles by type");

                    break;
                case "8":
                    getVehicleAllVehicles();
                    System.out.println("Display List All Vehicles");

                    break;
                case "9":
                    addVehicle();
                    System.out.println("Display Add a Vehicle");

                    break;
                case "9a":
                    removeVehicle();
                    System.out.println("Display Remove a Vehicle");

                    break;
                case "q":
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        } while (!input.equalsIgnoreCase("q"));

    }
    public static void loadVehicles() {
        try {
            FileReader fileReader = new FileReader("./src/main/java/com/dm/inventory.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String input;

            while ((input = bufferedReader.readLine()) != null) {
                System.out.println(input);
                // Access dealership variable
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void getVehiclesByPrice() {
        System.out.print("Please give min price");
        float minValue = scanner.nextFloat();
        System.out.print("Please give max price");
        float maxValue = scanner.nextFloat();

       ArrayList<Vehicle> vehicleByPrice = this.dealership.getVehicleByPrice(minValue, maxValue);
       for(Vehicle vehicle: vehicleByPrice){
           System.out.print(vehicle);
       }
       scanner.nextLine();
    }


    private void getVehiclesByMake() {
        System.out.println("Please enter make that you would like: ");
        String make = scanner.nextLine();

        ArrayList<Vehicle> vehicleByMake = this.dealership.getVehicleByMake(make);
        for(Vehicle vehicle: vehicleByMake){
            System.out.println(vehicle);
        }
        scanner.nextLine();
    }

    private static void getVehiclesByModel() {
    }


    private static void getVehicleByYear() {
    }


    private static void getVehicleByColor() {
    }


    private static void getVehicleByMileage() {
    }


    private static void getVehicleByType() {
    }


    private static void getVehicleAllVehicles() {

        try {
//            Scanner scanner1 = new Scanner(System.in);
//
//            ArrayList<String> arrayList = new ArrayList<String>();
//
//            for (int i = 0; i < vehicles.size(); i++) {
//                Vehicle currentVehicle = vehicles.get(i);
//                System.out.println("Current Transaction: " + vehicles.get(i));
//            }

            FileReader fileReader = new FileReader("./src/main/java/com/dm/inventory.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String input;

            while ((input = bufferedReader.readLine()) != null) {
                System.out.println(input);
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        String userInput;
//        do {
//            System.out.println("Please enter \"done\" when finished reviewing all vehicles");
//            userInput = scanner.nextLine();
//            if (!userInput.equalsIgnoreCase("done")) {
//                }
//            }while(!userInput.equalsIgnoreCase("done")) ;
//            System.out.println(vehicles);
//        }


//        public static void addVehicle () {

//        try {
//            Scanner scanner1 = new Scanner(System.in);
//
//            System.out.println("Please enter vin number: ");
//            int addVin = scanner.nextLine();
//
//
//            Vehicle newVehicle = new Vehicle(addVin, addYear, addMake, addModel, addVehicleType, addColor, addOdometer, addPrice);
//            vehicles.add(newVehicle);
//            System.out.println(newVehicle);
//        }
    }

    public void addVehicle(){
        System.out.println("Please provide info below to add vehicle: ");

        System.out.println("Vin: ");
        int vin = scanner.nextInt();
        int year = scanner.nextInt();

        //clearing the scanner and creating a new line
        scanner.nextLine();

        System.out.println("Make: ");
        String make = scanner.nextLine();
        System.out.println("Model: ");
        String model = scanner.nextLine();
        System.out.println("Type: ");
        String type = scanner.nextLine();
        System.out.println("Color: ");
        String color = scanner.nextLine();
        System.out.println("Odometer: ");
        int odometer = scanner.nextInt();
        System.out.println("Price: ");
        double price = scanner.nextDouble();

        this.dealership.addVehicle(new Vehicle(vin, year, make, model, type, color, odometer, price));

        dealershipFileManager.saveDealership(this.dealership);

        System.out.println("Vehicle added successfully");
        // clearing the scanner
        scanner.nextLine();
    }


    private void removeVehicle() {
        //Display all vehicles and allow user to remove vehicle of choice
        System.out.println("Please enter the vehicle number of choice that you would like to remove");

        ArrayList<Vehicle> allVehicles = this.dealership.getAllVehicle();
        for (int i = 0; i < allVehicles.size(); i++) {
            System.out.println((i + 1) + " " + allVehicles.get(i).toString());
        }
        int chosenVehicle = scanner.nextInt();

        this.dealership.removeVehicle(chosenVehicle - 1);

        dealershipFileManager.saveDealership(this.dealership);

        System.out.println("Successfully removed vehicle");
        scanner.nextLine();
    }





}

