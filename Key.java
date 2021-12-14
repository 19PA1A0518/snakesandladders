//package Key;
import java.util.*;

public class Key {
    public static void main(String[] args) {
        HashMap<Integer,Snakes> snakes = new HashMap<Integer,Snakes>();
        HashMap<Integer,Ladders> ladders = new HashMap<Integer,Ladders>();
        Queue <Players> players = new LinkedList<Players>(); // To store player details
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the board.....");
        int board_size = in.nextInt(); //To customize the board size
        System.out.println("Enter whether you want to play with single diece or two diece...");
        in.nextLine();
        int no_of_diece=in.nextInt(); // No.of dice
        in.nextLine();
        int sn = in.nextInt(); //Input of no of snakes
        for(int i=0;i<sn;i++){
            in.nextLine();
            int start = in.nextInt();
            int end = in.nextInt();
            Snakes s = new Snakes(start,end);
            snakes.put(start,s);
        }
        int l = in.nextInt(); // Input of no of ladders
        for(int i=0;i<l;i++){
            in.nextLine();
            int start = in.nextInt();
            int end = in.nextInt();
            Ladders le = new Ladders(start,end);
            ladders.put(start,le);
        }
        in.nextLine();
        int no_of_players = in.nextInt();
        in.nextLine();
        for(int i=0;i<no_of_players;i++){
            String str = in.nextLine();
            Players p = new Players(str);
            players.add(p);

        }
        Board b = new Board(board_size,snakes,ladders,players); // creating a new board
        b.startgame(); // let's start the game..!!
    } 
    
}
