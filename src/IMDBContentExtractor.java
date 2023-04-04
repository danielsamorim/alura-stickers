import java.util.List;
import java.util.Map;

public class IMDBContentExtractor implements ContentExtractor {
	
public List<ContentRecord> extractContent(String json){ 
		
		JsonParser parser = new JsonParser(); 
		List<Map<String, String>> attributeList = parser.parse(json);
			
		return attributeList.stream()
		.map(attribute -> new ContentRecord(attribute.get("title"), attribute.get("image")
				.replaceAll("(@+)(.*).jpg$", "S1.jpg"))).toList();
		
		
		 
	}


//		List<ContentRecord> contents = new ArrayList<>();
//
//for (Map<String, String> attribute : attributeList) {
//	String title = attribute.get("title");
//	String imageUrl = attribute.get("image").replaceAll("(@+)(.*).jpg$", "S1.jpg");
//
//	ContentRecord content = new ContentRecord(title, imageUrl);
//	
//	contents.add(content);
//}



//	public Content<> showContent(){
//		String rank = map.get("rank");
//		String title = map.get("title");
//		String image = map.get("image").replaceAll("(@+)(.*).jpg$", "S1.jpg");
//		double rating = Double.parseDouble(map.get("imDbRating"));
//		int rate = (int) rating;
//		String star = "";
//		
//		System.out.println("\u001b[1m" + rank + " - " + title + "\u001b[m");
//		System.out.println(image);
//		System.out.println("\u001b[37m \u001b[41mClassificação:\u001b[m " + "\u001b[1m" + rating);
//					
//		if(rate >= 8) {
//			 star = "🌟";
//		}else if(rate <= 7) {
//			 star = "⭐";
//		}else if(rate < 5) {
//			 star = "💩";
//		}
//		
//		for (int i = 0; i < rate; i++) {
//			System.out.print(star);
//		}
//		System.out.println();

	//generator.create(inputStream, fileName, "mensagem")
		
//	}
}
