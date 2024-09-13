package org.CS5800.Polymorphism;

import java.util.Scanner;
public class ShipTest {
    
    public static void main(String[] args) {
        Ship[] ships = new Ship[3];
        ships[0] = new Ship("SS Anne", "1998");
        ships[1] = new CruiseShip("The Queen Mary 2", "2003", 3000);
        ships[2] = new CargoShip("Evergreen", "2015", 150000);
        Scanner inputInfo = new Scanner(System.in);
        for (int i = 0; i < ships.length; i++) {
            System.out.println("Enter details for Ship " + (i + 1) + ":");

            System.out.print("Enter the name of the ship: ");
            String name = inputInfo.nextLine();

            System.out.print("Enter the year the ship was built: ");
            String yearBuilt = inputInfo.nextLine();

            if (i == 1) {
                System.out.print("Enter the maximum number of passengers: ");
                int maxPassengers = inputInfo.nextInt();
                inputInfo.nextLine();
                ships[i] = new CruiseShip(name, yearBuilt, maxPassengers);
            } else if (i == 2) {
                System.out.print("Enter the cargo capacity (tonnage): ");
                int cargoCapacity = inputInfo.nextInt();
                inputInfo.nextLine();
                ships[i] = new CargoShip(name, yearBuilt, cargoCapacity);
            } else
                ships[i] = new Ship(name, yearBuilt);

            System.out.println();
        }
        for (Ship ship : ships) {
            ship.print();
            System.out.println();
        }
    }
}
