package domain;

import java.util.Date;

import lombok.Setter;
import ports.util.TextCleaner;

public class MessageFactory implements PrivateMessageFactory, MulticastMessageFactory {

    @Setter TextCleaner cleaner;

    @Override
    public PrivateMessage makePrivateMessage(UserId sourceId, UserId targetId, String text, Date sentAt) throws Exception {
        validate(sourceId, targetId, text, sentAt);
        String cleanText = clean(text);
        return new PrivateMessage(sourceId, targetId, cleanText, sentAt);
    }

    @Override
    public MulticastMessage makeMulticastMessage(UserId sourceId, HousingId targetId, String text, Date sentAt, Housing housingType)
            throws Exception {
        validate(sourceId, targetId, text, sentAt);
        String cleanText = clean(text);
        if (housingType == null) {
            throw new Exception("housingType can't be null");
        }
        return new MulticastMessage(sourceId, targetId, cleanText, sentAt, housingType);
    }

    private <T> void validate(UserId sourceId, T targetId, String text, Date sentAt) throws Exception {
        if (sourceId == null) {
            throw new Exception("sourceId can't be null");
        }
        if (targetId == null) {
            throw new Exception("targetId can't be null");
        }
        if (sentAt == null) {
            throw new Exception("sentAt can't be null");
        }
        if (text == null) {
            throw new Exception("text can't be null");
        }
    }

    private String clean(String text) throws Exception {
        String cleanText = cleaner.clean(text);
        if (cleanText.length() == 0) {
            throw new Exception("message text has no usable text in it");
        }
        return cleanText;
    }
}