package homework.day6;

public class GenericMethodsInGenericClassTwoParams<X, Y> {

    public String genericMethodGenArgs(Object arg) {
        return String.format("I received 1 argument of type: %s class", arg.getClass().getSimpleName());
    }

    public String genericMethodGenArgs(X arg1, Y arg2) {
        return String.format("I received 2 arguments of type: %s class, %s class",
                arg1.getClass().getSimpleName(), arg2.getClass().getSimpleName());
    }

    public void genericMethodHalfGenArgs(Object arg, String str) {
        System.out.println(String.format(
                "I got an object of %s class and string with %d characters",
                arg.getClass().getSimpleName(),
                str.length()));
    }

    public void genericMethodHalfGenArgs(X arg1, Y arg2, String str) {
        System.out.println(String.format("I got an object of %s class and %s class and string with %d characters",
                arg1.getClass().getSimpleName(), arg2.getClass().getSimpleName(), str.length()));
    }
}
