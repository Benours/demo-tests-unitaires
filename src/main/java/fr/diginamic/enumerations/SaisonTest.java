package fr.diginamic.enumerations;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class SaisonTest {
	
	@Test
	public void testGetInstance() {
		Saison test = Saison.getInstance("Printemps");
		assertEquals(Saison.PRINTEMPS, test);
	}
	
	@Test
	public void testGetInstanceInexistant() {
		Saison test = Saison.getInstance("Toto");
		boolean verif = false;
		for (Saison saison : Saison.values())
			if(saison.equals(test))
				verif = true;
		assertFalse(verif);
	}
	
	@Test
	public void testGetInstanceNull() {
		Saison test = Saison.getInstance(null);
		assertNull(test);
	}

}
