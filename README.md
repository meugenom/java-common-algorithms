# 🧠 📚 ⏱ Java Data Structures and Algorithms

Implementations of data structures and algorithms in Java.

🛠 Use Unit Tests:

- run all tests
```
mvn clean test
```
- and result in the terminal:
```
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running com.meugenom.dataStructures.search.binarySearch.BinarySearchTest
Test - Binary Search : search() - passed ok
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 sec
Running com.meugenom.dataStructures.arrays.ArraysTest
Test - Arrays : findMin() - passed ok
Test - Arrays : remove(index) - passed ok
Test - Arrays : pop() - passed ok
Test - Arrays : push(element) - passed ok
Test - Arrays : reverse() - passed ok
...
Results :
Tests run: 17, Failures: 0, Errors: 0, Skipped: 0
```

 📌 *notation keys:*:
 - `🟢` - easy;
 - `🟡` - medium;
 - `🔴` - hard;
 - `⭕️(1)`, `⭕️log(N)`, `⭕️(N^2)`... - Big O notations;
 - [`✍🏻`] - by proccess;
 - [`🙇🏻‍♂️`] - hard to solve;
 - [`❓`] - the solution is not optimal;
 - [`✔️`] - done;
 - [`🆗`] - Test passed Ok;

### List of Implementations:


- #### Data Structure: [**Arrays**](src/main/java/com/meugenom/dataStructures/arrays) 

