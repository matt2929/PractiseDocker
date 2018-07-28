import java.util.*;
class Model{
	Stack<Card> deck = new Stack<Card>();
	public Model(){
		
	}
	public void addCard(Card card){
		deck.push(card);
	}

	public Card playCard(){
		return deck.pop();	
	}

	public int deckSize(){
		return deck.size();
	}

}
