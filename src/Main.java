import enums.ActionTime;
import enums.Actions;
import enums.HowMuch;
import enums.Where;
import exceptions.WrongNameException;
import interfaces.Wearable;
import objects.AchievableLocation;
import objects.Actor;
import objects.GettableObject;
import objects.Storage;

public class Main
{
    public static void main(String[] args) throws WrongNameException  {
        tellStory();
        
    }

    public static void tellStory() throws WrongNameException {
        class StoryTeller {
            static Actor.Shorty shorty;
            static Actor seeds;
            static Wearable spaceSuit;
            static Wearable boots;
            static AchievableLocation cave;
            static AchievableLocation grotto;
            static AchievableLocation tunnel;
            static AchievableLocation pit;
            static Actor wind;
            static Actor surf;
            static Actor thisOne;
            static Actor wave;
            static Actor relax;
            static Actor street;
            static Actor manyShopsAnsStuff;
            static Actor poster;

            private static void initialize() throws WrongNameException {
                shorty = new Actor.Shorty("Пончик");
                seeds = new Actor("Семена");
                spaceSuit = new Wearable() {
                    @Override
                    public String toString() { return "космический скафандр"; }
                };
                boots = new Wearable() {
                    @Override
                    public String toString() { return "новые, подходящие по размеру космические сапоги";}
                };
                cave = new AchievableLocation("уже известная ему пещера");
                grotto = new AchievableLocation("сосучлен рот");
                tunnel = new AchievableLocation("тонель с ледяным дном");
                pit = new AchievableLocation("подлунный колодец");
                wind = new Actor("Сильный ветер");
                surf = new Actor("прибой");
                thisOne = new Actor("Это");
                wave = new Actor("волна");
                relax = new Actor("Отдых");
                street = new Actor("Самая большая и самая красивая улица Лос-Паганоса");
                manyShopsAnsStuff = new Actor("многочисленные магазины, рестораны, столовые, закусочные, гостиницы");
            }

            private static void addActions() {
                seeds.addActions(Actions.SEEM_TASTELESS);
                wind.addActions(Actions.CARRY,Actions.CARRY_TO,Actions.CHANGE);
                surf.addActions(Actions.BE_STRONG);
                thisOne.addActions(Actions.HAPPENED_BECAUSE);
                wave.addActions(Actions.GET_TO_THE_SEA);
                relax.addActions(Actions.NEED);
                street.addActions(Actions.RUN_ON);
                manyShopsAnsStuff.addActions(Actions.FIT);
            }

            public static void createStory() throws WrongNameException {
                initialize();
                addActions();
                seeds.addActions(Actions.SEEM_TASTELESS);
                seeds.doAction(Actions.SEEM_TASTELESS);
                shorty.think(false);
                spaceSuit.putOn(shorty, "натянул на себя");
                boots.putOn(shorty, "подобрал");
                shorty.doAction(Actions.SHORTY.JUMP_OUT);
                cave.goHere(shorty, "поскакал во весь опор к");
                shorty.doAction(Actions.SHORTY.GET_TO_CAVE);
                grotto.goHere(shorty, "спустился в");
                tunnel.goHere(shorty, "спустился");
                shorty.doAction(Actions.SHORTY.SLIPPED, Where.HERE);
                shorty.doAction(Actions.SHORTY.TAKE_A_RIDE);
                pit.goHere(shorty, "полетел в");
                shorty.doAction(Actions.SHORTY.NOTICE, ActionTime.AFTER_TIME);
                wind.doAction(Actions.CARRY);
                shorty.doAction(Actions.SHORTY.GO_DOWN);
                shorty.doAction(Actions.SHORTY.FLY);
                shorty.doAction(Actions.SHORTY.GREATLY_GO_DOWN, ActionTime.ALREADY);
                shorty.doAction(Actions.SHORTY.FLY_TO);
                wind.doAction(Actions.CHANGE);
                wind.doAction(Actions.CARRY_TO);
                shorty.doAction(Actions.SHORTY.SAW);
                shorty.doAction(Actions.SHORTY.NOT_BE_SCARED);
                shorty.doAction(Actions.SHORTY.BE_SCARED);
                shorty.doAction(Actions.SHORTY.FLIP_INTO_WATER);
                shorty.doAction(Actions.SHORTY.SWIM,ActionTime.THATTIME);
                surf.doAction(Actions.BE_STRONG, ActionTime.THIS_DAY);
                shorty.doAction(Actions.SHORTY.DOCK);
                thisOne.doAction(Actions.HAPPENED_BECAUSE);
                shorty.doAction(Actions.SHORTY.FEEL_BOTTOM, ActionTime.JUST_WHEN);
                shorty.doAction(Actions.SHORTY.TRY_TO_STAND, ActionTime.JUST_WHEN);
                wave.doAction(Actions.GET_TO_THE_SEA);
                spaceSuit.tekeOf(shorty, "сбросил с себя");
                boots.tekeOf(shorty, "сбросил с себя");
                shorty.doAction(Actions.SHORTY.GET_OUT_OF_SEA);
                relax.doAction(Actions.NEED);
                shorty.doAction(Actions.SHORTY.RELAX);
                shorty.doAction(Actions.SHORTY.NO_SLEEP);
                shorty.doAction(Actions.SHORTY.EXPLORE);
                shorty.doAction(Actions.SHORTY.INSPECT);
                shorty.doAction(Actions.SHORTY.REALIZE);
                shorty.doAction(Actions.SHORTY.CHOOSE);
                shorty.doAction(Actions.SHORTY.GRIND);
                tellOldStory();
                street.doAction(Actions.RUN_ON);
                manyShopsAnsStuff.doAction(Actions.FIT, Where.IN_HOUSES);
                shorty.doAction(Actions.SHORTY.STOP);
                shorty.doAction(Actions.SHORTY.CONFUSED);
                poster = new Actor("Афиша", "ДОБРО ПОЖАЛОВАТЬ! Кормим вкусно! Сегодня за деньги, завтра в долг");
                shorty.think(true);
            }
        }

        StoryTeller.createStory();
    }


