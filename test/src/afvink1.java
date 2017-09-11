
import java.awt.*;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.*;

public class afvink1 extends JFrame {

	/**
	 * @param args
	 */
	private static JFrame raampje;
	
	
	public static void main(String[] args) {
		try {
			TrayIcon TI = new TrayIcon( Toolkit.getDefaultToolkit().getImage("plaatje/ding.png"), "hehehe");
			TI.setImageAutoSize(true);
			SystemTray.getSystemTray().add(TI);
		} catch (HeadlessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Bitch please");
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Bitch please");
		}
		JFrame.setDefaultLookAndFeelDecorated(true);
		raampje = new JFrame("Hehehe");
		raampje.setSize(600, 600);
		raampje.setLayout(new GridBagLayout());
		/*JPanel mainPanel = new JPanel(new BorderLayout());
		
		ImageIcon image = Toolkit.getDefaultToolkit().getImage("plaatje/ding.png");
		JLabel label = new JLabel(image);
		mainPanel.add(label);
		
		raampje.add(mainPanel);*/
	
		raampje.setIconImage(new ImageIcon("plaatje/ding.png").getImage());
		
		raampje.setVisible(true);
		//java.net.URL url = ClassLoader.getSystemResource("./plaatje/ding.png");
		//String imageName = "timeLabel.jpg";
		//imageLabel.setIcon( new ImageIcon(ImageIO.read( new File(imageName) ) ) );
		// TODO Auto-generated method stub
		//System.out.println("Hello");
		JOptionPane.showMessageDialog(raampje,JOptionPane.showInputDialog(raampje, "Hi",
				"Customized Dialog",JOptionPane.PLAIN_MESSAGE));
		raampje.dispose();
		return;
		
	}

}
