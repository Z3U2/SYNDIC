package domain;

import java.util.Date;

public interface MulticastMessageFactory {
    public MulticastMessage makeMulticastMessage(
        UserId sourceId,
        HousingId targetId,
        String text,
        Date sentAt,
        Housing housingType
        ) throws Exception;
}