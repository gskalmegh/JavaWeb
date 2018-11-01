package professional_company;

import java.io.IOException;


public class MyCaptcha {

	public String text;
	public String img;
	
	public MyCaptcha() throws IOException {
		CaptchaGenerator cgen=new CaptchaGenerator();
		Captcha c=cgen.getCaptcha();
		text=c.getCaptcha_string_data();
		img=c.getCaptcha_image_data();
	}
}
