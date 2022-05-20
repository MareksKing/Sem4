package dataStr;

public class MyGraphEdgeNode {
    private int indexToNeighbor;
    private int edgeValue;
    private MyGraphEdgeNode myNode;

    /**
     * @return int return the indexToNeighbor
     */
    public int getIndexToNeighbor() {
        return indexToNeighbor;
    }

    /**
     * @param indexToNeighbor the indexToNeighbor to set
     */
    public void setIndexToNeighbor(int indexToNeighbor) {
        this.indexToNeighbor = indexToNeighbor;
    }

    /**
     * @return int return the edgeValue
     */
    public int getEdgeValue() {
        return edgeValue;
    }

    /**
     * @param edgeValue the edgeValue to set
     */
    public void setEdgeValue(int edgeValue) {
        this.edgeValue = edgeValue;
    }

    /**
     * @return MyGraphEdgeNode return the myNode
     */
    public MyGraphEdgeNode getMyNode() {
        return myNode;
    }

    /**
     * @param myNode the myNode to set
     */
    public void setMyNode(MyGraphEdgeNode myNode) {
        this.myNode = myNode;
    }

    public MyGraphEdgeNode(int indexToNeighbor, int edgeValue, MyGraphEdgeNode myNode) {
        this.indexToNeighbor = indexToNeighbor;
        this.edgeValue = edgeValue;
        this.myNode = myNode;
    }

    public MyGraphEdgeNode() {
    }

    @Override
    public String toString() {
        return "MyGraphEdgeNode [edgeValue=" + edgeValue + ", indexToNeighbor=" + indexToNeighbor + ", myNode=" + myNode
                + "]";
    }

    

}
