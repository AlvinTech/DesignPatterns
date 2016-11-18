package state;

/**
 * Created by Alvin on 16/11/16.
 */
public class BlackVoteState extends VoteState{
    @Override public void vote(String user, String voteItem) {
        System.out.println("=============进入黑名单，将禁止登录和使用本系统=============");
        super.context.delVote(user);
    }
}
