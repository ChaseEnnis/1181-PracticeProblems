// Chase Ennis
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import javax.swing.text.html.FormView;

public class practice8 extends TileGame{
    

    
    public static void main(String[]args){
        Queue<Integer> q = new LinkedList<>();
        ArrayDeque<Integer> stack = new ArrayDeque();

        int qdata[] = {1, 2, 2, 1, 3, 1, 2, 1, 2, 3};
        int sdata[] = {3, 2, 1, 2};

        for (int i = 0; i < qdata.length; i++) {
            if ((qdata[i] != 1) && (qdata[i] != 2) && (qdata[i] != 3)){
                System.out.println("Invalid tile!");
                return ;
            }
            q.offer(qdata[i]);
        }
        System.out.println(q);
        for (int i = sdata.length-1; i >= 0; i--) {
            if ((sdata[i] != 1) && (sdata[i] != 2) && (sdata[i] != 3)){
                System.out.println("Invalid tile!");
                return ;
            }
            stack.push(sdata[i]);
        
        } 
        System.out.println("stack: "+ stack);
        System.out.println("q "+ q);
        int num =tileGame(stack,q);

        System.out.println("The number of moves is " + num);
    

    }
}
