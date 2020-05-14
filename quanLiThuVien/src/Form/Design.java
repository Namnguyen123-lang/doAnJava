package Form;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class Design {
	public static void drawJPanel(JPanel panel,Color backgroundColor) {
		panel.setBackground(backgroundColor);
	}
	public static void drawJPanel(JPanel panel,int x, int y,int z,int w,int h) {
		panel.setBackground(new Color(x,y,z));
		panel.setPreferredSize(new Dimension(w,h));
	}
}
