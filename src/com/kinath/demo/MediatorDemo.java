package com.kinath.demo;

import com.kinath.mediatorimpl.GormanSlacks;
import com.kinath.mediatorimpl.JTPorman;
import com.kinath.mediatorimpl.StockMediator;

/**
 * Created by Kinath on 3/12/2017.
 */
public class MediatorDemo
{
    public static void main( String[] args )
    {
        StockMediator nyse = new StockMediator();

        GormanSlacks broker1 = new GormanSlacks( nyse );
        JTPorman broker2 = new JTPorman( nyse );

        broker1.saleOffer( "MSFT", 100 );
        broker1.saleOffer( "GOOG", 50 );

        broker2.buyOffer( "MSFT", 100 );
        broker2.saleOffer( "NRG", 10 );

        broker1.buyOffer( "NRG", 10 );

        nyse.getStockOfferings();

    }
}
