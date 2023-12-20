package interfaces;

import enums.HowMuch;
import objects.AbstractObject;

public interface Gettable {
    default void get(AbstractObject whoGets, String getAction, HowMuch howMuch) {
        System.out.println(whoGets.toString() + " " + getAction +" " + this.toString()+ " " + howMuch.getName()+ ".");
    }
}
