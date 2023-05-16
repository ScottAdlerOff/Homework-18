public class UserValidator {
    public static void validate(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        try {
            if (login.length() > 20) {
                throw new WrongLoginException("Длина логина превышает 20 символов");
            }

            if (!login.matches("[a-zA-Z0-9_]+")) {
                throw new WrongLoginException("Логин содержит недопустимые символы");
            }

            if (password.length() >= 20) {
                throw new WrongPasswordException("Длина пароля превышает или равна 20 символам");
            }

            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Пароль и подтверждение пароля не совпадают");
            }

            if (!password.matches("[a-zA-Z0-9_]+")) {
                throw new WrongPasswordException("Пароль содержит недопустимые символы");
            }

        } catch (WrongLoginException | WrongPasswordException e) {
            System.err.println(e.getMessage());
        }
    }
}
