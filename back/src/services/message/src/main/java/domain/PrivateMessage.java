package domain;

import java.util.Date;

final public class PrivateMessage extends Message<UserId> {

    public PrivateMessage(UserId sourceId, UserId targetId, String text, Date sentAt) {
        super(sourceId, targetId, text, sentAt);
    }
    
}