import java.util.*;

public class Solution<Key extends Comparable<Key>, Value> {
    private Node root;
    private int size; 
    int Nodecount;
               // root of BST

    private class Node {
        private Key key;           // sorted by key
        private Value val;         // associated data
        private Node left, right;  // left and right subtrees
        private int size;          // number of nodes in subtree

        public Node(Key key, Value val, int size) {
            this.key = key;
            this.val = val;
            this.size = size;
        }
    }

    /**
     * Initializes an empty symbol table.
     */
    public Solution() {
       root = null;
       size = 0;
       
    }

    /**
     * Returns true if this symbol table is empty.
     * @return {@code true} if this symbol table is empty; {@code false} otherwise
     */
    public boolean isEmpty() {
        if(size == 0){
            return true;
        }
        return false;
    }

    /**
     * Returns the number of key-value pairs in this symbol table.
     * @return the number of key-value pairs in this symbol table
     */
    public int size() {
        return size;
      
       
    }
    /**
     * Does this symbol table contain the given key?
     *
     * @param  key the key
     * @return {@code true} if this symbol table contains {@code key} and
     *         {@code false} otherwise
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    // public boolean contains(Key key) {
    //    if(key == null){
    //    	throw new IllegalArgumentException("Key is null");
    //    }
    //    return get(key) != null;
    // }

    /**
     * Returns the value associated with the given key.
     *
     * @param  key the key
     * @return the value associated with the given key if the key is in the symbol table
     *         and {@code null} if the key is not in the symbol table
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public Value get(Key key) {
        if(key == null){
            throw new IllegalArgumentException("key value is null");
        }    
        return get(root,key);
    }
    private Value get(Node x, Key key){
        while (x != null){
            int cmp = key.compareTo(x.key);
            if(cmp  < 0) {
                x = x.left;
            }
            else if(cmp>0){
                x = x.right;
            }
            else{
                return x.val;
            } 
        }
        return null;
    }

   //  /**
   //   * Inserts the specified key-value pair into the symbol table, overwriting the old 
   //   * value with the new value if the symbol table already contains the specified key.
   //   * Deletes the specified key (and its associated value) from this symbol table
   //   * if the specified value is {@code null}.
   //   *
   //   * @param  key the key
   //   * @param  val the value
   //   * @throws IllegalArgumentException if {@code key} is {@code null}
   //   */
        
       public void put(Key key, Value val) {
        if (key==null) {
            System.out.println("Key cannot be null");
        }
        root=put(root, key, val);
        
       
    }

    private Node put(Node x, Key key, Value val) {
        Node newest=new Node(key, val, 1);
        
        if (root==null) {
            x=newest;
        }
        else{
            int cmp=key.compareTo(x.key);  
            Node parent=null;
                
            while(true){
                parent=x;
                
                if (cmp > 0) {
                    x=x.right;    
                    if (x == null) {
                        parent.right=newest;   
                        
                        size++;
                        return x;
                        
                       
                    }

                }

                else if (cmp < 0) {
                    x=x.left;

                    if (x==null){
                        parent.left=newest; 
                       size+=1;
                        return x;
                        
                        
                    }
   
                }
                else{
                    val=x.val;
                }
                // x.size=1+size(x.right)+size(x.left);
                
            }
           
        }
         size += 1;
        return x;
    }
   //  // /**
   //  //  * Returns the smallest key in the symbol table.
   //  //  *
   //  //  * @return the smallest key in the symbol table
   //  //  * @throws NoSuchElementException if the symbol table is empty
   //  //  */
    public Key min() {
        if(size == 0){
           throw new NoSuchElementException("The symbol table is empty"); 
        }
        Node temp = root;
        // loop down to find the leftmost leaf 
        while(temp.left != null){
            temp = temp.left;
        }
        return temp.key;
         
    }
   //  // /**
   //  //  * Returns the largest key in the symbol table less than or equal to {@code key}.
   //  //  *
   //  //  * @param  key the key
   //  //  * @return the largest key in the symbol table less than or equal to {@code key}
   //  //  * @throws NoSuchElementException if there is no such key
   //  //  * @throws IllegalArgumentException if {@code key} is {@code null}
//    //  //  */
   public Key floor(Key key) {
        if(key == null){
            System.out.println("Key is null");
        }
        if(size == 0){
            System.out.println("Called floor() with empty symbol table");
        }
        Node x = floor(root, key);
        if(x == null){
            return null;
        }
        else {
            return x.key;
        }
    }
    private Node floor(Node x, Key key){
        Node smallest = null;
        while(x != null){
            int cmp = key.compareTo(x.key);
            if(cmp == 0){
                return x;
            }
            else if(cmp < 0){
                x = x.left;
            }
            else{
                smallest = x;
                x = x.right;
            }
        }
        return smallest;
    }
          
    public Key select(int k){
        Nodecount = 0;
        if(Nodecount<0 || Nodecount>=size){
            throw new IllegalArgumentException("");
        }
        return select(root, Nodecount+1).key;
    }
    private Node select(Node x, int k){
        Stack<Node> stack = new Stack<Node>();
        while(!stack.empty() || x != null){
            if(x != null){
                stack.push(x);
                x = x.left;
            }
            else{
                x = stack.pop();
                Nodecount ++;
                if(Nodecount == k){
                    break;
                }
                x = x.right;
            }
        }
        return x;
    }

     public void keys(Key lo, Key hi){
        if(lo == null || hi == null){
            throw new IllegalArgumentException("called keys() with a null key");
        }
        Node curNode = root;
        Node parent;
        while(curNode != null) {
            parent = curNode;
            if(parent == null) { 
                return; 
            } 
            int cmp = lo.compareTo(parent.key);
            int cm = hi.compareTo(parent.key); 
            if (cmp < 0) { 
                curNode = parent.left;
            }
            if (cmp <= 0 && cm >= 0) { 
                System.out.print(parent.key + " "); 
            } 
            if (cm > 0) { 
                curNode = parent.right;
            }
        }
    }
    
    /* Run the program by giving the approriate command obtained from
    input files through input.txt files. The output should be displayed
    exactly like the file output.txt shows it to be.*/
    
}
        
       