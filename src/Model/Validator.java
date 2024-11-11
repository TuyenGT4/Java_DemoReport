package Model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    // Hàm kiểm tra email
    public static boolean isValidEmail(String email) {
        //kiểm tra email
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();  // Trả về true nếu email hợp lệ
    }

    // Hàm kiểm tra mật khẩu
    public static boolean isValidPassword(String password) {
        //kiểm tra mật khẩu (ít nhất 1 chữ in hoa, 1 ký tự đặc biệt, 1 số và dài ít nhất 8 ký tự)
        String passwordRegex = "(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]).{8,}";
        Pattern pattern = Pattern.compile(passwordRegex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();  // Trả về true nếu mật khẩu hợp lệ
    }

    public static void main(String[] args) {
        // Kiểm tra ví dụ
        String email = "example@domain.com";
        String password = "Password123!";

        if (isValidEmail(email)) {
            System.out.println("Email hợp lệ!");
        } else {
            System.out.println("Email không hợp lệ!");
        }

        if (isValidPassword(password)) {
            System.out.println("Mật khẩu hợp lệ!");
        } else {
            System.out.println("Mật khẩu không hợp lệ!");
        }
    }
}

