package btree;


public class BinaryTree {

    public Node root;
    
    BinaryTree() {
        root = null;
}
    public void insert(int key) {
        root = insert(root, key);
    }
    
    public int getHeight(Node node )  
    {  
        return node == null ? -1 : node.h;  
    }  
    
    
    void printPathsRecur(Node node, int pathLen)
    {
        if (node == null)
            return;
  
        
        pathLen++;
        node.korkeus = pathLen;
        System.out.println(node.korkeus);
  
        
        printPathsRecur(node.left, pathLen);
        printPathsRecur(node.right, pathLen);
    }
    
    //https://www.javatpoint.com/avl-tree-program-in-java
    //https://www.geeksforgeeks.org/given-a-binary-tree-print-all-root-to-leaf-paths/
      
    //create maxNode() method to get the maximum height from left and right node  
    /*private int getMaxHeight(int leftNodeHeight, int rightNodeHeight)  
    {  
    return leftNodeHeight > rightNodeHeight ? leftNodeHeight : rightNodeHeight;  
    } */ 
    
    //node.h = getMaxHeight( getHeight( node.left ), getHeight( node.right ) ) + 1;
   
    
    
        
    public void preOrder(Node node){
        if(node != null){
            node.displayData();
            preOrder(node.left);           
            preOrder(node.right);
       }
      }
    public Node insert(Node node, int value){
    if(node == null){
      return new Node(value);
    }
    // Move to the left if passed value is 
    // less than the current node
    if(value < node.value){
      node.left = insert(node.left, value);
    }
    // Move to the right if passed value is 
    // greater than the current node
    else if(value > node.value){
      node.right = insert(node.right, value);
    }
    return node;
}
    public Node find(int searchedValue){
    Node current = root;
    while(current.value != searchedValue){
      if(searchedValue < current.value)
        // Move to the left if searched value is less
        current = current.left;
      else
        // Move to the right if searched value is >=
        current = current.right;
      if(current == null){
        return null;
      }
    }
    return current;
    }
    
    
    
    
    
    /*public Node insert_Recursive(Node current, int value) {
        
        if (current == null){
          void insert(int key) {
        root = insert_Recursive(root, key);  return new Node(value);
            
        }
        if (value < current.value){
            current.left = insert_Recursive(current.left, value);
        }
        else if (value > current.value){
            
            current.right = insert_Recursive(current.right, value);
        }
        return current;
    }
    
    public BinaryTree(int rootValue) {
        root = new Node(rootValue);
    }
    public BinaryTree(){
        root = null;
    }*/
    /*public BinaryTree(String rootValue, BinaryTree left, BinaryTree right){
        root = new Node(rootValue, left, right);
    } */
    /*boolean search(int key) {
        root = search_Recursive(root, key);
        if (root!= null)
            return true;
        else
            return false;*/
    
    
        
    
    /*
    Node search_Recursive(Node root, int key) {
        if (root==null || root.key==key)
            return root;
        if (root.key > key)
            return search_Recursive(root.left, key);
        return search_Recursive(root.right, key);
    }*/
    public void InOrderTraversal(Node node)
    {
        if (node != null)
        {
            InOrderTraversal(node.left);
            print(node.value);
            InOrderTraversal(node.right);
          
        }
    }
        
    public void PostOrderTraversal(Node node)
        {
        if (node != null)
        {
            PostOrderTraversal(node.left);
            PostOrderTraversal(node.right);
            print(node.value);
            }
        }
    private void print(int value)
    {
        System.out.print(" " + value);
        
    }
    //public void insert(String aData){
        
    //}
    
    /*public BinaryTree find(String aData){
        
        return null;
    }*/
    /*public void preOrder() { //laittaa tän iffien väliin jos haluaa eri järkän
        if (root != null) {
            System.out.println(root.getData()+',');
            if (root.left() != null) // pääseeekö vasemmalle?
                root.left().preOrder();
            if (root.right() != null) // pääseekö oikealle?
                root.right().preOrder();
        }*/

    /*}
  
    public void setLeft(BinaryTree tree) {
        root.setLeft(tree);
    }

    public void setRight(BinaryTree tree) {
        root.setRight(tree);
    }*/
}
