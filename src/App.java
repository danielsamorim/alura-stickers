import java.io.InputStream;
import java.net.URL;
import java.util.List;

public class App {
	public static void main(String[] args) throws Exception {
		
		var api = API.NASA;
		String url = api.getDescricao();
		ContentExtractor extractor = api.getExtractor();
		
		
		var http = new HttpClients();
		String json = http.searchData(url);
		
		List<ContentRecord> contents =  extractor.extractContent(json);
		
		var generator = new StickerGenerator();

		for (int i = 0; i < 3; i++) {
			
			ContentRecord content = contents.get(i);
			InputStream inputStream = new URL(content.image()).openStream();
			
			String fileName = content.title() + ".png";
			
			generator.create(inputStream, fileName);
			
			System.out.println(content.title());
		}
	}
}
