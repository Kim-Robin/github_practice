package calculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class GraphicPane extends JFrame{
	
	public static final int SCREEN_WIDTH = 1334;
	public static final int SCREEN_HEIGHT = 750;
	
	private Image screenImage;
	private Graphics screenGraphic;
	Calculation calc = new Calculation();
	//private Image background = new ImageIcon(Main.class.getResource("../image/blackimage.jpg")).getImage();
	
	private int mouseX, mouseY;
	double num1, num2, answer;
	String all, snum, knum;
	char opera;
	
	//private Image button0 = new ImageIcon(Main.class.getResource("")).getImage();
	
	//private ImageIcon button1x = new ImageIcon(Main.class.getResource("/image/button1x.png"));
	//private JLabel jpanel = new JLabel(new ImageIcon(Main.class.getResource("../image/blackimage.jpg")));
	
	private JTextField show =new JTextField();
	private JButton button1 = new JButton(new ImageIcon(Main.class.getResource("../image/button1.png")));
	
	private JButton button2 = new JButton(new ImageIcon(Main.class.getResource("../image/button2.png")));
	private JButton button3 = new JButton(new ImageIcon(Main.class.getResource("../image/button3.png")));
	private JButton button4 = new JButton(new ImageIcon(Main.class.getResource("../image/button4.png")));
	private JButton button5 = new JButton(new ImageIcon(Main.class.getResource("../image/button5.png")));
	private JButton button6 = new JButton(new ImageIcon(Main.class.getResource("../image/button6.png")));
	private JButton button7 = new JButton(new ImageIcon(Main.class.getResource("../image/button7.png")));
	private JButton button8 = new JButton(new ImageIcon(Main.class.getResource("../image/button8.png")));
	private JButton button9 = new JButton(new ImageIcon(Main.class.getResource("../image/button9.png")));
	
	private JButton buttonC = new JButton(new ImageIcon(Main.class.getResource("../image/buttonC.png")));
	private JButton buttonDivide = new JButton(new ImageIcon(Main.class.getResource("../image/buttonDivide.png")));
	private JButton buttonDot = new JButton(new ImageIcon(Main.class.getResource("../image/buttonDot.png")));
	private JButton buttonMultiply = new JButton(new ImageIcon(Main.class.getResource("../image/buttonX.png")));
	private JButton buttonMinus = new JButton(new ImageIcon(Main.class.getResource("../image/button-.png")));
	private JButton buttonMod = new JButton(new ImageIcon(Main.class.getResource("../image/button%.png")));
	private JButton buttonPlus = new JButton(new ImageIcon(Main.class.getResource("../image/button+.png")));
	private JButton buttonEqual = new JButton(new ImageIcon(Main.class.getResource("../image/button=.png")));
	
	public GraphicPane() {
		setTitle("Calculator");
		setSize(SCREEN_WIDTH,SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(null);
		
		//jpanel.setBounds(0, 0, 1334, 750);
		//add(jpanel);
		
		show.setBackground(Color.YELLOW);
		show.setBounds(0, 0, 1334, 214);
		show.setFont(new Font("SanSerif", Font.BOLD,59));
		
		add(show);
		
		
		button1.setBounds(798, 523, 133, 103);
		button1.setBorderPainted(false);
		button1.setContentAreaFilled(false);
		button1.setFocusPainted(false);
		
		button1.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();
				show.setText(show.getText() + "1");
			}
		});
		add(button1);
		
		button2.setBounds(931, 523, 133, 103);
		button2.setBorderPainted(false);
		button2.setContentAreaFilled(false);
		button2.setFocusPainted(false);
		
		button2.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();
				show.setText(show.getText() + "2");
			}
		});
		add(button2);
		
		button3.setBounds(1064, 523, 133, 103);
		button3.setBorderPainted(false);
		button3.setContentAreaFilled(false);
		button3.setFocusPainted(false);
		
		button3.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();
				show.setText(show.getText() + "3");
			}
		});
		add(button3);
		
		buttonDot.setBounds(1064, 626, 133, 103);
		buttonDot.setBorderPainted(false);
		buttonDot.setContentAreaFilled(false);
		buttonDot.setFocusPainted(false);
		
		buttonDot.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();
				show.setText(show.getText() + ".");
			}
		});
		add(buttonDot);
		
		button4.setBounds(798, 420, 133, 103);
		button4.setBorderPainted(false);
		button4.setContentAreaFilled(false);
		button4.setFocusPainted(false);
		
		button4.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();
				show.setText(show.getText() + "4");
			}
		});
		add(button4);
		
		button5.setBounds(931, 420, 133, 103);
		button5.setBorderPainted(false);
		button5.setContentAreaFilled(false);
		button5.setFocusPainted(false);
		
		button5.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();
				show.setText(show.getText() + "5");
			}
		});
		add(button5);
		
		button6.setBounds(1064, 420, 133, 103);
		button6.setBorderPainted(false);
		button6.setContentAreaFilled(false);
		button6.setFocusPainted(false);
		
		button6.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();
				show.setText(show.getText() + "6");
			}
		});
		add(button6);
		
		button7.setBounds(798, 317, 133, 103);
		button7.setBorderPainted(false);
		button7.setContentAreaFilled(false);
		button7.setFocusPainted(false);
		
		button7.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();
				show.setText(show.getText() + "7");
			}
		});
		add(button7);
		
		button8.setBounds(931, 317, 133, 103);
		button8.setBorderPainted(false);
		button8.setContentAreaFilled(false);
		button8.setFocusPainted(false);
		
		button8.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();
				show.setText(show.getText() + "8");
			}
		});
		add(button8);
		
		button9.setBounds(1064, 317, 133, 103);
		button9.setBorderPainted(false);
		button9.setContentAreaFilled(false);
		button9.setFocusPainted(false);
		
		button9.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();
				show.setText(show.getText() + "9");
			}
		});
		add(button9);
		
		buttonMultiply.setBounds(1197, 317, 133, 103);
		buttonMultiply.setBorderPainted(false);
		buttonMultiply.setContentAreaFilled(false);
		buttonMultiply.setFocusPainted(false);
		
		buttonMultiply.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();
				show.setText(show.getText() + "*");
			}
		});
		add(buttonMultiply);
		
		buttonDivide.setBounds(1197, 214, 133, 103);
		buttonDivide.setBorderPainted(false);
		buttonDivide.setContentAreaFilled(false);
		buttonDivide.setFocusPainted(false);
		
		buttonDivide.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();
				show.setText(show.getText() + "/");
			}
		});
		add(buttonDivide);
		
		buttonMod.setBounds(1064, 214, 133, 103);
		buttonMod.setBorderPainted(false);
		buttonMod.setContentAreaFilled(false);
		buttonMod.setFocusPainted(false);
		
		buttonMod.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();
				show.setText(show.getText() + "%");
			}
		});
		add(buttonMod);
		
		buttonPlus.setBounds(1197, 523, 133, 103);
		buttonPlus.setBorderPainted(false);
		buttonPlus.setContentAreaFilled(false);
		buttonPlus.setFocusPainted(false);
		
		buttonPlus.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();
				show.setText(show.getText() + "+");
			}
		});
		add(buttonPlus);
		
		buttonMinus.setBounds(1197, 420, 133, 103);
		buttonMinus.setBorderPainted(false);
		buttonMinus.setContentAreaFilled(false);
		buttonMinus.setFocusPainted(false);
		
		buttonMinus.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();
				show.setText(show.getText() + "-");
			}
		});
		add(buttonMinus);
		
		buttonC.setBounds(798, 214, 133, 103);
		buttonC.setBorderPainted(false);
		buttonC.setContentAreaFilled(false);
		buttonC.setFocusPainted(false);
		
		buttonC.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				//mouseX = e.getX();
				//mouseY = e.getY();
				show.setText("");
				num1 = 0;
				num2 = 0;
				answer = 0;
				all = "";
				snum = "";
				opera = 0;
						
			}
		});
		add(buttonC);
		
		buttonEqual.setBounds(1197, 626, 133, 103);
		buttonEqual.setBorderPainted(false);
		buttonEqual.setContentAreaFilled(false);
		buttonEqual.setFocusPainted(false);
		
		buttonEqual.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();
				all = show.getText();
				searching();
				
				num1 = new Double(knum);
				num2 = new Double(snum);
				//System.out.println(num1);
				//System.out.println(num2);

				operation();
				
				show.setText(show.getText() + "=" + Double.toString(answer));
			}
		});
		add(buttonEqual);
	}
	
	public void paint(Graphics g) {
		
		screenImage = createImage(SCREEN_WIDTH, SCREEN_HEIGHT);
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(screenImage, 0, 0, null);
	}
	
	public void screenDraw(Graphics g) {
		//g.drawImage(background, 0, 0, null);
		paintComponents(g);
		this.repaint();
	}
	
	public void operation() {
		if(opera == '+') {
			answer = calc.addition(num1, num2);
		}else if(opera == '/') {
			answer = calc.division(num1, num2);
		}else if(opera == '*') {
			answer = calc.multifly(num1, num2);
		}else if(opera == '%') {
			answer = calc.mod(num1, num2);
		}else if(opera == '-') {
			answer = calc.subtraction(num1, num2);
		}else {
			
		}
			
		
	}
	public void searching() {
		char[] full = all.toCharArray();
		//char[] s = new char[100];
		int i = 0;
		int store = 0;
		boolean b = true;
		while(b){
			if(full[i] == '%' || full[i] == '*' || full[i] == '/' || full[i] == '+' || full[i] == '-') {
				store = i;
				b = false;
			}
			i++;
		}
		char[] p = new char[full.length - 1 - store];
		for(int k = store + 1, u = 0; k< full.length; k++, u++) {
			p[u] = full[k];
		}
		//System.out.println(p[0]);

		snum = new String(p);
		char[] rt = new char[store];
		for(int k = 0, u = 0; k < store; k++, u++) {
			rt[u] = full[k];
		}
		
		//System.out.println(rt[0]);

		knum = new String(rt);
		opera = full[store];
	}
}
