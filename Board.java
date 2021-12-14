import java.util.*;
public class Board {
    int boardSize;
    Map<Integer, Snakes> snakemap;
    Map<Integer, Ladders> laddermap;
    Queue<Players> player;
    Dice d;
    List<String> winners = new ArrayList<>();
    Board(int boardsize,Map<Integer,Snakes>headsAndTails ,Map<Integer,Ladders> startsAndEnd,Queue <Players> players){
        this.boardSize=boardsize;
        this.snakemap=headsAndTails;
        this.laddermap=startsAndEnd;
        this.player=players;
        d=new Dice(0,6);
       
    }
    public void startgame(){
        while(true){
            Players playerName=player.poll();
            int diceValue=d.rollTheDice();
            int currPosition = playerName.getLocation();
            int newPosition = currPosition+diceValue;
            if(newPosition <= boardSize){
                if(snakemap.containsKey(newPosition)){
                    Snakes s = snakemap.get(newPosition);
                    newPosition = s.getTail();
                }
                else if(laddermap.containsKey(newPosition)){
                    Ladders l = laddermap.get(newPosition);
                    newPosition = l.getEnd();
                }
                playerName.setLocation(newPosition);
                System.out.println(playerName.getName()+" rolled a "+diceValue+" and moved from "+currPosition+" to "+newPosition);
                if(newPosition==boardSize){
                    System.out.println(playerName.getName()+" has won the game!!!!");
                    break;
                }   
                player.add(playerName);
            
        }
       
        }
    }


    
}