Algorithm (operation)| Level |  Done  |  Big ⭕️ Notation  | Tests passed:
---------------------|-------|--------|-------------------|---------------
[findMin](src/main/java/com/meugenom/dataStructures/arrays/Arrays.java#L45) | `🟢` | [`✔️`] | `⭕️(N)`| [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/arrays/ArraysTest.java#L14)
 merge |`🟢`|[`✍🏻`]
[pop](src/main/java/com/meugenom/dataStructures/arrays/Arrays.java#L20)|`🟢`|[`✔️`]|`⭕️(N)`| [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/arrays/ArraysTest.java#L44)
[push](src/main/java/com/meugenom/dataStructures/arrays/Arrays.java#L7)|`🟢`|[`✔️`]|`⭕️(N)`| [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/arrays/ArraysTest.java#L61)
[remove(position)](src/main/java/com/meugenom/dataStructures/arrays/Arrays.java#L63)|`🟢`|[`✔️`]|`⭕️(N)`| [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/arrays/ArraysTest.java#L26)
[reverse](src/main/java/com/meugenom/dataStructures/arrays/Arrays.java#L87)|`🟡`|[`✔️`]|`⭕️(N)`| [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/arrays/ArraysTest.java#L78)
[reverse(start, end)](src/main/java/com/meugenom/dataStructures/arrays/Arrays.java#L102)|`🟡`|[`✔️`]|`⭕️(N)`
[size](src/main/java/com/meugenom/dataStructures/arrays/Arrays.java#L31)|`🟢`|[`✔️`]|`⭕️(N)`| [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/arrays/ArraysTest.java#L95)
[sort](src/main/java/com/meugenom/dataStructures/arrays/Arrays.java#L117)|`🟡`|[`✔️`]|`⭕️(N^2)`| [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/arrays/ArraysTest.java#L109)


 - #### Data Structure: [**Matrix**](src/main/java/com/meugenom/dataStructures/matrix)

Algorithm (operation)| Level |  Done  |  Big ⭕️ Notation | Tests passed
---------------------|-------|--------|------------------|--------------
[rotate](src/main/java/com/meugenom/dataStructures/matrix/Matrix.java#L15)|`🟡`|[`✔️`]|`⭕️(N^2)` | [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/matrix/MatrixTest.java#L10)
[transpose](src/main/java/com/meugenom/dataStructures/matrix/Matrix.java#L24)|`🟡`|[`✔️`]|`⭕️(N^2)` | [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/matrix/MatrixTest.java#L29)
[reflect](src/main/java/com/meugenom/dataStructures/matrix/Matrix.java#L37)|`🟡`|[`✔️`]|`⭕️(N^2)` | [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/matrix/MatrixTest.java#L48)

- #### Data Structure: [**Singly Linked List**](src/main/java/com/meugenom/dataStructures/singlyLinkedList)

Algorithm (operation)| Level |  Done  |  Big ⭕️ Notation | Tests passed
---------------------|-------|--------|------------------|--------------
[append(data)](src/main/java/com/meugenom/dataStructures/singlyLinkedList/SinglyLinkedList.java#L7)|`🟢`|[`✔️`]|`⭕️(1)`| [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/singlyLinkedList/SinglyLinkedListTest.java#L79)
[preppend(data)](src/main/java/com/meugenom/dataStructures/singlyLinkedList/SinglyLinkedList.java#L28)|`🟢`|[`✔️`]|`⭕️(N)`| [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/singlyLinkedList/SinglyLinkedListTest.java#L97)
[find(data)](src/main/java/com/meugenom/dataStructures/singlyLinkedList/SinglyLinkedList.java#L136)|`🟢`|[`✔️`]|`⭕️(N)`| [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/singlyLinkedList/SinglyLinkedListTest.java#L165)
[deleteFirst()](src/main/java/com/meugenom/dataStructures/singlyLinkedList/SinglyLinkedList.java#L110)|`🟢`|[`✔️`]|`⭕️(N)`| [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/singlyLinkedList/SinglyLinkedListTest.java#L131)
[deleteLast()](src/main/java/com/meugenom/dataStructures/singlyLinkedList/SinglyLinkedList.java#L7)|`🟢`|[`✔️`]|`⭕️(1)`| [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/singlyLinkedList/SinglyLinkedListTest.java#L148)
[deletePos(position)](src/main/java/com/meugenom/dataStructures/singlyLinkedList/SinglyLinkedList.java#L114)|`🟢`|[`✔️`]|`⭕️(N)`| [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/singlyLinkedList/SinglyLinkedListTest.java#L79)
[length()](src/main/java/com/meugenom/dataStructures/singlyLinkedList/SinglyLinkedList.java#L160)|`🟢`|[`✔️`]|`⭕️(N)`| [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/singlyLinkedList/SinglyLinkedListTest.java#L49)
[reverse()](src/main/java/com/meugenom/dataStructures/singlyLinkedList/SinglyLinkedList.java#L53)|`🟢`|[`✔️`]|`⭕️(N^2)` | [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/singlyLinkedList/SinglyLinkedListTest.java#L30)

- #### Data Structure: [**Doubly Linked List**](src/main/java/com/meugenom/dataStructures/doublyLinkedList)

Algorithm (operation)| Level |  Done  |  Big ⭕️ Notation | Tests passed
---------------------|-------|--------|------------------|--------------
[append(data)](src/main/java/com/meugenom/dataStructures/doublyLinkedList/DoublyLinkedList.java#L17)|`🟢`|[`✔️`]|`⭕️(1)`| [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/doublyLinkedList/DoublyLinkedListTest.java#L8)
[preppend(data)](src/main/java/com/meugenom/dataStructures/doublyLinkedList/DoublyLinkedList.java#L41)|`🟢`|[`✔️`]|`⭕️(1)`| [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/doublyLinkedList/DoublyLinkedListTest.java#L26)
[deleteFirst()](src/main/java/com/meugenom/dataStructures/doublyLinkedList/DoublyLinkedList.java#L139)|`🟢`|[`✔️`]|`⭕️(1)`| [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/doublyLinkedList/DoublyLinkedListTest.java#L43)
[deleteLast()](src/main/java/com/meugenom/dataStructures/doublyLinkedList/DoublyLinkedList.java#L161)|`🟢`|[`✔️`]|`⭕️(1)`| [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/doublyLinkedList/DoublyLinkedListTest.java#L61)

- #### Data Structure: [**Stack**\<Listnode\>](src/main/java/com/meugenom/dataStructures/stack)

Algorithm (operation)| Level |  Done  |  Big ⭕️ Notation | Tests passed
---------------------|-------|--------|------------------|--------------
[getMin()](src/main/java/com/meugenom/dataStructures/stack/Stack.java#L47)|`🟢`|[`✔️`]|`⭕️(N)` | [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/stack/StackTest.java#L10)
[peak()](src/main/java/com/meugenom/dataStructures/stack/Stack.java#L37)|`🟢`|[`✔️`]|`⭕️(1)` | [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/stack/StackTest.java#L26)
[pop()](src/main/java/com/meugenom/dataStructures/stack/Stack.java#L29)|`🟢`|[`✔️`]|`⭕️(1)` | [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/stack/StackTest.java#L44)
[push(data)](src/main/java/com/meugenom/dataStructures/stack/Stack.java#L17)|`🟢`|[`✔️`]|`⭕️(1)` | [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/stack/StackTest.java#L63)

- #### Data Structure: [**Queue**](src/main/java/com/meugenom/dataStructures/queue)

Algorithm (operation)| Level |  Done  |  Big ⭕️ Notation 
---------------------|-------|--------|---------------------
isEmpty | `🟢` | [`✍🏻`] |
peak    | `🟢` | [`✍🏻`] |
enqueue | `🟢` | [`✍🏻`] |
dequeue | `🟢` | [`✍🏻`] |

- #### Data Structure: [**Hash Table**\<Listnode\>](src/main/java/com/meugenom/dataStructures/hashTable)

Algorithm (operation)| Level |  Done  |  Big ⭕️ Notation 
---------------------|-------|--------|---------------------
hash(key)       | `🟢` | [`✍🏻`] |
set(key, value) | `🟢` | [`✍🏻`] |
delete(key) | `🟢` | [`✍🏻`] |
get(key) | `🟢` | [`✍🏻`] |
has(key) | `🟢` | [`✍🏻`] |
getKeys() | `🟢` | [`✍🏻`] |
getValues() | `🟢` | [`✍🏻`] |

- #### Data Structure: [**Heap**](src/main/java/com/meugenom/dataStructures/heap)

Algorithm (operation)| Level |  Done  |  Big ⭕️ Notation 
---------------------|-------|--------|---------------------
add       | `🔴` | [`✍🏻`] |
remove       | `🔴` | [`✍🏻`] |

- #### Data Structure: [**Trie**](src/main/java/com/meugenom/dataStructures/trie)

Algorithm (operation)| Level |  Done  |  Big ⭕️ Notation 
---------------------|-------|--------|---------------------
addWord       | `🔴` | [`✍🏻`] |
deleteWord      | `🔴` | [`✍🏻`] |

- #### Data Structure: [**Tree**](src/main/java/com/meugenom/dataStructures/tree)

Algorithm (operation)| Level |  Done  |  Big ⭕️ Notation | Tests passed
---------------------|-------|--------|------------------|--------------
[**Binary Search Tree**](src/main/java/com/meugenom/dataStructures/tree/binarySearchTree)| `🔴` | [`✍🏻`] |
[BST Recursive: insert(data)](src/main/java/com/meugenom/dataStructures/tree/binarySearchTree/BinarySearchTreeRecursive.java#L13)|`🔴`|[`✔️`]|`⭕️log(N)` | [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/tree/binarySearchTreeRecursive/BinarySearchTreeRecursiveTest.java#L15)
[BST Recursive: preOrderPrint()](src/main/java/com/meugenom/dataStructures/tree/binarySearchTree/BinarySearchTreeRecursive.java#L39)|`🔴`|[`✔️`]|`⭕️log(N)` | [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/tree/binarySearchTreeRecursive/BinarySearchTreeRecursiveTest.java#L59)
[BST Recursive: inOrderPrint()](src/main/java/com/meugenom/dataStructures/tree/binarySearchTree/BinarySearchTreeRecursive.java#L55)|`🔴`|[`✔️`]|`⭕️log(N)` | [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/tree/binarySearchTreeRecursive/BinarySearchTreeRecursiveTest.java#L83)
[BST Recursive: postOrderPrint()](src/main/java/com/meugenom/dataStructures/tree/binarySearchTree/BinarySearchTreeRecursive.java#L74)|`🔴`|[`✔️`]|`⭕️log(N)` | [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/tree/binarySearchTreeRecursive/BinarySearchTreeRecursiveTest.java#L107)
[BST Recursive: find(data)](src/main/java/com/meugenom/dataStructures/tree/binarySearchTree/BinarySearchTreeRecursive.java#L74)|`🔴`|[`✔️`]|`⭕️log(N)` | [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/tree/binarySearchTreeRecursive/BinarySearchTreeRecursiveTest.java#L107)
[BST Recursive: delete()](src/main/java/com/meugenom/dataStructures/tree/binarySearchTree/BinarySearchTreeRecursive.java#L157)|`🔴`|[`✔️`]|`⭕️log(N)` | [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/tree/binarySearchTreeRecursive/BinarySearchTreeRecursiveTest.java#L131)
[BST Iterative: insert(data)](src/main/java/com/meugenom/dataStructures/tree/binarySearchTree/BinarySearchTreeIterative.java#L13)|`🔴`|[`✔️`]|`⭕️(N)` | [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/tree/binarySearchTreeIterative/BinarySearchTreeIterativeTest.java#L16)
[BST Iterative: preOrderPrint()](src/main/java/com/meugenom/dataStructures/tree/binarySearchTree/BinarySearchTreeIterative.java#L50)|`🔴`|[`✔️`]|`⭕️(N)` | [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/tree/binarySearchTreeIterative/BinarySearchTreeIterativeTest.java#L16)
[BST Iterative: inOrderPrint()](src/main/java/com/meugenom/dataStructures/tree/binarySearchTree/BinarySearchTreeIterative.java#L80)|`🔴`|[`✔️`]|`⭕️(N)` | [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/tree/binarySearchTreeIterative/BinarySearchTreeIterativeTest.java#L40)
[BST Iterative: postOrderPrint()](src/main/java/com/meugenom/dataStructures/tree/binarySearchTree/BinarySearchTreeIterative.java#L107)|`🔴`|[`✔️`]|`⭕️(N)` | [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/tree/binarySearchTreeIterative/BinarySearchTreeIterativeTest.java#L64)
[AVL Tree](src/main/java/com/meugenom/dataStructures/tree)| `🔴` | [`✍🏻`] |
[Fenwick Tree](src/main/java/com/meugenom/dataStructures/tree)| `🔴` | [`✍🏻`] |
[Red-Black Tree](src/main/java/com/meugenom/dataStructures/tree)| `🔴` | [`✍🏻`] |
[Segment Tree](src/main/java/com/meugenom/dataStructures/tree)| `🔴` | [`✍🏻`] |



- #### Data Structure: [**Graph**](src/main/java/com/meugenom/dataStructures/graph)

Algorithm (operation)| Level |  Done  |  Big ⭕️ Notation 
---------------------|-------|--------|---------------------
directed             | `🔴`  | [`✍🏻`]  |
undirected           | `🔴`  | [`✍🏻`]  |

- #### Data Structure: [**Search**](src/main/java/com/meugenom/dataStructures/search/binarySearch)

Algorithm (operation)| Level |  Done  |  Big ⭕️ Notation | Tests passed
---------------------|-------|--------|------------------|--------------
[Binary Search](src/main/java/com/meugenom/dataStructures/search/binarySearch/BinarySearch.java#L5)|`🟢`|[`✔️`]|`⭕️(N)` | [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/search/binarySearch/BinarySearchTest.java#L10)


- #### Data Structure: [**Sorting**](src/main/java/com/meugenom/sorting)

Algorithm (operation)| Level |  Done  |  Big ⭕️ Notation | Tests passed
---------------------|-------|--------|------------------|--------------
[Buble Sort \<T\>](src/main/java/com/meugenom/sorting/BubleSort.java#L5)|`🟢`|[`✔️`]|`⭕️(N^2)` | [`🆗`] [Open](src/test/java/com/meugenom/sorting/BubleSortTest.java#L11)
[Quick Sort](src/main/java/com/meugenom/sorting/QuickSort.java#L5)|`🟢`|[`✔️`]|`⭕️(N^2)` | [`🆗`] [Open](src/test/java/com/meugenom/sorting/QuickSortTest.java#L9)
[MergeSort](src/main/java/com/meugenom/sorting/MergeSort.java#L5)|`🟢`|[`✔️`]|`⭕️(N log(N))` | [`🆗`] [Open](src/test/java/com/meugenom/sorting/MergeSortTest.java#L9)
[Insertion Sort](src/main/java/com/meugenom/sorting/InsertionSort.java#L5)|`🟢`|[`✔️`]|`⭕️(N^2)` | [`🆗`] [Open](src/test/java/com/meugenom/sorting/InsertionSortTest.java#L9)

- [_Generic Array_](src/main/java/com/meugenom/generics)
    - [ [`✔️`] `🟢` GenericArray](src/main/java/com/meugenom/generics/GenericArray.java)

### Leetcode tasks:

_easy:_
- [ [`✔️`] `🟢` 1. Two Sum](src/main/java/com/meugenom/leetcode/TwoSum)
- [ [`✔️`] `🟢` 7. Reverse Integer](src/main/java/com/meugenom/leetcode/ReverseInteger)
- [ [`✔️`] `🟢` 9. Palindrome Number](src/main/java/com/meugenom/leetcode/PalindromeNumber)
- [ [`✔️`] `🟢` 13. Roman to Integer](src/main/java/com/meugenom/leetcode/RomanToInteger)
- [ [`✔️`] `🟢` 20. Valid Parentheses](src/main/java/com/meugenom/leetcode/ValidParentheses)
- [ [`✔️`] `🟢` 21. Merge Two Sorted Lists](src/main/java/com/meugenom/leetcode/MergeTwoSortedLists)
- [ [`✔️`] `🟢` 35. Search Insert Position](src/main/java/com/meugenom/leetcode/SearchInsertPosition)
- [ [`✔️`] `🟢` 53. Maximum Subarray](src/main/java/com/meugenom/leetcode/MaxSubArray)
- [ [`✔️`] `🟢` 88. Merge Sorted Array](src/main/java/com/meugenom/leetcode/MergeSortedArray)
- [ [`✔️`] `🟢` 121. Best Time to Buy and Sell Stock](src/main/java/com/meugenom/leetcode/BestTimeToBuyAndSellStock)
- [ [`✔️`] `🟢` 136. Single Number](src/main/java/com/meugenom/leetcode/SingleNumber)
- [ [`✔️`] `🟢` 155. Min Stack](src/main/java/com/meugenom/leetcode/MinStack)
- [ [`✔️`] `🟢` 202. Happy Number](src/main/java/com/meugenom/leetcode/HappyNumber)
- [ [`✔️`] `🟢` 206. Reverse Linked List](src/main/java/com/meugenom/leetcode/ReverseLinkedList)
- [ [`❓`] `🟢` 234. Palindrome Linked List](src/main/java/com/meugenom/leetcode/PalindromeLinkedList) [-] 69/85 test cases passed.
- [ [`✔️`] `🟢` 344. Reverse String](src/main/java/com/meugenom/leetcode/ReverseString)
- [ [`✔️`] `🟢` 771. Jewels and Stones](src/main/java/com/meugenom/leetcode/JewelsAndStones)

_medium:_
- [ [`✔️`] `🟡` 2. Add Two Numbers](src/main/java/com/meugenom/leetcode/AddTwoNumbers)
- [ [`✔️`] `🟡` 3. Longest Substring Without Repeating Characters](src/main/java/com/meugenom/leetcode/LongestSubstringWithoutRepeatingCharacters)
- [ [`✔️`] `🟡` 48. Rotate Image](src/main/java/com/meugenom/leetcode/RotateImage)
- [ [`❓`] `🟡` 148. Sort List](src/main/java/com/meugenom/leetcode/SortList)  26/28 test cases passed
- [ [`❓`] `🟡` 189. Rotate Array](src/main/java/com/meugenom/leetcode/RotateArray) 37/38 test cases passed.
- [ [`✔️`] `🟡` 198. House Robber](src/main/java/com/meugenom/leetcode/HouseRobber)
- [ [`✔️`] `🟡` 287. Find the Duplicate Number](src/main/java/com/meugenom/leetcode/FindtheDuplicateNumber)

_hard:_
- [ [`✔️`] `🔴` 4. Median of Two Sorted Arrays](src/main/java/com/meugenom/leetcode/MedianOfTwoSortedArrays)
- [ [`✔️`] `🔴` 23. Merge k Sorted Lists](src/main/java/com/meugenom/leetcode/MergeKSortedLists)

### HackerRank

- [ [`✔️`] `🟢` A very big sum](src/main/java/com/meugenom/hackerrank/AVeryBigSum.java)
- [ [`✔️`] `🟢` Compare the triplets](src/main/java/com/meugenom/hackerrank/CompareTheTriplets.java)
