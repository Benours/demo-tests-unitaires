import static org.junit.Assert.assertEquals;

import org.junit.Test;
import fr.diginamic.levenshtein.*;

public class StringUtilsTest {
	
	@Test
	public void testLevenshteinDistanceChat() {
		
		int result = StringUtils.levenshteinDistance("chat", "chats");
		
		assertEquals(1, result);
		
	}	
	
	@Test
	public void testLevenshteinDistanceMachin() {
		
		int result = StringUtils.levenshteinDistance("machins", "machine");
		
		assertEquals(1, result);
		
	}	
	
	@Test
	public void testLevenshteinDistanceAvion() {
		
		int result = StringUtils.levenshteinDistance("aviron", "avion");
		
		assertEquals(1, result);
		
	}	
	
	@Test
	public void testLevenshteinDistanceInstance() {
		
		int result = StringUtils.levenshteinDistance("distance", "intance");
		
		assertEquals(2, result);
		
	}
	
	@Test
	public void testLevenshteinDistanceChien() {
		
		int result = StringUtils.levenshteinDistance("Chien", "Chine");
		
		assertEquals(2, result);
		
	}
	
	
	@Test
	public void testLevenshteinDistanceNull1() {
		
		int result = StringUtils.levenshteinDistance(null, "chats");
		System.out.println(result);
//		assertEquals(6, result);
		
	}
}
