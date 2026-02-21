package diaries;

import java.util.Scanner;

public class MainApplication {
    private static Diaries diaries;

    static void main() {
        diaries = new Diaries();
        displayMainMenu();
    }

    private static void displayMainMenu() {
        String mainMenu = """
                WELCOME TO SK DIARY APP
                1-> Create Diary
                2-> Find Diary
                3-> Delete Diary
                4-> Exit
                """;
        char response = input(mainMenu).charAt(0);
        switch (response){
            case '1' -> createDiary();
            case '2' -> findDiary();
            case '3' -> deleteDiary();
            case '4' -> exit();
            default -> defaultMainMenuResponse();
        }
    }

    private static void exit() {
        print("Thank you for banking with SK LTD!!");
        System.exit(0);
    }

    private static void deleteDiary() {
        String username = input("Enter your username: ");
        String password = input("Enter your password");
        try{
            diaries.findByUsername(username);
            diaries.delete(username, password);
            print("Diary Deleted!!!");
        }catch (Exception ex){
            print(ex.getMessage());
        }finally {
            displayMainMenu();
        }
    }

    private static void findDiary() {
        String username = input("Enter your username: ");
        Diary diary = diaries.findByUsername(username);
        displayDiaryMenu(diary);
    }

    private static void displayDiaryMenu(Diary diary) {
        String diaryMenu = """
                WELCOME TO SK DIARY APP
                1-> Unlock Diary
                2-> Lock Diary
                3-> Create Entry
                4-> Update Entry
                5-> Delete Entry
                6-> Return To Main Menu
                """;
        char response = input(diaryMenu).charAt(0);
        switch (response){
            case '1' -> unlockDiary(diary);
            case '2' -> lockDiary(diary);
            case '3' -> createEntry(diary);
            case '4' -> updateEntry(diary);
            case '5' -> deleteEntry(diary);
            case '6' -> displayMainMenu();
            default -> defaultResponse(diary);
        }
    }

    private static void defaultResponse(Diary diary) {
        print("Invalid Option!!");
        displayDiaryMenu(diary);
    }

    private static void defaultMainMenuResponse() {
        print("Invalid Option!");
        displayMainMenu();
    }

    private static void deleteEntry(Diary diary) {
        try{
        int id = Integer.parseInt(input("Enter Entry ID: "));
        diary.deleteEntry(id);
        print("Entry Deleted Successfully!!!");
        }catch (Exception ex){
            print(ex.getMessage());
        }finally {
            displayDiaryMenu(diary);
        }
    }

    private static void updateEntry(Diary diary) {
        int id = Integer.parseInt(input("Enter Entry ID: "));
        String newTitle = input("Enter New Title: ");
        String newBody = input("Enter New Body");
        try{
            diary.updateEntry(id, newTitle, newBody);
            print("Entry Updated Successfully!!!");
        }catch (Exception ex){
            print(ex.getMessage());
        }finally {
            displayDiaryMenu(diary);
        }
    }

    private static void createEntry(Diary diary) {
        String title = input("Enter Title of Entry: ");
        String body = input("Enter Body of Entry: ");
        try {
            diary.createEntry(title,body);
            print("Entry Recorded Successfully!!!");
        } catch (Exception ex) {
            print(ex.getMessage());
        }finally {
            displayDiaryMenu(diary);
        }
    }

    private static void lockDiary(Diary diary) {
        try{
        diary.lockDiary();
        print("Diary Locked!!");
        }catch (Exception ex){
            print(ex.getMessage());
        }finally {
            displayDiaryMenu(diary);
        }
    }

    private static void unlockDiary(Diary diary) {
        String password = input("Enter Diary Password: ");
        try{
        diary.unlockDiary(password);
        print("Diary Unlocked!!");
        }catch (Exception ex){
            print(ex.getMessage());
        }finally {
            displayDiaryMenu(diary);
        }
    }

    private static void createDiary() {
        String username = input("Enter your username: ");
        String password = input("Enter your password");
        try{
        diaries.add(username, password);
        print("Diary Created Successfully!!!");
        }catch (Exception ex){
            print(ex.getMessage());
        }finally {
            displayMainMenu();
        }
    }

    private static String input(String message) {
        Scanner sc = new Scanner(System.in);
        print(message);
        return sc.nextLine();
    }

    private static void print(String mainMenu) {
        System.out.println(mainMenu);
    }
}
