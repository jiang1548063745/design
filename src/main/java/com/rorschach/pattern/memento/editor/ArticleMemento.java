package com.rorschach.pattern.memento.editor;

/**
 * @author Rorschach
 * @date 2021-4-24 18:30
 */
public class ArticleMemento {

    private String title;

    private String content;

    private String img;

    public ArticleMemento(String title, String content, String img) {
        this.title = title;
        this.content = content;
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getImg() {
        return img;
    }

    @Override
    public String toString() {
        return "ArticleMemento{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", img='" + img + '\'' +
                '}';
    }
}
