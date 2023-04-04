
public class Content {

	private String title;
	private String image;
	private String rate;
	
	
	public Content(String title, String image){
		this.title = title;
		this.image = image;
	}
	
	public Content(String title, String image, String rate){
		this.title = title;
		this.image = image;
		this.rate = rate;
	}
	
	public String getTitle() {
		return title;
	}
	public String getImage() {
		return image;
	}
	
	public String getRate() {
		return rate;
	}
	
}