    private static void tellOldStory()
    {
        Actor shorty = new Actor("Пончик", "коротышка практический, не привыкший расставаться с тем, что попадается в руки");
        shorty.addActions(Actions.MAKE_SHURE, Actions.GET_DRESSED,Actions.SEE);
        GettableObject salt = new GettableObject("Соль");
        salt.get(shorty, "натолок", HowMuch.MORE);
        Storage pockets = new Storage("карманы курточки");
        pockets.store(shorty, "набил", salt);
        shorty.doAction(Actions.MAKE_SHURE);
        shorty.doAction(Actions.GET_DRESSED);
        AchievableLocation hill = new AchievableLocation("сторона холма");
        hill.goHere(shorty,"зашагал вдоль", "где, по его расчетам, должен был находиться город, который он видел, когда спускался на парашюте");
        Actor calculations = new Actor("Рассчеты");
        calculations.addActions(Actions.BE_CORRECT);
        calculations.doAction(Actions.BE_CORRECT);
        AchievableLocation hillEdge = new AchievableLocation("края холмов");
        hillEdge.goHere(shorty, "дошел до");
        shorty.doAction(Actions.SEE);
        Actor losPoganos = new Actor("Город Лос Поганос", "в который съезжались богачи из всех других городов, так как здесь был отличнейший климат и можно было прекрасно повеселиться");
   }
    // Actor seeds = new Actor("Семена");
    //     seeds.addActions(Actions.SEEM_TASTELESS);
    //     seeds.doAction(Actions.SEEM_TASTELESS);
    //     ThinkingActor shorty = new ThinkingActor("Пончик");
    //     shorty.addActions(Actions.REMEMBER,Actions.JUMP_OUT,Actions.GET_TO_CAVE,Actions.SLIPPED,Actions.TAKE_A_RIDE,Actions.NOTICE,Actions.GO_DOWN,Actions.FLY,Actions.GREATLY_GO_DOWN,Actions.FLY_TO,Actions.SAW,Actions.NOT_BE_SCARED,Actions.BE_SCARED,Actions.FLIP_INTO_WATER,Actions.SWIM,Actions.DOCK);                                       //
    //     shorty.doAction(Actions.REMEMBER, ActionTime.THEN, Introductories.AGAIN);
    //     ThinkingActor.Thought thought = new ThinkingActor.Thought();
    //     thought.addThought("Наверно, Незнайка вернулся бы в ракету, если бы не обнаружил где-нибудь продуктов питания,\nа поскольку он не вернулся, значит, продукты питания где-то найдены, а раз это так, то мне нет никакого смысла сидеть в ракете,\nа необходимо отправиться на поиски Незнайки");
    //     shorty.think("подумал", thought);
    //     Clothes spaceSuit = new Clothes("космический скафандр");
    //     spaceSuit.putOn(shorty, "натянул на себя");
    //     Clothes boots = new Clothes("новые, подходящие по размеру космические сапоги");
    //     boots.putOn(shorty, "подобрал");
    //     shorty.doAction(Actions.JUMP_OUT);
    //     AchievableLocation cave = new AchievableLocation("уже известная ему пещера");
    //     cave.goHere(shorty, "поскакал во весь опор к");
    //     shorty.doAction(Actions.GET_TO_CAVE);
    //     AchievableLocation grotto = new AchievableLocation("сосульчатый грот");
    //     AchievableLocation tunnel = new AchievableLocation("тонель с ледяным дном");
    //     grotto.goHere(shorty, "спустился в");
    //     tunnel.goHere(shorty, "спустился");
    //     shorty.doAction(Actions.SLIPPED, Where.HERE);
    //     shorty.doAction(Actions.TAKE_A_RIDE);
    //     AchievableLocation pit = new AchievableLocation("подлунный колодец");
    //     pit.goHere(shorty, "полетел в");
    //     shorty.doAction(Actions.NOTICE, ActionTime.AFTER_TIME);
    //     Actor wind = new Actor("Сильный ветер");
    //     wind.addActions(Actions.CARRY,Actions.CARRY_TO,Actions.CHANGE);
    //     wind.doAction(Actions.CARRY);
    //     shorty.doAction(Actions.GO_DOWN);
    //     shorty.doAction(Actions.FLY);
    //     shorty.doAction(Actions.GREATLY_GO_DOWN, ActionTime.ALREADY);
    //     shorty.doAction(Actions.FLY_TO);
    //     wind.doAction(Actions.CHANGE);
    //     wind.doAction(Actions.CARRY_TO);
    //     shorty.doAction(Actions.SAW);
    //     shorty.doAction(Actions.NOT_BE_SCARED);
    //     shorty.doAction(Actions.BE_SCARED);
    //     shorty.doAction(Actions.FLIP_INTO_WATER);
    //     shorty.doAction(Actions.SWIM,ActionTime.THATTIME);
    //     Actor surf = new Actor("прибой");
    //     surf.addActions(Actions.BE_STRONG);
    //     surf.doAction(Actions.BE_STRONG, ActionTime.THIS_DAY);
    //     shorty.doAction(Actions.DOCK);
    //     Actor thisOne = new Actor("Это");
    //     thisOne.addActions(Actions.HAPPENED_BECAUSE);
    //     thisOne.doAction(Actions.HAPPENED_BECAUSE);

