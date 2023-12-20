package enums;

public enum Actions {
    
    GET_DRESSED("убедился, что одежда просохла"),
    MAKE_SHURE("оделся"),
    SEE("увидел, что море образовало здесь обширный залив, на берегах которого уступами расположился красивейший город"),
    BE_CORRECT("оказались верными"),
    CARRY("нес его в сторону"),
    SEEM_TASTELESS("показались ему невкусными"),
    CHANGE("изменил свое направление"),
    CARRY_TO("понес его в сторону моря"),
    BE_STRONG("был особенно сильный"),
    GET_TO_THE_SEA("тащила обратно в море"),
    NEED("потребовался пончику"),
            RUN_ON("тянулась вдоль береговой линии"),
    FIT("помещались"),
    HAPPENED_BECAUSE("происходило из-за того, что в громоздком космическом скафандре он был крайне неповоротлив и не мог маневрировать в бурной морской воде с достаточной ловкостью");

    public static enum SHORTY {
        JUMP_OUT("выскочил из ракеты"),
        GET_OUT_OF_SEA("став в тот момент более обтекаемым и подвижным, ускользнул от бросавшихся на него волн и выскочил на сухой берег"),
        GET_TO_CAVE("добрался до пещеры"),
        SLIPPED("поскользнулся, как и Незнайка"),
        TAKE_A_RIDE("покатился на животе по наклонной плоскости"),
        NOTICE("заметил, что выскочил из колодца и летит на страшной высоте с раскрывшимся парашютом над каким-то приморским городом"),
        GO_DOWN("постепенно снижался"),
        GREATLY_GO_DOWN("значительно снизился"),
        FLY_TO("подлетел к городу Лос-Паганосу"),
        SAW("видел, что купания ему не миновать"),
        NOT_BE_SCARED("не боялся утонуть, так как был толстенький, а толстенькие коротышки, как известно, в воде не тонут"),
        BE_SCARED("боялся, как бы его не укусила акула"),
        FLIP_INTO_WATER("шлепнулся в воду"),
        SWIM("принялся работать руками и ногами и спустя час уже был у берега"),
        DOCK("никак не удавалось пришвартоваться к берегу"),
        FEEL_BOTTOM("ощущал под собой дно"),
        TRY_TO_STAND("пытался встать на ноги"),
        FLY("пролетел над приморскими городами Лос-Свиносом и Лос-Кабаносом"),
        RELAX("принялся отдыхать"),
        NO_SLEEP("решил не спать"),
        EXPLORE("принялся изучать окружавшую местность"),
        INSPECT("осмотрел внимательно несколько камней"),
        REALIZE("убедился, что перед ним вовсе не лед и не стекло, а кристаллы обыкновенной поваренной соли"),
        CHOOSE("выбрал пару кристаллов покрупней"),
        GRIND("положил между ними несколько кристаллов помельче и принялся их толочь"),
        STOP("остановился у небольшого здания, над входом в которое было написано: \"Пищезаправочная станция\""),
        CONFUSED("был смущен афишей"),
        REMEMBER("вспомнил о Незнайке");

        private String name;

        private SHORTY(String name) {
        this.name = name;
        }

        public String getName()
        {
            return name;
        }
        }

    private String name;

    private Actions(String name) {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
}
