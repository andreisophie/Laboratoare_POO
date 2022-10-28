package src.task1;

import java.util.Objects;

public class CandyBox {
    private String flavour;
    private String origin;

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public CandyBox() {
        flavour = "sugar-free";
        origin = "Switzerland";
    }

    public CandyBox(String flavour, String origin) {
        this.flavour = flavour;
        this.origin = origin;
    }

    public float getVolume() {
        return 0;
    }

    @Override
    public String toString() {
        return "The " + origin + " " + flavour + " chocolate";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CandyBox candyBox = (CandyBox) o;
        return Objects.equals(flavour, candyBox.flavour) && Objects.equals(origin, candyBox.origin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavour, origin);
    }

    public void printDim(){}

    public void printLindtDim(){}
    public void printBaravelliDim(){}
    public void printChocAmorDim(){}
}
