public class MangaGame {
    private String title;
    private int chapters;
    
    public MangaGame(String title) {
        this.title = title;
        this.chapters = 1;
    }
    
    public void addChapter() {
        chapters++;
        System.out.println(title + " - Chapter " + chapters + " added!");
    }
    
    public static void main(String[] args) {
        MangaGame game = new MangaGame("Magical Bookpack");
        game.addChapter();
        game.addChapter();
    }
}
