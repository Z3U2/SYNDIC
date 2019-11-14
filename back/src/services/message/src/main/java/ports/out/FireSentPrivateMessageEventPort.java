package ports.out;

import domain.PrivateMessage;

public interface FireSentPrivateMessageEventPort {
    void fireSentPrivateMessageEvent(PrivateMessage message);
}