package DataStructures;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<String> stk = new Stack<>();

        //push() -> addingg item into stack
        stk.push("Valorant");
        stk.push("Doom");
        stk.push("RE4");

        System.out.println(stk); //[Valorant, Doom, RE4]

        //pop()->removing the item from the last push(the last index))
        stk.pop();
        System.out.println(stk); //[Valorant, Doom]

        //Peek() ->checking the last item in stack
        System.out.println(stk.peek()); //Doom

        //Search() -> find the index item in the stack
        System.out.println(stk.search("Doom")); //1
    }

}
