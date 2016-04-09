package com.hmkcode;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.hmkcode.vo.Content;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Sending POST to GCM");

		String apiKey = "AIzaSyB6fM2k7bqLH0JtiNatrEPhRumG9htFL5Q";
		Content content = createContent();

		POST2GCM.post(apiKey, content);
	}

	public static Content createContent() {

		Content c = new Content();

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		c.addRegId(
				"e75dMeVGcEY:APA91bEFV9j5H_XNGqrH_y9_Gh5dXFbEh4x9_HPZJHqUySVs75IRBdmuIUtUbWiL2ZyS4srha0h0j9v-erYV-GrsR824I63oETIRF23W6oGTpne-QFND0OKTvCnrlj56UOV3JiJH93Yk");
		c.createData("3 novas mensagens", "Clique aqui e confira agora!", format.format(new Date()));

		return c;
	}
}
