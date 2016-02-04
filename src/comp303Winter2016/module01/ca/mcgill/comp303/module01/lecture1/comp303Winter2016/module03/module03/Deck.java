package comp303Winter2016.module01.ca.mcgill.comp303.module01.lecture1.comp303Winter2016.module03.module03;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

import comp303Winter2016.module01.ca.mcgill.comp303.module01.lecture1.comp303Winter2016.module03.module03.Card.Rank;
import comp303Winter2016.module01.ca.mcgill.comp303.module01.lecture1.comp303Winter2016.module03.module03.Card.Suit;

/**
 * An iterable implementation of cards.
 */
public class Deck implements Iterable<Card>, Cloneable
{
	private final Stack<Card> aCards;// = new Stack<>();
	
	public static void main(String[] args)
	{
		Deck deck = new Deck();
		deck.shuffle();
		for( Card card : deck )
		{
			System.out.println(card);
		}
	}
	
	public Deck()
	{
		aCards = new Stack<Card>();
	}
	
	public List<Card> getCards()
	{
		return Collections.unmodifiableList(aCards);
	}
	
	public Deck( Deck pDeck )
	{
		aCards = new Stack<Card>();
		for( Card card : pDeck.aCards )
		{
			aCards.add(new Card(card));
		}
	}
	
	public void shuffle()
	{
		aCards.clear();
		for( Suit suit : Suit.values() )
		{
			for( Rank rank : Rank.values())
			{
				aCards.push(new Card(rank, suit));
			}
		}
		Collections.shuffle(aCards);
	}
	
	public boolean isEmpty()
	{
		return aCards.isEmpty();
	}
	
	public Card draw()
	{
		return aCards.pop();
	}

	@Override
	public Iterator<Card> iterator()
	{
		return aCards.iterator();
	}
}
