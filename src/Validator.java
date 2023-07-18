public class Validator {
    private static final String ALLOWED_CHARS = "abcdefghijklmnopqrstuvwxyz0123456789_";

    public static boolean check(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        checkLogin(login);
        checkPassword(password);
        checkAlphabet(login);
        checkAlphabet(password);
        checkConfirmPassword(password, confirmPassword);

        return true;
    }

    private static boolean checkAlphabet(String str) {
        for (char symbol : str.toCharArray()) {

            if (!ALLOWED_CHARS.contains(Character.toString(symbol))) {

                return false;
            }
        }

        return true;
    }

    private static void checkLogin(String login) throws WrongLoginException {

        if (login.length() > 20 || !checkAlphabet(login)) {


            throw new WrongLoginException("Логин содержит недопустимые символы!");

        }
    }

    private static void checkPassword(String password) throws WrongPasswordException {

        if (password.length() > 20 || !checkAlphabet(password)) {

            throw new WrongPasswordException(" Пароль содержит недопустимые символы!");
        }
    }

    private static void checkConfirmPassword(String password, String confirmPassword) throws WrongPasswordException {

        if (!password.equals(confirmPassword)) {

            throw new WrongPasswordException(" Пароли не совпадают!");

        }
    }
}
