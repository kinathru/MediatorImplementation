package com.kinath.mediatorimpl;

import com.kinath.mediator.Colleague;
import com.kinath.mediator.Mediator;

/**
 * Created by Kinath on 3/12/2017.
 */
public class JTPorman extends Colleague
{

    public JTPorman( Mediator mediator )
    {
        super( mediator );
        System.out.println("JTPorman signed up for the exchange\n");
    }
}
