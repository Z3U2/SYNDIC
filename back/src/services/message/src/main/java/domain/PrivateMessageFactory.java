package domain;

import java.util.Date;

public interface PrivateMessageFactory {
    public PrivateMessage makePrivateMessage(
        UserId sourceId,
        UserId targetId,
        String text,
        Date sentAt
        ) throws Exception;
}