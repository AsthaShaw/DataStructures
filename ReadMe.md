

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

Very good resource for Big O
- https://www.bigocheatsheet.com/

Study on space complexity??

### Big O

- As ‘n’ grows the number of operations remains the same, and hence it is 0(1)

```jsx
public class Experiment {

    public static void main(String[] args) {
        addItems(10);
    }
    
    public static int addItems(int n){
        return n + n;
    }
}

```

## ArrayList vs LinkedList

- LinkedList no indexing like arrayList as LL are all over in the memory and pointers links the nodes unlike arraylist which has contiguous place in memory
- LL has head and tail pointers which point to first and last node respectively while ArrayList does not

## Big O of Linked List

- Adding to end of the list is O(1)
- Adding to the beginning of the list is O(1)
- Removing a node from the beginning of the list O(1)
- Removing end node - O(n)
- Inserting and Removing in the middle of the list is O(n)
- Searching for a node index wise or value wise is O(n)

[LL+Big+O.pdf](https://prod-files-secure.s3.us-west-2.amazonaws.com/80a6b46e-3c37-495b-a38f-8fd7c97e0f4f/b89fc86c-68f6-4c14-bf17-bd1ccdf52e7c/LLBigO.pdf)

Node = value + pointer

Floyd's Tortoise and Hare algorithm Implementation - slow and fast pointers

1. FindMiddleNode
2. HasLoop

Detect loops in LinkedList-done another way



