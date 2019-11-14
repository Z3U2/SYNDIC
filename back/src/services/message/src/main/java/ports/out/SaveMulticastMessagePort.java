package ports.out;

import domain.MulticastMessage;

public interface SaveMulticastMessagePort {
    void saveMulticastMessage(MulticastMessage message);
}