public class Validator {
    private static final String ALLOWED_CHARS = "abcdefghijklmnopqrstuvwxyz0123456789_";

    public static boolean check(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        isValidChars();
        checkAlphabet();

        return true;
    }

    private static boolean checkAlphabet(String str) {
            for (char symbol : str.toCharArray()) {

                if (!ALLOWED_СHARS.contains(Character.toString(symbol))) {

                    return false;
                }
            }

            return true;
        }

    private static boolean isValidChars(String login, String password ) throws WrongLoginException, WrongPasswordException {
            if (login.length() > 20 || !checkAlphabet(login)) {

                throw new WrongLoginException("Логин содержит недопустимые символы!");
            }
            if (password.length() > 20 || !checkAlphabet(password)) {

            throw new WrongPasswordException("Пароль  содержит недопустимые символы!");

        }
    }
    }

