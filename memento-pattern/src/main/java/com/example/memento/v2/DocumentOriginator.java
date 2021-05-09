package com.example.memento.v2;

public class DocumentOriginator {

    private String content;
    private String fontName;
    private double fontSize;

    public DocumentMemento createState() {
        return new DocumentMemento(content, fontName, fontSize);
    }

    public void restore(DocumentMemento documentMemento) {
        this.content = documentMemento.getContent();
        this.fontName = documentMemento.getFontName();
        this.fontSize = documentMemento.getFontSize();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public double getFontSize() {
        return fontSize;
    }

    public void setFontSize(double fontSize) {
        this.fontSize = fontSize;
    }

    @Override
    public String toString() {
        return "DocumentOriginator{" +
                "content='" + content + '\'' +
                ", fontName='" + fontName + '\'' +
                ", fontSize=" + fontSize +
                '}';
    }
}
