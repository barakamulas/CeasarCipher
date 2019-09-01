public class CaesarCipher {


    private String text;
    private Integer key;

    public CaesarCipher(String text,Integer key){
        this.key = key;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public Integer getKey() {
        return key;
    }

    public String encode() {

        String resultText = "";



        if (key > 26){
            key = key % 26;
        }
        else if (key < 0){
            key = (key%26)+26;
        }

        char letter = text.charAt(0);
        char c = (char) (letter + key);
        if (c > 'z') {
            resultText += (char) (letter - (26 - key));
        } else {
            resultText += c;
        }
        return resultText;
    }

}
