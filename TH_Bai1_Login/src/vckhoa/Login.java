package vckhoa;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTDN;
	private JPasswordField txtMK;

	public Login() {
		setTitle("ĐĂNG NHẬP HỆ THỐNG");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 532, 288);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TÊN ĐĂNG NHẬP:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(27, 41, 142, 42);
		contentPane.add(lblNewLabel);
		
		JLabel lblMtKhu = new JLabel("MẬT KHẨU:");
		lblMtKhu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMtKhu.setBounds(27, 102, 142, 42);
		contentPane.add(lblMtKhu);
		
		txtTDN = new JTextField();
		txtTDN.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtTDN.setBounds(179, 41, 245, 42);
		contentPane.add(txtTDN);
		txtTDN.setColumns(10);
		
		JButton btnDN = new JButton("Đăng nhập");
		btnDN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLyDangNhap();
			}
		});
		btnDN.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDN.setBounds(179, 167, 132, 42);
		contentPane.add(btnDN);
		
		txtMK = new JPasswordField();
		txtMK.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtMK.setBounds(179, 102, 245, 42);
		contentPane.add(txtMK);
	}
	void XuLyDangNhap() {
		// Lấy về TDN và MK
		String strTen = txtTDN.getText();
		String strMK = txtMK.getText();
		// Xử lý
		if (strTen.equals("vochikhoa") && strMK.equals("123456")) {
			// hiện trang chủ
			HomeFrame homepage = new HomeFrame();
			homepage.setVisible(true);
			// Ẩn form đăng nhập
			this.setVisible(false);
		} else {
			// xóa dữ liệu
			txtTDN.setText("");
			txtMK.setText("");
			// hiện thông báo
			JOptionPane hopThoai = new JOptionPane();
			hopThoai.showMessageDialog(this, "Đăng nhập thất bại");
			
		}
		
	}
}
