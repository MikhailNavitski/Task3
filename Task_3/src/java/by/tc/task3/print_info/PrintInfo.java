package by.tc.task3.print_info;

import by.tc.task3.entity.Node;

public class PrintInfo {// ни этого пакета, на этого класса в данной библиотеке быть не должно
    // только в виде какого-нибудь исключения
    // так как ты не знаешь, куда и как и где будут использоваться результаты работы твоей библиотеки
    private final static PrintInfo instance = new PrintInfo();

    public static PrintInfo getInstance() {
        return instance;
    }

    private PrintInfo(){

    }
    public  void printInformation(Node node){
        System.out.println("-----------------");
        System.out.println("Имя : "+ node.getName());
        System.out.println("Тип : "+ node.getType());
    }
}
