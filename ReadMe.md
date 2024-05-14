

Binary Tree Implementation has
- Adding nodes
- Finding a node
- Inorder, postorder and preorder traversals

Important Notes
- The head and tail is not a node but pointers to the node

Big O
- A way to compare two codes mathematically
- Time complexity is not measured in time rather measured in the number of operations it takes to complete something.
- Space complexity is all about memory space. If code 1 takes more time to complete but less space but maybe that is better as it is less memory intensive
- Big O best case is represented by Theta, average case is represented by Omega and worst case is represented by O or omicron.
- O(n) more efficient than O(n^2)
- If as n grows the number of operations reamains the case then it is o(1)-constant time. Most efficient Big O. Now n+n is one operation and hence it is 0(1) but n+n+n are 3 operations and hence O(2) which gets simplified to O(1) Refer to the example below :-

public class Experiment {

    public static void main(String[] args) {
        addItems(10);
    }
    
    public static int addItems(int n){
        return n + n;
    }
}

- O(log n)-the next most efficient after o(1). Used in divide and conquer algos.

ArrayList Big O
- add and remove at end of the array list is O(1)
- add and remove at the beginning of the arraylist O(n) as reindexing is needed.
- Looking for an item by value is O(n) but looking via index is O(1)
