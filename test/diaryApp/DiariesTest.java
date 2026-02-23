package diaryApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DiariesTest {
    Diaries diaries;

    @BeforeEach
    public void initialState(){diaries = new Diaries();}

    @Test
    public void testThatDiaryCanBeAddedToListOfDiaries(){
        diaries.add("folaissk", "123abc");
        Diary diary = diaries.findByUsername("folaissk");
        assertEquals("folaissk", diary.getUsername());
    }

    @Test
    public void testThatDiaryCanBeDeletedFromDiaries(){
        diaries.add("folaissk", "123abc");
        Diary diary = diaries.findByUsername("folaissk");
        assertEquals("folaissk", diary.getUsername());
        diaries.delete("folaissk", "123abc");
        assertThrows(IllegalArgumentException.class, ()-> diaries.findByUsername("folaissk"));
    }
}
