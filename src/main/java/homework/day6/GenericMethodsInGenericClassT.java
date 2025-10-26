package homework.day6;

public class GenericMethodsInGenericClassT<T> {
    public void genericMethodOneGenArg (T arg) {
        System.out.println("I am an object of " + arg.getClass().getSimpleName() + " class");
    }

    public <U, V> String genericMethodTwoGenArgs (U arg1, V arg2) {
        return "We are objects of " + arg1.getClass().getSimpleName()
                + " class and " + arg2.getClass().getSimpleName() + " class";
    }

    public void genericMethodHalfGenArgs (T arg, String str) {
        System.out.println("I got an object of " + arg.getClass().getSimpleName()
        + " class and string with " + str.length() + " characters");
    }
}
