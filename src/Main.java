public class Main {
    public static void main(String[] args) throws WrongLoginException {
        try {
            Validator.check("acbed", "", "");
            System.out.println("Логин выполнен!");
        } catch (WrongLoginException e) {
            throw new RuntimeException(e);
        }
    }
}
