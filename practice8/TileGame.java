import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Queue;

public class TileGame {

    
    public static int tileGame(ArrayDeque<Integer> stack, Queue<Integer> q){
        int numOfMoves=0;
        for (int i = 0; i < stack.size(); i++) {
            while (!stack.isEmpty()){
                try {
                    if(stack.peek() == 1){
                        numOfMoves++;
                        stack.pop();
                        stack.pop();
                        if(stack.isEmpty()){
                            return numOfMoves;
                        }
                    }
                    else if(stack.peek() == 2){
                        numOfMoves++;
                        stack.pop();
                        stack.pop();
                        if(stack.isEmpty()){
                            return numOfMoves;
                        }
                        stack.pop();
                        if(stack.isEmpty()){
                            return numOfMoves;
                        }
                        
                    }
                    else if (stack.peek() ==3){
                        numOfMoves++;
                        stack.pop();
                        if(stack.isEmpty()){
                            return numOfMoves;
                        }
                        int val1 = q.poll(); 
                        stack.push(val1);
                        int val2 = q.poll();
                        stack.push(val2);
                        int val3 = q.poll();
                        stack.push(val3);
                    }    
                } 
                catch (Exception e) {
                    System.out.println("Bad things have happened!");
                    System.out.println(e);
                }
            
            }
        }
        return numOfMoves;
    }
}
