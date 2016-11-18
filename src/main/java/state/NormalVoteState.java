package state;

import policy.*;

/**
 * Created by Alvin on 16/11/16.
 */
public class NormalVoteState extends VoteState {
    @Override
    public void vote(String name, String voteItem) {
        System.out.println("=============欢迎投票=============");
        if(super.context.getVote(name) != null){
            super.context.setState(Context.repeatVoteState);
        }

    }
}
