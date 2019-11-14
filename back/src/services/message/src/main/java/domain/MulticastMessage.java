package domain;

import java.util.Date;

import lombok.Getter;

final public class MulticastMessage extends Message<HousingId> {

    @Getter
    private final Housing housingType;

    public MulticastMessage(UserId sourceId, HousingId targetId, String text, Date sentAt, Housing housingType) {
        super(sourceId, targetId, text, sentAt);
        this.housingType = housingType;
    }

}