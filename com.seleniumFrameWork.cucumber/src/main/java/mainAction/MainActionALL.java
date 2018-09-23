package mainAction;

import stepDefinations.EnterValuesIntoApp;

public class MainActionALL {

	public void main() {
		// TODO Auto-generated method stub

		EnterValuesIntoApp loginApp =  new EnterValuesIntoApp();
		loginApp.loginApplication();
		loginApp.EnterValuesTextBox("//div[@id='example_filter']/label/input","ABC");
	}

}
