package basetask;

public class TrainMethodsReturn {
    public Object returnNewInt;

    public int returnNewInt(int number) {
        return number * 3;
    }

    public long returnNewLong(long number) {
        return number - 4;
    }

    public String returnNewChar(char symbol) {
        return "" + symbol + symbol;
    }

    public float returnNewFloat(float number) {
        return number / 2;
    }

    public double returnNewDouble(double number) {
        return number + 8;
    }

    public short returnNewShort(short number) {
        return (short) (number - 1);
    }

    public byte returnNewByte(byte number) {
        return (byte) (number * 2);
    }

    public boolean returnNewBoolean(boolean value) {
        return !value;
    }

}
