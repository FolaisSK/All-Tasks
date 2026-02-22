package diaries;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    private String username;
    private String password;
    private boolean isLocked;
    private List<Entry> entries;
    private int entryId;

    public Diary(String username, String password){
        validatePasswordLength(password);
        this.username = username;
        this.password = password;
        this.isLocked = true;
        this.entries = new ArrayList<>();
    }
    public boolean isLocked() {
        return isLocked;
    }

    public void unlockDiary(String password) {
        checkIsUnlocked();
        validatePassword(password);
        isLocked = false;
    }

    public void lockDiary() {
        checkStatus();
        isLocked = true;
    }

    public void createEntry(String title, String body) {
        checkStatus();
        Entry entry = new Entry(++entryId,title, body);
        entries.add(entry);
        System.out.println("Entry ID: " + entry.getId());
    }

    public Entry findEntryById(int id) {
        checkStatus();
        validateEntryId(id);
        for(Entry entry : entries){
            if (entry.getId() == id) return entry;
        }
        throw new IllegalArgumentException("Entry not found");
    }

    public void deleteEntry(int id){
        checkStatus();
        validateEntryId(id);
        entries.remove(findEntryById(id));
    }

    public void updateEntry(int id, String newTitle, String newBody) {
        checkStatus();
        validateEntryId(id);
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

    private void validatePassword(String password){
        if (!password.equals(this.password)) throw new IllegalArgumentException("Invalid Password");
    }

    private void validatePasswordLength(String password){
        if(password.length() < 4) throw new IllegalArgumentException("Password must be minimum 4 charaters");
    }

    private void validateEntryId(int id){
        if(id < 1) throw new IllegalArgumentException("Entry ID cannot be negative number!!");
    }

    private void checkStatus(){
        if(isLocked()) throw new IllegalArgumentException("Diary is Locked!!");
    }

    private void checkIsUnlocked(){
        if(!isLocked()) throw new IllegalArgumentException("Diary is open!!");
    }
}
