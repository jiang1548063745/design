package com.rorschach.pattern.composite.demo.safe;

/**
 * @author Rorschach
 * @date 2021-4-15 21:32
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("======安全模式写法======");

        File qq = new File("QQ.exe");
        File weChat = new File("WeChat.exe");

        Folder office = new Folder("办公软件", 2);

        File word = new File("Word.exe");
        File powerPoint = new File("PowerPoint.exe");
        File excel = new File("Excel.exe");

        office.add(word);
        office.add(powerPoint);
        office.add(excel);

        Folder root = new Folder("D://", 1);
        root.add(office);
        root.add(weChat);
        root.add(qq);

        System.out.println(">>>>>>>>>>> Show()");
        root.show();

        System.out.println(">>>>>>>>>>> List()");
        root.list();
    }
}
