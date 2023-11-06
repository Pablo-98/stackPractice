public class Stack{

String[] stack; // array to hold stack elements 

int top; //pointer to top of the stack 


//constructor
public StackClass(){
stack = new String[10];
top = 0;

}


public boolean isEmpty(){
return top == 0; //shortcut if top == 0 , true, else, false 

}

public void push(String s){
    if (top==stack.length){
        ensureCapacity(); // 
    }
stack[top] = s;
top++; //update top 

}

public void ensureCapacity(){
    String[] newStack =new String[stack.length*2]; //double stack length!!

    for(int i = 0; i < stack.length; i++){

        newStack[i] = stack[i]; // copy each element in stack and throw it into new stack
    }
}
    
    
    }
