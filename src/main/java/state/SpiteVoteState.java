package state;

/**
 * Created by Alvin on 16/11/16.
 */
public class SpiteVoteState extends VoteState {
    @Override public void vote(String user, String voteItem) {
        System.out.println("=============删除投票=============");
        super.context.delVote(user);
        if(super.context.getVote(user) == 8){
            super.context.setState(Context.blackVoteState);
        }
    }
}
