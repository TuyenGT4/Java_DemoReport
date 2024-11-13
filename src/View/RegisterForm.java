package View;


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import Controller.RegisterController;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegisterForm extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JLabel lblDangKy;
    private JTextField tfEmail;
    private JTextField tfMatKhau1;
    private JTextField tfMatKhau2;
    private JButton btnDangKy;
    private JLabel lblBnC;
    private JLabel lblDangNhap;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    RegisterForm frame = new RegisterForm();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public RegisterForm() {
        setTitle("Đăng ký");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 450);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        lblDangKy = new JLabel("Đăng ký");
        lblDangKy.setHorizontalAlignment(SwingConstants.CENTER);
        lblDangKy.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblDangKy.setForeground(new Color(61, 187, 164));
        lblDangKy.setBounds(10, 32, 266, 53);
        contentPane.add(lblDangKy);
        
        tfEmail = new JTextField();
        tfEmail.setColumns(10);
        tfEmail.setBounds(47, 96, 200, 30);
        tfEmail.setText("Nhập email");
        tfEmail.setForeground(Color.GRAY);
        contentPane.add(tfEmail);

/*        tfEmail.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (tfEmail.getText().equals("Nhập email")) {
                    tfEmail.setText("");
                    tfEmail.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (tfEmail.getText().isEmpty()) {
                    tfEmail.setForeground(Color.GRAY);
                    tfEmail.setText("Nhập email");
                }
            }
        });
*/
        tfMatKhau1 = new JTextField();
        tfMatKhau1.setColumns(10);
        tfMatKhau1.setBounds(47, 149, 200, 30);
        tfMatKhau1.setText("Nhập mật khẩu");
        tfMatKhau1.setForeground(Color.GRAY);
        contentPane.add(tfMatKhau1);

/*        tfMatKhau1.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if (tfMatKhau1.getText().equals("Nhập mật khẩu")) {
                    tfMatKhau1.setText("");
                    tfMatKhau1.setForeground(Color.BLACK);
                }
            }

            public void focusLost(FocusEvent e) {
                if (tfMatKhau1.getText().isEmpty()) {
                    tfMatKhau1.setForeground(Color.GRAY);
                    tfMatKhau1.setText("Nhập mật khẩu");
                }
            }
        });
*/
        tfMatKhau2 = new JTextField();
        tfMatKhau2.setColumns(10);
        tfMatKhau2.setBounds(47, 202, 200, 30);
        tfMatKhau2.setText("Nhập lại mật khẩu");
        tfMatKhau2.setForeground(Color.GRAY);
        contentPane.add(tfMatKhau2);

/*        tfMatKhau2.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if (tfMatKhau2.getText().equals("Nhập lại mật khẩu")) {
                    tfMatKhau2.setText("");
                    tfMatKhau2.setForeground(Color.BLACK);
                }
            }

            public void focusLost(FocusEvent e) {
                if (tfMatKhau2.getText().isEmpty()) {
                    tfMatKhau2.setForeground(Color.GRAY);
                    tfMatKhau2.setText("Nhập lại mật khẩu");
                }
            }
        });
*/
        btnDangKy = new JButton("Đăng ký");
        btnDangKy.setForeground(Color.WHITE);
        btnDangKy.setFont(new Font("Times New Roman", Font.PLAIN, 11));
        btnDangKy.setBackground(new Color(61, 187, 164));
        btnDangKy.setBounds(96, 257, 89, 23);
        contentPane.add(btnDangKy);

/*        btnDangKy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = tfEmail.getText();
                String matKhau1 = tfMatKhau1.getText();
                String matKhau2 = tfMatKhau2.getText();
                
                // Validate email
                if (!isValidEmail(email)) {
                    JOptionPane.showMessageDialog(RegisterForm.this, "Email không hợp lệ. Vui lòng kiểm tra lại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Validate password
                if (!isValidPassword(matKhau1)) {
                    JOptionPane.showMessageDialog(RegisterForm.this, "Mật khẩu phải chứa ít nhất: 1 chữ in hoa, 1 ký tự đặc biệt và 1 số.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Validate password match
                if (!matKhau1.equals(matKhau2)) {
                    JOptionPane.showMessageDialog(RegisterForm.this, "Mật khẩu và mật khẩu xác nhận không khớp.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Show success message
                JOptionPane.showMessageDialog(RegisterForm.this, "Đăng ký thành công!", "Thành công", JOptionPane.INFORMATION_MESSAGE);
            }
        });
*/
        lblBnC = new JLabel("Bạn đã có tài khoản?");
        lblBnC.setFont(new Font("Times New Roman", Font.PLAIN, 11));
        lblBnC.setBounds(70, 337, 115, 14);
        contentPane.add(lblBnC);

        lblDangNhap = new JLabel("Đăng nhập");
        lblDangNhap.setForeground(new Color(61, 187, 164));
        lblDangNhap.setFont(new Font("Times New Roman", Font.PLAIN, 11));
        lblDangNhap.setBounds(172, 337, 49, 14);
        contentPane.add(lblDangNhap);
        
/*        lblDangNhap.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	if (SwingUtilities.isLeftMouseButton(e)) {   // Kiểm tra nút chuột trái  
            		// ẩn registerform
	                RegisterForm.this.setVisible(false);
	
	                // Hiển thị LoginForm
	                LoginForm loginForm = new LoginForm();
	                loginForm.setVisible(true);
            	}
            }
        });
*/
        RegisterController controller = new RegisterController(this);
    }

    
    public JTextField gettfEmail() {
    	return this.tfEmail;
    }
    public JTextField gettfMatKhau1() {
    	return this.tfMatKhau1;
    }
    public JTextField gettfMatKhau2() {
    	return this.tfMatKhau2;
    }
    public JButton getbtnDangKy() {
    	return this.btnDangKy;
    }
    public JLabel getlblDangNhap() {
    	return this.lblDangNhap;
    }
    public JPanel getContenPane() {
    	return this.contentPane;
    }
}
