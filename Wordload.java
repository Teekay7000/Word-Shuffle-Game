public class Wordload {
    public static MyArrayList<CharacterWrapper> loadWord(String letter) {
        MyArrayList<CharacterWrapper> List = new MyArrayList<>();
        for (int i = 0; i < letter.length(); i++) {
              List.add(i, new CharacterWrapper(letter.charAt(i), false));
        }
        return List;
    }
}
