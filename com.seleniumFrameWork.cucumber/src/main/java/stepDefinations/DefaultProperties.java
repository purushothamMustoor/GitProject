package stepDefinations;

public class DefaultProperties {

	public String defaultUrl; //= "http://www.seleniumeasy.com/test/table-data-download-demo.html";
	public long accountId;
	public String SearchValue;
	
	public String defaultUrl() {
		
			defaultUrl = "http://www.seleniumeasy.com/test/table-data-download-demo.html";
			System.out.println("Taken URL");
			return defaultUrl;
			
		
	}
	//defaultUrl = "http://www.seleniumeasy.com/test/table-data-download-demo.html"; 
/*	public String getUrl() {
		return Url;
	}
	public void setUrl(String Url) {
		if (Url == "") {
			Url = "http://www.seleniumeasy.com/test/table-data-download-demo.html";
			System.out.println("Taken URL");
		}
		
	}
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public String getSearchValue() {
		return SearchValue;
	}
	public void setSearchValue(String searchValue) {
		SearchValue = searchValue;
	}
	
*/}
