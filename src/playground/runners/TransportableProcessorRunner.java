package playground.runners;

import playground.essence.Flyable;
import playground.essence.craft.Rideable;
import playground.essence.craft.air.*;
import playground.essence.craft.field.*;
import playground.essence.craft.Transportable;
import playground.processors.TransportableProcessor;

public class TransportableProcessorRunner {

    public static void main(String[] args) {
        TransportableProcessor processor = new TransportableProcessor();

        Transportable transportableCopter = new Copter(223, "AW109 Transportable");
        Transportable transportablePlane = new Plane(3452, "Airbus a380 Transportable");
        Transportable transportableRocket = new Rocket(7623, "Soyuz-FG Transportable");
        Transportable transportableCar = new Car(23, "Tesla X Transportable");
        Transportable transportableMoped = new Moped(12, "Honda EM1 Transportable");
        Transportable transportableMotorbike = new Motorbike(12, "Suzuki GSX-R1000 Transportable");

        Aircraft aircraftCopter = new Copter(223, "AW109 Aircraft");
        Aircraft aircraftPlane = new Plane(3452, "Airbus a380 Aircraft");
        Aircraft aircraftRocket = new Rocket(7623, "Soyuz-FG Aircraft");

        Vehicle vehicleCar = new Car(23, "Tesla X Vehicle");
        Vehicle vehicleMoped = new Moped(12, "Honda EM1 Vehicle");
        Vehicle vehicleMotorbike = new Motorbike(12, "Suzuki GSX-R1000 Vehicle");

        Flyable flyableCopter = new Copter(223, "AW109 Flyable");
        Flyable flyablePlane = new Plane(3452, "Airbus a380 Flyable");
        Flyable flyableRocket = new Rocket(7623, "Soyuz-FG Flyable");

        Rideable rideableCar = new Car(23, "Tesla X Rideable");
        Rideable rideableMoped = new Moped(12, "Honda EM1 Rideable");
        Rideable rideableMotorbike = new Motorbike(12, "Suzuki GSX-R1000 Rideable");

        Copter aCopter = new Copter(223, "AW109 Copter");
        Plane aPlane = new Plane(3452, "Airbus a380 Plane");
        Rocket aRocket = new Rocket(7623, "Soyuz-FG Rocket");
        Car aCar = new Car(23, "Tesla X Car");
        Moped aMoped = new Moped(12, "Honda EM1 Moped");
        Motorbike aMotorbike = new Motorbike(12, "Suzuki GSX-R1000 Motorbike");

        processor.runTransportable(transportableCopter, 10, 20);
        processor.runTransportable(transportablePlane, 15, 25);
        processor.runTransportable(transportableRocket, 30, 60);
        processor.runTransportable(transportableCar, 5, 18);
        processor.runTransportable(transportableMoped, 7, 14);
        processor.runTransportable(transportableMotorbike, 100, 220);

        // Эти объекты не реализуют напрямую Transportable, поэтому закомментировано
        // processor.runTransportable(aircraftCopter, 1, 2);
        // processor.runTransportable(aircraftPlane, 3, 4);
        // processor.runTransportable(aircraftRocket, 5, 6);
        // processor.runTransportable(vehicleCar, 7, 8);
        // processor.runTransportable(vehicleMoped, 9, 10);
        // processor.runTransportable(vehicleMotorbike, 11, 12);
        // processor.runTransportable(flyableCopter, 13, 14);
        // processor.runTransportable(flyablePlane, 15, 16);
        // processor.runTransportable(flyableRocket, 17, 18);
        // processor.runTransportable(rideableCar, 19, 20);
        // processor.runTransportable(rideableMoped, 21, 22);
        // processor.runTransportable(rideableMotorbike, 23, 24);

        processor.runTransportable(aCopter, 1, 11);
        processor.runTransportable(aPlane, 2, 22);
        processor.runTransportable(aRocket, 3, 33);
        processor.runTransportable(aCar, 4, 44);
        processor.runTransportable(aMoped, 5, 55);
        processor.runTransportable(aMotorbike, 6, 66);


        processor.runTransportable(transportableCar, 23, 242);
        processor.runTransportable(transportablePlane, 93, 7);
    }
}
