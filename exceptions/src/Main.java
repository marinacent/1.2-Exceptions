public class Main {

    public static void main(String[] args) {

        Product sofa = new Product("sofa", 1500);
        Product chair = new Product("chair", 200);
        Product table = new Product("table", 700);

        Sale morningSale = new Sale();
        try {
            morningSale.computeTotalPrice();
        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }

        Sale afternoonSale = new Sale();
        afternoonSale.addProduct(sofa);
        afternoonSale.addProduct(chair);

        try {
            afternoonSale.computeTotalPrice();
        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(afternoonSale.getTotalPrice());

        Sale eveningSale = new Sale();
        try {
            System.out.println(eveningSale.findProduct(1).getName());
        } catch (IndexOutOfBoundsException f) {
            System.out.println(f.getMessage());
        }

    }
}
