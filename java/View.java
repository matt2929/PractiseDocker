import java.util.Scanner;

class View{
	Scanner scan = new Scanner(System.in);
	public View(){
				
	}


	public String gameActionPrompt(){
		String input = "";
		while(!input.toLowerCase().equals("p") || !input.equals("s")){
			System.out.print("What will you do? ('p' - play card, 's' - deck status): ");
			input = getStringInput();
			System.out.println("\n");
		}
		return input;
	}

	public void startGamePrompt(){
		String input = "";
		while(!input.toLowerCase().equals("y")){
			System.out.print("Prepare yourself for War! Are you ready (y/n)?: ");
			input = getStringInput();
			System.out.println("\n");
		}
	}


	private String getStringInput(){
		String s = scan.next();
		return s;
	}

	public String updateView(int myDeckSize, int opponentDeckSize, Card myCard, Card opponentCards){
		return "TODO: view";	       
	}

	public String cardToAscii(Card card){
		return "___\n|4|\n___";
	}

}
