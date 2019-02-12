public class CarApp {
    public static void main(String[] args){
        Car porshe = new Car();
        porshe.setBrand("Porshe");
        porshe.setColor("Red");
        porshe.setSpeed(90);
        Car honda = new Car("Blue","Honda",60);
        System.out.println(honda.getVehicleStart());
        System.out.println(porshe.getVehicleStart());
        System.out.println(honda.getVehicleAccelerate());
        System.out.println(porshe.getVehicleAccelerate());
        System.out.println(honda.getVehicleSpeed());
        System.out.println(porshe.getVehicleSpeed());
        RandomGenerator index = new RandomGenerator();
        index.setIndex();
        Race race = new Race();
        race.setRace(index.getIndex(),porshe, honda);
        System.out.println(race.getRace());
        System.out.println(honda.getVehicleStop());
        System.out.println(porshe.getVehicleStop());
    }

}
