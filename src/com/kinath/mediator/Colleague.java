package com.kinath.mediator;

/**
 * Created by Kinath on 3/12/2017.
 */
public abstract class Colleague
{
    private Mediator mediator;
    private int colleagueCode;

    public Colleague( Mediator mediator )
    {
        this.mediator = mediator;
    }

    public void saleOffer(String stock, int shares)
    {
        mediator.saleOffer(stock,shares,this.colleagueCode);
    }

    public void buyOffer(String stock, int shares)
    {
        mediator.buyOffer(stock,shares,this.colleagueCode);
    }

    public void setColleagueCode( int colleagueCode )
    {
        this.colleagueCode = colleagueCode;
    }
}
