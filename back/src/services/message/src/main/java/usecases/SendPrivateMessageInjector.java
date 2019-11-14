package usecases;

import domain.MessageInjector;
import domain.PrivateMessage;
import ports.out.FireSentPrivateMessageEventPort;
import ports.out.SavePrivateMessagePort;

public class SendPrivateMessageInjector {
    public SendPrivateMessageUseCase getUseCase() {
        SendPrivateMessageUseCase usecase = new SendPrivateMessageUseCase();
        usecase.setSavePrivateMessagePort(new DoNothingSavePrivateMessage());
        usecase.setPrivateMessageFactory(new MessageInjector().getPrivateMessageFactory());
        usecase.setFireSentPrivateMessageEventPort(new DoNothingFireSentPrivateMessageEvent());
        return usecase;
    }
}

class DoNothingSavePrivateMessage implements SavePrivateMessagePort {

    @Override
    public void savePrivateMessage(PrivateMessage message) {
        // TODO Auto-generated method stub

    }

}

class DoNothingFireSentPrivateMessageEvent implements FireSentPrivateMessageEventPort {

    @Override
    public void fireSentPrivateMessageEvent(PrivateMessage message) {
        // TODO Auto-generated method stub

    }
    
} 