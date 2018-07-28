import java.io.*;
import java.util.*;


class Controller{
	Model model;
	View view;
	ApiCall api;			
	Random generator;
	Boolean progress = true;
	final String ENDPOINT = "http://localhost:5001/";
	ArrayList<Card> cards = new ArrayList<Card>();
	public Controller(){
	   model = new Model();
	   view = new View();
	   api = new ApiCall();
	   generator = new Random();
	}

	public void start(){
	  /* System.out.println(opponentAddCard());
	   System.out.println(opponentRemoveCard()); 
	   System.out.println(opponentPlayCard());
	   System.out.println(opponentEmptyDeck()); 
	   System.out.println(opponentShuffle());
	  */
	   for(int i = 0; i < 100; i++){
	      cards.add(new Card('c', generator.nextInt(50)));
	   }
	   view.startGamePrompt();
	   while(progress){
		inputToAction(view.gameActionPrompt());
	   	view.updateView(0, 0, null, null);
		
	   }
	}

	public void inputToAction(String str){

	}

	public void selfAddCard(){
	
	}

	public void selfRemoveCard(){

	}

	public void selfPlayCard(){
	
	}

	public void selfEmptyDeck(){
	
	}

	public void selfShuffle(){

	}
	
	//communicate with server section

	public String opponentAddCard(){
	   System.out.println("Request: Take this card!");
	   Map<String, Object> params = new HashMap<String, Object>();
	   params.put("card","type:heart,value:5");
	   return api.post(ENDPOINT+"addcard",params);		
	}

	public String opponentRemoveCard(){
	   System.out.println("Request: Remove this card!");
	   Map<String, Object> params = new HashMap<String, Object>();
	   params.put("card","type:heart,value:5");
	   return api.post(ENDPOINT+"removecard",params);	
	}

	public String opponentPlayCard(){
     	   System.out.println("Request: Play a card!");
	    return api.get(ENDPOINT+"playcard");	
	}

	public String opponentEmptyDeck(){	   
	   System.out.println("Request: Emptying Deck!");
	   return api.get(ENDPOINT+"emptydeck");	
	    
	}

	public String opponentShuffle(){
	   System.out.println("Request: Shuffle Card!");
	   return api.get(ENDPOINT+"shuffle");	
	}

}
