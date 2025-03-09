import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

import java.util.regex.Pattern;

public class ValidateService {

    private final static Pattern LOGIN_PATTERN = Pattern.compile("[a-zA-Z0-9_]{1,20}");
    private final static Pattern PASSWORD_PATTERN = Pattern.compile("[a-zA-Z0-9_]{1,20}");


    public static void validate(
            String login,
            String password,
            String confirmPassword
    ) {
        validateLogin(login);
        validatePassword(password, confirmPassword);
    }

    private static void validateLogin(String login) {
        if (!LOGIN_PATTERN.matcher(login).matches()) {
            throw new WrongLoginException("Неверный формат логина");
        }
    }

    private static void validatePassword(String password, String confirmPassword) {
        if (!PASSWORD_PATTERN.matcher(password).matches()) {
            throw new WrongPasswordException("Неверный формат пароля");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
    }

}
