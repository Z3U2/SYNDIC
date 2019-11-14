package usecases;

import domain.MessageInjector;
import domain.MulticastMessage;
import ports.out.FireSentMulticastMessageEventPort;
import ports.out.SaveMulticastMessagePort;

public class SendMulticastMessageInjector {
    public SendMulticastMessageUseCase getUseCase() {
        SendMulticastMessageUseCase usecase = new SendMulticastMessageUseCase();
        usecase.setSaveMulticastMessagePort(new DoNothingSaveMulticastMessage());
        usecase.setMulticastMessageFactory(new MessageInjector().getMulticastMessageFactory());
        usecase.setFireSentMulticastMessageEventPort(new DoNothingFireSentMulticastMessageEvent());
        return usecase;
    }
}

class DoNothingSaveMulticastMessage implements SaveMulticastMessagePort {

    @Override
    public void saveMulticastMessage(MulticastMessage message) {
        // TODO Auto-generated method stub

    }

}

class DoNothingFireSentMulticastMessageEvent implements FireSentMulticastMessageEventPort {

    @Override
    public void fireSentMulticastMessageEvent(MulticastMessage message) {
        // TODO Auto-generated method stub

    }

}