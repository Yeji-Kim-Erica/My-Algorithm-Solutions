import java.util.Map;
import java.util.Map.Entry;
import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {        
        Map<String, Integer> rank = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            rank.put(players[i], i);
        }
        for (int i = 0; i < callings.length; i++) {
            String calledPlayer = callings[i];
            int currentRank = rank.get(calledPlayer);
            
            int newRank = currentRank - 1;
            String playerAhead = players[newRank];
            
            players[newRank] = calledPlayer;
            rank.put(calledPlayer, newRank);
            
            players[currentRank] = playerAhead;
            rank.put(playerAhead, currentRank);
        }
        return players;
    }
}