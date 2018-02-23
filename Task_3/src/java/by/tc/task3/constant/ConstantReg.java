package by.tc.task3.constant;

public final class ConstantReg {//не жалей символов на имена - Reg - может быть понята как регистрация
    public final static String REG_OPEN = "<[^>]+>";
    public final static String REG_CLOSE = "[a-zA-Z 0-9 _,.+=^&*%$#@!]+>";
    public final static String REG_ENTITY = "([\\S \\n]+</)";
    public final static String REG_META = "<\\?xml version=\"1.0\" encoding=\"UTF-8\"\\?>||<\\?xml version=\"1.0\"\\?>";
    
    // конструктор у этого класса д.б. final
}
