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

    public String encode(){

        String resultText = "";
//        int shift = key % 26;
//        char letter = text.charAt(0);
//        char c = (char)(letter + shift);
//
//        resultText += c;

        return resultText;
    }






}
