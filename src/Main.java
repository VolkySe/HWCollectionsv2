import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String login = "login_123";
        String password = "passssswoord";
        String confirmPassword = "passwoord";
        try {
            ValidateService.validate(login, password, confirmPassword);
        } catch (WrongLoginException wrongLoginException) {
            System.out.println("Произошла ошибка при проверке формата логина: " + wrongLoginException.getMessage());
        } catch (WrongPasswordException wrongPasswordException) {
            System.out.println("Произошла ошибка при проверке формата пароля: " + wrongPasswordException);
        } finally {
            System.out.println("Валидация завершена");
        }
    }
}