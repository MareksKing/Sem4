package dataStr;

public class MyGraph<Type> {
    private MyGraphVerticeNode<Type>[] vertices;
    private final int DEFAULT_SIZE = 10;
    private int size = DEFAULT_SIZE;
    private int counter = 0;

    public MyGraph(){
        vertices = (MyGraphVerticeNode<Type>[]) new Object[size];
    }

    public MyGraph(int mySize){
        if(mySize > 0 && mySize <= 10000){
            this.size = mySize;
        }
    }

    private boolean isFull(){   
        return (counter == size);
    }

    private boolean isEmpty(){ 
        return (counter == 0);
    }

    private void makeEmpty(){
        counter = 0;
        vertices = (MyGraphVerticeNode<Type>[]) new Object[size];
    }

    private int howManyElements(){
        return counter;
    }
}
