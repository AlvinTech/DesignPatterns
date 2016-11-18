package state;

import lombok.Data;

import java.util.HashMap;

/**
 * Created by Alvin on 16/11/16.
 */
@Data
public class Context {
    private HashMap<String,String> voteMap = new HashMap<>();
    private HashMap<String,Integer> voteCount = new HashMap<>();

    public final static VoteState normalVoteState = new NormalVoteState();
    public final static VoteState repeatVoteState = new RepeatVoteState();
    public final static VoteState spiteVoteState = new SpiteVoteState();
    public final static VoteState blackVoteState = new BlackVoteState();

    private VoteState state ;

    public void vote(String name, String item){
        voteMap.put(name, item);
        int value = 0;
        if(voteCount.get(name) != null)
            value = voteCount.get(name);
        value++;
        System.out.println("投票数 " + value);
        voteCount.put(name,value);
        state.vote(name, item);

    }

    public Integer getVote(String name){
        return voteCount.get(name);
    }

    public void addVote(String name, int vote){
        voteCount.put(name,vote);
    }

    public void setState(VoteState state){
        this.state = state;
        this.state.setContext(this);
    }

    public void delVote(String name){
        voteMap.remove(name);
    }
}
