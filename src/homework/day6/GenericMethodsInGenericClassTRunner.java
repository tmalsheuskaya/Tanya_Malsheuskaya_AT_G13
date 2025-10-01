package homework.day6;

import playground.essence.creatures.*;
import playground.essence.craft.air.*;
import playground.essence.craft.field.*;
import playground.essence.craft.hand.*;
import playground.essence.material.*;


public class GenericMethodsInGenericClassTRunner {
    public static void main(String[] args) {

        GenericMethodsInGenericClassT<String> stringObj = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Integer> integerObj = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Double> doubleObj = new GenericMethodsInGenericClassT<>();

        GenericMethodsInGenericClassT<Beetle> beetleObj = new GenericMethodsInGenericClassT<>();
        beetleObj.genericMethodOneGenArg(new Beetle(1, "BeetleOne"));
        System.out.println(beetleObj.genericMethodTwoGenArgs(new Beetle(3, "we"), new Fly(5, "Erl")));
        beetleObj.genericMethodHalfGenArgs(new Beetle(5, "Zhuk"), "BeetleString");

        GenericMethodsInGenericClassT<Mosquito> mosquitoObj = new GenericMethodsInGenericClassT<>();
        mosquitoObj.genericMethodOneGenArg(new Mosquito(4, "Kus"));
        System.out.println(mosquitoObj.genericMethodTwoGenArgs(new Mosquito(3, "Wee"), "Ukus"));
        mosquitoObj.genericMethodHalfGenArgs(new Mosquito(3, "Sara"), "Superstroka");

        GenericMethodsInGenericClassT<Fly> flyObj = new GenericMethodsInGenericClassT<>();
        flyObj.genericMethodOneGenArg(new Fly(9, "Cokotuha"));
        System.out.println(flyObj.genericMethodTwoGenArgs(new Fly(6, "Flying"), new Fly(8, "HiFlying")));
        flyObj.genericMethodHalfGenArgs(new Fly(5, "Myxa"), "Strokaduraka");

        GenericMethodsInGenericClassT<Pigeon> pigeonObj = new GenericMethodsInGenericClassT<>();
        pigeonObj.genericMethodOneGenArg(new Pigeon(7, "Valera"));
        System.out.println(pigeonObj.genericMethodTwoGenArgs(new Pigeon(8, "White"), new Pigeon(9, "Golub")));
        pigeonObj.genericMethodHalfGenArgs(new Pigeon(4, "Golubka"), "Line");

        GenericMethodsInGenericClassT<Raven> ravenObj = new GenericMethodsInGenericClassT<>();
        ravenObj.genericMethodOneGenArg(new Raven(8, "Karkusha"));
        System.out.println(ravenObj.genericMethodTwoGenArgs(new Raven(9, "Kraken"), new Raven(6, "Karkaken")));
        ravenObj.genericMethodHalfGenArgs(new Raven(5, "Voron"), "Black");

        GenericMethodsInGenericClassT<Crocodile> crocodileObj = new GenericMethodsInGenericClassT<>();
        crocodileObj.genericMethodOneGenArg(new Crocodile(123, "Gena"));
        System.out.println(crocodileObj.genericMethodTwoGenArgs(new Crocodile(654, "Gator"), new Crocodile(987, "Dandy")));
        crocodileObj.genericMethodHalfGenArgs(new Crocodile(987, "Crocs"), "Alligator");

        GenericMethodsInGenericClassT<Maylily> maylilyObj = new GenericMethodsInGenericClassT<>();
        maylilyObj.genericMethodOneGenArg(new Maylily(1, "Maylily"));
        System.out.println(maylilyObj.genericMethodTwoGenArgs(new Maylily(8, "Lilymay"), new Maylily(8, "Lily")));
        maylilyObj.genericMethodHalfGenArgs(new Maylily(5, "May"), "Lilylily");

        GenericMethodsInGenericClassT<Rose> roseObj = new GenericMethodsInGenericClassT<>();
        roseObj.genericMethodOneGenArg(new Rose(4, "Rose"));
        System.out.println(roseObj.genericMethodTwoGenArgs(new Rose(3, "Azor"), new Rose(7, "Roza")));
        roseObj.genericMethodHalfGenArgs(new Rose(4, "White"), "Red");

        GenericMethodsInGenericClassT<Chamomile> chamomileObj = new GenericMethodsInGenericClassT<>();
        chamomileObj.genericMethodOneGenArg(new Chamomile(1, "Romashka"));
        System.out.println(chamomileObj.genericMethodTwoGenArgs(new Chamomile(4, "Chamomile"), new Chamomile(7, "Flower")));
        chamomileObj.genericMethodHalfGenArgs(new Chamomile(5, "Vasilek"), "Blue");

        GenericMethodsInGenericClassT<Potato> potatoObj = new GenericMethodsInGenericClassT<>();
        potatoObj.genericMethodOneGenArg(new Potato(1, "Bulba"));
        System.out.println(potatoObj.genericMethodTwoGenArgs(new Potato(7, "Kartoshechka"), new Potato(8, "Kroshechka")));
        potatoObj.genericMethodHalfGenArgs(new Potato(4, "Ziemniak"), "Frytki");

        GenericMethodsInGenericClassT<Carrot> carrotObj = new GenericMethodsInGenericClassT<>();
        carrotObj.genericMethodOneGenArg(new Carrot(9, "Carrot"));
        System.out.println(carrotObj.genericMethodTwoGenArgs(new Carrot(7, "Morkva"), new Carrot(8, "Marchev")));
        carrotObj.genericMethodHalfGenArgs(new Carrot(3, "Carrot1"), "Orange");

        GenericMethodsInGenericClassT<Radish> radishObj = new GenericMethodsInGenericClassT<>();
        radishObj.genericMethodOneGenArg(new Radish(7, "Raddish"));
        System.out.println(radishObj.genericMethodTwoGenArgs(new Radish(1, "Radish1"), new Radish(5, "Bigradish")));
        radishObj.genericMethodHalfGenArgs(new Radish(5, "Radish2"), "Pink");

        GenericMethodsInGenericClassT<Plane> planeObj = new GenericMethodsInGenericClassT<>();
        planeObj.genericMethodOneGenArg(new Plane(123, "Airbus"));
        System.out.println(planeObj.genericMethodTwoGenArgs(new Plane(987, "Boeing"), new Plane(765, "LOT")));
        planeObj.genericMethodHalfGenArgs(new Plane(765, "Wizz"), "Air");

        GenericMethodsInGenericClassT<Copter> copterObj = new GenericMethodsInGenericClassT<>();
        copterObj.genericMethodOneGenArg(new Copter(345, "Apache"));
        System.out.println(copterObj.genericMethodTwoGenArgs(new Copter(567, "Tiger"), new Copter(876, "Helicopter")));
        copterObj.genericMethodHalfGenArgs(new Copter(638, "Mi"), "Vertushka");

        GenericMethodsInGenericClassT<Rocket> rocketObj = new GenericMethodsInGenericClassT<>();
        rocketObj.genericMethodOneGenArg(new Rocket(9876, "SpaceX"));
        System.out.println(rocketObj.genericMethodTwoGenArgs(new Rocket(4545, "XSpace"), new Rocket(9393, "RocketScience")));
        rocketObj.genericMethodHalfGenArgs(new Rocket(123, "Mini"), "Smallrocket");

        GenericMethodsInGenericClassT<Car> carObj = new GenericMethodsInGenericClassT<>();
        carObj.genericMethodOneGenArg(new Car(233, "Volvo"));
        System.out.println(carObj.genericMethodTwoGenArgs(new Car(76, "Citroen"), new Car(98, "Honda")));
        carObj.genericMethodHalfGenArgs(new Car(234, "BMW"), "Supercar");

        GenericMethodsInGenericClassT<Motorbike> motorbikeObj = new GenericMethodsInGenericClassT<>();
        motorbikeObj.genericMethodOneGenArg(new Motorbike(23, "Java"));
        System.out.println(motorbikeObj.genericMethodTwoGenArgs(new Motorbike(12, "Harley"), new Motorbike(123, "BMX")));
        motorbikeObj.genericMethodHalfGenArgs(new Motorbike(12, "Izh"), "Cycle");

        GenericMethodsInGenericClassT<Moped> mopedObj = new GenericMethodsInGenericClassT<>();
        mopedObj.genericMethodOneGenArg(new Moped(123, "Vespa"));
        System.out.println(mopedObj.genericMethodTwoGenArgs(new Moped(82, "Minsk"), new  Moped(98, "Motoroller")));
        mopedObj.genericMethodHalfGenArgs(new Moped(34, "Moped"), "Moped");

        GenericMethodsInGenericClassT<Bottle> bottleObj = new GenericMethodsInGenericClassT<>();
        bottleObj.genericMethodOneGenArg(new Bottle(1, "Winebottle"));
        System.out.println(bottleObj.genericMethodTwoGenArgs(new Bottle(2, "Beerbottle"), new Bottle(1, "Milkbottle")));
        bottleObj.genericMethodHalfGenArgs(new Bottle(3, "Bigbottle"), "Verybig");

        GenericMethodsInGenericClassT<Mug> mugObj = new GenericMethodsInGenericClassT<>();
        mugObj.genericMethodOneGenArg(new Mug(1, "Coffemug"));
        System.out.println(mugObj.genericMethodTwoGenArgs(new Mug(2, "Teamug"), new Mug(3, "Soupmug")));
        mugObj.genericMethodHalfGenArgs(new Mug(3, "BigMug"), "My Mug");

        GenericMethodsInGenericClassT<Can> canObj = new GenericMethodsInGenericClassT<>();
        canObj.genericMethodOneGenArg(new Can(3, "Tuna"));
        System.out.println(canObj.genericMethodTwoGenArgs(new Can(3, "Salmon"), new Can(4, "Corn")));
        canObj.genericMethodHalfGenArgs(new Can(3, "Beer"), "Budwaiser");

        GenericMethodsInGenericClassT<Petrol> petrolObj = new GenericMethodsInGenericClassT<>();
        petrolObj.genericMethodOneGenArg(new Petrol(92));
        System.out.println(new Petrol(95));
        petrolObj.genericMethodHalfGenArgs(new Petrol(100), "Turbo");

        GenericMethodsInGenericClassT<Diesel> dieselObj = new GenericMethodsInGenericClassT<>();
        dieselObj.genericMethodOneGenArg(new Diesel(1));
        System.out.println(new Diesel(2));
        dieselObj.genericMethodHalfGenArgs(new Diesel(3), "Diesel");

        GenericMethodsInGenericClassT<Water> waterObj = new GenericMethodsInGenericClassT<>();
        waterObj.genericMethodOneGenArg(new Water(1));
        System.out.println(new Water(2));
        waterObj.genericMethodHalfGenArgs(new Water(3), "Mineral");


    }
}
