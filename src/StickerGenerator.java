import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;

import javax.imageio.ImageIO;
 	
public class StickerGenerator {
	
	public void create(InputStream inputStream, String fileName) throws Exception {
//		
//		InputStream inputStream = new FileInputStream(new File("entrada/filme.png"));
//		
//		InputStream inputStream = new URL("https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies_1.jpg")
//				.openStream();
		
		BufferedImage originalImage =  ImageIO.read(inputStream);
		
		int width = originalImage.getWidth();
		int height = originalImage.getHeight();
		int newHeight = height + 200;
		BufferedImage newImage = new BufferedImage(width, newHeight, BufferedImage.TRANSLUCENT);
		
		Graphics2D graphics = (Graphics2D) newImage.getGraphics();
		graphics.drawImage(originalImage, 0, 0, null);
		
		
		
		Font fonte = new Font("Impact", Font.BOLD, 80);
		
		graphics.setColor(Color.YELLOW);
		graphics.setFont(fonte);
		graphics.drawString("TOPZERA", (width/2) - (fonte.getSize()*2) , newHeight -100);

		File f = new File("C:\\Users\\Asus\\Desktop\\alura-java\\alura-stickers\\saida");
		if (!f.exists()){
		    f.mkdirs();
		}
		ImageIO.write(newImage, "png", new File("saida/" + fileName));
		
	}
	
}
