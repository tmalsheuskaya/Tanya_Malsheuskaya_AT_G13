package basetask;

import java.sql.SQLOutput;

public class TrainMethodsReturnRunner {
    public static void main(String[] args) {
        TrainMethodsReturn run = new TrainMethodsReturn();

        System.out.println("метод returnNewInt вернул " + run.returnNewInt(3));
        System.out.println("метод returnNewLong вернул " + run.returnNewLong(7));
        System.out.println("метод returnNewChar вернул " + run.returnNewChar('a'));
        System.out.println("метод returnNewFloat вернул " + run.returnNewFloat(3.45f));
        System.out.println("метод returnNewDouble вернул " + run.returnNewDouble(7.18));
        System.out.println("метод returnNewShort вернул " + run.returnNewShort((short) 9));
        System.out.println("метод returnNewByte вернул " + run.returnNewByte((byte) 5));
        System.out.println("метод returnNewBoolean вернул " + run.returnNewBoolean(true));


    }
}
