package fr.diginamic.maison;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaisonTest {

	@Test
	public void testAjouterPiece() {
		Piece piece = new Salon(20, 0);
		Maison maison = new Maison();
		Piece[] pieces = {piece};
		
		maison.ajouterPiece(piece);
		assertEquals(pieces, maison.getPieces());
	}
	
	@Test
	public void testAjouterPieceNull() {
		Maison maison = new Maison();
		Piece[] pieces = {null};
		
		maison.ajouterPiece(null);
		assertEquals(0, maison.getPieces().length);
	}
}
