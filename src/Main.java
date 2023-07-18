public class Main {
    public static void main(String[] args) throws WrongLoginException {
        try {

            Validator.check("acbed", "", "");

            System.out.println("Логин выполнен!");

        } catch (WrongLoginException | WrongPasswordException e) {

            System.out.println(e.getMessage());

        }
    }
}
