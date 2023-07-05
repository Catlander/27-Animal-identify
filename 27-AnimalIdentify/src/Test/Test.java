package Test;

import main.BilibiliAPI;
import swing.DownLoadbk;
import swing.window;

public class Test {
	//下方为Bilibili视频BV号，修改可该该程序背景。
	
	public final static String BV = "BV1Xa4y1c7m5";
	
	public static void main(String[] args) {
		String biliURL = "https://www.bilibili.com/video/" + BV;
		String bkURL=BilibiliAPI.VedioCover(biliURL);
		DownLoadbk.downloadPicture(bkURL, "src/image/bk.jpg");
		window.init();
	}
}
