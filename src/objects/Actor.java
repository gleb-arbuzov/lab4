package objects;

import java.util.ArrayList;

import enums.ActionTime;
import enums.Actions;
import enums.Where;
import exceptions.UnallowedActionException;
import exceptions.WrongNameException;
import interfaces.CanDoActions;

public class Actor extends AbstractObject implements CanDoActions{

    private ArrayList<Actions> allowedActions = new ArrayList<>();
    
    public Actor(String name) {
        super(name);
    }
    public Actor(String name, String description)
    {
        super(name);
        System.out.println(name + " - " + description + ".");
    }

    @Override
    public void doAction(Actions action) {
        if (!allowedActions.contains(action)) throw new UnallowedActionException(action, this);
        System.out.println(this.toString() + " " + action.getName() + ".");
    }

    public void addActions(Actions... actions) {
        for (var action : actions) {
            allowedActions.add(action);
        }
    }

    public static class Shorty extends AbstractObject{
        public Shorty(String name) throws WrongNameException { 
            super(name);
            if (name.toUpperCase().charAt(0) != name.charAt(0)) throw new WrongNameException();
         }

        public void think(boolean isAboutMoney) {
            class Thought {
                private static String rememberNeznaika = "Наверно, Незнайка вернулся бы в ракету, если бы не обнаружил где-нибудь продуктов питания,\nа поскольку он не вернулся, значит, продукты питания где-то найдены, а раз это так, то мне нет никакого смысла сидеть в ракете,\nа необходимо отправиться на поиски Незнайки";
                private static String money = "Может быть, эти бумажонки с кружочками и есть деньги?";
                private static String rememberNeznaika() { return rememberNeznaika; }
                private static String thinkAboutMoney() { return money; }
            }
            if (isAboutMoney) System.out.println(this.toString() + " подумал: \"" + Thought.thinkAboutMoney() + "\".");
            else System.out.println(this.toString() + " подумал: \"" + Thought.rememberNeznaika() + "\".");
        }

        public void doAction(Actions.SHORTY action) {
            System.out.println(this.toString() + " " + action.getName() + ".");
        }
        public void doAction(Actions.SHORTY action, ActionTime actionTime) {
            System.out.println(actionTime.getValue() + " " + this.toString() + " " + action.getName() + ".");
        }
        public void doAction(Actions.SHORTY action, Where where) {
        System.out.println(where.getName() + " " + this.toString() + " " + action.getName() + ".");
        }
    }
}
