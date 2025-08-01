public class CharacterWrapper {
    private char alpha;
    private boolean Words ;

    public CharacterWrapper(char alpha, boolean Words) {
        this.alpha = alpha;
        this.Words = Words;
    }

    public void setWord(boolean word) {
        this.Words = word;
    }

    public boolean  Words() {
        return Words;
    }

    public char getAlpha() {
        return alpha;
    }

    @Override
    public String toString() {
        return Words ? String.valueOf(alpha) : "_";
    }
}


