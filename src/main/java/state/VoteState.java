package state;

import lombok.Data;

/**
 * Created by Alvin on 16/11/16.
 */
@Data
public abstract class VoteState {
    protected Context context;

    public abstract void vote(String user, String voteItem);
}
