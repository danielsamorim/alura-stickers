import java.util.List;

public interface ContentExtractor {
	List<ContentRecord> extractContent(String json);
}
