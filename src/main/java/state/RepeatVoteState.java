package state;

/**
 * Created by Alvin on 16/11/16.
 */
public class RepeatVoteState extends VoteState {
    @Override public void vote(String user, String voteItem) {
        System.out.println("=============请勿重复投票=============");
        if(super.context.getVote(user) == 6){
            super.context.setState(Context.spiteVoteState);
        }
    }
}
