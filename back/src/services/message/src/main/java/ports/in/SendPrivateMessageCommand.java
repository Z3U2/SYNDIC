package ports.in;

import java.util.Date;

import domain.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class SendPrivateMessageCommand {
    @Getter
    private final UserId sourceId;
    @Getter
    private final UserId targetId;
    @Getter
    private final String text;
    @Getter
    private final Date sentAt;
}