package day25_practies;

public class Carpet {

    /*
    Create a custom class named Carpet:
                instance variables:
                        width, length, unitPrice, isPersian (boolean)

                Add a constructor that can set all the fields

                instance methods:
                        calcCost(): should be able to caculate the total cost of the carpet and
                        return it as double
                        toString(): should be able to display all the info of the carpet including
                         the total cost of the carpet as calculated by calcCost()

            total price of carpet = (width*length)*unitprice

            if the carpet is persian  carpet, add 200$ to the totalPrice

     */

    public double width, length, unitPrice;
    public boolean isPersian;

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }


    public double calcCost(){
        double totalPrice = (width*length)*unitPrice;

        if(isPersian){
            totalPrice += 200;
        }

        return totalPrice;
    }


    @Override
    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                '}';
    }

    public static void main(String[] args) {

        Carpet ca = new Carpet(10,10,10,true);

        System.out.println("Totol coast :$"+ca.calcCost());
    }
}
