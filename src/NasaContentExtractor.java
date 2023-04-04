import java.util.List;
import java.util.Map;

public class NasaContentExtractor implements ContentExtractor{

	public List<ContentRecord> extractContent(String json){ 
		
		JsonParser parser = new JsonParser(); 
		List<Map<String, String>> attributeList = parser.parse(json);
			
		return attributeList.stream()
				.map(attribute -> new ContentRecord(attribute.get("title"),
						attribute.get("url"))).toList();
		
		
		 
	}
}


//List<ContentRecord> contents = new ArrayList<>();
//
//for (Map<String, String> attribute : attributeList) {
//	String title = attribute.get("title");
//	String imageUrl = attribute.get("url");
//
//	var content = new ContentRecord(title, imageUrl);
//	
//	contents.add(content);
//}
