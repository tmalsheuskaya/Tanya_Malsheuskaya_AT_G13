package basetask;

public class TrainMethodsPrimitiveRunner {
    public static void main(String[] args) {
        TrainMethodsPrimitive run = new TrainMethodsPrimitive();

        run.printInt(7);
        run.printLong(888);
        run.printChar('s');
        run.printFloat(2.14f);
        run.printDouble(3.141516);
        run.printShort((short) 76);
        run.printByte((byte)9);
        run.printBoolean(false);

    }
}
