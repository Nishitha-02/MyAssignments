package week1.day2;

public class EdgeBrowser {

	public static void main(String[] args) {
		Browser myBrowser = new Browser();
		myBrowser.loadUrl();
		String browserName = myBrowser.launchBrowser("Edge");
		System.out.println("Browser Name: " + browserName);

	}

}
