package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;

import java.awt.GridBagLayout;
import javax.swing.JMenuBar;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;

public class GeneralForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel plMenu, plVachNgan1, plVachNgan2, plVachNgan3;
	private JButton btnNewButton, btnNewButton_1, btnNewButton_1_1, btnNewButton_1_1_1;
	private JButton selectedButton = null;
	private boolean isButtonSelected = false, isPanelVisible = false;
	private JPanel plMain, plAboveMain;
	private JLabel lblUserName, lblAvata;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GeneralForm frame = new GeneralForm();
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
	public GeneralForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800 ,600);
		setLocationRelativeTo(null);
		setTitle("Nông trại thông minh");
		
		 plMenu = new JPanel();
		plMenu.setBackground(new Color(61, 187, 164));
		
		 btnNewButton = new JButton("Trang chủ");
		 btnNewButton.setForeground(Color.WHITE);
		 btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton.setBackground(new Color(61, 187, 164));
		btnNewButton.setBorder(null);
	
		
		// Thêm MouseListener để đổi màu khi di chuột và khi nút được chọn
		btnNewButton.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseEntered(MouseEvent e) {
		        // Đổi màu khi di chuột vào nếu nút chưa được chọn
		        if (!isButtonSelected) {
		            btnNewButton.setBackground(new Color(0, 150, 136));
		        }
		    }

		    @Override
		    public void mouseExited(MouseEvent e) {
		        // Đổi màu về mặc định khi di chuột ra nếu nút chưa được chọn
		        if (!isButtonSelected) {
		            btnNewButton.setBackground(new Color(61, 187, 164));
		        }
		    }

		    @Override
		    public void mousePressed(MouseEvent e) {
		        // Xử lý khi nút được nhấn

		        if (selectedButton != null) {
		            selectedButton.setBackground(new Color(61, 187, 164)); // Trả lại màu ban đầu cho nút trước đó
		            isButtonSelected = false; // Đặt lại trạng thái cho nút trước đó
		        }

		        selectedButton = (JButton) e.getSource(); // Lưu nút hiện tại là nút được chọn
		        selectedButton.setBackground(new Color(0, 150, 136)); // Đổi màu nút được chọn
		        isButtonSelected = true; // Cập nhật trạng thái cho nút hiện tại

		        if (isPanelVisible) {
		            isPanelVisible = false;
		            plVachNgan2.setVisible(isPanelVisible);
		        }
		    }
		});
		
		 plVachNgan1 = new JPanel();
		plVachNgan1.setBackground(new Color(61, 187, 164));
		
		 btnNewButton_1 = new JButton("Quản lý\r\n");
		 btnNewButton_1.setForeground(Color.WHITE);
		 btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton_1.setBackground(new Color(61, 187, 164));
		//btnNewButton_1.setIcon(new ImageIcon("D:\\Java github\\Login\\pic\\arrow.png"));
		btnNewButton_1.setBorder(null);
		// Thêm MouseListener để đổi màu khi di chuột, nếu nút chưa được chọn
				btnNewButton_1.addMouseListener(new MouseAdapter() {
				    @Override
				    public void mouseEntered(MouseEvent e) {
				        // Đổi màu khi di chuột vào nếu nút chưa được chọn
				        if (!isButtonSelected) {
				            btnNewButton_1.setBackground(new Color(0, 150, 136));
				        }
				    }

				    @Override
				    public void mouseExited(MouseEvent e) {
				        // Đổi màu về mặc định khi di chuột ra nếu nút chưa được chọn
				        if (!isButtonSelected) {
				            btnNewButton_1.setBackground(new Color(61, 187, 164));
				        }
				    }
				    public void mousePressed(MouseEvent e) {
				        // Xử lý khi nút được nhấn

				        if (selectedButton != null) {
				            selectedButton.setBackground(new Color(61, 187, 164)); // Trả lại màu ban đầu cho nút trước đó
				            isButtonSelected = false; // Đặt lại trạng thái cho nút trước đó
				        }

				        selectedButton = (JButton) e.getSource(); // Lưu nút hiện tại là nút được chọn
				        selectedButton.setBackground(new Color(0, 150, 136)); // Đổi màu nút được chọn
				        isButtonSelected = true; // Cập nhật trạng thái cho nút hiện tại
				    }
				});
				
				

		
		 plVachNgan2 = new JPanel();
		plVachNgan2.setBackground(new Color(61, 187, 164));
		plVachNgan2.setLayout(null);

        // Thêm ActionListener để hiển thị/ẩn plVachNgan2 khi nhấn vào btnNewButton_1
        btnNewButton_1.addActionListener(e -> {
            isPanelVisible = !isPanelVisible;
            plVachNgan2.setVisible(isPanelVisible);
        });
		
		// Thêm MouseListener cho toàn bộ frame
		this.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mousePressed(MouseEvent e) { // Sử dụng mousePressed()
		        // Kiểm tra xem click có nằm ngoài vùng btnNewButton_1 và plVachNgan2 không
		        if (!btnNewButton_1.getBounds().contains(e.getPoint()) && 
		            !plVachNgan2.getBounds().contains(e.getPoint())) {
		            isPanelVisible = false;
		            plVachNgan2.setVisible(isPanelVisible);
		        }
		    }
		});
		
		JButton btnNewButton_1_3 = new JButton("Quản lý1\r\n");
		btnNewButton_1_3.setBounds(0, 0, 170, 30);
		btnNewButton_1_3.setForeground(Color.WHITE);
		btnNewButton_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton_1_3.setBorder(null);
		btnNewButton_1_3.setBackground(new Color(61, 187, 164));
		plVachNgan2.setVisible(isPanelVisible);
		plVachNgan2.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_2 = new JButton("Quản lý2\r\n");
		btnNewButton_1_2.setBounds(0, 30, 170, 30);
		btnNewButton_1_2.setForeground(Color.WHITE);
		btnNewButton_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton_1_2.setBorder(null);
		btnNewButton_1_2.setBackground(new Color(61, 187, 164));
		plVachNgan2.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_2_1 = new JButton("Quản lý2\r\n");
		btnNewButton_1_2_1.setBounds(0, 60, 170, 30);
		plVachNgan2.add(btnNewButton_1_2_1);
		btnNewButton_1_2_1.setForeground(Color.WHITE);
		btnNewButton_1_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton_1_2_1.setBorder(null);
		btnNewButton_1_2_1.setBackground(new Color(61, 187, 164));
		
		 btnNewButton_1_1 = new JButton("Thống kê");
		 btnNewButton_1_1.setForeground(Color.WHITE);
		 btnNewButton_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton_1_1.setBackground(new Color(61, 187, 164));
		btnNewButton_1_1.setBorder(null);
		// Thêm MouseListener để đổi màu khi di chuột, nếu nút chưa được chọn
				btnNewButton_1_1.addMouseListener(new MouseAdapter() {
				    @Override
				    public void mouseEntered(MouseEvent e) {
				        // Đổi màu khi di chuột vào nếu nút chưa được chọn
				        if (!isButtonSelected) {
				            btnNewButton_1_1.setBackground(new Color(0, 150, 136));
				        }
				    }

				    @Override
				    public void mouseExited(MouseEvent e) {
				        // Đổi màu về mặc định khi di chuột ra nếu nút chưa được chọn
				        if (!isButtonSelected) {
				            btnNewButton_1_1.setBackground(new Color(61, 187, 164));
				        }
				    }
				    @Override
				    public void mousePressed(MouseEvent e) {
				        // Xử lý khi nút được nhấn

				        if (selectedButton != null) {
				            selectedButton.setBackground(new Color(61, 187, 164)); // Trả lại màu ban đầu cho nút trước đó
				            isButtonSelected = false; // Đặt lại trạng thái cho nút trước đó
				        }

				        selectedButton = (JButton) e.getSource(); // Lưu nút hiện tại là nút được chọn
				        selectedButton.setBackground(new Color(0, 150, 136)); // Đổi màu nút được chọn
				        isButtonSelected = true; // Cập nhật trạng thái cho nút hiện tại
		                if (isPanelVisible) {
		                    isPanelVisible = false;
		                    plVachNgan2.setVisible(isPanelVisible);
		                }
		            }
				});
		
		 plVachNgan3 = new JPanel();
		plVachNgan3.setBackground(new Color(61, 187, 164));
		
		 btnNewButton_1_1_1 = new JButton("Thông báo");
		 btnNewButton_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		 btnNewButton_1_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1_1.setBackground(new Color(61, 187, 164));
		btnNewButton_1_1_1.setBorder(null);
		// Thêm MouseListener để đổi màu khi di chuột, nếu nút chưa được chọn
		btnNewButton_1_1_1.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseEntered(MouseEvent e) {
		        // Đổi màu khi di chuột vào nếu nút chưa được chọn
		        if (!isButtonSelected) {
		            btnNewButton_1_1_1.setBackground(new Color(0, 150, 136));
		        }
		    }

		    @Override
		    public void mouseExited(MouseEvent e) {
		        // Đổi màu về mặc định khi di chuột ra nếu nút chưa được chọn
		        if (!isButtonSelected) {
		            btnNewButton_1_1_1.setBackground(new Color(61, 187, 164));
		        }
		    }
		    @Override
		    public void mousePressed(MouseEvent e) {
		        // Xử lý khi nút được nhấn

		        if (selectedButton != null) {
		            selectedButton.setBackground(new Color(61, 187, 164)); // Trả lại màu ban đầu cho nút trước đó
		            isButtonSelected = false; // Đặt lại trạng thái cho nút trước đó
		        }

		        selectedButton = (JButton) e.getSource(); // Lưu nút hiện tại là nút được chọn
		        selectedButton.setBackground(new Color(0, 150, 136)); // Đổi màu nút được chọn
		        isButtonSelected = true; // Cập nhật trạng thái cho nút hiện tại
                if (isPanelVisible) {
                    isPanelVisible = false;
                    plVachNgan2.setVisible(isPanelVisible);
                }
            }
		});
		
		
		
		GroupLayout gl_plMenu = new GroupLayout(plMenu);
		gl_plMenu.setHorizontalGroup(
			gl_plMenu.createParallelGroup(Alignment.LEADING)
				.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
				.addComponent(plVachNgan1, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
				.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
				.addComponent(plVachNgan2, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
				.addComponent(btnNewButton_1_1, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
				.addComponent(plVachNgan3, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
				.addComponent(btnNewButton_1_1_1, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
		);
		gl_plMenu.setVerticalGroup(
			gl_plMenu.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_plMenu.createSequentialGroup()
					.addGap(159)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addComponent(plVachNgan1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addComponent(plVachNgan2, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
					.addGap(20)
					.addComponent(btnNewButton_1_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addComponent(plVachNgan3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addComponent(btnNewButton_1_1_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
		);
		plMenu.setLayout(gl_plMenu);
		plMain = new JPanel();
		plMain.setBackground(new Color(251,251,251));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addComponent(plMenu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(plMain, GroupLayout.PREFERRED_SIZE, 599, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(plMain, GroupLayout.PREFERRED_SIZE, 552, GroupLayout.PREFERRED_SIZE)
						.addComponent(plMenu, GroupLayout.PREFERRED_SIZE, 552, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		
		plAboveMain = new JPanel();
		plAboveMain.setBackground(new Color(251,251,251));
		GroupLayout gl_plMain = new GroupLayout(plMain);
		gl_plMain.setHorizontalGroup(
			gl_plMain.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_plMain.createSequentialGroup()
					.addComponent(plAboveMain, GroupLayout.PREFERRED_SIZE, 598, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_plMain.setVerticalGroup(
			gl_plMain.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_plMain.createSequentialGroup()
					.addComponent(plAboveMain, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(493, Short.MAX_VALUE))
		);
		
		JPanel plUser = new JPanel();
		GroupLayout gl_plAboveMain = new GroupLayout(plAboveMain);
		gl_plAboveMain.setHorizontalGroup(
			gl_plAboveMain.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_plAboveMain.createSequentialGroup()
					.addContainerGap(464, Short.MAX_VALUE)
					.addComponent(plUser, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_plAboveMain.setVerticalGroup(
			gl_plAboveMain.createParallelGroup(Alignment.LEADING)
				.addComponent(plUser, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
		);
		plUser.setLayout(null);
		
		lblUserName = new JLabel("UserName");
		lblUserName.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblUserName.setBounds(60, 25, 49, 14);
		plUser.add(lblUserName);
		
		lblAvata = new JLabel(new ImageIcon("D:\\Java github\\Login\\pic\\avata.jpg"));
		lblAvata.setBounds(10, 25, 49, 14);
		plUser.add(lblAvata);
		
		
		plAboveMain.setLayout(gl_plAboveMain);
		plMain.setLayout(gl_plMain);
		getContentPane().setLayout(groupLayout);

		
		
	}
}
