package src.task1;

public class ChocAmor extends CandyBox {
    private float length;

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public ChocAmor() {
        length = 0;
    }

    public ChocAmor(float length) {
        this.length = length;
    }

    public ChocAmor(String flavour, String origin, float length) {
        super(flavour, origin);
        this.length = length;
    }

    @Override
    public float getVolume() {
        return length * length * length;
    }

    @Override
    public String toString() {
        return "ChocAmor: " + super.toString() + " has volume " + getVolume();
    }

    public void printChocAmorDim() {
        System.out.println("ChocAmor: " + length);
    }

    @Override
    public void printDim() {
        System.out.println("ChocAmor: " + length);
    }
}
