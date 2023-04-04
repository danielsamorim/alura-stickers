import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

public class MostPopularMovies {
	public static void main(String[] args) throws Exception {
		String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/MostPopularMovies.json";
		URI endereco = URI.create(url);
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder(endereco).GET().build();
		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
		String body = response.body();
			
		
		JsonParser parser = new JsonParser(); 
		List<Map<String, String>> listaDeFilmes = parser.parse(body);
		
		for (Map<String, String> map : listaDeFilmes) {
			
			String rank = map.get("rank");
			String title = map.get("title");
			String image = map.get("image");
			double rating = Double.parseDouble(map.get("imDbRating"));
			int rate = (int) rating;
			String star = "";
			
			System.out.println("\u001b[1m" + rank + " - " + title + "\u001b[m");
			System.out.println(image);
			System.out.println("\u001b[37m \u001b[41mClassificação:\u001b[m" + rating);
			
			if(rate >= 8) {
				 star = "🌟";
			}else if(rate <= 7) {
				 star = "⭐";
			}else if(rate < 5) {
				 star = "💩";
			}
			for (int i = 0; i < rate; i++) {
				System.out.print(star);
			}
			System.out.println();

			
			
		}
	}
}
