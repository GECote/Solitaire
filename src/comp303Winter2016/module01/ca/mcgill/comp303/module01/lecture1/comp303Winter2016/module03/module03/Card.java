package comp303Winter2016.module01.ca.mcgill.comp303.module01.lecture1.comp303Winter2016.module03.module03;

/**
 * Same as version 7. My last example.
 */
public class Card implements Cloneable
{	
	/**
 	 * A card's rank.
	 */
	public enum Rank
	{ ACE, TWO, THREE, FOUR, FIVE, SIX,
		SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;
	}
	
	/**
	 * A card's suit.
	 */
	public enum Suit
	{
		CLUBS, DIAMONDS, SPADES, HEARTS
	}
	
	private final Rank aRank; // Invariant: != null
	private final Suit aSuit; // Invariant: != null
	private boolean visible = false;	
	public void setvisible(){
	visible = true;
	}	
	public void setinvisible(){
		visible = false;
	}
	
	/**
	 * @param pRank The index of the rank in RANKS
	 * @param pSuit The index of the suit in SUITS
	 * @pre pRank != null && pSuit != null
	 */
	public Card(Rank pRank, Suit pSuit)
	{
		assert pRank != null && pSuit != null;
		aRank = pRank;
		aSuit = pSuit;
	}
	
	@Override
	public Card clone()
	{
		try
		{
			return (Card)super.clone();
		}
		catch (CloneNotSupportedException e)
		{
			return null;
			}
	}
	
	@Override
	public boolean equals(Object pObject)
	{
		if( pObject == null ) return false;
		if( pObject == this ) return true;
		if( pObject.getClass() != getClass() ) return false;
		return aRank == ((Card)pObject).getRank() && aSuit == ((Card)pObject).getSuit();
	}
	
	@Override
	public int hashCode()
	{
		return aSuit.ordinal() * Rank.values().length + aRank.ordinal();
	}
	
	public Card( Card pCard )
	{
		aRank = pCard.aRank;
		aSuit = pCard.aSuit;
	}
	
	/**
	 * @return The index in RANKS corresponding to the rank of the card.
	 * @post return != null
	 */
	public Rank getRank()
	{
		return aRank;
	}
	
	/**
	 * @return The index in SUITS corresponding to the suit of the card.
	 * @post return != null
	 */
	public Suit getSuit()
	{
		return aSuit;
	}
	
	public static void main(String[] args)
	{
	}
	
	/**
	 * Assigns a new suit to the card.
	 * @param pSuit The new suit.
	 * @pre pSuit != null
	 */
	
	@Override
	public String toString()
	{
		return aRank + " of " + aSuit;
	}
}
