package com.kinath.mediatorimpl;

import com.kinath.mediator.Colleague;
import com.kinath.mediator.Mediator;

/**
 * Created by Kinath on 3/12/2017.
 */
public class GormanSlacks extends Colleague
{

    public GormanSlacks( Mediator mediator )
    {
        super( mediator );
        System.out.println("Gorman Slacks signed up for the exchange\n");
    }
}
