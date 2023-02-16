
public class ReturnWordCount {
    /**
     * @param in A String representing a sentence, with words delineated by spaces.
     * @return return the amount of words in a string.
     */
    public int count(String in){
        String empty = " ";
        String counter = in.replaceAll(empty, "");
        return in.length()-counter.length()+1;
    }
}
