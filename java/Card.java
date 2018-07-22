import java.util.*;
class Card{
	char suit;
	int value;
	String[] valueMap = new String[13];
	public Card(char suit, int value){
		this.suit = suit;
		this.value = value;
		for(int i=0;i<9;i++){
			valueMap[i]=""+(i+2);
		}
		valueMap[9]="Jack";
		valueMap[10]="Queen";
		valueMap[11]="King";
		valueMap[12]="Ace";
	}

	public String toString(){
		return valueMap[value]+":"+suit;		
	}

	public HashMap<String, Object> cardToMap(){
		HashMap<String, Object> map = new HashMap<>();
		map.put("suit",this.suit);
		map.put("value",this.value);	
		return map;
	}
	//>0 this card is bigger
	//=0 same
	//<0 other card is larger
	public int compareCard(Card card){
		return value-card.value;
	}
}
