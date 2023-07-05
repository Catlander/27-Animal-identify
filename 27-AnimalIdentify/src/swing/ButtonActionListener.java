package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;


import main.AnimalPic;
import net.sf.json.JSONException;
import netscape.javascript.JSException;

public class ButtonActionListener implements ActionListener{
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String text = window.text.getText();
		try {
			window.label.setText("");
			Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+ AnimalPic.AnimalBaike(text));
		} catch (JSONException e1) {
			try{
				window.label.setText("您搜索的应该是： " + AnimalPic.AnimalName(text) + " 很抱歉未能百科到，请换张图片试试。");
			}catch(JSONException e2) {
				window.label.setText("输入有误，请确认您输入的是否是正确的URL链接");
			}
		}catch(IOException e3) {
			e3.printStackTrace();
		}
	}
	 
}
