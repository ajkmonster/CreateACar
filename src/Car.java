public class Car extends Vehicle{

    private String color;
    private String brand;
    private int speed;
    public Car() {
        color = "";
        brand = "";
        speed = 0;
    }
    public Car(String color,String brand, int speed){
        super();
        this.speed = speed;
        this.color = color;
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public String getDescription(){
        return " is a "+getColor()+" "+getBrand()+". It can go up to "+getSpeed()+ " mph.";
    }

    @Override
    public String getVehicleAccelerate (){
        return "The "+color+" "+brand+" is accelerating...";
    }

    @Override
    public String getVehicleSpeed() {
        return "The "+color+" "+brand+" is going "+speed+" mph";
    }

    @Override
    public String getVehicleStart() {
        return "The "+color+" "+brand+" is starting...";
    }

    @Override
    public String getVehicleStop() {
        return "The "+color+" "+brand+" is stopping...";
    }

}

