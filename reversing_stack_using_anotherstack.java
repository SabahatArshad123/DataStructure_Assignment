import java.sql.SQLOutput;
import java.util.SortedMap;
import java.util.Stack;

public class reversing_stack_using_anotherstack {
    public static void main(String[] args) {
        Stack <Integer> stack= new Stack<>();
        Stack <Integer> stack2= new Stack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.push(0);


        System.out.println("Stack:" );
        System.out.println(stack);

        while (!stack.isEmpty()){
            stack2.push(stack.pop());
        }
        System.out.println("Stack 2:" );

        System.out.print(stack2);
        System.out.println();



    }
}
