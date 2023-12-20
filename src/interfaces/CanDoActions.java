package interfaces;

import enums.Actions;
import enums.Introductories;
import enums.Where;
import enums.ActionTime;

public interface CanDoActions {
    default void doAction(Actions action) {
        System.out.println(this.toString() + " " + action.getName() + ".");
    }
    default void doAction(Actions action, ActionTime actionTime) {
        System.out.println(actionTime.getValue() + " " + this.toString() + " " + action.getName() + ".");
    }
    default void doAction(Actions action, ActionTime actionTime, Introductories indtoductoryWord) {
        System.out.println(actionTime.getValue() + " " + this.toString() + " " + indtoductoryWord.getName() + " " + action.getName() + ".");
    }
    default void doAction(Actions action, Where where) {
        System.out.println(where.getName() + " " + this.toString() + " " + action.getName() + ".");
    }
}
