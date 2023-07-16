public class Validator {
    private static final String ALLOWED_CHARS = "abcdeif_";

    public static boolean check(String login, String password, String confirmPassword) throws WrongLoginException {
        if (login.length() > 20) {
            throw new WrongLoginException("Логин не может быть более 20 символов");
        }
        if (!checkAlphabet(login)) {
            checkAlphabet(login);
            throw new WrongLoginException("Строка содержит недоустимые символы);");
        }
        if (password.length() > 20) {
            throw new WrongPasswordException("Пароль не может быть более 20 символов");
        }
        if (!checkAlphabet(password)) {
            throw new WrongPasswordException("Логин не может быть более 20 символов");
        }

        return true;
    }

    private static boolean checkAlphabet(String str) throws WrongLoginException {
        var lowercaase = str.toLowerCase();
        for (int i = 0; i < lowercaase.length(); i++) {
            var c = lowercaase.charAt(i);
            boolean found = false;
            for (int j = 0; j < ALLOWED_CHARS.length(); j++) {
                if (ALLOWED_CHARS.charAt(j) == c) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                throw new WrongLoginException("Cтрока содержит недопустимые символы!");
            }

        }

        return false;
    }
}
