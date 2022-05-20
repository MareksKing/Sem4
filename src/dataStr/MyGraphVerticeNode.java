package dataStr;

public class MyGraphVerticeNode<Type> {
    private Type verticeValue;
    private MyGraphEdgeNode firstEdge;

    /**
     * @return Type return the verticeValue
     */
    public Type getVerticeValue() {
        return verticeValue;
    }

    /**
     * @param verticeValue the verticeValue to set
     */
    public void setVerticeValue(Type verticeValue) {
        this.verticeValue = verticeValue;
    }

    /**
     * @return MyGraphEdgeNode return the firstEdge
     */
    public MyGraphEdgeNode getFirstEdge() {
        return firstEdge;
    }

    /**
     * @param firstEdge the firstEdge to set
     */
    public void setFirstEdge(MyGraphEdgeNode firstEdge) {
        this.firstEdge = firstEdge;
    }

    public MyGraphVerticeNode(Type verticeValue) {
        this.verticeValue = verticeValue;
    }

    @Override
    public String toString() {
        return "MyGraphVerticeNode [verticeValue=" + verticeValue + "]";
    }

    

}
