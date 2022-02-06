package model;

public class Request {

    private String title;
    private String totalResults;
    private String searchTerms;
    private int count;
    private int startIndex;

    public Request() {
        this.title = null;
        this.totalResults = null;
        this.searchTerms = null;
        this.count = 0;
        this.startIndex = 0;
    }

    public Request(String title, String totalResults, String searchTerms, int count, int startIndex) {
        this.title = title;
        this.totalResults = totalResults;
        this.searchTerms = searchTerms;
        this.count = count;
        this.startIndex = startIndex;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public String getSearchTerms() {
        return searchTerms;
    }

    public void setSearchTerms(String searchTerms) {
        this.searchTerms = searchTerms;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    @Override
    public String toString() {
        return "Anfrage \"" + title + '\"' + " mit Suchbegriff \"" + searchTerms + "\" ergab " + totalResults +
                " Treffer." + System.getProperty("line.separator") +
                "Hier sehen Sie die " + startIndex + ". " + count + " Treffer:" + System.getProperty("line.separator");
    }
}
