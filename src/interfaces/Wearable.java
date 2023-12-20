package interfaces;

import objects.AbstractObject;

public interface Wearable {
    default void putOn(AbstractObject whoPutsOn, String action) {
        System.out.println(whoPutsOn.toString() + " " + action + " " + this.toString() + ".");
    }
    default void tekeOf(AbstractObject whoTakesOf, String action) {
         System.out.println(whoTakesOf.toString() + " " + action + " " + this.toString() + ".");
    }
}
