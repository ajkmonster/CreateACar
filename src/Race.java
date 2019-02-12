public class Race {
    String race;
    public Race(){
        race ="";
    }
//    public void setRace(int index, String color1,String brand1,String color2,String brand2) {
//        if (index != 0) {
//            race = "The " + color1 + " " + brand1 + " passed " + color2 + " " + brand2 + "." +"\n"+
//                    color1+" "+brand1+" won the race";
//        } else {
//            race =  "The " + color2 + " " + brand2 + " passed " + color1 + " " + brand1 + "."+"\n"+
//                    color2+" "+brand2+" won the race";
//        }
//    }
    // the above is fine with the input but a more efficient way is below

    public void setRace(int index, Car car1, Car car2) {
        if (index != 0) {
            race = "The " + car1.getColor() + " " + car1.getBrand() + " passed " + car2.getColor() + " " + car2.getBrand() + "." + "\n" +
                    car1.getColor() + " " + car1.getBrand() + " won the race";
        } else {
            race = "The " + car2.getColor() + " " + car2.getBrand() + " passed " + car1.getColor() + " " + car1.getBrand() + "." + "\n" +
                    car2.getColor() + " " + car2.getBrand() + " won the race";
        }
    }

    public String getRace() {
        return race;
    }
}
