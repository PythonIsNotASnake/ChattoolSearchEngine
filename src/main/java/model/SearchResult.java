package model;

import java.util.ArrayList;
import java.util.List;

public class SearchResult {
    private Request request;
    private List<Item> items;

    public SearchResult() {
        request = new Request();
        items = new ArrayList<Item>();
    }

    public SearchResult(Request request, List<Item> items) {
        this.request = request;
        this.items = items;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        String str = "";
        str = str + request.toString() + System.getProperty("line.separator");

        for (int i = 0; i < items.size(); i++) {
            str = str + items.get(i).toString() + System.getProperty("line.separator");
        }

        return str;
    }
}
