import java.util.Random;

public class Dealership {
    class BrandOffer implements Offer {
        @Override
        public int getDiscount(Car car) {
            int discount = switch (car.type) {
                case MERCEDES -> (int) (0.05 * car.price);
                case FIAT -> (int) (0.10 * car.price);
                case SKODA -> (int) (0.15 * car.price);
            };
            System.out.println("Applying Brand discount: " + discount + " euros");
            return discount;
        }
    }

    class DealerOffer implements Offer {
        @Override
        public int getDiscount(Car car) {
            int discount;
            discount = switch (car.type) {
                case MERCEDES -> 300 * (2022 - car.fabricationYear);
                case FIAT -> 100 * (2022 - car.fabricationYear);
                case SKODA -> 150 * (2022 - car.fabricationYear);
                default -> -1;
            };
            System.out.println("Applying Dealer discount: " + discount + " euros");
            return discount;
        }
    }

    class SpecialOffer implements Offer {
        @Override
        public int getDiscount(Car car) {
            int discount = Main.rand.nextInt(1000);
            System.out.println("Applying Special discount: " + discount + " euros");
            return discount;
        }
    }

    public int getFinalPrice(Car car) {
        BrandOffer brandOffer = new BrandOffer();
        DealerOffer dealerOffer = new DealerOffer();
        SpecialOffer specialOffer = new SpecialOffer();
        return car.price - brandOffer.getDiscount(car) - dealerOffer.getDiscount(car) - specialOffer.getDiscount(car);
    }

    public void negotiate(Car car, Offer offer) {
        int discount = offer.getDiscount(car);
        System.out.println("Applying Client discount: " + discount + " euros");
    }
}
