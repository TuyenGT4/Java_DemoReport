package View;

import javax.swing.*;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.SwingConstants;

public class LoginForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblDangNhap;
	private JTextField tfEmail;
	private JPasswordField tfMatKhau;
	private JCheckBox cbHienThiMatKhau;
	private JButton btnDangNhap;
	private JLabel lblNewLabel;
	private JLabel lblDangKy;
	private JLabel lblQuenMatKhau;
	private Color color = new Color(61, 187, 164);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginForm() {
		setTitle("Đăng nhập\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 450);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblDangNhap = new JLabel("Đăng nhập");
		lblDangNhap.setHorizontalAlignment(SwingConstants.CENTER);
		lblDangNhap.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblDangNhap.setForeground(color); // set màu chữ "Login" là rbg(61,187,164)
		lblDangNhap.setBounds(10, 32, 266, 53);
		contentPane.add(lblDangNhap);
		
		tfEmail = new JTextField();
		tfEmail.setBounds(43, 107, 200, 30);
		tfEmail.setText("Nhập email");
		contentPane.add(tfEmail);
		tfEmail.setColumns(10);
		
/*		//thêm placeholder		
		tfEmail.addFocusListener(new FocusListener() {
		    @Override
		    public void focusGained(FocusEvent e) {
		        if (tfEmail.getText().equals("Nhập email")) {
		            tfEmail.setText("");
		            tfEmail.setForeground(Color.BLACK); // Đổi màu chữ khi người dùng nhập
		        }
		    }

		    @Override
		    public void focusLost(FocusEvent e) {
		        if (tfEmail.getText().isEmpty()) {
		            tfEmail.setForeground(Color.GRAY);
		            tfEmail.setText("Nhập email"); // Hiển thị lại placeholder nếu trống
		        }
		    }
		});
		
*/			
		tfMatKhau = new JPasswordField();
		tfMatKhau.setBounds(43, 177, 200, 30);
		tfMatKhau.setText("Nhập mật khẩu");
		contentPane.add(tfMatKhau);
		tfMatKhau.setColumns(10);
/*		
		//set placeholder
		tfMatKhau.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (new String(tfMatKhau.getPassword()).equals("Nhập mật khẩu")) { // Use getPassword()
                    tfMatKhau.setText("");
                    tfMatKhau.setForeground(Color.BLACK);
                    tfMatKhau.setEchoChar('*'); // Bật chế độ ẩn mật khẩu
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (tfMatKhau.getPassword().length == 0) { 
                    tfMatKhau.setForeground(Color.GRAY);
                    tfMatKhau.setText("Nhập mật khẩu");
                    tfMatKhau.setEchoChar((char) 0); // Tắt chế độ ẩn mật khẩu
                }
            }
        });
*/		
		
		cbHienThiMatKhau = new JCheckBox("Hiển thị mật khẩu");
		cbHienThiMatKhau.setFont(new Font("Times New Roman", Font.PLAIN, 9));
		cbHienThiMatKhau.setBounds(43, 214, 142, 23);
		contentPane.add(cbHienThiMatKhau);
/*		
		cbHienThiMatKhau.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (cbHienThiMatKhau.isSelected()) {
                    tfMatKhau.setEchoChar((char) 0); // Hiển thị mật khẩu
                } else {
                    if (new String(tfMatKhau.getPassword()).equals("Nhập mật khẩu")) { // Use getPassword()
                        tfMatKhau.setEchoChar((char) 0); // Tắt chế độ ẩn cho placeholder
                    } else {
                        tfMatKhau.setEchoChar('*'); // Ẩn mật khẩu
                    }
                }
            }
        });
*/		
		btnDangNhap = new JButton("Đăng nhập");
		btnDangNhap.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnDangNhap.setBounds(96, 254, 89, 23);
		btnDangNhap.setBackground(color); // set màu nền nút
		btnDangNhap.setForeground(new Color(255,255,255));  //set màu chữ
		contentPane.add(btnDangNhap);
		
		lblNewLabel = new JLabel("Bạn chưa có tài khoản?");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel.setBounds(58, 337, 115, 14);
		contentPane.add(lblNewLabel);
		
		lblDangKy = new JLabel("Đăng ký");
		lblDangKy.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblDangKy.setBounds(168, 337, 49, 14);
		lblDangKy.setForeground(color);
		contentPane.add(lblDangKy);
/*		
        lblDangKy.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	if (SwingUtilities.isLeftMouseButton(e)) { // Kiểm tra nút chuột trái
	                // ẩn loginform
	            	LoginForm.this.setVisible(false);
	                
	
	                // Hiển thị Registerform
	                RegisterForm registerForm = new RegisterForm();
	                registerForm.setVisible(true);
            	}
            }
        });
*/		
		lblQuenMatKhau = new JLabel("Quên mật khẩu?");
		lblQuenMatKhau.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblQuenMatKhau.setBounds(96, 312, 87, 14);
		lblQuenMatKhau.setForeground(color);
		contentPane.add(lblQuenMatKhau);
	}
	public JTextField gettfEmail() {
		return this.tfEmail;
	}
	public JPasswordField gettfMatKhau() {
		return this.tfMatKhau;
	}
	public JCheckBox getcbHienThiMatKhau() {
		return this.cbHienThiMatKhau;
	}
	public JButton getbtnDangNhap() {
		return this.btnDangNhap;
	}
	public JLabel getlblDangKy() {
		return this.lblDangKy;
	}
	public JLabel getlblQuenMatKhau() {
		return this.getlblQuenMatKhau();
	}
}
