package com.dm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    static Scanner scanner = new Scanner(System.in);
    static Dealership dealership = new Dealership("", "", "");

    public static void main(String[] args) {

        loadVehicles();

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
//                    addVehicle();
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
//                System.out.println(input);
                // Access dealership variable
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void getVehiclesByPrice() {
    }


    private static void getVehiclesByMake() {
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

    private static void removeVehicle() {
    }

}
