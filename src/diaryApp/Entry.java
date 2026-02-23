package diaryApp;

import java.time.LocalDate;

public class Entry {
    private int id;
    private String title;
    private String body;
    private LocalDate dateCreated;

    public Entry(int id, String title, String body) {
        this.title = title;
        this.body = body;
        this.id += id;
        this.dateCreated = LocalDate.now();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }
}
