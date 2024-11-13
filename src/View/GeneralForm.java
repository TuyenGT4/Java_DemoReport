package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.GeneralController;

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
import javax.swing.JScrollPane;

public class GeneralForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel plMenu, plVachNgan1, plVachNgan2, plVachNgan3;
	private JButton btnTrangChu, btnQuanLy, btnThongKe, btnThongBao, btnVatNuoi, btnCayTrong;
	private boolean isPanelVisible = false;
	private JPanel plMain, plAboveMain;
	private JLabel lblUserName, lblAvata, lblTitlePage;
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
		 plMenu.setBounds(10, 11, 170, 552);
		plMenu.setBackground(new Color(61, 187, 164));
		
		 btnTrangChu = new JButton("Trang chủ");
		 btnTrangChu.setForeground(Color.WHITE);
		 btnTrangChu.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnTrangChu.setBackground(new Color(61, 187, 164));
		btnTrangChu.setBorder(null);
	
	
		 plVachNgan1 = new JPanel();
		plVachNgan1.setBackground(new Color(61, 187, 164));
		
		 btnQuanLy = new JButton("Quản lý\r\n");
		 btnQuanLy.setForeground(Color.WHITE);
		 btnQuanLy.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnQuanLy.setBackground(new Color(61, 187, 164));
		//btnNewButton_1.setIcon(new ImageIcon("D:\\Java github\\Login\\pic\\arrow.png"));
		btnQuanLy.setBorder(null);

		 plVachNgan2 = new JPanel();
		plVachNgan2.setBackground(new Color(61, 187, 164));
		plVachNgan2.setLayout(null);
		
		btnVatNuoi = new JButton("Vật nuôi\r\n");
		btnVatNuoi.setBounds(0, 0, 170, 30);
		btnVatNuoi.setForeground(Color.WHITE);
		btnVatNuoi.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnVatNuoi.setBorder(null);
		btnVatNuoi.setBackground(new Color(61, 187, 164));
		plVachNgan2.setVisible(isPanelVisible);
		plVachNgan2.add(btnVatNuoi);		
		
		btnCayTrong = new JButton("Cây trồng");
		btnCayTrong.setBounds(0, 30, 170, 30);
		btnCayTrong.setForeground(Color.WHITE);
		btnCayTrong.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnCayTrong.setBorder(null);
		btnCayTrong.setBackground(new Color(61, 187, 164));
		plVachNgan2.add(btnCayTrong);
				
		 btnThongKe = new JButton("Thống kê");
		 btnThongKe.setForeground(Color.WHITE);
		 btnThongKe.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnThongKe.setBackground(new Color(61, 187, 164));
		btnThongKe.setBorder(null);
		
		 plVachNgan3 = new JPanel();
		plVachNgan3.setBackground(new Color(61, 187, 164));
		
		 btnThongBao = new JButton("Thông báo");
		 btnThongBao.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		 btnThongBao.setForeground(Color.WHITE);
		btnThongBao.setBackground(new Color(61, 187, 164));
		btnThongBao.setBorder(null);
	
		GroupLayout gl_plMenu = new GroupLayout(plMenu);
		gl_plMenu.setHorizontalGroup(
			gl_plMenu.createParallelGroup(Alignment.LEADING)
				.addComponent(btnTrangChu, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
				.addComponent(plVachNgan1, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
				.addComponent(btnQuanLy, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
				.addComponent(plVachNgan2, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
				.addComponent(btnThongKe, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
				.addComponent(plVachNgan3, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
				.addComponent(btnThongBao, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
		);
		gl_plMenu.setVerticalGroup(
			gl_plMenu.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_plMenu.createSequentialGroup()
					.addGap(159)
					.addComponent(btnTrangChu, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addComponent(plVachNgan1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addComponent(btnQuanLy, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addComponent(plVachNgan2, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
					.addGap(20)
					.addComponent(btnThongKe, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addComponent(plVachNgan3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addComponent(btnThongBao, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
		);
		plMenu.setLayout(gl_plMenu);
		plMain = new JPanel();
		plMain.setBounds(186, 11, 599, 552);
		plMain.setBackground(new Color(251,251,251));
		
		plAboveMain = new JPanel();
		plAboveMain.setBackground(new Color(251,251,251));
		
		lblTitlePage = new JLabel("Page");
		lblTitlePage.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		
		GroupLayout gl_plMain = new GroupLayout(plMain);
		gl_plMain.setHorizontalGroup(
			gl_plMain.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_plMain.createSequentialGroup()
					.addGroup(gl_plMain.createParallelGroup(Alignment.LEADING)
						.addComponent(plAboveMain, GroupLayout.PREFERRED_SIZE, 598, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_plMain.createSequentialGroup()
							.addGap(254)
							.addComponent(lblTitlePage, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_plMain.setVerticalGroup(
			gl_plMain.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_plMain.createSequentialGroup()
					.addComponent(plAboveMain, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblTitlePage)
					.addContainerGap(473, Short.MAX_VALUE))
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
		getContentPane().setLayout(null);
		getContentPane().add(plMenu);
		getContentPane().add(plMain);

		GeneralController controller = new GeneralController(this);
		
	}
	public JButton getBtnTrangChu() {
		return this.btnTrangChu;
	}
	public JButton getBtnQuanLy() {
		return this.btnQuanLy;
	}
	public JButton getBtnVatNuoi() {
		return this.btnVatNuoi;
	}
	public JButton getBtnCayTrong() {
		return this.btnCayTrong;
	}
	public JButton getBtnThongKe() {
		return this.btnThongKe;
	}
	public JButton getBtnThongBao() {
		return this.btnThongBao;
	}
	public JLabel getLblTitlePage() {
		return this.lblTitlePage;
	}
	public JPanel getPlVachNgan2() {
		return this.plVachNgan2;
	}
	
}
