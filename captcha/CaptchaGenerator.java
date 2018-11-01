package professional_company;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.xml.bind.DatatypeConverter;

import com.sun.prism.Image;

public class CaptchaGenerator {

	public Captcha getCaptcha() throws IOException
	{
		Captcha c=new Captcha();
		Random rand = new Random();
		char[] letters="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
		
		
		
		ArrayList<Color> mycolor=new ArrayList<Color>();
		mycolor.add(Color.yellow);
		mycolor.add(Color.WHITE);

		mycolor.add(Color.GREEN);
		mycolor.add(Color.pink);
		
		BufferedImage image=new BufferedImage(200, 70, BufferedImage.TYPE_INT_RGB);
		Graphics g = image.createGraphics();  // not sure on this line, but this seems more right
		g.setColor(Color.black);
		
		
		
		int x,y;
		x=0;
		y=30;
		String tcap_str="";
		Font currentFont = g.getFont();
		Font newFont = currentFont.deriveFont(currentFont.getSize() * 3F);
		g.setFont(newFont);
		for(int i=0;i<5;i++)
		{
			int  n = rand.nextInt(letters.length);
			int font_size=rand.nextInt(7)+4;
			int font_color=rand.nextInt(mycolor.size());
			g.setColor(mycolor.get(font_color));
			x=x+30;
			g.drawString(""+letters[n], x, y+rand.nextInt(20));
			
			tcap_str+=letters[n];
			
		}
		
		
		
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		ImageIO.write(image, "png", bos);
		bos.flush();
		byte[] imageInByteArray = bos.toByteArray();
		bos.close();
		String tcap_img = DatatypeConverter.printBase64Binary(imageInByteArray);


		c.setCaptcha_image_data(tcap_img);
		c.setCaptcha_string_data(tcap_str);
		
		return c;
	}
	
	
	
	
	
	
}
