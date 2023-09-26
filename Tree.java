public class Tree {

    private Node root;
    Node no=new Node();


    public Tree(Node root) {
        this.root = null;
    }

    private void add(Node no, int value) {
        if (this.root == null) {
            this.root = new Node(value);
        } else if(this.root.value <value){
            if (no.right != null) {
                add(no.right, value);
            } else {
                no.right = new Node(value);
            }
        }else if(this.root.value>value){
            if (no.left!= null) {
                add(no.left, value);
            } else {
                no.right = new Node(value);
            }
        }

    }

   public boolean searchelement(Node no,long value){
        if(this.root.value==value && this.root!=null){
           return true;
        }else if(this.root.value<value){
            if(no.right!=null && no.right.value==value){
                return true;
            }else{
                searchelement(no.right,value);
            }
        } else if(root.value>value){
            if(no.left!=null && no.left.value==value){
                return true;

            } else{
                searchelement(no.left,value);
            }
        }

            return false;


    }
    public void pesquisa(long value) {
        searchelement(this.root,value);

    }
    public void add(int value) {
        add(this.root, value);
    }

}
