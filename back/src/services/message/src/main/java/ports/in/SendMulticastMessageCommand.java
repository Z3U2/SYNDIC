package ports.in;

import java.util.Date;

import domain.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class SendMulticastMessageCommand {
    @Getter
    private final UserId sourceId;
    @Getter
    private final HousingId targetId;
    @Getter
    private final String text;
    @Getter
    private final Date sentAt;
    @Getter
    private final Housing housingType;
}