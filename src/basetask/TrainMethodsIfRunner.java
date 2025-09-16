package basetask;

public class TrainMethodsIfRunner {
    public static void main(String[] args) {
        TrainMethodsIf run = new TrainMethodsIf();

        System.out.println("метод returnNewInt вернул " + run.returnNewInt(5));
        System.out.println("метод returnNewLong вернул " + run.returnNewLong(500L));
        System.out.println("метод returnNewChar вернул " + run.returnNewChar('g'));
        System.out.println("метод returnNewFloat вернул " + run.returnNewFloat(0.5f));
        System.out.println("метод returnNewDouble вернул " + run.returnNewDouble(50.0));
        run.returnNewBoolean(true);
        run.returnNewBoolean(false);
        }
    }
