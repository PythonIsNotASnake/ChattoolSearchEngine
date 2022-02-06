package model;

public class Item {
    private String title;
    private String htmlTitle;
    private String link;

    public Item() {
        this.title = null;
        this.htmlTitle = null;
        this.link = null;
    }

    public Item(String title, String htmlTitle, String link) {
        this.title = title;
        this.htmlTitle = htmlTitle;
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHtmlTitle() {
        return htmlTitle;
    }

    public void setHtmlTitle(String htmlTitle) {
        this.htmlTitle = htmlTitle;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return title + System.getProperty("line.separator") + link + System.getProperty("line.separator");
    }
}
