package comp303Winter2016.module01.ca.mcgill.comp303.module01.lecture1.comp303Winter2016.module03.module03;

import java.util.Stack;

public class SuitStackManager {

	private Stack<Card> myStack = new Stack<Card>();
	private Card.Suit mySuit;
	
	public int getscore(){
		return myStack.size(); 
	}	
	
	SuitStackManager(Card.Suit aSuit){
	
	mySuit = aSuit;	
	}
	
	boolean canAdd(Card aCard)
	{
		if(mySuit != aCard.getSuit()) 
			return false;
		Card topstack;
		if(myStack.isEmpty())
			topstack = null;
		else
			topstack = myStack.peek();
		switch(aCard.getRank()){
		case ACE: if(topstack==null)
						return true;
					break;
		case TWO: if(topstack.getRank() == Card.Rank.ACE)
						return true;
					break;
		case THREE: if(topstack.getRank() == Card.Rank.TWO)
			return true;
		break;			
		case FOUR: if(topstack.getRank() == Card.Rank.THREE)
			return true;
		break;
		case FIVE: if(topstack.getRank() == Card.Rank.FOUR)
			return true;
		break;
		case SIX: if(topstack.getRank() == Card.Rank.FIVE)
			return true;
		break;
		case SEVEN: if(topstack.getRank() == Card.Rank.SIX)
			return true;
		break;
		case EIGHT: if(topstack.getRank() == Card.Rank.SEVEN)
			return true;
		break;
		case NINE: if(topstack.getRank() == Card.Rank.EIGHT)
			return true;
		break;
		case TEN: if(topstack.getRank() == Card.Rank.NINE)
			return true;
		break;
		case JACK: if(topstack.getRank() == Card.Rank.TEN)
			return true;
		break;
		case QUEEN: if(topstack.getRank() == Card.Rank.JACK)
			return true;
		break;
		case KING: if(topstack.getRank() == Card.Rank.QUEEN)
			return true;
		break;
	}
	
		return false;
	}

	boolean canRemove(){	
	if(myStack.isEmpty())
		return false;
	else
		return true;
	}
}
