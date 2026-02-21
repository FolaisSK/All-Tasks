package diaries;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    Diary diary;

    @BeforeEach
    public void initialState(){diary = new Diary("folaissk", "abc123");}

    @Test
    public void testThatDiaryCanBeUnlocked(){
        assertTrue(diary.isLocked());
        diary.unlockDiary("abc123");
        assertFalse(diary.isLocked());
    }

    @Test
    public void testThatDiaryCanBeLockedAfterBeingUnlocked(){
        assertTrue(diary.isLocked());
        diary.unlockDiary("abc123");
        assertFalse(diary.isLocked());
        diary.lockDiary();
        assertTrue(diary.isLocked());
    }

    @Test
    public void testThatDiaryCannotBeUnlockedWithWrongPassword(){
        assertTrue(diary.isLocked());
        assertThrows(IllegalArgumentException.class, () ->diary.unlockDiary("23def"));
    }

    @Test
    public void testThatAnEntryCanBeCreated(){
        assertTrue(diary.isLocked());
        diary.unlockDiary("abc123");
        assertFalse(diary.isLocked());
        diary.createEntry("The Flash", "A story about a man who was struck by lightning, and became the fastest man alive");
        Entry entry = diary.findEntryById(1);
        assertEquals("The Flash", entry.getTitle());
    }

    @Test
    public void testThatAnEntryCreatedCanBeDeleted(){
        assertTrue(diary.isLocked());
        diary.unlockDiary("abc123");
        assertFalse(diary.isLocked());
        diary.createEntry("The Flash", "A story about a man who was struck by lightning, and became the fastest man alive");
        Entry entry = diary.findEntryById(1);
        assertEquals("The Flash", entry.getTitle());
        diary.deleteEntry(1);
        assertThrows(IllegalArgumentException.class, ()-> diary.findEntryById(1));
    }

    @Test
    public void testThatAnEntryCanBeUpdated(){
        assertTrue(diary.isLocked());
        diary.unlockDiary("abc123");
        assertFalse(diary.isLocked());
        diary.createEntry("The Flash", "A story about a man who was struck by lightning, and became the fastest man alive");
        Entry entry = diary.findEntryById(1);
        assertEquals("The Flash", entry.getTitle());
        diary.updateEntry(1, "Martin Luther King", "Patriotism at it's finest, racism at it's worst");
        assertEquals("Martin Luther King", entry.getTitle());
    }
}
