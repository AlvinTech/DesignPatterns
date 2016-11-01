package mediator;

import mediator.Mediator;

/**
 * Created by Alvin on 16/11/1.
 */
abstract class AbstractColleague {
    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator){
        this.mediator =  mediator;
    }
}
