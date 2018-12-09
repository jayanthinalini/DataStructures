package DataStructures.Trees;

import java.util.List;
import java.util.ArrayList;

public class BinarySearchTree {
	
	private Node root;
	
	public BinarySearchTree() {
		// TODO Auto-generated constructor stub
		root=null;
	}

	public boolean isEmpty(){
		if(this.root!=null)
		  return false;
		else
		  return true;
				  
	}
	
	
	public boolean insert(int nodeData){
		
	   Node newNode=new Node(nodeData,null,null);
	   //if tree is empty
	   if(this.root==null){
		   this.root=newNode;
		   return true;
	   }else{	
	   //If tree is not empty  
		Node x=root;
		Node xParentNode=null;
		while(x!=null){
			xParentNode=x;
			if(x.getiData()>=nodeData){
				x=x.getLeftChild();
			}
			else
				x=x.getRightChild();
		}
		
		
		newNode.setParent(xParentNode);
		if(nodeData<=xParentNode.getiData()){
			xParentNode.setLeftChild(newNode);
		}else{
			xParentNode.setRightChild(newNode);
		}
	   }
		return false;
	}
	
	public boolean delete(int nodeData){
		return false;
	}
	
	public Node search(int data){
		return null;
	}

	
	public Node successor(int nodeData){
		return null;
	}
	
	public Node predecessor(int nodeData){
		return null;
	}
	
	
	public Node min(){
		Node x=this.root;
		while(x.getLeftChild()!=null)
			x=x.getLeftChild();
		
		return x;
	}
	
	public Node max(){
		return null;
	}
	Node getRoot() {
		return root;
	}

	void setRoot(Node root) {
		this.root = root;
	}

	public void view() {
		
		System.out.println(getHeight(this.root));
	}

	public int getHeight(Node node){
		
		if(node==null)
			return 0;
		
	   System.out.println(node.getiData()+ " ");
	   int leftChildHeight=getHeight(node.getLeftChild());
	   
	   int rightChildHeight=getHeight(node.getRightChild());
	   int height = Math.max(leftChildHeight, rightChildHeight)+1;
	   
	   
       
	   return height;
	    
		
	}
	
	
	
	public void nodeDepth(Node node, List<Node> leaves) {
	    int depth = 0;
        if(node.getParent()!=null) 
            depth = node.getParent().getDepth()+1;
	    if(node.isLeafNode()) {
	        node.setDepth(depth);
	        leaves.add(node);
	        return;
	    }
	    
	    node.setDepth(depth);
	    if(node.getLeftChild()!=null)
	    nodeDepth(node.getLeftChild(),  leaves);
	    if(node.getRightChild()!=null)
	    nodeDepth(node.getRightChild(), leaves);
	    return;
	        
	}
	
	public boolean isSuperBalanced() {
	    List<Node> nodeList = new ArrayList<Node>();
	    this.root.setDepth(0);
	    nodeDepth(root, nodeList);
	    for(Node node: nodeList )
	        System.out.println("Node : " + node.getiData()+ " Depth : "+ node.getDepth());
	    return true;
	        
	    
	}

}
