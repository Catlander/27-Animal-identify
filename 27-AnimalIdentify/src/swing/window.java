package swing;


import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class window {
	public static JFrame frame = new JFrame("动物识别");
	public static JPanel container = new JPanel();
	public static JLabel label = new JLabel("");
	public static JTextField text = new JTextField(50);
	
	public static void init(){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,400);
		frame.setContentPane(container);
		initcontainer();
		frame.setVisible(true);
	}
	
	public static void initcontainer() {
		JButton button = new JButton("百科");
		ButtonActionListener b1 = new ButtonActionListener();
		button.addActionListener(b1);
		setbackground();
		container.add(text);
		container.add(button);
		container.add(label);
	}
	
	public static void setbackground() {
        //设置背景图
        ImageIcon backbround = new ImageIcon("src/image/bk.jpg");
        //将背景图进行压缩，一般如果你想显示一整张图片，就得把大小设置跟窗口一样
		Image image = backbround.getImage(); 
		Image smallImage = image.getScaledInstance(600, 400, Image.SCALE_FAST);
		ImageIcon backbrounds = new ImageIcon(smallImage);
		
		//将图片添加到JLable标签 
		JLabel back = new JLabel(backbrounds);
		//标签大小调整为窗格大小
		back.setBounds(0,0, frame.getWidth(),frame.getHeight() );
		// 把内容窗格强制转化为JPanel，否则不能用方法setOpaque(false)来使内容窗口透明
		JPanel imagePanel = (JPanel) frame.getContentPane();
		imagePanel.setOpaque(false);
		frame.getLayeredPane().add(back,new Integer(Integer.MIN_VALUE));
	}
}
