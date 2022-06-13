package SegundoParcial.E4;

import java.util.ArrayList;
import java.util.List;

public class Whatsapp implements Mediator {
    private List<Cliente> chat = new ArrayList<>();

    public void addChat(Cliente cliente){
        chat.add(cliente);
    }

    @Override
    public void send(String msg, String tipo, Cliente receiver, Cliente sender) {
        if (tipo.equals("directo")){
            receiver.receive(msg);
        } else if (tipo.equals("grupal")){
            for (Cliente c : chat) {
                if(!c.equals(sender)){
                    c.receive(msg);
                }
            }
        }
    }
}