    // Actor.Shorty shorty = new Actor("").shorty;
    //     Actor seeds = new Actor("Семена");
    //     seeds.addActions(Actions.SEEM_TASTELESS);
    //     seeds.doAction(Actions.SEEM_TASTELESS);
    //     shorty.think(false);
    //     Wearable spaceSuit = new Wearable() {
    //         @Override
    //         public String toString() { return "космический скафандр"; }
    //     };
    //     spaceSuit.putOn(shorty, "натянул на себя");
    //     Wearable boots = new Wearable() {
    //         @Override
    //         public String toString() { return "новые, подходящие по размеру космические сапоги";}
    //     };
    //     boots.putOn(shorty, "подобрал");
    //     shorty.doAction(Actions.SHORTY.JUMP_OUT);
    //     AchievableLocation cave = new AchievableLocation("уже известная ему пещера");
    //     cave.goHere(shorty, "поскакал во весь опор к");
    //     shorty.doAction(Actions.SHORTY.GET_TO_CAVE);
    //     AchievableLocation grotto = new AchievableLocation("сосульчатый грот");
    //     AchievableLocation tunnel = new AchievableLocation("тонель с ледяным дном");
    //     grotto.goHere(shorty, "спустился в");
    //     tunnel.goHere(shorty, "спустился");
    //     shorty.doAction(Actions.SHORTY.SLIPPED, Where.HERE);
    //     shorty.doAction(Actions.SHORTY.TAKE_A_RIDE);
    //     AchievableLocation pit = new AchievableLocation("подлунный колодец");
    //     pit.goHere(shorty, "полетел в");
    //     shorty.doAction(Actions.SHORTY.NOTICE, ActionTime.AFTER_TIME);
    //     Actor wind = new Actor("Сильный ветер");
    //     wind.addActions(Actions.CARRY,Actions.CARRY_TO,Actions.CHANGE);
    //     wind.doAction(Actions.CARRY);
    //     shorty.doAction(Actions.SHORTY.GO_DOWN);
    //     shorty.doAction(Actions.SHORTY.FLY);
    //     shorty.doAction(Actions.SHORTY.GREATLY_GO_DOWN, ActionTime.ALREADY);
    //     shorty.doAction(Actions.SHORTY.FLY_TO);
    //     wind.doAction(Actions.CHANGE);
    //     wind.doAction(Actions.CARRY_TO);
    //     shorty.doAction(Actions.SHORTY.SAW);
    //     shorty.doAction(Actions.SHORTY.NOT_BE_SCARED);
    //     shorty.doAction(Actions.SHORTY.BE_SCARED);
    //     shorty.doAction(Actions.SHORTY.FLIP_INTO_WATER);
    //     shorty.doAction(Actions.SHORTY.SWIM,ActionTime.THATTIME);
    //     Actor surf = new Actor("прибой");
    //     surf.addActions(Actions.BE_STRONG);
    //     surf.doAction(Actions.BE_STRONG, ActionTime.THIS_DAY);
    //     shorty.doAction(Actions.SHORTY.DOCK);
    //     Actor thisOne = new Actor("Это");
    //     thisOne.addActions(Actions.HAPPENED_BECAUSE);
    //     thisOne.doAction(Actions.HAPPENED_BECAUSE);
    //     shorty.doAction(Actions.SHORTY.FEEL_BOTTOM, ActionTime.JUST_WHEN);
    //     shorty.doAction(Actions.SHORTY.TRY_TO_STAND, ActionTime.JUST_WHEN);
    //     Actor wave = new Actor("волна");
    //     wave.addActions(Actions.GET_TO_THE_SEA);
    //     wave.doAction(Actions.GET_TO_THE_SEA);
    //     spaceSuit.tekeOf(shorty, "сбросил с себя");
    //     boots.tekeOf(shorty, "сбросил с себя");
    //     shorty.doAction(Actions.SHORTY.GET_OUT_OF_SEA);
    //     Actor relax = new Actor("Отдых");
    //     relax.addActions(Actions.NEED);
    //     relax.doAction(Actions.NEED);
    //     shorty.doAction(Actions.SHORTY.RELAX);
    //     shorty.doAction(Actions.SHORTY.NO_SLEEP);
    //     shorty.doAction(Actions.SHORTY.EXPLORE);
    //     shorty.doAction(Actions.SHORTY.INSPECT);
    //     shorty.doAction(Actions.SHORTY.REALIZE);
    //     shorty.doAction(Actions.SHORTY.CHOOSE);
    //     shorty.doAction(Actions.SHORTY.GRIND);
    //     Actor street = new Actor("Самая большая и самая красивая улица Лос-Паганоса");
    //     street.addActions(Actions.RUN_ON);
    //     tellOldStory();
    //     street.doAction(Actions.RUN_ON);
    //     Actor manyShopsAnsStuff = new Actor("многочисленные магазины, рестораны, столовые, закусочные, гостиницы");
    //     manyShopsAnsStuff.addActions(Actions.FIT);
    //     manyShopsAnsStuff.doAction(Actions.FIT, Where.IN_HOUSES);
    //     shorty.doAction(Actions.SHORTY.STOP);
    //     shorty.doAction(Actions.SHORTY.CONFUSED);
    //     Actor poster = new Actor("Афиша", "ДОБРО ПОЖАЛОВАТЬ! Кормим вкусно! Сегодня за деньги, завтра в долг");
    //     shorty.think(true);
}
