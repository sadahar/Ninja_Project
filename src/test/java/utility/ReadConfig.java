package utility;

import java.io.FileInputStream;

import java.util.Properties;

public class ReadConfig {

	Properties pro;

	public ReadConfig() {

		pro = new Properties();

		FileInputStream file;
		try {
			file = new FileInputStream("config.properties");
			pro.load(file);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String getbrowser() {
		String value = pro.getProperty("browser");

		if (value != null)
			return value;
		else
			throw new RuntimeException("url not satisfied");
	}

	

}
