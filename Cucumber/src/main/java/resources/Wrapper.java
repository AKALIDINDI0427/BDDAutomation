package resources;

public interface Wrapper {

	abstract void invokeApp(String URl);
	abstract void takeScreenshot();
	abstract void elementsendText(String xpath, String value);
	abstract void elementClick(String xpath);
	abstract void selectDropDownbyIndex(String xpath, int value);
	abstract void selectDropDownbyValue(String xpath, String value);
	abstract void selectDropDownbyVisibleText(String xpath, String value);
	abstract void switchFrame(String xpath);
	abstract void defaultFrame();
	abstract void switchToWindow();
}
