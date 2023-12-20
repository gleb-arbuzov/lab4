package interfaces;

import objects.AbstractObject;

public interface Achievable {
    default void goHere(AbstractObject whoGoes, String achieveAction) {
        System.out.println(whoGoes.toString() +" " + achieveAction + " " + this.toString()+ ".");
    }

    default void goHere(AbstractObject whoGoes, String achieveAction, String locationDescription) {
        System.out.println(whoGoes.toString() +" " + achieveAction + " " + this.toString()+ ", " + locationDescription + ".");
    }
}