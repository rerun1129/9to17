package newinstanceof;


/**
 * from java 14
 */
public class NewInstanceOf {

    public static void main(String[] args) {
        AbstractFile file = new MusicFile();
        oldInstanceOf(file);
        newInstanceOf(file);
    }

    private static void oldInstanceOf(AbstractFile abstractFile) {
        if (abstractFile instanceof MusicFile) {
            ((MusicFile) abstractFile).playMusic();
        }
    }

    private static void newInstanceOf(AbstractFile abstractFile) {
        if (abstractFile instanceof MusicFile musicFile) {
            musicFile.playMusic();
        }
    }
}
