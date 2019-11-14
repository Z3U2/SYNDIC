package usecases;

import domain.MulticastMessage;
import lombok.Setter;
import domain.MulticastMessageFactory;

import ports.out.FireSentMulticastMessageEventPort;
import ports.out.SaveMulticastMessagePort;
import ports.in.SendMulticastMessageCommand;

class SendMulticastMessageUseCase {

    @Setter
    SaveMulticastMessagePort saveMulticastMessagePort;
    @Setter
    MulticastMessageFactory MulticastMessageFactory;
    @Setter
    FireSentMulticastMessageEventPort fireSentMulticastMessageEventPort;

    void sendMulticastMessage(SendMulticastMessageCommand command) throws Exception {
        MulticastMessage message = MulticastMessageFactory
            .makeMulticastMessage(
                command.getSourceId(),
                command.getTargetId(),
                command.getText(),
                command.getSentAt(),
                command.getHousingType()
                );
        saveMulticastMessagePort.saveMulticastMessage(message);
        fireSentMulticastMessageEventPort.fireSentMulticastMessageEvent(message);
    }

}