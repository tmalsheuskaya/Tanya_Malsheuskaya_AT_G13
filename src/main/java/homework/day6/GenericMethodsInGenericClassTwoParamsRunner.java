package homework.day6;

import playground.essence.creatures.*;
import playground.essence.craft.air.*;
import playground.essence.craft.field.*;
import playground.essence.craft.hand.*;
import playground.essence.material.*;

public class GenericMethodsInGenericClassTwoParamsRunner {
    public static void main(String[] args) {

        GenericMethodsInGenericClassTwoParams<String, String> obj1 = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(obj1.genericMethodGenArgs("String1"));
        System.out.println(obj1.genericMethodGenArgs("String2", "String3"));
        obj1.genericMethodHalfGenArgs("String4", "String5");

        GenericMethodsInGenericClassTwoParams<String, Integer> obj2 = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(obj2.genericMethodGenArgs(4));
        System.out.println(obj2.genericMethodGenArgs("String6", 6));
        obj2.genericMethodHalfGenArgs(7, "String7");

        GenericMethodsInGenericClassTwoParams<String, Double> obj3 = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(obj3.genericMethodGenArgs("String8", 88.88));
        System.out.println(obj3.genericMethodGenArgs(99.9));
        obj3.genericMethodHalfGenArgs(100.0, "String10");

        GenericMethodsInGenericClassTwoParams<Integer, Integer> obj4 = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(obj4.genericMethodGenArgs(11, 12));
        System.out.println(13);
        obj4.genericMethodHalfGenArgs(14, "String14");

        GenericMethodsInGenericClassTwoParams<Beetle, Mosquito> obj5 = new GenericMethodsInGenericClassTwoParams<>();
        Beetle beetle = new Beetle(1, "BeetleOne");
        Mosquito mosquito = new Mosquito(2, "MosquitoOne");
        System.out.println(obj5.genericMethodGenArgs(beetle));
        System.out.println(obj5.genericMethodGenArgs(beetle, mosquito));
        obj5.genericMethodHalfGenArgs(mosquito, "MosquitoString");

        GenericMethodsInGenericClassTwoParams<Fly, Pigeon> obj6 = new GenericMethodsInGenericClassTwoParams<>();
        Fly fly = new Fly(2, "FlyOne");
        Pigeon pigeon = new Pigeon(3, "PigeonOne");
        System.out.println(obj6.genericMethodGenArgs(pigeon));
        System.out.println(obj6.genericMethodGenArgs(fly, pigeon));
        obj6.genericMethodHalfGenArgs(pigeon, "Fly");

        GenericMethodsInGenericClassTwoParams<Raven, Crocodile> obj7 = new GenericMethodsInGenericClassTwoParams<>();
        Raven raven = new Raven(5, "RavenOne");
        Crocodile crocodile = new Crocodile(100, "CrocodileOne");
        System.out.println(obj7.genericMethodGenArgs(raven));
        System.out.println(obj7.genericMethodGenArgs(raven, crocodile));
        obj7.genericMethodHalfGenArgs(raven, "Crocodile");

        GenericMethodsInGenericClassTwoParams<Maylily, Rose> obj8 = new GenericMethodsInGenericClassTwoParams<>();
        Maylily maylily = new Maylily(1, "MaylilyOne");
        Rose rose = new Rose(2, "RoseOne");
        System.out.println(obj8.genericMethodGenArgs(rose));
        System.out.println(obj8.genericMethodGenArgs(maylily, rose));
        obj8.genericMethodHalfGenArgs(maylily, rose, "Rose");

        GenericMethodsInGenericClassTwoParams<Chamomile, Potato> obj9 = new GenericMethodsInGenericClassTwoParams<>();
        Chamomile chamomile = new Chamomile(3, "ChamomileOne");
        Potato potato = new Potato(3, "PotatoOne");
        System.out.println(obj9.genericMethodGenArgs(potato));
        System.out.println(obj9.genericMethodGenArgs(chamomile, potato));
        obj9.genericMethodHalfGenArgs(potato, "PotatoString");

        GenericMethodsInGenericClassTwoParams<Carrot, Radish> obj10 = new GenericMethodsInGenericClassTwoParams<>();
        Carrot carrot = new Carrot(4, "CarrotOne");
        Radish radish = new Radish(5, "RadishOne");
        System.out.println(obj10.genericMethodGenArgs(radish));
        System.out.println(obj10.genericMethodGenArgs(carrot, radish));
        obj10.genericMethodHalfGenArgs(radish, "RadishString");

        GenericMethodsInGenericClassTwoParams<Plane, Copter> obj11 = new GenericMethodsInGenericClassTwoParams<>();
        Plane plane = new Plane(1234, "PlaneOne");
        Copter copter = new Copter(4321, "CopterOne");
        System.out.println(obj11.genericMethodGenArgs(copter));
        System.out.println(obj11.genericMethodGenArgs(plane));
        obj11.genericMethodHalfGenArgs(plane, copter, "CopterString");

        GenericMethodsInGenericClassTwoParams<Rocket, Car> obj12 = new GenericMethodsInGenericClassTwoParams<>();
        Rocket rocket = new Rocket(9876, "RocketOne");
        Car car = new Car(1000, "CarOne");
        System.out.println(obj12.genericMethodGenArgs(rocket, car));
        System.out.println(obj12.genericMethodGenArgs(rocket, car));
        obj12.genericMethodHalfGenArgs(car, "CarString");

        GenericMethodsInGenericClassTwoParams<Motorbike, Moped> obj13 = new GenericMethodsInGenericClassTwoParams<>();
        Motorbike motorbike = new Motorbike(134, "MotorbikeOne");
        Moped moped = new Moped(123, "MopedOne");
        System.out.println(obj13.genericMethodGenArgs(moped));
        System.out.println(obj13.genericMethodGenArgs(motorbike, moped));
        obj13.genericMethodHalfGenArgs(moped, "MopedString");

        GenericMethodsInGenericClassTwoParams<Bottle, Mug> obj14 = new GenericMethodsInGenericClassTwoParams<>();
        Bottle bottle = new Bottle(1, "BottleOne");
        Mug mug = new Mug(1, "MugOne");
        System.out.println(obj14.genericMethodGenArgs(bottle));
        System.out.println(obj14.genericMethodGenArgs(bottle, mug));
        obj14.genericMethodHalfGenArgs(mug, "MugString");

        GenericMethodsInGenericClassTwoParams<Can, Petrol> obj15 = new GenericMethodsInGenericClassTwoParams<>();
        Can can = new Can(2, "CanOne");
        Petrol petrol = new Petrol(3);
        System.out.println(obj15.genericMethodGenArgs(can));
        System.out.println(obj15.genericMethodGenArgs(can, petrol));
        obj15.genericMethodHalfGenArgs(can, petrol, "PetrolString");

        GenericMethodsInGenericClassTwoParams<Diesel, Water> obj16 = new GenericMethodsInGenericClassTwoParams<>();
        Diesel diesel = new Diesel(4);
        Water water = new Water(5);
        System.out.println(obj16.genericMethodGenArgs(diesel));
        System.out.println(obj16.genericMethodGenArgs(diesel, water));
        obj16.genericMethodHalfGenArgs(diesel,"WaterString");
    }
}
