package com.kinath.mediator;

/**
 * Created by Kinath on 3/12/2017.
 */
public interface Mediator
{
    public void saleOffer( String stock, int shares, int colleagueCode );

    public void buyOffer( String stock, int shares, int colleagueCode );

    public void addColleague(Colleague colleague);
}
