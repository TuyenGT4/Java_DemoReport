package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class dashboard extends JFrame {

    private JPanel contentPanel;

    public dashboard() {
        setTitle("Dashboard");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        // Tạo panel chứa menu dọc
        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new BoxLayout(menuPanel, BoxLayout.Y_AXIS));
        menuPanel.setBackground(Color.DARK_GRAY);
        menuPanel.setPreferredSize(new Dimension(200, 0));

        // Tạo các nút menu
        JButton btnHome = createMenuButton("Home");
        JButton btnAnalytics = createMenuButton("Analytics");
        JButton btnSettings = createMenuButton("Settings");

        // Thêm các nút vào menu panel
        menuPanel.add(btnHome);
        menuPanel.add(btnAnalytics);
        menuPanel.add(btnSettings);

        // Tạo panel nội dung
        contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout());

        // Thêm menu và nội dung vào frame
        add(menuPanel, BorderLayout.WEST);
        add(contentPanel, BorderLayout.CENTER);

        // Xử lý sự kiện click cho các nút menu
        btnHome.addActionListener(e -> showPanel("Home"));
        btnAnalytics.addActionListener(e -> showPanel("Analytics"));
        btnSettings.addActionListener(e -> showPanel("Settings"));

        // Hiển thị panel Home mặc định
        showPanel("Home");

        setVisible(true);
    }

    // Tạo nút menu với màu sắc và font chữ
    private JButton createMenuButton(String text) {
        JButton button = new JButton(text);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.setMaximumSize(new Dimension(180, 40));
        button.setBackground(Color.DARK_GRAY);
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Arial", Font.PLAIN, 16));
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setContentAreaFilled(false);
        button.setOpaque(true);
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button.setBackground(Color.LIGHT_GRAY);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button.setBackground(Color.DARK_GRAY);
            }
        });
        return button;
    }

    // Hiển thị panel tương ứng với nút menu được click
    private void showPanel(String panelName) {
        contentPanel.removeAll();
        JPanel panel = new JPanel();
        panel.add(new JLabel(panelName + " Panel", JLabel.CENTER));
        contentPanel.add(panel, BorderLayout.CENTER);
        contentPanel.revalidate();
        contentPanel.repaint();
    }

    public static void main(String[] args) {
        new dashboard();
    }
}