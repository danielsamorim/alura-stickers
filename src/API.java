
public enum API {

	TOP_MOVIES("https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies.json", new IMDBContentExtractor()),
    MOST_POPULAR("https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/MostPopularMovies.json", new IMDBContentExtractor()),
    NASA("https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/NASA-APOD.json", new NasaContentExtractor());

    private String descricao;
    private ContentExtractor extractor;

    API(String descricao, ContentExtractor extractor) {
        this.descricao = descricao;
        this.extractor = extractor;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public ContentExtractor getExtractor() {
    	return extractor;
    }
	
}
