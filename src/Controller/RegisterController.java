package Controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import View.LoginForm;
import View.RegisterForm;

public class RegisterController {
	private RegisterForm register;
	public RegisterController(RegisterForm registerForm) {
		this.register = registerForm;
		
		//dat placeholder "Nhập email"
		register.gettfEmail().addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (register.gettfEmail().getText().equals("Nhập email")) {
                	register.gettfEmail().setText("");
                	register.gettfEmail().setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (register.gettfEmail().getText().isEmpty()) {
                	register.gettfEmail().setForeground(Color.GRAY);
                	register.gettfEmail().setText("Nhập email");
                }
            }
        });
		
		//dat placeholder "Nhập mật khẩu"
		register.gettfMatKhau1().addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if (register.gettfMatKhau1().getText().equals("Nhập mật khẩu")) {
                	register.gettfMatKhau1().setText("");
                	register.gettfMatKhau1().setForeground(Color.BLACK);
                }
            }

            public void focusLost(FocusEvent e) {
                if (register.gettfMatKhau1().getText().isEmpty()) {
                	register.gettfMatKhau1().setForeground(Color.GRAY);
                	register.gettfMatKhau1().setText("Nhập mật khẩu");
                }
            }
        });
		
		//dat placeholder "Nhập mật khẩu"
				register.gettfMatKhau2().addFocusListener(new FocusListener() {
		            public void focusGained(FocusEvent e) {
		                if (register.gettfMatKhau2().getText().equals("Nhập mật khẩu")) {
		                	register.gettfMatKhau2().setText("");
		                	register.gettfMatKhau2().setForeground(Color.BLACK);
		                }
		            }

		            public void focusLost(FocusEvent e) {
		                if (register.gettfMatKhau2().getText().isEmpty()) {
		                	register.gettfMatKhau2().setForeground(Color.GRAY);
		                	register.gettfMatKhau2().setText("Nhập mật khẩu");
		                }
		            }
		        });
				
				
				//xử lý event nhấn vào nút đăng ký tài khoản
		        register.getbtnDangKy().addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		                String email = register.gettfEmail().getText();
		                String matKhau1 = register.gettfMatKhau1().getText();
		                String matKhau2 = register.gettfMatKhau2().getText();
		                
		                // Validate email
		                if (!isValidEmail(email)) {
		                    JOptionPane.showMessageDialog(register.getContenPane(), "Email không hợp lệ. Vui lòng kiểm tra lại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
		                    return;
		                }

		                // Validate password
		                if (!isValidPassword(matKhau1)) {
		                    JOptionPane.showMessageDialog(register.getContenPane(), "Mật khẩu phải chứa ít nhất: 1 chữ in hoa, 1 ký tự đặc biệt và 1 số.", "Lỗi", JOptionPane.ERROR_MESSAGE);
		                    return;
		                }

		                // Validate password match
		                if (!matKhau1.equals(matKhau2)) {
		                    JOptionPane.showMessageDialog(register.getContenPane(), "Mật khẩu và mật khẩu xác nhận không khớp.", "Lỗi", JOptionPane.ERROR_MESSAGE);
		                    return;
		                }

		                // Show success message
		                JOptionPane.showMessageDialog(register.getContenPane(), "Đăng ký thành công!", "Thành công", JOptionPane.INFORMATION_MESSAGE);
		            }
		        });	
		        
		// xử lý event nhấn vào đăng nhập -> chuyển hướng đến trang đăng nhập
		        register.getlblDangNhap().addMouseListener(new MouseAdapter() {
		            @Override
		            public void mouseClicked(MouseEvent e) {
		            	if (SwingUtilities.isLeftMouseButton(e)) {   // Kiểm tra nút chuột trái  
		            		// ẩn registerform
		            		register.getContenPane().setVisible(false);
			
			                // Hiển thị LoginForm
			                LoginForm loginForm = new LoginForm();
			                loginForm.setVisible(true);
		            	}
		            }
		        });
	}
	
	// Email validation
    private boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        return pattern.matcher(email).matches();
    }

    // Password validation
    private boolean isValidPassword(String password) {
    	//xác thực tính hợp lệ của mật khẩu (ít nhất 1 chữ hoa, 1 ký tự đặc biệt, 1 số và dài ít nhất 8 ký tự)
        String passwordRegex = "(?=.*[A-Z])(?=.*[0-9])(?=.*[^_=!#$%&()*+,-.:/'?@]).{8,}";
        return password.matches(passwordRegex);
    }
}
