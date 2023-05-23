package day30_practies.DeviceTask;

public class Computer extends Device{


    private int memory, RAM;
    private boolean hasSSD;

    public Computer(String brand, String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton, int memory, int RAM, boolean hasSSD) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
        setMemory(memory);
        setRAM(RAM);
        setHasSSD(hasSSD);
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public boolean isHasSSD() {
        return hasSSD;
    }

    public void setHasSSD(boolean hasSSD) {
        this.hasSSD = hasSSD;
    }


    /*
     Create the following sub classes of Computer and add any extra methods that are needed:
				1. PersonalComputer
				2. Desktop
				3. Laptop

     */
}
