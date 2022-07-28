package bt_abstract_interface.animal;

import bt_abstract_interface.Animal;
import bt_abstract_interface.Interface.Barkable;

public class Nemo extends Animal implements Barkable {

    @Override
    public String bark() {
        return "go go";
    }

    @Override
    public String toString() {
        return bark();
    }

}
