package day30_practies.DeviceTask;

public class Phone extends Device{

    public Phone(String brand, String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
    }

    public void call(long number){
        System.out.println(getBrand() + " " + getModel() + " calling " + number);
    }

    public void text(long number){
        System.out.println(getBrand() + " " + getModel() + " texting " + number);
    }


    /*
    Create the following sub classes of Phone and add any extra methods that are needed:

				1. Iphone
				2. Samsung
				3. BlackBerry
				4. Google
				5. Nokia
     */
}
