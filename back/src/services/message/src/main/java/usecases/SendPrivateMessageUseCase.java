package usecases;

import domain.PrivateMessage;
import lombok.Setter;
import domain.PrivateMessageFactory;

import ports.out.FireSentPrivateMessageEventPort;
import ports.out.SavePrivateMessagePort;
import ports.in.SendPrivateMessageCommand;

class SendPrivateMessageUseCase {

    @Setter SavePrivateMessagePort savePrivateMessagePort;
    @Setter PrivateMessageFactory privateMessageFactory;
    @Setter FireSentPrivateMessageEventPort fireSentPrivateMessageEventPort;

    void sendPrivateMessage(SendPrivateMessageCommand command) throws Exception {
        PrivateMessage message = privateMessageFactory
            .makePrivateMessage(
                command.getSourceId(),
                command.getTargetId(),
                command.getText(),
                command.getSentAt()
                );
        savePrivateMessagePort.savePrivateMessage(message);
        fireSentPrivateMessageEventPort.fireSentPrivateMessageEvent(message);
    }

}