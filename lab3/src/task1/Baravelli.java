package src.task1;

public class Baravelli extends CandyBox {
    private float radius, height;

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public Baravelli() {
        radius = 0;
        height = 0;
    }

    public Baravelli(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }

    public Baravelli(String flavour, String origin, float radius, float height) {
        super(flavour, origin);
        this.radius = radius;
        this.height = height;
    }

    @Override
    public float getVolume() {
        return (float)Math.PI * radius * radius * height;
    }

    @Override
    public String toString() {
        return "Baravelli: " + super.toString() + " has volume " + getVolume();
    }

    public void printBaravelliDim() {
        System.out.println("Baravelli: " + radius + " " +  height);
    }

    public void printDim() {
        System.out.println("Baravelli: " + radius + " " +  height);
    }
}
