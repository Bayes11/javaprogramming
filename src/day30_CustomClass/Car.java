package day30_CustomClass;

public class Car {

    public String brand;
    public String model;
    public String color;
    public int year;
    public int price;


    public void setInfo(String brandCar, String modelCar, String colorCar, int yearCar, int priceCar){

        brand = brandCar;
        model = modelCar;
        color = colorCar;
        year = yearCar;
        price = priceCar;
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=$" + price +
                '}';
    }

    public void drive(){
        System.out.println("I am driving a " + brand + " " + model);
    }
    public void start(){
        System.out.println(brand + " is starting.");
    }
    public void stop(){
        System.out.println(brand + " is stop!");
    }
}

/*
Atrributes :
    brand, model, color, year, price

Actions:
    drive() , start() , stop(), toString(), setInfo()

carobjects:

create 3 objects of car
 */