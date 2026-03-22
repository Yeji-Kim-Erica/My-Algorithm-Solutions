class Solution {
    public String solution(String letter) {
        String morse = "'.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f','--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l','--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r','...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x','-.--':'y','--..':'z'";
        String[] morseArr = morse.replaceAll("'","").split(":|,");
        String[] letterSplit = letter.split("\\s");
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < letterSplit.length; i++) {
            for (int j = 0; j < morseArr.length; j+=2) {
                if (morseArr[j].equals(letterSplit[i])) {
                    answer.append(morseArr[j+1]);
                    break;
                }
            }
        }
        return answer.toString();
    }
}