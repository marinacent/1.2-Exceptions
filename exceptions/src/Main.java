public class Main {

    public static void main(String[] args) {

        Product sofa = new Product("sofa", 1500);

        Sale morningSale = new Sale();
        try {
            morningSale.computeTotalPrice();
            System.out.println(morningSale.getTotalPrice());
        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }

        Sale eveningSale = new Sale();
        eveningSale.addProduct(sofa);

        try {
            System.out.println(eveningSale.findProduct(1).getName());
        } catch (IndexOutOfBoundsException f) {
            System.out.println(f.getMessage());
        }

    }
}
