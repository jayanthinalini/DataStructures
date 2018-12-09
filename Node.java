package DataStructures.Trees;

public class Node {
	private int iData;
	private Node parent;
	private Node[] childList;
	private Node leftChild;
	private Node rightChild;
	private int depth;
	
	public int getDepth() {
        return depth;
    }
    public void setDepth(int depth) {
        this.depth = depth;
    }
    public Node() {
		this.iData=0;
		this.parent=null;
		this.childList=null;
	}
	public Node(int iData,Node parent, Node[] child){
		this.iData=iData;
		this.parent=parent;
		this.childList=child;
	}
	
	
	public int getiData() {
		return iData;
	}

	void setiData(int iData) {
		this.iData = iData;
	}

	Node getParent() {
		return parent;
	}

	void setParent(Node parent) {
		this.parent = parent;
	}

	

	public Node[] getChildList() {
		return childList;
	}

	public void setChildList(Node[] childList) {
		this.childList = childList;
	}
	public Node getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(Node leftChild) {
		this.leftChild = leftChild;
	}
	public Node getRightChild() {
		return rightChild;
	}
	public void setRightChild(Node rightChild) {
		this.rightChild = rightChild;
	}
    public boolean isLeafNode() {
        if(this.leftChild==null && this.rightChild==null)
            return true;
        return false;
    }
	

}
