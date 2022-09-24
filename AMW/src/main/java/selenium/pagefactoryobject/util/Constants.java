package selenium.pagefactoryobject.util;

public class Constants {

	public static final int TIMEOUT = 10;
	public static final String CHROME = "Chrome";
	public static final String FIREFOX = "Firefox";
	public static final String OPERA = "Opera";
	public static final String URL = "https://opensource-demo.orangehrmlive.com";
	public static final String URLDEMO = "https://demoqa.com/automation-practice-form";
	public static final String URLAMAZON = "https://katalon-test.s3.amazonaws.com/aut/html/form.html";
	public static final String URLNOPC = "https://admin-demo.nopcommerce.com";
	public static final String URLNOPCPRODUCT = "https://admin-demo.nopcommerce.com/Admin/Product/ProductTags";
	public static final String URL_SHOP_REGIST = "https://shop.demoqa.com/my-account/";
	public static final String URL_SHOP = "https://shop.demoqa.com";
	public static final String URL_SHOP_BLOG = "https://shop.demoqa.com/blog/";
	public static final String GLOB_PARAM_DELAY = "y";
	
	public static void delay(int detik, String delays) {
		if(delays.equals("y"))
		{
			try {
				Thread.sleep(1000*detik);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}
	
}