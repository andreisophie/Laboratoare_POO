public class Car {
    int price;
    int fabricationYear;
    CarType type;

    enum CarType {
        MERCEDES,
        FIAT,
        SKODA
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getFabricationYear() {
        return fabricationYear;
    }

    public void setFabricationYear(int fabricationYear) {
        this.fabricationYear = fabricationYear;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public Car(int price, CarType type, int fabricationYear) {
        this.price = price;
        this.type = type;
        this.fabricationYear = fabricationYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", carType=" + type +
                ", year=" + fabricationYear +
                '}';
    }
}
