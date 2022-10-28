package src.task1;

public class Lindt extends CandyBox {
    private float length, width, height;

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public Lindt() {
        length = 0;
        width = 0;
        height = 0;
    }

    public Lindt(float length, float width, float height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Lindt(String flavour, String origin, float length, float width, float height) {
        super(flavour, origin);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public float getVolume() {
        return length * width * height;
    }

    @Override
    public String toString() {
        return "Lindt: " + super.toString() + " has volume " + getVolume();
    }

    public void printLindtDim() {
        System.out.println("Lindt: " + length + " " + width + " " + height);
    }

    @Override
    public void printDim() {
        System.out.println("Lindt: " + length + " " + width + " " + height);
    }
}
