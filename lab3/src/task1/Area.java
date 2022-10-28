package src.task1;

public class Area {
    private CandyBag gift;
    private int number;
    private String street;
    private String message;

    public CandyBag getGift() {
        return gift;
    }

    public void setGift(CandyBag gift) {
        this.gift = gift;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Area() {
        gift = new CandyBag();
        number = 0;
        street = "nowhere";
        message = null;
    }

    public Area(int number, String street, CandyBag gift) {
        this.number = number;
        this.street = street;
        this.gift = gift;
    }

    public void getBirthdayCard() {
        System.out.println("Street " + street + ", number " + number);
        System.out.println();
        System.out.println("LMA");
        System.out.println();

        gift.getCandies().forEach((box) -> {
            if (box instanceof Lindt) {
                box.printLindtDim();
            } else if (box instanceof Baravelli) {
                box.printBaravelliDim();
            } else {
                box.printChocAmorDim();
            }
        });
    }

    public void getBirthdayCardv2() {
        System.out.println("Street " + street + ", number " + number);
        System.out.println();
        System.out.println("LMA");
        System.out.println();

        gift.getCandies().forEach((box) -> {
            if (box instanceof Lindt) {
                box.printLindtDim();
            } else if (box instanceof Baravelli) {
                box.printBaravelliDim();
            } else {
                box.printChocAmorDim();
            }
        });
    }

}
