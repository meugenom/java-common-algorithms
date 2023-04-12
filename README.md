# 🧠 📚 ⏱ Java Common Data Structures and Algorithms

This repository contains an implementation of common data structures and algorithms in Java.

### Notation keys

 The following keys are used to indicate the level of difficulty and time/space complexity of each algorithm:

 - `🍏`: easy;
 - `🍊`: medium;
 - `🍎`: hard;
 - `⭕️(1)`, `⭕️log(N)`, `⭕️(N^2)`, etc: time and space complexity;
 - [`✍🏻`]: in progress;
 - [`🙇🏻‍♂️`]: hard to solve;
 - [`❓`]: the solution is not optimal;
 - [`✔️`]: done;
 - [`🆗`]: Test passed Ok;

### Data Structures:

The following data structures are implemented in this repository:

#### [**Arrays**](src/main/java/dataStructures/arrays)

The `Arrays` class provides the following algorithms:

Algorithm (operation)| Level |  Done  |  Time Complexity  | Space Complexity | Tests passed:
---------------------|-------|--------|-------------------|---------------|------------
[findMin](src/main/java/dataStructures/arrays/Arrays.java#L53) | `🍏` | [`✔️`] | `⭕️(N)`| `⭕️(1)`|[`🆗`] [Open](src/test/java/dataStructures/arrays/ArraysTest.java#L14)
 [mergeSortedArrays](src/main/java/dataStructures/arrays/Arrays.java#L163) | `🍊` | [`✔️`] | `⭕️(N)`| `⭕️(N)`|[`🆗`] [Open](src/test/java/dataStructures/arrays/ArraysTest.java#L138)
 [mergeUnsortedArrays](src/main/java/dataStructures/arrays/Arrays.java#L203) | `🍊` | [`✔️`] | `⭕️(N^2)`| `⭕️(N)`|[`🆗`] [Open](src/test/java/dataStructures/arrays/ArraysTest.java#L159)
[pop](src/main/java/dataStructures/arrays/Arrays.java#L23)|`🍏`|[`✔️`]|`⭕️(N)`| `⭕️(N)` | [`🆗`] [Open](src/test/java/dataStructures/arrays/ArraysTest.java#L44)
[push](src/main/java/dataStructures/arrays/Arrays.java#L7)|`🍏`|[`✔️`]|`⭕️(N)`| `⭕️(N)`| [`🆗`] [Open](src/test/java/dataStructures/arrays/ArraysTest.java#L61)
[remove(position)](src/main/java/dataStructures/arrays/Arrays.java#L74)|`🍏`|[`✔️`]|`⭕️(N)`| `⭕️(N)`| [`🆗`] [Open](src/test/java/dataStructures/arrays/ArraysTest.java#L26)
[reverse](src/main/java/dataStructures/arrays/Arrays.java#L101)|`🍊`|[`✔️`]|`⭕️(N)`| `⭕️(1)`| [`🆗`] [Open](src/test/java/dataStructures/arrays/ArraysTest.java#L78)
[reverse(start,end)](src/main/java/dataStructures/arrays/Arrays.java#L119)|`🍊`|[`✔️`]|`⭕️(N)`| `⭕️(1)`| [`🆗`] [Open](src/test/java/dataStructures/arrays/ArraysTest.java#L180)
[size](src/main/java/dataStructures/arrays/Arrays.java#L37)|`🍏`|[`✔️`]|`⭕️(N)`| `⭕️(1)`| [`🆗`] [Open](src/test/java/dataStructures/arrays/ArraysTest.java#L95)
[sort](src/main/java/dataStructures/arrays/Arrays.java#L137)|`🍊`|[`✔️`]|`⭕️(N^2)`| `⭕️(1)`| [`🆗`] [Open](src/test/java/dataStructures/arrays/ArraysTest.java#L109)
[genericArray \<T\>](src/main/java/generics/GenericArray.java#L1)|`🍎`|[`✔️`]| | | [`🆗`] [Open](src/test/java/generics/GenericArrayTest.java#L1)



 #### [**Matrix**](src/main/java/dataStructures/matrix)

 The `Matrix` class provides the following algorithms:

Algorithm (operation)| Level |  Done  |  Time Complexity  | Space Complexity | Tests passed:
---------------------|-------|--------|-------------------|---------------|------------
[rotate](src/main/java/dataStructures/matrix/Matrix.java#L18)|`🍊`|[`✔️`]| `⭕️(N^2)` | `⭕️(1)` | [`🆗`] [Open](src/test/java/dataStructures/matrix/MatrixTest.java#L13)
[transpose](src/main/java/dataStructures/matrix/Matrix.java#L30)|`🍊`|[`✔️`]|`⭕️(N^2)` | `⭕️(1)` | [`🆗`] [Open](src/test/java/dataStructures/matrix/MatrixTest.java#L32)
[reflect](src/main/java/dataStructures/matrix/Matrix.java#L45)|`🍊`|[`✔️`]|`⭕️(N^2)` | `⭕️(1)` | [`🆗`] [Open](src/test/java/dataStructures/matrix/MatrixTest.java#L51)

#### [**Singly Linked List**](src/main/java/dataStructures/singlyLinkedList)

The `Singly Linked List` class provides the following algorithms:

Algorithm (operation)| Level |  Done  |  Time Complexity  | Space Complexity | Tests passed:
---------------------|-------|--------|-------------------|---------------|------------
[append(data)](src/main/java/dataStructures/singlyLinkedList/SinglyLinkedList.java#L7)|`🍏`|[`✔️`]|`⭕️(1)`|`⭕️(1)`| [`🆗`] [Open](src/test/java/dataStructures/singlyLinkedList/SinglyLinkedListTest.java#L79)
[preppend(data)](src/main/java/dataStructures/singlyLinkedList/SinglyLinkedList.java#L28)|`🍏`|[`✔️`]|`⭕️(N)`| `⭕️(1)`| [`🆗`] [Open](src/test/java/dataStructures/singlyLinkedList/SinglyLinkedListTest.java#L98)
[find(data)](src/main/java/dataStructures/singlyLinkedList/SinglyLinkedList.java#L162)|`🍏`|[`✔️`]|`⭕️(N)`| `⭕️(1)`| [`🆗`] [Open](src/test/java/dataStructures/singlyLinkedList/SinglyLinkedListTest.java#L170)
[deleteFirst()](src/main/java/dataStructures/singlyLinkedList/SinglyLinkedList.java#L130)|`🍏`|[`✔️`]|`⭕️(N)`| `⭕️(1)`| [`🆗`] [Open](src/test/java/dataStructures/singlyLinkedList/SinglyLinkedListTest.java#L134)
[deleteLast()](src/main/java/dataStructures/singlyLinkedList/SinglyLinkedList.java#L150)|`🍏`|[`✔️`]|`⭕️(N)`| `⭕️(1)`| [`🆗`] [Open](src/test/java/dataStructures/singlyLinkedList/SinglyLinkedListTest.java#L152)
[deletePos(position)](src/main/java/dataStructures/singlyLinkedList/SinglyLinkedList.java#L94)|`🍏`|[`✔️`]|`⭕️(N)`| `⭕️(1)`| [`🆗`] [Open](src/test/java/dataStructures/singlyLinkedList/SinglyLinkedListTest.java#L116)
[length()](src/main/java/dataStructures/singlyLinkedList/SinglyLinkedList.java#L187)|`🍏`|[`✔️`]|`⭕️(N)`| `⭕️(1)`| [`🆗`] [Open](src/test/java/dataStructures/singlyLinkedList/SinglyLinkedListTest.java#L48)
[reverse()](src/main/java/dataStructures/singlyLinkedList/SinglyLinkedList.java#L56)|`🍏`|[`✔️`]|`⭕️(N^2)` | `⭕️(N)`| [`🆗`] [Open](src/test/java/dataStructures/singlyLinkedList/SinglyLinkedListTest.java#L29)
[getMid(LinkedList)](src/main/java/dataStructures/singlyLinkedList/SinglyLinkedList.java#L299)|`🍏`|[`✔️`]|`⭕️(N)` | `⭕️(1)` | [`🆗`] [Open](src/test/java/dataStructures/singlyLinkedList/SinglyLinkedListTest.java#L186)
[merge(LinkedList, LinkedList)](src/main/java/dataStructures/singlyLinkedList/SinglyLinkedList.java#L265)|`🍊`|[`✔️`]|`⭕️(N+M)` | `⭕️(1)` | [`🆗`] [Open](src/test/java/dataStructures/singlyLinkedList/SinglyLinkedListTest.java#L208)
[sort()](src/main/java/dataStructures/singlyLinkedList/SinglyLinkedList.java#L247)|`🍊`|[`✔️`]|`⭕️(N Log(N))` | `⭕️(Log(N))` | [`🆗`] [Open](src/test/java/dataStructures/singlyLinkedList/SinglyLinkedListTest.java#L235)

#### Data Structure: [**Doubly Linked List**](src/main/java/dataStructures/doublyLinkedList)

Algorithm (operation)| Level |  Done  |  Big ⭕️ Notation | Tests passed
---------------------|-------|--------|------------------|--------------
[append(data)](src/main/java/dataStructures/doublyLinkedList/DoublyLinkedList.java#L17)|`🍏`|[`✔️`]|`⭕️(1)`| [`🆗`] [Open](src/test/java/dataStructures/doublyLinkedList/DoublyLinkedListTest.java#L8)
[preppend(data)](src/main/java/dataStructures/doublyLinkedList/DoublyLinkedList.java#L41)|`🍏`|[`✔️`]|`⭕️(1)`| [`🆗`] [Open](src/test/java/dataStructures/doublyLinkedList/DoublyLinkedListTest.java#L26)
[deleteFirst()](src/main/java/dataStructures/doublyLinkedList/DoublyLinkedList.java#L139)|`🍏`|[`✔️`]|`⭕️(1)`| [`🆗`] [Open](src/test/java/dataStructures/doublyLinkedList/DoublyLinkedListTest.java#L43)
[deleteLast()](src/main/java/dataStructures/doublyLinkedList/DoublyLinkedList.java#L161)|`🍏`|[`✔️`]|`⭕️(1)`| [`🆗`] [Open](src/test/java/dataStructures/doublyLinkedList/DoublyLinkedListTest.java#L61)

#### Data Structure: [**Stack**\<Listnode\>](src/main/java/dataStructures/stack)

Algorithm (operation)| Level |  Done  |  Big ⭕️ Notation | Tests passed
---------------------|-------|--------|------------------|--------------
[getMin()](src/main/java/dataStructures/stack/Stack.java#L47)|`🍏`|[`✔️`]|`⭕️(N)` | [`🆗`] [Open](src/test/java/dataStructures/stack/StackTest.java#L10)
[peak()](src/main/java/dataStructures/stack/Stack.java#L37)|`🍏`|[`✔️`]|`⭕️(1)` | [`🆗`] [Open](src/test/java/dataStructures/stack/StackTest.java#L26)
[pop()](src/main/java/dataStructures/stack/Stack.java#L29)|`🍏`|[`✔️`]|`⭕️(1)` | [`🆗`] [Open](src/test/java/dataStructures/stack/StackTest.java#L44)
[push(data)](src/main/java/dataStructures/stack/Stack.java#L17)|`🍏`|[`✔️`]|`⭕️(1)` | [`🆗`] [Open](src/test/java/dataStructures/stack/StackTest.java#L63)

#### Data Structure: [**Queue**](src/main/java/dataStructures/queue)

Algorithm (operation)| Level |  Done  |  Big ⭕️ Notation 
---------------------|-------|--------|---------------------
isEmpty | `🍏` | [`✍🏻`] |
peak    | `🍏` | [`✍🏻`] |
enqueue | `🍏` | [`✍🏻`] |
dequeue | `🍏` | [`✍🏻`] |

#### Data Structure: [**Hash Table**\<Listnode\>](src/main/java/dataStructures/hashTable)

Algorithm (operation)| Level |  Done  |  Big ⭕️ Notation 
---------------------|-------|--------|---------------------
hash(key)       | `🍏` | [`✍🏻`] |
set(key, value) | `🍏` | [`✍🏻`] |
delete(key) | `🍏` | [`✍🏻`] |
get(key) | `🍏` | [`✍🏻`] |
has(key) | `🍏` | [`✍🏻`] |
getKeys() | `🍏` | [`✍🏻`] |
getValues() | `🍏` | [`✍🏻`] |

#### Data Structure: [**Heap**](src/main/java/dataStructures/heap)

Algorithm (operation)| Level |  Done  |  Big ⭕️ Notation 
---------------------|-------|--------|---------------------
add       | `🍎` | [`✍🏻`] |
remove       | `🍎` | [`✍🏻`] |

#### Data Structure: [**Trie**](src/main/java/dataStructures/trie)

Algorithm (operation)| Level |  Done  |  Big ⭕️ Notation 
---------------------|-------|--------|---------------------
addWord       | `🍎` | [`✍🏻`] |
deleteWord      | `🍎` | [`✍🏻`] |

#### Data Structure: [**Tree**](src/main/java/dataStructures/tree)

Algorithm (operation)| Level |  Done  |  Big ⭕️ Notation | Tests passed
---------------------|-------|--------|------------------|--------------
[**Binary Tree**](src/main/java/dataStructures/tree/binarySearchTree)| `🍎` | [`✍🏻`] |
[Binary Tree Recursive: insert(data)](src/main/java/dataStructures/tree/binarySearchTree/BinarySearchTreeRecursive.java#L13)|`🍎`|[`✔️`]|`⭕️log(N)` | [`🆗`] [Open](src/test/java/dataStructures/tree/binarySearchTreeRecursive/BinarySearchTreeRecursiveTest.java#L15)
[Binary Tree Recursive: preOrderPrint()](src/main/java/dataStructures/tree/binarySearchTree/BinarySearchTreeRecursive.java#L39)|`🍎`|[`✔️`]|`⭕️log(N)` | [`🆗`] [Open](src/test/java/dataStructures/tree/binarySearchTreeRecursive/BinarySearchTreeRecursiveTest.java#L59)
[Binary Tree Recursive: inOrderPrint()](src/main/java/dataStructures/tree/binarySearchTree/BinarySearchTreeRecursive.java#L55)|`🍎`|[`✔️`]|`⭕️log(N)` | [`🆗`] [Open](src/test/java/dataStructures/tree/binarySearchTreeRecursive/BinarySearchTreeRecursiveTest.java#L83)
[Binary Tree Recursive: postOrderPrint()](src/main/java/dataStructures/tree/binarySearchTree/BinarySearchTreeRecursive.java#L74)|`🍎`|[`✔️`]|`⭕️log(N)` | [`🆗`] [Open](src/test/java/dataStructures/tree/binarySearchTreeRecursive/BinarySearchTreeRecursiveTest.java#L107)
[Binary Tree Recursive: find(data)](src/main/java/dataStructures/tree/binarySearchTree/BinarySearchTreeRecursive.java#L74)|`🍎`|[`✔️`]|`⭕️log(N)` | [`🆗`] [Open](src/test/java/dataStructures/tree/binarySearchTreeRecursive/BinarySearchTreeRecursiveTest.java#L107)
[Binary Tree Recursive: delete()](src/main/java/dataStructures/tree/binarySearchTree/BinarySearchTreeRecursive.java#L157)|`🍎`|[`✔️`]|`⭕️log(N)` | [`🆗`] [Open](src/test/java/dataStructures/tree/binarySearchTreeRecursive/BinarySearchTreeRecursiveTest.java#L131)
[Binary Tree Iterative: insert(data)](src/main/java/dataStructures/tree/binarySearchTree/BinarySearchTreeIterative.java#L13)|`🍎`|[`✔️`]|`⭕️(N)` | [`🆗`] [Open](src/test/java/dataStructures/tree/binarySearchTreeIterative/BinarySearchTreeIterativeTest.java#L16)
[Binary Tree Iterative: preOrderPrint()](src/main/java/dataStructures/tree/binarySearchTree/BinarySearchTreeIterative.java#L50)|`🍎`|[`✔️`]|`⭕️(N)` | [`🆗`] [Open](src/test/java/dataStructures/tree/binarySearchTreeIterative/BinarySearchTreeIterativeTest.java#L16)
[Binary Tree Iterative: inOrderPrint()](src/main/java/dataStructures/tree/binarySearchTree/BinarySearchTreeIterative.java#L80)|`🍎`|[`✔️`]|`⭕️(N)` | [`🆗`] [Open](src/test/java/dataStructures/tree/binarySearchTreeIterative/BinarySearchTreeIterativeTest.java#L40)
[Binary Tree Iterative: postOrderPrint()](src/main/java/dataStructures/tree/binarySearchTree/BinarySearchTreeIterative.java#L107)|`🍎`|[`✔️`]|`⭕️(N)` | [`🆗`] [Open](src/test/java/dataStructures/tree/binarySearchTreeIterative/BinarySearchTreeIterativeTest.java#L64)
[AVL Tree](src/main/java/dataStructures/tree)| `🍎` | [`✍🏻`] |
[Fenwick Tree](src/main/java/dataStructures/tree)| `🍎` | [`✍🏻`] |
[Red-Black Tree](src/main/java/dataStructures/tree)| `🍎` | [`✍🏻`] |
[Segment Tree](src/main/java/dataStructures/tree)| `🍎` | [`✍🏻`] |


- #### Data Structure: [**Graph**](src/main/java/dataStructures/graph)

Algorithm (operation)| Level |  Done  |  Big ⭕️ Notation 
---------------------|-------|--------|---------------------
directed             | `🍎`  | [`✍🏻`]  |
undirected           | `🍎`  | [`✍🏻`]  |

- #### Data Structure: [**Search**](src/main/java/dataStructures/search/binarySearch)

Algorithm (operation)| Level |  Done  |  Time Complexity | Space Complexity | Tests passed
---------------------|-------|--------|------------------|--------------|------------
[Binary Search Iterative](src/main/java/dataStructures/arrays/BinarySearchArray.java#L5)|`🍊`|[`✔️`]|`⭕️(logN)`| `⭕️(1)` | [`🆗`] [Open](src/test/java/dataStructures/arrays/BinarySearchArrayTest.java#L12)
[Binary Search Recursive](src/main/java/dataStructures/arrays/BinarySearchArray.java#L32)|`🍊`|[`✔️`]|`⭕️(log N)`| `⭕️(log N)` |[`🆗`] [Open](src/test/java/dataStructures/arrays/BinarySearchArrayTest.java#L25)


- #### Data Structure: [**Sorting**](src/main/java/sorting)

Algorithm (operation)| Level |  Done  |  Big ⭕️ Notation | Tests passed
---------------------|-------|--------|------------------|--------------
[Buble Sort \<T\>](src/main/java/sorting/BubleSort.java#L5)|`🍏`|[`✔️`]|`⭕️(N^2)` | [`🆗`] [Open](src/test/java/sorting/BubleSortTest.java#L11)
[Quick Sort](src/main/java/sorting/QuickSort.java#L5)|`🍊`|[`✔️`]|`⭕️(N^2)` | [`🆗`] [Open](src/test/java/sorting/QuickSortTest.java#L9)
[MergeSort](src/main/java/sorting/MergeSort.java#L5)|`🍏`|[`✔️`]|`⭕️(N log(N))` | [`🆗`] [Open](src/test/java/sorting/MergeSortTest.java#L9)
[Insertion Sort](src/main/java/sorting/InsertionSort.java#L5)|`🍏`|[`✔️`]|`⭕️(N^2)` | [`🆗`] [Open](src/test/java/sorting/InsertionSortTest.java#L9)

#### 🛠 Use Tests:

```
mvn clean test
```


#### Autor
[meugenom](https://meugenom.com)