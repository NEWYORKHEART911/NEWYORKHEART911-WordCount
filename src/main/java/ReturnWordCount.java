
public class ReturnWordCount {
    /**
     * @param in A String representing a sentence, with words delineated by spaces.
     * @return return the amount of words in a string.
     */
    public int count(String in){
        char empty = ' ';
        int counter = 1;
        for(int j=0; j<in.length(); j++) {
            if(in.charAt(j)==empty) {
                counter++;
            }
        }
        return counter;
    }
}
