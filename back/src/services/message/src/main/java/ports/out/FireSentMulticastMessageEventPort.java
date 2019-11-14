package ports.out;

import domain.MulticastMessage;

public interface FireSentMulticastMessageEventPort {
    void fireSentMulticastMessageEvent(MulticastMessage message);
}