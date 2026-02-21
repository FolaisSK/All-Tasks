package diaries;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    private String username;
    private String password;
    private boolean isLocked;
    private List<Entry> entries;

    public Diary(String username, String password){
        this.username = username;
        this.password = password;
        this.isLocked = true;
        this.entries = new ArrayList<>();
    }
    public boolean isLocked() {
        return isLocked;
    }

    public void unlockDiary(String password) {
        validatePassword(password);
        isLocked = false;
    }

    public void lockDiary() {
        isLocked = true;
    }

    private void validatePassword(String password){
        if (!password.equals(this.password)) throw new IllegalArgumentException("Invalid Password");
    }

    public void createEntry(String title, String body) {
        Entry entry = new Entry(title, body);
        entries.add(entry);
    }

    public Entry findEntryById(int id) {
        for(Entry entry : entries){
            if (entry.getId() == id) return entry;
        }
        throw new IllegalArgumentException("Entry not found");
    }

    public void deleteEntry(int id){
        entries.remove(findEntryById(id));
    }

    public void updateEntry(int id, String newTitle, String newBody) {
        Entry story = findEntryById(id);
        story.setTitle(newTitle);
        story.setBody(newBody);
    }

    public String getUsername() {
        return this.username;
    }

    public boolean peepPassword(String password) {
        if(password.equals(this.password)) return true;
        return false;
    }
}
