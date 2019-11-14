package ports.out;

import domain.PrivateMessage;

public interface SavePrivateMessagePort {
    void savePrivateMessage(PrivateMessage message);
}