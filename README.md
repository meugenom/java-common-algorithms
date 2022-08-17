# 🧠 📚 ⏱ Java Data Structures and Algorithms

Implementation of data structures and algorithms.

 📌 *notation keys:*:
 - `🍏` - easy;
 - `🍊` - medium;
 - `🍎` - hard;
 - `⭕️(1)`, `⭕️log(N)`, `⭕️(N^2)`... - Big O notations;
 - [`✍🏻`] - in progress;
 - [`🙇🏻‍♂️`] - hard to solve;
 - [`❓`] - the solution is not optimal;
 - [`✔️`] - done;
 - [`🆗`] - Test passed Ok;


#### Data Structure: [**Arrays**](src/main/java/com/meugenom/dataStructures/arrays) 

Algorithm (operation)| Level |  Done  |  Big ⭕️ Notation  | Tests passed:
---------------------|-------|--------|-------------------|---------------
[findMin](src/main/java/com/meugenom/dataStructures/arrays/Arrays.java#L45) | `🍏` | [`✔️`] | `⭕️(N)`| [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/arrays/ArraysTest.java#L14)
 merge |`🍏`|[`✍🏻`]
[pop](src/main/java/com/meugenom/dataStructures/arrays/Arrays.java#L20)|`🍏`|[`✔️`]|`⭕️(N)`| [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/arrays/ArraysTest.java#L44)
[push](src/main/java/com/meugenom/dataStructures/arrays/Arrays.java#L7)|`🍏`|[`✔️`]|`⭕️(N)`| [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/arrays/ArraysTest.java#L61)
[remove(position)](src/main/java/com/meugenom/dataStructures/arrays/Arrays.java#L63)|`🍏`|[`✔️`]|`⭕️(N)`| [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/arrays/ArraysTest.java#L26)
[reverse](src/main/java/com/meugenom/dataStructures/arrays/Arrays.java#L87)|`🍊`|[`✔️`]|`⭕️(N)`| [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/arrays/ArraysTest.java#L78)
[reverse(start, end)](src/main/java/com/meugenom/dataStructures/arrays/Arrays.java#L102)|`🍊`|[`✔️`]|`⭕️(N)`
[size](src/main/java/com/meugenom/dataStructures/arrays/Arrays.java#L31)|`🍏`|[`✔️`]|`⭕️(N)`| [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/arrays/ArraysTest.java#L95)
[sort](src/main/java/com/meugenom/dataStructures/arrays/Arrays.java#L117)|`🍊`|[`✔️`]|`⭕️(N^2)`| [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/arrays/ArraysTest.java#L109)
[GenericArray \<T\>](src/main/java/com/meugenom/generics/GenericArray.java)|`🍊`| |



 #### Data Structure: [**Matrix**](src/main/java/com/meugenom/dataStructures/matrix)

Algorithm (operation)| Level |  Done  |  Big ⭕️ Notation | Tests passed
---------------------|-------|--------|------------------|--------------
[rotate](src/main/java/com/meugenom/dataStructures/matrix/Matrix.java#L15)|`🍊`|[`✔️`]|`⭕️(N^2)` | [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/matrix/MatrixTest.java#L10)
[transpose](src/main/java/com/meugenom/dataStructures/matrix/Matrix.java#L24)|`🍊`|[`✔️`]|`⭕️(N^2)` | [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/matrix/MatrixTest.java#L29)
[reflect](src/main/java/com/meugenom/dataStructures/matrix/Matrix.java#L37)|`🍊`|[`✔️`]|`⭕️(N^2)` | [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/matrix/MatrixTest.java#L48)

#### Data Structure: [**Singly Linked List**](src/main/java/com/meugenom/dataStructures/singlyLinkedList)

Algorithm (operation)| Level |  Done  |  Big ⭕️ Notation | Tests passed
---------------------|-------|--------|------------------|--------------
[append(data)](src/main/java/com/meugenom/dataStructures/singlyLinkedList/SinglyLinkedList.java#L7)|`🍏`|[`✔️`]|`⭕️(1)`| [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/singlyLinkedList/SinglyLinkedListTest.java#L79)
[preppend(data)](src/main/java/com/meugenom/dataStructures/singlyLinkedList/SinglyLinkedList.java#L28)|`🍏`|[`✔️`]|`⭕️(N)`| [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/singlyLinkedList/SinglyLinkedListTest.java#L97)
[find(data)](src/main/java/com/meugenom/dataStructures/singlyLinkedList/SinglyLinkedList.java#L136)|`🍏`|[`✔️`]|`⭕️(N)`| [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/singlyLinkedList/SinglyLinkedListTest.java#L165)
[deleteFirst()](src/main/java/com/meugenom/dataStructures/singlyLinkedList/SinglyLinkedList.java#L110)|`🍏`|[`✔️`]|`⭕️(N)`| [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/singlyLinkedList/SinglyLinkedListTest.java#L131)
[deleteLast()](src/main/java/com/meugenom/dataStructures/singlyLinkedList/SinglyLinkedList.java#L7)|`🍏`|[`✔️`]|`⭕️(1)`| [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/singlyLinkedList/SinglyLinkedListTest.java#L148)
[deletePos(position)](src/main/java/com/meugenom/dataStructures/singlyLinkedList/SinglyLinkedList.java#L114)|`🍏`|[`✔️`]|`⭕️(N)`| [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/singlyLinkedList/SinglyLinkedListTest.java#L79)
[length()](src/main/java/com/meugenom/dataStructures/singlyLinkedList/SinglyLinkedList.java#L160)|`🍏`|[`✔️`]|`⭕️(N)`| [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/singlyLinkedList/SinglyLinkedListTest.java#L49)
[reverse()](src/main/java/com/meugenom/dataStructures/singlyLinkedList/SinglyLinkedList.java#L53)|`🍏`|[`✔️`]|`⭕️(N^2)` | [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/singlyLinkedList/SinglyLinkedListTest.java#L30)
[getMid(LinkedList)](src/main/java/com/meugenom/dataStructures/singlyLinkedList/SinglyLinkedList.java#L275)|`🍏`|[`✔️`]|`⭕️(N)` | [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/singlyLinkedList/SinglyLinkedListTest.java#L190)
[merge(LinkedList, LinkedList)](src/main/java/com/meugenom/dataStructures/singlyLinkedList/SinglyLinkedList.java#L243)|`🍊`|[`✔️`]|`⭕️(N)` | [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/singlyLinkedList/SinglyLinkedListTest.java#L211)
[sort()](src/main/java/com/meugenom/dataStructures/singlyLinkedList/SinglyLinkedList.java#L227)|`🍊`|[`✔️`]|`⭕️(N Log(N))` | [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/singlyLinkedList/SinglyLinkedListTest.java#L30)

#### Data Structure: [**Doubly Linked List**](src/main/java/com/meugenom/dataStructures/doublyLinkedList)

Algorithm (operation)| Level |  Done  |  Big ⭕️ Notation | Tests passed
---------------------|-------|--------|------------------|--------------
[append(data)](src/main/java/com/meugenom/dataStructures/doublyLinkedList/DoublyLinkedList.java#L17)|`🍏`|[`✔️`]|`⭕️(1)`| [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/doublyLinkedList/DoublyLinkedListTest.java#L8)
[preppend(data)](src/main/java/com/meugenom/dataStructures/doublyLinkedList/DoublyLinkedList.java#L41)|`🍏`|[`✔️`]|`⭕️(1)`| [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/doublyLinkedList/DoublyLinkedListTest.java#L26)
[deleteFirst()](src/main/java/com/meugenom/dataStructures/doublyLinkedList/DoublyLinkedList.java#L139)|`🍏`|[`✔️`]|`⭕️(1)`| [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/doublyLinkedList/DoublyLinkedListTest.java#L43)
[deleteLast()](src/main/java/com/meugenom/dataStructures/doublyLinkedList/DoublyLinkedList.java#L161)|`🍏`|[`✔️`]|`⭕️(1)`| [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/doublyLinkedList/DoublyLinkedListTest.java#L61)

#### Data Structure: [**Stack**\<Listnode\>](src/main/java/com/meugenom/dataStructures/stack)

Algorithm (operation)| Level |  Done  |  Big ⭕️ Notation | Tests passed
---------------------|-------|--------|------------------|--------------
[getMin()](src/main/java/com/meugenom/dataStructures/stack/Stack.java#L47)|`🍏`|[`✔️`]|`⭕️(N)` | [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/stack/StackTest.java#L10)
[peak()](src/main/java/com/meugenom/dataStructures/stack/Stack.java#L37)|`🍏`|[`✔️`]|`⭕️(1)` | [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/stack/StackTest.java#L26)
[pop()](src/main/java/com/meugenom/dataStructures/stack/Stack.java#L29)|`🍏`|[`✔️`]|`⭕️(1)` | [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/stack/StackTest.java#L44)
[push(data)](src/main/java/com/meugenom/dataStructures/stack/Stack.java#L17)|`🍏`|[`✔️`]|`⭕️(1)` | [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/stack/StackTest.java#L63)

#### Data Structure: [**Queue**](src/main/java/com/meugenom/dataStructures/queue)

Algorithm (operation)| Level |  Done  |  Big ⭕️ Notation 
---------------------|-------|--------|---------------------
isEmpty | `🍏` | [`✍🏻`] |
peak    | `🍏` | [`✍🏻`] |
enqueue | `🍏` | [`✍🏻`] |
dequeue | `🍏` | [`✍🏻`] |

#### Data Structure: [**Hash Table**\<Listnode\>](src/main/java/com/meugenom/dataStructures/hashTable)

Algorithm (operation)| Level |  Done  |  Big ⭕️ Notation 
---------------------|-------|--------|---------------------
hash(key)       | `🍏` | [`✍🏻`] |
set(key, value) | `🍏` | [`✍🏻`] |
delete(key) | `🍏` | [`✍🏻`] |
get(key) | `🍏` | [`✍🏻`] |
has(key) | `🍏` | [`✍🏻`] |
getKeys() | `🍏` | [`✍🏻`] |
getValues() | `🍏` | [`✍🏻`] |

#### Data Structure: [**Heap**](src/main/java/com/meugenom/dataStructures/heap)

Algorithm (operation)| Level |  Done  |  Big ⭕️ Notation 
---------------------|-------|--------|---------------------
add       | `🍎` | [`✍🏻`] |
remove       | `🍎` | [`✍🏻`] |

#### Data Structure: [**Trie**](src/main/java/com/meugenom/dataStructures/trie)

Algorithm (operation)| Level |  Done  |  Big ⭕️ Notation 
---------------------|-------|--------|---------------------
addWord       | `🍎` | [`✍🏻`] |
deleteWord      | `🍎` | [`✍🏻`] |

#### Data Structure: [**Tree**](src/main/java/com/meugenom/dataStructures/tree)

Algorithm (operation)| Level |  Done  |  Big ⭕️ Notation | Tests passed
---------------------|-------|--------|------------------|--------------
[**Binary Tree**](src/main/java/com/meugenom/dataStructures/tree/binarySearchTree)| `🍎` | [`✍🏻`] |
[Binary Tree Recursive: insert(data)](src/main/java/com/meugenom/dataStructures/tree/binarySearchTree/BinarySearchTreeRecursive.java#L13)|`🍎`|[`✔️`]|`⭕️log(N)` | [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/tree/binarySearchTreeRecursive/BinarySearchTreeRecursiveTest.java#L15)
[Binary Tree Recursive: preOrderPrint()](src/main/java/com/meugenom/dataStructures/tree/binarySearchTree/BinarySearchTreeRecursive.java#L39)|`🍎`|[`✔️`]|`⭕️log(N)` | [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/tree/binarySearchTreeRecursive/BinarySearchTreeRecursiveTest.java#L59)
[Binary Tree Recursive: inOrderPrint()](src/main/java/com/meugenom/dataStructures/tree/binarySearchTree/BinarySearchTreeRecursive.java#L55)|`🍎`|[`✔️`]|`⭕️log(N)` | [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/tree/binarySearchTreeRecursive/BinarySearchTreeRecursiveTest.java#L83)
[Binary Tree Recursive: postOrderPrint()](src/main/java/com/meugenom/dataStructures/tree/binarySearchTree/BinarySearchTreeRecursive.java#L74)|`🍎`|[`✔️`]|`⭕️log(N)` | [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/tree/binarySearchTreeRecursive/BinarySearchTreeRecursiveTest.java#L107)
[Binary Tree Recursive: find(data)](src/main/java/com/meugenom/dataStructures/tree/binarySearchTree/BinarySearchTreeRecursive.java#L74)|`🍎`|[`✔️`]|`⭕️log(N)` | [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/tree/binarySearchTreeRecursive/BinarySearchTreeRecursiveTest.java#L107)
[Binary Tree Recursive: delete()](src/main/java/com/meugenom/dataStructures/tree/binarySearchTree/BinarySearchTreeRecursive.java#L157)|`🍎`|[`✔️`]|`⭕️log(N)` | [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/tree/binarySearchTreeRecursive/BinarySearchTreeRecursiveTest.java#L131)
[Binary Tree Iterative: insert(data)](src/main/java/com/meugenom/dataStructures/tree/binarySearchTree/BinarySearchTreeIterative.java#L13)|`🍎`|[`✔️`]|`⭕️(N)` | [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/tree/binarySearchTreeIterative/BinarySearchTreeIterativeTest.java#L16)
[Binary Tree Iterative: preOrderPrint()](src/main/java/com/meugenom/dataStructures/tree/binarySearchTree/BinarySearchTreeIterative.java#L50)|`🍎`|[`✔️`]|`⭕️(N)` | [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/tree/binarySearchTreeIterative/BinarySearchTreeIterativeTest.java#L16)
[Binary Tree Iterative: inOrderPrint()](src/main/java/com/meugenom/dataStructures/tree/binarySearchTree/BinarySearchTreeIterative.java#L80)|`🍎`|[`✔️`]|`⭕️(N)` | [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/tree/binarySearchTreeIterative/BinarySearchTreeIterativeTest.java#L40)
[Binary Tree Iterative: postOrderPrint()](src/main/java/com/meugenom/dataStructures/tree/binarySearchTree/BinarySearchTreeIterative.java#L107)|`🍎`|[`✔️`]|`⭕️(N)` | [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/tree/binarySearchTreeIterative/BinarySearchTreeIterativeTest.java#L64)
[AVL Tree](src/main/java/com/meugenom/dataStructures/tree)| `🍎` | [`✍🏻`] |
[Fenwick Tree](src/main/java/com/meugenom/dataStructures/tree)| `🍎` | [`✍🏻`] |
[Red-Black Tree](src/main/java/com/meugenom/dataStructures/tree)| `🍎` | [`✍🏻`] |
[Segment Tree](src/main/java/com/meugenom/dataStructures/tree)| `🍎` | [`✍🏻`] |


- #### Data Structure: [**Graph**](src/main/java/com/meugenom/dataStructures/graph)

Algorithm (operation)| Level |  Done  |  Big ⭕️ Notation 
---------------------|-------|--------|---------------------
directed             | `🍎`  | [`✍🏻`]  |
undirected           | `🍎`  | [`✍🏻`]  |

- #### Data Structure: [**Search**](src/main/java/com/meugenom/dataStructures/search/binarySearch)

Algorithm (operation)| Level |  Done  |  Big ⭕️ Notation | Tests passed
---------------------|-------|--------|------------------|--------------
[Binary Search Iterative](src/main/java/com/meugenom/dataStructures/arrays/BinarySearchArray.java#L5)|`🍊`|[`✔️`]|`⭕️(N)`| [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/arrays/BinarySearchArrayTest.java#L12)
[Binary Search Recursive](src/main/java/com/meugenom/dataStructures/arrays/BinarySearchArray.java#L32)|`🍊`|[`✔️`]|`⭕️(log N)`| [`🆗`] [Open](src/test/java/com/meugenom/dataStructures/arrays/BinarySearchArrayTest.java#L25)


- #### Data Structure: [**Sorting**](src/main/java/com/meugenom/sorting)

Algorithm (operation)| Level |  Done  |  Big ⭕️ Notation | Tests passed
---------------------|-------|--------|------------------|--------------
[Buble Sort \<T\>](src/main/java/com/meugenom/sorting/BubleSort.java#L5)|`🍏`|[`✔️`]|`⭕️(N^2)` | [`🆗`] [Open](src/test/java/com/meugenom/sorting/BubleSortTest.java#L11)
[Quick Sort](src/main/java/com/meugenom/sorting/QuickSort.java#L5)|`🍊`|[`✔️`]|`⭕️(N^2)` | [`🆗`] [Open](src/test/java/com/meugenom/sorting/QuickSortTest.java#L9)
[MergeSort](src/main/java/com/meugenom/sorting/MergeSort.java#L5)|`🍏`|[`✔️`]|`⭕️(N log(N))` | [`🆗`] [Open](src/test/java/com/meugenom/sorting/MergeSortTest.java#L9)
[Insertion Sort](src/main/java/com/meugenom/sorting/InsertionSort.java#L5)|`🍏`|[`✔️`]|`⭕️(N^2)` | [`🆗`] [Open](src/test/java/com/meugenom/sorting/InsertionSortTest.java#L9)


### Leetcode's Problems by Skills:

 Skills by abc         | Complexity | Language | Solved Problems
-----------------------|------------|----------|------------------------------------
**_Array_** | 🍏 easy | Java |[1. Two Sum](src/main/java/com/meugenom/leetcode/TwoSum/TwoSum.java)
**_Array_** | 🍏 easy | Java |[26. Remove Duplicates from Sorted Array](src/main/java/com/meugenom/leetcode/RemoveDuplicatesFromSortedArray/RemoveDuplicatesFromSortedArray.java)
**_Array_** | 🍏 easy | Java |[35. Search Insert Position](src/main/java/com/meugenom/leetcode/SearchInsertPosition/SearchInsertPosition.java)
**_Array_** | 🍏 easy | Java |[88. Merge Sorted Array](src/main/java/com/meugenom/leetcode/MergeSortedArray/MergeSortedArray.java)
**_Array_** | 🍏 easy | Java | [121. Best Time to Buy and Sell Stock](src/main/java/com/meugenom/leetcode/BestTimeToBuyAndSellStock/BestTimeToBuyAndSellStock.java)
**_Array_** | 🍏 easy | Java |[ 283. Move Zeroes](src/main/java/com/meugenom/leetcode/MoveZeroes/MoveZeroes.java)
**_Array_** | 🍏 easy | Java |[ 977. Squares of a sorted Array](src/main/java/com/meugenom/leetcode/SquaresOfSortedArray/SquaresOfSortedArray.java)
**_Array_** | 🍊 medium | Java |[11. Container with Most Water](src/main/java/com/meugenom/leetcode/ContainerWithMostWater/ContainerWithMostWater.java)
**_Array_** | 🍊 medium | Java |[56. Merge Intervals](src/main/java/com/meugenom/leetcode/MergeIntervals/MergeIntervals.java)
**_Array_** | 🍊 medium | Java |[46. Permutations](src/main/java/com/meugenom/leetcode/Permutations/Permutations.java)
**_Array_** | 🍊 medium | Java |[48. Rotate Image](src/main/java/com/meugenom/leetcode/RotateImage/RotateImage.java)
**_Array_** | 🍊 medium | Java |[53. Maximum Subarray](src/main/java/com/meugenom/leetcode/MaxSubArray/MaxSubArray.java)
**_Array_** | 🍊 medium | Java | [167. Two Sum II](src/main/java/com/meugenom/leetcode/TwoSumII/TwoSumII.java)
**_Array_** | 🍊 medium | Java | [189. Rotate Array](src/main/java/com/meugenom/leetcode/RotateArray/RotateArray.java)
**_Array_** | 🍊 medium | Java | [198. House Robber](src/main/java/com/meugenom/leetcode/HouseRobber/HouseRobber.java)
**_Array_** | 🍎 hard | Java |[4. Median of Two Sorted Arrays](src/main/java/com/meugenom/leetcode/MedianOfTwoSortedArrays/MedianOfTwoSortedArrays.java)
➿ |➿ |➿ |➿
**_Backtracking_** | 🍊 medium | Java | [17. Letter Combinations of a Phone Number](src/main/java/com/meugenom/leetcode/LetterCombinationsOfPhoneNumber/LetterCombinationsOfPhoneNumber.java)
**_Backtracking_** | 🍊 medium | Java | [22.  Generate Parentheses](src/main/java/com/meugenom/leetcode/GenerateParentheses/GenerateParentheses.java)
**_Backtracking_** | 🍊 medium | Java | [39. Combination Sum](src/main/java/com/meugenom/leetcode/CombinationSum/CombinationSum.java)
**_Backtracking_** | 🍊 medium | Java | [46. Permutations](src/main/java/com/meugenom/leetcode/Permutations/Permutations.java)
**_Backtracking_** | 🍊 medium | Java | [77. Combinations](src/main/java/com/meugenom/leetcode/Combinations/Combinations.java)
**_Backtracking_** | 🍊 medium | Java | [79. Word Search](src/main/java/com/meugenom/leetcode/WordSearch/WordSearch.java)
**_Backtracking_** | 🍊 medium | Java | [784. Letter Case Permutation](src/main/java/com/meugenom/leetcode/LetterCasePermutation/LetterCasePermutation.java)
➿ |➿ |➿ |➿
**_Binary Search_** | 🍊 medium | Java | [33. Search In Rotated Sorted Array](src/main/java/com/meugenom/leetcode/SearchInRotatedSortedArray/SearchInRotatedSortedArray.java)
**_Binary Search_** | 🍊 medium | Java | [34. Find First and Last Position of Element in Sorted Array](src/main/java/com/meugenom/leetcode/FindFirstAndLastPositionOfElementInSortedArray/FindFirstAndLastPositionOfElementInSortedArray.java)
**_Binary Search_** | 🍊 medium | Java | [153. Find Minimum in Rotated Sorted Array](src/main/java/com/meugenom/leetcode/FindMinimumInRotatedSortedArray/FindMinimumInRotatedSortedArray.java)
**_Binary Search_** | 🍊 medium | Java | [167. Two Sum II](src/main/java/com/meugenom/leetcode/TwoSumII/TwoSumII.java)
**_Binary Search_** | 🍎 hard | Java |[4. Median of Two Sorted Arrays](src/main/java/com/meugenom/leetcode/MedianOfTwoSortedArrays/MedianOfTwoSortedArrays.java)
➿ |➿ |➿ |➿
**_Binary Tree_** | 🍏 easy | Java | [94. Binary Tree Inorder Traversal](src/main/java/com/meugenom/leetcode/BinaryTreeInorderTraversal/BinaryTreeInorderTraversal.java)
**_Binary Tree_** | 🍏 easy | Java | [100. Same Tree](src/main/java/com/meugenom/leetcode/SameTree/SameTree.java)
**_Binary Tree_** | 🍏 easy | Java | [101. Symmetric Tree](src/main/java/com/meugenom/leetcode/SymmetricTree/SymmetricTree.java)
**_Binary Tree_** | 🍏 easy | Java | [104. Maximum Depth of Binary Tree](src/main/java/com/meugenom/leetcode/MaxDepthOfBinaryTree/MaxDepthOfBinaryTree.java)
**_Binary Tree_** | 🍏 easy | Java | [108. Convert Sorted Array To Binary Search Tree](src/main/java/com/meugenom/leetcode/ConvertSortedArrayToBinarySearchTree/ConvertSortedArrayToBinarySearchTree.java)
**_Binary Tree_** | 🍏 easy | Java | [226. Invert Binary Tree](src/main/java/com/meugenom/leetcode/InvertBinaryTree/InvertBinaryTree.java)
**_Binary Tree_** | 🍏 easy | Java | [543. Diameter of Binary Tree](src/main/java/com/meugenom/leetcode/DiameterOfBinaryTree/DiameterOfBinaryTree.java)
**_Binary Tree_** | 🍏 easy | Java | [617. Merge Two Binary Trees](src/main/java/com/meugenom/leetcode/MergeTwoBinaryTrees/MergeTwoBinaryTrees.java)
**_Binary Tree_** | 🍊 medium | Java |[98. Validate Binary Search Tree](src/main/java/com/meugenom/leetcode/ValidateBinarySearchTree/ValidateBinarySearchTree.java)
**_Binary Tree_** | 🍊 medium | Java |[102. Binary Tree Level Order Traversal](src/main/java/com/meugenom/leetcode/BinaryTreeLevelOrderTraversal/BinaryTreeLevelOrderTraversal.java)
**_Binary Tree_** | 🍊 medium | Java |[105. Construct Binary Tree from Preorder and Inorder Traversal](src/main/java/com/meugenom/leetcode/ConstructBinaryTreeFromPreorderAndInorderTraversal/ConstructBinaryTreeFromPreorderAndInorderTraversal.java)
**_Binary Tree_** | 🍊 medium | Java |[114. Flatten Binary Tree to Linked List](src/main/java/com/meugenom/leetcode/FlattenBinaryTreeToLinkedList/FlattenBinaryTreeToLinkedList.java)
**_Binary Tree_** | 🍊 medium | Java | [116. Populating Next Right Pointers in Each Node](src/main/java/com/meugenom/leetcode/PopulatingNextRightPointersEachNode/PopulatingNextRightPointersEachNode.java)
**_Binary Tree_** | 🍊 medium | Java |[199. Binary Tree Right Side View](src/main/java/com/meugenom/leetcode/BinaryTreeRightSideView/BinaryTreeRightSideView.java)
**_Binary Tree_** | 🍊 medium | Java |[669. Trim a Binary Search Tree](src/main/java/com/meugenom/leetcode/TrimBinarySearchTree/TrimBinarySearchTree.java)
➿ |➿ |➿ |➿
**_Bit Manipulation_** | 🍏 easy | Java |[67. Add Binary](src/main/java/com/meugenom/leetcode/AddBinary/AddBinary.java)
**_Bit Manipulation_** | 🍏 easy | Java |[136. Single Number](src/main/java/com/meugenom/leetcode/SingleNumber/SingleNumber.java)
**_Bit Manipulation_** | 🍏 easy | Java |[191. Number of 1 Bits](src/main/java/com/meugenom/leetcode/NumberOfOneBits/NumberOfOneBits.java)
**_Bit Manipulation_** | 🍏 easy | Java |[338. Counting Bits](src/main/java/com/meugenom/leetcode/CountingBits/CountingBits.java)
➿ |➿ |➿ |➿
**_Breadth-First Search_** | 🍊 medium | Java | [116. Populating Next Right Pointers in Each Node](src/main/java/com/meugenom/leetcode/PopulatingNextRightPointersEachNode/PopulatingNextRightPointersEachNode.java)
**_Breadth-First Search_** | 🍊 medium | Java | [994. Rotting Oranges](src/main/java/com/meugenom/leetcode/RottingOranges/RottingOranges.java)
➿ |➿ |➿ |➿
**_Design_** | 🍏 easy | Java | [155. Min Stack](src/main/java/com/meugenom/leetcode/MinStack/MinStack.java)
➿ |➿ |➿ |➿
**_Depth-First Search_** | 🍏 easy | Java |[733. Flood Fill](src/main/java/com/meugenom/leetcode/FloodFill/FloodFill.java)
**_Depth-First Search_** | 🍊 medium | Java |[98. Validate Binary Search Tree](src/main/java/com/meugenom/leetcode/ValidateBinarySearchTree/ValidateBinarySearchTree.java)
**_Depth-First Search_** | 🍊 medium | Java |[695. Max Area of Islands](src/main/java/com/meugenom/leetcode/MaxAreaOfIslands/MaxAreaOfIslands.java)
➿ |➿ |➿ |➿
**_Divide and Conquer_** | 🍏 easy | Java |[190. Reverse Bits](src/main/java/com/meugenom/leetcode/ReverseBits/ReverseBits.java)
**_Divide and Conquer_** | 🍎 hard | Java |[4. Median of Two Sorted Arrays](src/main/java/com/meugenom/leetcode/MedianOfTwoSortedArrays/MedianOfTwoSortedArrays.java)
➿ |➿ |➿ |➿
**_Dynamic Programming_** | 🍏 easy | Java |[70. Climbing Stairs](src/main/java/com/meugenom/leetcode/ClimbingStairs/ClimbingStairs.java)
**_Dynamic Programming_** | 🍏 easy | Java |[118. Pascal's Triangle](src/main/java/com/meugenom/leetcode/PascalTriangle/PascalTriangle.java)
**_Dynamic Programming_** | 🍏 easy | Java |[119. Pascal's Triangle II](src/main/java/com/meugenom/leetcode/PascalTriangleII/PascalTriangleII.java)
**_Dynamic Programming_** | 🍏 easy | Java | [121. Best Time to Buy and Sell Stock](src/main/java/com/meugenom/leetcode/BestTimeToBuyAndSellStock/BestTimeToBuyAndSellStock.java)
**_Dynamic Programming_** | 🍏 easy | Java | [ 509. Fibonacci Number](src/main/java/com/meugenom/leetcode/FibonacciNumber/FibonacciNumber.java)
**_Dynamic Programming_** | 🍊 medium | Java | [5. Longest Palindromic Substring](src/main/java/com/meugenom/leetcode/LongestPalindromicSubstring/LongestPalindromicSubstring.java)
**_Dynamic Programming_** | 🍊 medium | Java |[53. Maximum Subarray](src/main/java/com/meugenom/leetcode/MaxSubArray/MaxSubArray.java)
**_Dynamic Programming_** | 🍊 medium | Java |[62. Unique Paths](src/main/java/com/meugenom/leetcode/UniquePaths/UniquePaths.java)
**_Dynamic Programming_** | 🍊 medium | Java |[63. Unique Paths II](src/main/java/com/meugenom/leetcode/UniquePathsII/UniquePathsII.java)
**_Dynamic Programming_** | 🍊 medium | Java | [97. Interleaving String](src/main/java/com/meugenom/leetcode/InterleavingString/InterleavingString.java)
**_Dynamic Programming_** | 🍊 medium | Java | [198. House Robber](src/main/java/com/meugenom/leetcode/HouseRobber/HouseRobber.java)
**_Dynamic Programming_** | 🍊 medium | Java | [322. Coin Change](src/main/java/com/meugenom/leetcode/CoinChange/CoinChange.java)
**_Dynamic Programming_** | 🍊 medium | Java |[542. 01 Matrix](src/main/java/com/meugenom/leetcode/NullOneMatrix/NullOneMatrix.java)
➿ |➿ |➿ |➿
**_Hash Table_** | 🍏 easy | Java |[1. Two Sum](src/main/java/com/meugenom/leetcode/TwoSum/TwoSum.java)
**_Hash Table_** | 🍏 easy | Java |[13. Roman to Integer](src/main/java/com/meugenom/leetcode/RomanToInteger/RomanToInteger.java)
**_Hash Table_** | 🍏 easy | Java |[ 202. Happy Number](src/main/java/com/meugenom/leetcode/HappyNumber/HappyNumber.java)
**_Hash Table_** | 🍏 easy | Java |[ 217. Contains Duplicate](src/main/java/com/meugenom/leetcode/ContainsDuplicate/ContainsDuplicate.java)
**_Hash Table_** | 🍏 easy | Java |[ 448. Find All Numbers Disappeared in an Array](src/main/java/com/meugenom/leetcode/FindAllNumbersDisappearedInAnArray/FindAllNumbersDisappearedInAnArray.java)
**_Hash Table_** | 🍏 easy | Java |[ 929. Unique Email Addresses](src/main/java/com/meugenom/leetcode/UniqueEmailAddresses/UniqueEmailAddresses.java)
**_Hash Table_** | 🍊 medium | Java |[3. Longest Substring Without Repeating Characters](src/main/java/com/meugenom/leetcode/LongestSubstringWithoutRepeatingCharacters/LongestSubstringWithoutRepeatingCharacters.java)
➿ |➿ |➿ |➿
**_Linked List_** | 🍏 easy | Java | [21. Merge Two Sorted Lists](src/main/java/com/meugenom/leetcode/MergeTwoSortedLists/MergeTwoSortedLists.java)
**_Linked List_** | 🍏 easy | Java | [160.  Intersection of Two Linked Lists](src/main/java/com/meugenom/leetcode/IntersectionOfTwoLinkedLists/IntersectionOfTwoLinkedLists.java)
**_Linked List_** | 🍏 easy | Java | [ 203. Remove Linked List Elements](src/main/java/com/meugenom/leetcode/RemoveLinkedListElements/RemoveLinkedListElements.java)
**_Linked List_** | 🍏 easy | Java | [ 206. Reverse Linked List](src/main/java/com/meugenom/leetcode/ReverseLinkedList/ReverseLinkedList.java)
**_Linked List_** | 🍏 easy | Java | [ 234. Palindrome Linked List](src/main/java/com/meugenom/leetcode/PalindromeLinkedList/PalindromeLinkedList.java)
**_Linked List_** | 🍏 easy | Java | [ 876. Middle of the Linked List](src/main/java/com/meugenom/leetcode/MiddleOfTheLinkedList/MiddleOfTheLinkedList.java)
**_Linked List_** | 🍊 medium | Java | [2. Add Two Numbers](src/main/java/com/meugenom/leetcode/AddTwoNumbers/AddTwoNumbers.java)
**_Linked List_** | 🍊 medium | Java | [19. Remove Nth Node From End of List](src/main/java/com/meugenom/leetcode/RemoveNthNodeFromEndList/RemoveNthNodeFromEndList.java)
**_Linked List_** | 🍊 medium | Java | [116. Populating Next Right Pointers in Each Node](src/main/java/com/meugenom/leetcode/PopulatingNextRightPointersEachNode/PopulatingNextRightPointersEachNode.java)
**_Linked List_** | 🍊 medium | Java | [148. Sort List](src/main/java/com/meugenom/leetcode/SortList/SortList.java)
**_Linked List_** | 🍎 hard   | Java |[23. Merge k Sorted Lists](src/main/java/com/meugenom/leetcode/MergeKSortedLists/MergeKSortedLists.java)
➿ |➿ |➿ |➿
**_Math_** | 🍏 easy | Java | [7. Reverse Integer](src/main/java/com/meugenom/leetcode/ReverseInteger/ReverseInteger.java)
**_Math_** | 🍏 easy | Java | [9. Palindrome Number](src/main/java/com/meugenom/leetcode/PalindromeNumber/PalindromeNumber.java)
**_Math_** | 🍏 easy | Java | [231. Power of Two](src/main/java/com/meugenom/leetcode/PowerOfTwo/PowerOfTwo.java)
**_Math_** | 🍊 medium |Java | [2. Add Two Numbers](src/main/java/com/meugenom/leetcode/AddTwoNumbers/AddTwoNumbers.java)
➿ |➿ |➿ |➿
**_Matrix_** | 🍏 easy | Java |[733. Flood Fill](src/main/java/com/meugenom/leetcode/FloodFill/FloodFill.java)
**_Matrix_** | 🍊 medium | Java |[48. Rotate Image](src/main/java/com/meugenom/leetcode/RotateImage/RotateImage.java)
**_Matrix_** | 🍊 medium | Java |[695. Max Area of Islands](src/main/java/com/meugenom/leetcode/MaxAreaOfIslands/MaxAreaOfIslands.java)
➿ |➿ |➿ |➿
**_Memoization_** | 🍏 easy | Java | [ 509. Fibonacci Number](src/main/java/com/meugenom/leetcode/FibonacciNumber/FibonacciNumber.java)
➿ |➿ |➿ |➿
**_Merge Sort_** | 🍊 medium | Java | [148. Sort List](src/main/java/com/meugenom/leetcode/SortList/SortList.java)
**_Merge Sort_** | 🍎 hard | Java | [Merge k Sorted Lists](src/main/java/com/meugenom/leetcode/MergeKSortedLists/MergeKSortedLists.java)
➿ |➿ |➿ |➿
**_Number Theory_** | 🍊 medium | Java | [204. Count Primes](src/main/java/com/meugenom/leetcode/CountPrimes/CountPrimes.java)
➿ |➿ |➿ |➿
**_Recursion_** | 🍏 easy | Java | [21. Merge Two Sorted Lists](src/main/java/com/meugenom/leetcode/MergeTwoSortedLists/MergeTwoSortedLists.java)
**_Recursion_** | 🍏 easy | Java |[191. Number of 1 Bits](src/main/java/com/meugenom/leetcode/NumberOfOneBits/NumberOfOneBits.java)
**_Recursion_** | 🍏 easy | Java | [ 206. Reverse Linked List](src/main/java/com/meugenom/leetcode/ReverseLinkedList/ReverseLinkedList.java)
**_Recursion_** | 🍏 easy | Java | [ 234. Palindrome Linked List](src/main/java/com/meugenom/leetcode/PalindromeLinkedList/PalindromeLinkedList.java)
**_Recursion_** | 🍏 easy | Java | [231. Power of Two](src/main/java/com/meugenom/leetcode/PowerOfTwo/PowerOfTwo.java)
**_Recursion_** | 🍏 easy | Java | [ 509. Fibonacci Number](src/main/java/com/meugenom/leetcode/FibonacciNumber/FibonacciNumber.java)
**_Recursion_** | 🍊 medium | Java | [2. Add Two Numbers](src/main/java/com/meugenom/leetcode/AddTwoNumbers/AddTwoNumbers.java)
➿ |➿ |➿ |➿
**_Sliding Window_** | 🍏 easy | Java | [643. Maximum Average Subarray I](src/main/java/com/meugenom/leetcode/MaximumAverageSubarrayI/MaximumAverageSubarrayI.java)
**_Sliding Window_** | 🍊 medium | Java | [3. Longest Substring Without Repeating Characters](src/main/java/com/meugenom/leetcode/LongestSubstringWithoutRepeatingCharacters/LongestSubstringWithoutRepeatingCharacters.java)
**_Sliding Window_** | 🍊 medium | Java | [438. Find All Anagrams in a String](src/main/java/com/meugenom/leetcode/FindAllAnagramsInAString/FindAllAnagramsInAString.java)
**_Sliding Window_** | 🍊 medium | Java | [567. Permutation in String](src/main/java/com/meugenom/leetcode/PermutationInString/PermutationInString.java)
➿ |➿ |➿ |➿
**_Stack_** | 🍏 easy | Java | [20. Valid Parentheses](src/main/java/com/meugenom/leetcode/ValidParentheses/ValidParentheses.java)
**_Stack_** | 🍏 easy | Java | [155. Min Stack](src/main/java/com/meugenom/leetcode/MinStack/MinStack.java)
**_Stack_** | 🍊 medium | Java | [394. Decode String](src/main/java/com/meugenom/leetcode/DecodeString/DecodeString.java)
**_Stack_** | 🍊 medium | Java | [1003. Check If Word Is Valid After Substitutions](src/main/java/com/meugenom/leetcode/CheckIfWordIsValidAfterSubstitutions/CheckIfWordIsValidAfterSubstitutions.java)
➿ |➿ |➿ |➿
**_Sorting_** | 🍏 easy | Java |[88. Merge Sorted Array](src/main/java/com/meugenom/leetcode/MergeSortedArray/MergeSortedArray.java)
**_Sorting_** | 🍏 easy | Java |[ 977. Squares of a sorted Array](src/main/java/com/meugenom/leetcode/SquaresOfSortedArray/SquaresOfSortedArray.java)
**_Sorting_** | 🍊 medium | Java |[56. Merge Intervals](src/main/java/com/meugenom/leetcode/MergeIntervals/MergeIntervals.java)
➿ |➿ |➿ |➿
**_String_** | 🍏 easy | Java |[ 14. Longest Common Prefix](src/main/java/com/meugenom/leetcode/LongestCommonPrefix/LongestCommonPrefix.java)
**_String_** | 🍏 easy | Java |[ 242. Is Anagram](src/main/java/com/meugenom/leetcode/IsAnagram/IsAnagram.java)
**_String_** | 🍏 easy | Java |[ 344. Reverse String](src/main/java/com/meugenom/leetcode/ReverseString/ReverseString.java)
**_String_** | 🍏 easy | Java |[ 387. First Unique Character in a String](src/main/java/com/meugenom/leetcode/FirstUniqueCharacterInAString/FirstUniqueCharacterInAString.java)
**_String_** | 🍏 easy | Java |[ 557. Reverse Words in a String III](src/main/java/com/meugenom/leetcode/ReverseWordsInStringIII/ReverseWordsInStringIII.java)
**_String_** | 🍏 easy | Java |[ 771. Jewels and Stones](src/main/java/com/meugenom/leetcode/JewelsAndStones/JewelsAndStones.java)
**_String_** | 🍊 medium | Java |[3. Longest Substring Without Repeating Characters](src/main/java/com/meugenom/leetcode/LongestSubstringWithoutRepeatingCharacters/LongestSubstringWithoutRepeatingCharacters.java)
**_String_** | 🍊 medium | Java | [5. Longest Palindromic Substring](src/main/java/com/meugenom/leetcode/LongestPalindromicSubstring/LongestPalindromicSubstring.java)
**_String_** | 🍊 medium | Java | [567. Permutation in String](src/main/java/com/meugenom/leetcode/PermutationInString/PermutationInString.java)
**_String_** | 🍊 medium | Java | [784. Letter Case Permutation](src/main/java/com/meugenom/leetcode/LetterCasePermutation/LetterCasePermutation.java)
➿ |➿ |➿ |➿
**_Tree_** | 🍏 easy | Java |[ [617. Merge Two Binary Trees](src/main/java/com/meugenom/leetcode/MergeTwoBinaryTrees/MergeTwoBinaryTrees.java)
**_Tree_** | 🍊 medium | Java | [116. Populating Next Right Pointers in Each Node](src/main/java/com/meugenom/leetcode/PopulatingNextRightPointersEachNode/PopulatingNextRightPointersEachNode.java)
**_Tree_** | 🍊 medium | Java | [687. Longest Unvalued Path](src/main/java/com/meugenom/leetcode/LongestUnivaluePath/LongestUnivaluePath.java)
➿ |➿ |➿ |➿
**_Two Pointers_** | 🍏 easy | Java |[ 202. Happy Number](src/main/java/com/meugenom/leetcode/HappyNumber/HappyNumber.java)
**_Two Pointers_** | 🍏 easy | Java |[ 283. Move Zeroes](src/main/java/com/meugenom/leetcode/MoveZeroes/MoveZeroes.java)
**_Two Pointers_** | 🍏 easy | Java |[ 344. Reverse String](src/main/java/com/meugenom/leetcode/ReverseString/ReverseString.java)
**_Two Pointers_** | 🍏 easy | Java |[ 557. Reverse Words in a String III](src/main/java/com/meugenom/leetcode/ReverseWordsInStringIII/ReverseWordsInStringIII.java)
**_Two Pointers_** | 🍊 medium | Java |[11. Container with Most Water](src/main/java/com/meugenom/leetcode/ContainerWithMostWater/ContainerWithMostWater.java)
**_Two Pointers_** | 🍊 medium | Java | [19. Remove Nth Node From End of List](src/main/java/com/meugenom/leetcode/RemoveNthNodeFromEndList/RemoveNthNodeFromEndList.java)
**_Two Pointers_** | 🍊 medium | Java | [167. Two Sum II](src/main/java/com/meugenom/leetcode/TwoSumII/TwoSumII.java)
**_Two Pointers_** | 🍊 medium | Java | [189. Rotate Array](src/main/java/com/meugenom/leetcode/RotateArray/RotateArray.java)
**_Two Pointers_** | 🍊 medium | Java | [567. Permutation in String](src/main/java/com/meugenom/leetcode/PermutationInString/PermutationInString.java)
➿ |➿ |➿ |➿
**_Union Find_** | 🍊 medium | Java | [200. Number of Islands](src/main/java/com/meugenom/leetcode/NumberIslands/NumberIslands.java)

**_need think_**
- [ [`✔️ Java`] `🍊` 287. Find the Duplicate Number](src/main/java/com/meugenom/leetcode/FindtheDuplicateNumber/FindtheDuplicateNumber.java)


### HackerRank

- [ [`✔️ Java`] A very big sum](src/main/java/com/meugenom/hackerrank/AVeryBigSum.java)
- [ [`✔️ Java`] Compare the triplets](src/main/java/com/meugenom/hackerrank/CompareTheTriplets.java)

### CodeWars

- [ [`✔️ JS`] Build Tower](src/main/js/codewars/buildTower.js)
- [ [`✔️ JS`] Camel Case](src/main/js/codewars/camelCase.js)
- [ [`✔️ Java`] Counting Duplicates](src/main/java/com/meugenom/codewars/CountingDuplicates.java)
- [ [`✔️ Java`] Help The Book Seller](src/main/java/com/meugenom/codewars/HelpTheBookSeller.java)
- [ [`✔️ Java`] Simple Encryption](src/main/java/com/meugenom/codewars/SimpleEncryption.java)
- [ [`✔️ JS`] Pete The Baker](src/main/js/codewars/peteTheBaker.js)
- [ [`✔️ Java`] Playing With Digits](src/main/java/com/meugenom/codewars/PlayingWithDigits.java)


### 🛠 Use Unit Tests:

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
