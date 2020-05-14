package Form;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class nhanVienForm extends JFrame implements MouseListener {
	JPanel mainPanel;
	JPanel panel_tieude;
	JButton btn_menu;
	JPanel left_panel;

	nhanVienForm(String title) {
		this.setTitle(title);
		initForm();

	}

	void initForm() {
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initComponent();
		Dimension dm = new Dimension();
		dm = Toolkit.getDefaultToolkit().getScreenSize();
		setSize((int) (dm.width / (1.5)), (int) (dm.height / 1.3));
		setResizable(false);
		setLocationRelativeTo(null);
	}

	void initComponent() {
		// khai báo một panel lớn bao trọn hết form
		mainPanel = new JPanel();
		// set cho panel này là border layout
		mainPanel.setLayout(new BorderLayout());
		// thêm mainPanel vào form
		add(mainPanel);

		panel_tieude = new JPanel();
		Design.drawJPanel(panel_tieude, 0, 206, 205, 250, 50);
		mainPanel.add(panel_tieude, BorderLayout.NORTH);

//		Paint.drawJPanel(panel_tieude, Color.black);

		JLabel lb_tieude = new JLabel("QUẢN LÍ NHÂN VIÊN");
		lb_tieude.setForeground(Color.white);
		panel_tieude.add(lb_tieude);

		left_panel = new JPanel();
		
		mainPanel.add(left_panel, BorderLayout.WEST);

		btn_menu = new JButton("Menu");
		left_panel.addMouseListener(this);
		left_panel.add(btn_menu);

	}

	
