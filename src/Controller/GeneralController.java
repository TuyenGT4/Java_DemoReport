package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

import View.GeneralForm;

public class GeneralController {
	private GeneralForm general;
	private JButton selectedButton = null;
	private boolean isButtonSelected = false;
	private boolean isPanelVisible = false;
	
	public GeneralController(GeneralForm generalForm) {
		this.general = generalForm;

// xử lý sự kiện nút trang chủ		
//		generalForm.getBtnTrangChu()
		// xử lý event nút được chọn sẽ hiện thị lên lblTitlePage
		generalForm.getBtnTrangChu().addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        // ... (Các xử lý khác của nút Trang chủ)

		        // Lấy text của nút Trang chủ
		        String buttonText = generalForm.getBtnTrangChu().getText();

		        // Đặt text cho titlePage
		        generalForm.getLblTitlePage().setText(buttonText);
		    }
		});
		
		//
		generalForm.getBtnTrangChu().addMouseListener(new MouseAdapter() {
		    @Override
		    public void mousePressed(MouseEvent e) {
		        // Xử lý khi nút được nhấn
		        if (isPanelVisible) {
		            isPanelVisible = false;
		            generalForm.getPlVachNgan2().setVisible(isPanelVisible);
		        }
		    }
		}); 

// xử lý sự kiện khi nhấn nút quản lý		
//		generalForm.getBtnQuanLy()
		// xử lý event nút được chọn sẽ hiện thị lên lblTitlePage
		generalForm.getBtnQuanLy().addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        // ... (Các xử lý khác của nút Trang chủ)

		        // Lấy text của nút Trang chủ
		        String buttonText = generalForm.getBtnQuanLy().getText();

		        // Đặt text cho titlePage
		        generalForm.getLblTitlePage().setText(buttonText);
		    }
		});
		
/*		//đổi màu khi di chuột, nếu nút chưa được chọn
		generalForm.getBtnQuanLy().addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseEntered(MouseEvent e) {
		        // Đổi màu khi di chuột vào nếu nút chưa được chọn
		        if (!isButtonSelected) {
		        	generalForm.getBtnQuanLy().setBackground(new Color(0, 150, 136));
		        }
		    }

		    @Override
		    public void mouseExited(MouseEvent e) {
		        // Đổi màu về mặc định khi di chuột ra nếu nút chưa được chọn
		        if (!isButtonSelected) {
		        	generalForm.getBtnQuanLy().setBackground(new Color(61, 187, 164));
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
		}); */
		
//ẩn hiện menu bar
		// Thêm ActionListener để hiển thị/ẩn plVachNgan2 khi nhấn vào btnNewButton_1
		generalForm.getBtnQuanLy().addActionListener(e -> {
            isPanelVisible = !isPanelVisible;
            generalForm.getPlVachNgan2().setVisible(isPanelVisible);
        });
		// Thêm MouseListener cho toàn bộ frame
		generalForm.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mousePressed(MouseEvent e) { // Sử dụng mousePressed()
		        // Kiểm tra xem click có nằm ngoài vùng btnNewButton_1 và plVachNgan2 không
		        if (!generalForm.getBtnQuanLy().getBounds().contains(e.getPoint()) && 
		            !generalForm.getPlVachNgan2().getBounds().contains(e.getPoint())) {
		            isPanelVisible = false;
		            generalForm.getPlVachNgan2().setVisible(isPanelVisible);
		        }
		    }
		});
		
// xử lý sự kiện nút Vật nuôi
//		generalForm.getBtnVatNuoi()		
		// xử lý event nút được chọn sẽ hiện thị lên lblTitlePage
		generalForm.getBtnVatNuoi().addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        // ... (Các xử lý khác của nút Trang chủ)

		        // Lấy text của nút Trang chủ
		        String buttonText = generalForm.getBtnVatNuoi().getText();

		        // Đặt text cho titlePage
		        generalForm.getLblTitlePage().setText(buttonText);
		    }
		});

//xử lý sự kiện nút Cây trồng
//		generalForm.getBtnCayTrong()
		
		// xử lý event nút được chọn sẽ hiện thị lên lblTitlePage
		generalForm.getBtnCayTrong().addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        // ... (Các xử lý khác của nút Trang chủ)

		        // Lấy text của nút Trang chủ
		        String buttonText = generalForm.getBtnCayTrong().getText();

		        // Đặt text cho titlePage
		        generalForm.getLblTitlePage().setText(buttonText);
		    }
		});
		
//xử lý sự kiện nút Thống kê
//		generalForm.getBtnThongKe()
		// xử lý event nút được chọn sẽ hiện thị lên lblTitlePage
		generalForm.getBtnThongKe().addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        // ... (Các xử lý khác của nút Trang chủ)

		        // Lấy text của nút Trang chủ
		        String buttonText = generalForm.getBtnThongKe().getText();

		        // Đặt text cho titlePage
		        generalForm.getLblTitlePage().setText(buttonText);
		    }
		});
		
		
		//đổi màu khi di chuột, nếu nút chưa được chọn
		generalForm.getBtnThongKe().addMouseListener(new MouseAdapter() {
			@Override
		    public void mousePressed(MouseEvent e) {
		        // Xử lý khi nút được nhấn
                if (isPanelVisible) {
                    isPanelVisible = false;
                    generalForm.getPlVachNgan2().setVisible(isPanelVisible);
                }
            }
		});
		
// xử lý sự kiện nút Thông báo
//		general.getBtnThongBao()
		// xử lý event nút được chọn sẽ hiện thị lên lblTitlePage
		general.getBtnThongBao().addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        // ... (Các xử lý khác của nút Trang chủ)

		        // Lấy text của nút Trang chủ
		        String buttonText = general.getBtnThongBao().getText();

		        // Đặt text cho titlePage
		        general.getLblTitlePage().setText(buttonText);
		    }
		});
		
		general.getBtnThongBao().addMouseListener(new MouseAdapter() {
		    @Override
		    public void mousePressed(MouseEvent e) {
		        // Xử lý khi nút được nhấn

                if (isPanelVisible) {
                    isPanelVisible = false;
                    general.getLblTitlePage().setVisible(isPanelVisible);
                }
            }
		});
	}
}
