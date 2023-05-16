public class Main {
    public static void main(String[] args) {
        String login = "user_name";
        String password = "password123";
        String confirmPassword = "password123";

        try {
            UserValidator.validate(login, password, confirmPassword);
            System.out.println("Вход выполнен успешно.");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.err.println("Вход не выполнен: " + e.getMessage());
        }
    }
}
