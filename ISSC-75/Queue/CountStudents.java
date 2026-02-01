package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class CountStudents {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> studentQueue = new LinkedList<>();
        for(int s : students)
            studentQueue.offer(s);
        
        int rotation = 0, i = 0;
        while(!studentQueue.isEmpty() && rotation < studentQueue.size()) {
            int front = studentQueue.remove();
            if(sandwiches[i] == front) {
                i++;
                rotation = 0;
            }
            else {
                studentQueue.add(front);
                rotation++;
            }
        }
        return studentQueue.isEmpty() ? 0 : studentQueue.size();
    }
}
