package com.rorschach.pattern.memento.editor;

/**
 * @author Rorschach
 * @date 2021-4-24 18:25
 */
public class Editor {

    private String title;

    private String content;

    private String img;

    public Editor(String title, String content, String img) {
        this.title = title;
        this.content = content;
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public ArticleMemento saveToMemento() {
        return new ArticleMemento(this.title, this.content, this.img);
    }

    public void undoFromMemento(ArticleMemento memento) {
        this.title = memento.getTitle();
        this.content = memento.getContent();
        this.img = memento.getImg();
    }

    @Override
    public String toString() {
        return "Editor{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", img='" + img + '\'' +
                '}';
    }
}
