public class EmptySaleException extends Exception {

    public EmptySaleException() {
        super("To complete a sale, you need to add products");
    }
}
