package state;

/**
 * Created by Alvin on 16/11/16.
 */
/*
*
考虑一个在线投票系统的应用，要实现控制同一个用户只能投一票，如果一个用户反复投票，
而且投票次数超过5次，则判定为恶意刷票，要取消该用户投票的资格，当然同时也要取消他所投的票；
如果一个用户的投票次数超过8次，将进入黑名单，禁止再登录和使用系统。
*
*
* */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        NormalVoteState state = new NormalVoteState();
        context.setState(state);
        for (int i = 0 ; i < 9 ; i++){
            context.vote("alvin", "A");
        }

        System.out.println(context.getVoteCount());
        System.out.println(context.getVoteMap());

    }
}
