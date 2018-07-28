import java.util.*;
import java.lang.reflect.*;
class View{
	Scanner scan = new Scanner(System.in);
	Map<String, Action> methodMapStart = new HashMap<String, Action>();
	Map<String, Action> methodMapPlay = new HashMap<String, Action>();
	
	public View(){
		methodMapStart.put("y",new Action() {
			@Override
			public void process(){
				
			}	
		});
	   	
		methodMapStart.put("n",new Action() {
			@Override
			public void process(){

			}	
		});
		 methodMapPlay.put("p",new Action() {
			@Override
			public void process(){
	
			}	
		});methodMapPlay.put("s",new Action() {
			@Override
			public void process(){

			}	
		});
	}
	
	private void userMessage(String str){
		System.out.println("==>"+str+"-");
	}

	public String gameActionPrompt(){
		String input = "";
		while(!methodMapPlay.containsKey(input.toLowerCase())){
			System.out.print("What will you do? ('p' - play card, 's' - deck status): ");
			input = getStringInput();
			System.out.println("\n");
		}
		return input;
	}

	public void startGamePrompt(){
		String input = "";
		while(!methodMapStart.containsKey(input.toLowerCase())){
			System.out.print("Prepare yourself for War! Are you ready (y/n)?: ");
			input = getStringInput();
			System.out.println("\n");
		}
	}


	private String getStringInput(){
		String s = scan.next();
		return s;
	}

	public void updateView(int myDeckSize, int opponentDeckSize, Card myCard, Card opponentCard){
		System.out.println("\033[H\033[2J");
		System.out.flush();
		String myAscii = cardToAscii(myCard), enemyAscii = cardToAscii(opponentCard);

		String divider = "\n";
		for(int i=0;i<20;i++){
		   divider+="=";
		}
		divider+="\n";
		System.out.println("Enemy Deck Size: "+opponentDeckSize);
		System.out.println(enemyAscii);
		System.out.println(divider);
		System.out.println(myAscii);
		System.out.println("Your Deck Size: "+myDeckSize);	
		       
	}

	private String availableOptions(Map<String, Method> methodMap){
		String options = "";
		for(Map.Entry<String,Method> entry : methodMap.entrySet()){
			options += ("--" + entry.getKey() +"\n");
		}
		return options;
	}
	
	private String cardToAscii(Card card){
		String cardstr = "";
		for(int i=0; i<20; i++){
			if(i<5||i>14){
				cardstr+="=";	
			}else{
				cardstr+=" ";
			}
		}
		cardstr+="\n";
		return cardstr;
	}
	

	private interface Action{
	 void process();
	}

}
