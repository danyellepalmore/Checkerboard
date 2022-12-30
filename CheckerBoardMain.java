import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CheckerBoardMain {
	public static int rows = 8;
	public static int cols = 8;
	public static Color color = Color.BLUE;
	public static Color color1 = Color.PINK;
	static JFrame checkerBoard = new JFrame();
	static boolean box = true;
	
	public static void main(String[] args) {
		checkerBoard.setBounds(10, 10, 395, 357);
		JPanel panel = new JPanel(){
			//gives more accessibility to paint method and their other protected methods
			@Override
			public void paint(Graphics g) {
				for(int i = 0; i < rows; i++) {
					for(int j = 0; j < cols; j++) {
						if (box) {
							g.setColor(color);
						} else {
							g.setColor(color1);
						}
						g.fillRect(i*64, j*64, 64, 64);
					//after each loop this will change the boolean to the opposite each time
					box = !box;
					}
					box = !box;
				}
			}
		};
		//adds the colors to the panel background
		checkerBoard.add(panel);
		//exits window when closed
		checkerBoard.setDefaultCloseOperation(3);
		checkerBoard.setVisible(true);
		checkerBoard.setTitle("MyFirstBoard");
	}
}


