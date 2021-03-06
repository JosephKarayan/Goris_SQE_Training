
public class Main {
	public static void main(String[] args) {
		System.out.println("             RULES & EXPLANATION");
		System.out.println("");
		System.out.println(" My dear user, in this Chess only one piece can be used. For this time it is King (both Black and White).");
		System.out.println("Important Functions:");
		System.out.println("Create Piece: .setName(String name), .setColor(String color) (Name should be only King)");
		System.out.println("Start game: .start()");
		System.out.println("Move Piece: .setPeacePlace(int a, int b) (also checks the possibility of movement)");
		System.out.println("Back movement: .setBack() (should only back one move)");
		System.out.println("Remove or add the piece of the game: .setExistence(boolean)");
		System.out.println("Check the existence of a piece: .getExistence()");
		System.out.println("");
		Piece king = new Piece();
		king.setName("King");
		king.setColor("Black");
		king.start();
		king.setPiecePlace(8, 6);
		king.setColor("White");
		king.start();
		king.setPiecePlace(1, 4);
		king.setPiecePlace(2, 3);
		king.setBack();
		king.setBack();
		king.setPiecePlace(1, 2);
		king.getExistence();
		king.setExistence(false);
		king.getExistence();
		king.setBack();
	}
}
