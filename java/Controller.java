class Controller{
	Model model;
	View view;
	ApiCall api;			
	final static String API2 = "http://localhost:5001/";
	final static String API1 = "http://localhost:5002/";
	
	public Controller(){
	   model = new Model();
	   view = new View();
	   api = new ApiCall();
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


	public void opponentAddCard(){}

	public void opponentRemoveCard(){}

	public void opponentPlayCard(){}

	public void opponentEmptyDeck(){}

	public void opponentShuffle(){}

}
