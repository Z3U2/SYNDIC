package domain;

import ports.util.TextCleaner;

public class MessageInjector {

    public PrivateMessageFactory getPrivateMessageFactory() {
        MessageFactory factory = new MessageFactory();
        factory.setCleaner(new Sanitize());
        return factory;  
    }

    public MulticastMessageFactory getMulticastMessageFactory() {
        MessageFactory factory = new MessageFactory();
        factory.setCleaner(new Sanitize());
        return factory;
    }
}

class Sanitize implements TextCleaner {

    @Override
    public String clean(String text) {
        // TODO Auto-generated method stub
        return text;
    }
    
}