package TercerParcial.E4;

import java.util.ArrayList;
import java.util.List;

public class Servidor2 implements IServidor {
    private List<User> listOfUsers;

    public Servidor2() {
        listOfUsers = new ArrayList<>();
    }

    @Override
    public void userLogin(User user) {
        listOfUsers.add(user);
    }

    @Override
    public void atenderUsuarios() {
        for (User user:listOfUsers) {
            System.out.println("Servidor2 atendiendo a usuario " + user.getNumber());
            user.showInfo();
        }
    }
}
