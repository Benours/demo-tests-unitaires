package fr.diginamic.maison;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaisonTest {

	@Test
	public void testAjouterPiece() {
		Piece piece = new Salon(20, 0);
		Maison maison = new Maison();
		Piece[] pieces = {piece};
		
		try {
			maison.ajouterPiece(piece);
		} catch (MaisonException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		assertEquals(pieces, maison.getPieces());
	}
	
	@Test
	public void testAjouterPieceNull() {
		Maison maison = new Maison();
		Piece[] pieces = {null};
		assertEquals(0, maison.getPieces().length);
	}
	
	@Test
	public void testPieceNegative() {
		
		Piece piece = new Cuisine(-10, 0);
		Maison maison = new Maison();

		Piece[] pieces = new Piece[0];
		try {
			maison.ajouterPiece(piece);
		} catch (MaisonException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		assertEquals(pieces, maison.getPieces());
	}
}
