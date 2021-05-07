package com.rorschach.pattern.memento.editor;

/**
 * @author Rorschach
 * @date 2021-4-24 18:44
 */
public class Test {

    public static void main(String[] args) {
        // 草稿箱
        DraftsBox draftsBox = new DraftsBox();

        // 编辑器
        Editor editor = new Editor(
                "测试标题",
                "测试文本内容",
                "test.jpg");

        // 保存当前版本
        ArticleMemento articleMemento = editor.saveToMemento();
        draftsBox.addMemento(articleMemento);

        System.out.println("当前草稿内容: " + articleMemento.toString());
        System.out.println("当前编辑内容: " + editor);

        System.out.println(">>>>> 更改");

        editor.setTitle("更改标题测试");
        editor.setContent("更改文本测试");
        editor.setImg("change.jpg");

        System.out.println("当前编辑内容: " + editor);
        System.out.println("当前草稿内容: " + articleMemento);

        articleMemento = editor.saveToMemento();
        draftsBox.addMemento(articleMemento);
        System.out.println("当前草稿内容: " + articleMemento);

        System.out.println(">>>>> 二次更改");
        editor.setTitle("二次更改标题测试");
        editor.setContent("二次更改文本测试");
        editor.setImg("二次change.jpg");

        System.out.println("当前编辑内容: " + editor);
        System.out.println("当前草稿内容: " + articleMemento);
        articleMemento = editor.saveToMemento();
        draftsBox.addMemento(articleMemento);
        System.out.println("当前草稿内容: " + articleMemento);

        System.out.println(">>>>> 回退");
        // 回退
        articleMemento = draftsBox.getMemento();
        editor.undoFromMemento(articleMemento);
        System.out.println("当前编辑内容: " + editor);
        System.out.println("当前草稿内容: " + articleMemento);

        System.out.println(">>>>> 回退");
        // 回退
        articleMemento = draftsBox.getMemento();
        editor.undoFromMemento(articleMemento);

        System.out.println("当前编辑内容: " + editor);
        System.out.println("当前草稿内容: " + articleMemento);
    }
}
