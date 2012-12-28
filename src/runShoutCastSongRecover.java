import java.net.URI;
import java.util.List;

import net.moraleboost.streamscraper.Scraper;
import net.moraleboost.streamscraper.Stream;
import net.moraleboost.streamscraper.scraper.ShoutCastScraper;

public class runShoutCastSongRecover {

	public static void main(String[] args) {

		try {
			Scraper scraper = new ShoutCastScraper();
			List<Stream> streams = scraper.scrape(new URI(
					"http://74.222.1.197:13588"));
			for (Stream stream : streams) {
				System.out.println("Song Title: " + stream.getCurrentSong());
				//System.out.println("URI: " + stream.getUri());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
