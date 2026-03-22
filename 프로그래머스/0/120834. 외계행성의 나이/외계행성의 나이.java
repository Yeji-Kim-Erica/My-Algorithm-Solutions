class Solution {
    public String solution(int age) {
        String[] ageString = (age + "").split("");
        String[] words = "abcdefghij".split("");
        StringBuilder ageInPlanet = new StringBuilder();
        for (int i = 0; i < ageString.length; i++) {
            ageInPlanet.append(words[Integer.parseInt(ageString[i])]);
        }
        
        return ageInPlanet.toString();
    }
}