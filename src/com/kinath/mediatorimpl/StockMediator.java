package com.kinath.mediatorimpl;

import com.kinath.mediator.Colleague;
import com.kinath.mediator.Mediator;
import com.kinath.mediator.StockOffer;

import java.util.ArrayList;

/**
 * Created by Kinath on 3/12/2017.
 */
public class StockMediator implements Mediator
{
    private ArrayList<Colleague> colleagues;
    private ArrayList<StockOffer> stockBuyOffers;
    private ArrayList<StockOffer> stockSellOffers;

    private int colleagueCodes = 0;

    public StockMediator()
    {
        colleagues = new ArrayList<>();
        stockBuyOffers = new ArrayList<>();
        stockSellOffers = new ArrayList<>();
    }

    @Override public void addColleague( Colleague newColleague )
    {
        colleagues.add( newColleague );
        colleagueCodes++;
        newColleague.setColleagueCode( colleagueCodes );
    }

    @Override public void saleOffer( String stock, int shares, int colleagueCode )
    {
        boolean stockSold = false;
        for( StockOffer offer : stockBuyOffers )
        {
            if( ( offer.getStockSymbol() == stock ) && ( offer.getStockShares() == shares ) )
            {
                System.out.println( shares + " shares of " + stock + " sold to colleague code " + offer.getColleagueCode() );
                stockBuyOffers.remove( offer );
                stockSold = true;
            }

            if( stockSold )
            {
                break;
            }
        }

        if( !stockSold )
        {
            System.out.println( shares + " share of " + stock + " added to inventory " );
            StockOffer newOffering = new StockOffer( shares, stock, colleagueCode );
            stockSellOffers.add( newOffering );
        }
    }

    @Override public void buyOffer( String stock, int shares, int colleagueCode )
    {
        boolean stockBought = false;
        for( StockOffer offer : stockSellOffers )
        {
            if( ( offer.getStockSymbol() == stock ) && ( offer.getStockShares() == shares ) )
            {
                System.out.println( shares + " shares of " + stock + " bought by colleague code " + offer.getColleagueCode() );
                stockSellOffers.remove( offer );
                stockBought = true;
            }

            if( stockBought )
            {
                break;
            }
        }

        if( !stockBought )
        {
            System.out.println( shares + " share of " + stock + " added to inventory " );
            StockOffer newOffering = new StockOffer( shares, stock, colleagueCode );
            stockBuyOffers.add( newOffering );
        }
    }

    public void getStockOfferings()
    {
        System.out.println("\nStocks for Sale");

        for( StockOffer offer : stockSellOffers )
        {
            System.out.println(offer.getStockShares()  +  " of " + offer.getStockSymbol());
        }

        System.out.println("\nStocks Buy Offers");

        for( StockOffer offer : stockBuyOffers )
        {
            System.out.println(offer.getStockShares()  +  " of " + offer.getStockSymbol());
        }
    }


}
