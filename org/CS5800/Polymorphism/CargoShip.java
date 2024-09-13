package org.CS5800.Polymorphism;
public class CargoShip extends Ship {
    private int cargoCapacityTonnes;

    public CargoShip(String name, String yearBuilt, int cargoCapacityTonnes) {
        super(name, yearBuilt);
        this.cargoCapacityTonnes = cargoCapacityTonnes;
    }

    public int getCargoCapacityTonnes() { return cargoCapacityTonnes; }
    public void setCargoCapacityTonnes(int cargoCapacityTonnes) { this.cargoCapacityTonnes = cargoCapacityTonnes; }

    @Override
    public void print() {
        System.out.println("Cargo Ship Name: " + getName());
        System.out.println("Cargo Capacity (tonnage): " + cargoCapacityTonnes);
    }
}
