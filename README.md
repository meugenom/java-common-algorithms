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
Running dev.eugenem.dataStructures.SinglyLinkedList.SinglyLinkedListTest
Test - Singly linked list : autoFill() - passed ok
Test - Singly linked list : reverse() - passed ok
Test - Singly linked list : length() - passed ok
Test - Singly linked list : create linked list with NULL array - passed ok
Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.013 sec
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

### List of Implementations:


- #### Data Structure: [**Arrays**](src/main/java/dev/eugenem/dataStructures/arrays) 

Algorithm (operation)| Level |  Done  |  Big ⭕️ Notation 
---------------------|-------|--------|---------------------
[findMin](src/main/java/dev/eugenem/dataStructures/arrays/Arrays.java#L45) | `🟢` | [`✔️`] | `⭕️(N)`
 merge |`🟢`|[`✍🏻`]|
[pop](src/main/java/dev/eugenem/dataStructures/arrays/Arrays.java#L20)|`🟢`|[`✔️`]|`⭕️(N)`
[push](src/main/java/dev/eugenem/dataStructures/arrays/Arrays.java#L7)|`🟢`|[`✔️`]|`⭕️(N)`
[remove(position)](src/main/java/dev/eugenem/dataStructures/arrays/Arrays.java#L63)|`🟢`|[`✔️`]|`⭕️(N)`
[reverse](src/main/java/dev/eugenem/dataStructures/arrays/Arrays.java#L87)|`🟡`|[`✔️`]|`⭕️(N)`
[reverse(start, end)](src/main/java/dev/eugenem/dataStructures/arrays/Arrays.java#L102)|`🟡`|[`✔️`]|`⭕️(N)`
[size](src/main/java/dev/eugenem/dataStructures/arrays/Arrays.java#L31)|`🟢`|[`✔️`]|`⭕️(N)`
[sort](src/main/java/dev/eugenem/dataStructures/arrays/Arrays.java#L117)|`🟡`|[`✔️`]|`⭕️(N^2)`


 - #### Data Structure: [**Matrix**](src/main/java/dev/eugenem/dataStructures/matrix)

Algorithm (operation)| Level |  Done  |  Big ⭕️ Notation 
---------------------|-------|--------|---------------------
[rotate](src/main/java/dev/eugenem/dataStructures/matrix/Matrix.java#L9)|`🟡`|[`✔️`]|`⭕️(N^2)`
[transpose](src/main/java/dev/eugenem/dataStructures/matrix/Matrix.java#L19)|`🟡`|[`✔️`]|`⭕️(N^2)`
[reflect](src/main/java/dev/eugenem/dataStructures/matrix/Matrix.java#L33)|`🟡`|[`✔️`]|`⭕️(N^2)`

- #### Data Structure: [**Singly Linked List**](src/main/java/dev/eugenem/dataStructures/SinglyLinkedList)

Algorithm (operation)| Level |  Done  |  Big ⭕️ Notation 
---------------------|-------|--------|---------------------
delete (position) |`🟢`|[`✍🏻`]|
deleteFirst |`🟢`|[`✍🏻`]|
deleteLast |`🟢`|[`✍🏻`]|
find (value) |`🟢`|[`✍🏻`]|
insert (position) |`🟢`|[`✍🏻`]|
insertFirst |`🟢`|[`✍🏻`]|
insertLast |`🟢`|[`✍🏻`]|
[length](src/main/java/dev/eugenem/dataStructures/SinglyLinkedList/SinglyLinkedList.java#L39)|`🟢`|[`✔️`]|`⭕️(N)`
[reverse](src/main/java/dev/eugenem/dataStructures/SinglyLinkedList/SinglyLinkedList.java#L7)|`🟢`|[`✔️`]|`⭕️(N^2)`
sort |`🟢`|[`✍🏻`]|
sortIn |`🟢`|[`✍🏻`]| `⭕️(N logN)`


- #### Data Structure: [**Double Linked List**](src/main/java/dev/eugenem/dataStructures/DoubleLinkedList)

Algorithm (operation)| Level |  Done  |  Big ⭕️ Notation 
---------------------|-------|--------|---------------------
soon                 |`🟢`   | [`✍🏻`]|


- #### Data Structure: [**Stack**\<Listnode\>](src/main/java/dev/eugenem/dataStructures/stack)

Algorithm (operation)| Level |  Done  |  Big ⭕️ Notation 
---------------------|-------|--------|---------------------
[getMin](src/main/java/dev/eugenem/dataStructures/stack/ListNodeStack.java#L48) | `🟢` | [`✔️`] | `⭕️(N)`
[peak](src/main/java/dev/eugenem/dataStructures/stack/ListNodeStack.java#L39) | `🟢` | [`✔️`] | `⭕️(1)`
[pop](src/main/java/dev/eugenem/dataStructures/stack/ListNodeStack.java#L30) | `🟢` | [`✔️`] | `⭕️(1)`
[push](src/main/java/dev/eugenem/dataStructures/stack/ListNodeStack.java#L19) | `🟢` | [`✔️`] | `⭕️(1)`
[search(value)](src/main/java/dev/eugenem/dataStructures/stack) | `🟢` | [`✍🏻`] | `⭕️(N)` 


- #### Data Structure: [**Queue**](src/main/java/dev/eugenem/dataStructures/queue)

Algorithm (operation)| Level |  Done  |  Big ⭕️ Notation 
---------------------|-------|--------|---------------------
isEmpty | `🟢` | [`✍🏻`] |
peak    | `🟢` | [`✍🏻`] |
enqueue | `🟢` | [`✍🏻`] |
dequeue | `🟢` | [`✍🏻`] |

- #### Data Structure: [**Hash Table**\<Listnode\>](src/main/java/dev/eugenem/dataStructures/hashTable)

Algorithm (operation)| Level |  Done  |  Big ⭕️ Notation 
---------------------|-------|--------|---------------------
hash(key)       | `🟢` | [`✍🏻`] |
set(key, value) | `🟢` | [`✍🏻`] |
delete(key) | `🟢` | [`✍🏻`] |
get(key) | `🟢` | [`✍🏻`] |
has(key) | `🟢` | [`✍🏻`] |
getKeys() | `🟢` | [`✍🏻`] |
getValues() | `🟢` | [`✍🏻`] |

- #### Data Structure: [**Heap**](src/main/java/dev/eugenem/dataStructures/heap)

Algorithm (operation)| Level |  Done  |  Big ⭕️ Notation 
---------------------|-------|--------|---------------------
add       | `🔴` | [`✍🏻`] |
remove       | `🔴` | [`✍🏻`] |

- #### Data Structure: [**Trie**](src/main/java/dev/eugenem/dataStructures/trie)

Algorithm (operation)| Level |  Done  |  Big ⭕️ Notation 
---------------------|-------|--------|---------------------
addWord       | `🔴` | [`✍🏻`] |
deleteWord      | `🔴` | [`✍🏻`] |

- #### Data Structure: [**Tree**](src/main/java/dev/eugenem/dataStructures/tree)

Algorithm (operation)| Level |  Done  |  Big ⭕️ Notation 
---------------------|-------|--------|---------------------
[AVL Tree](src/main/java/dev/eugenem/dataStructures/tree)| `🔴` | [`✍🏻`] |
[Fenwick Tree](src/main/java/dev/eugenem/dataStructures/tree)| `🔴` | [`✍🏻`] |
[Binary Search Tree](src/main/java/dev/eugenem/dataStructures/tree)| `🔴` | [`✍🏻`] |
[Red-Black Tree](src/main/java/dev/eugenem/dataStructures/tree)| `🔴` | [`✍🏻`] |
[Segment Tree](src/main/java/dev/eugenem/dataStructures/tree)| `🔴` | [`✍🏻`] |



- #### Data Structure: [**Graph**](src/main/java/dev/eugenem/dataStructures/graph)

Algorithm (operation)| Level |  Done  |  Big ⭕️ Notation 
---------------------|-------|--------|---------------------
directed             | `🔴`  | [`✍🏻`]  |
undirected           | `🔴`  | [`✍🏻`]  |

- #### Data Structure: [**Search**](src/main/java/dev/eugenem/Search)

Algorithm (operation)| Level |  Done  |  Big ⭕️ Notation 
---------------------|-------|--------|---------------------
[Binary Search](src/main/java/dev/eugenem/search/BinarySearch)|`🟢`|[`✔️`]|`⭕️(N)`


- #### Data Structure: [**Sorting**](src/main/java/dev/eugenem/sorting)

Algorithm (operation)| Level |  Done  |  Big ⭕️ Notation 
---------------------|-------|--------|---------------------
[Bubble Sort](src/main/java/dev/eugenem/sorting/BubbleSort.java)|`🟢`|[`✍🏻`]|

- [_Generic Array_](src/main/java/dev/eugenem/generics)
    - [ [`✔️`] `🟢` GenericArray](src/main/java/dev/eugenem/generics/GenericArray.java)

### Leetcode tasks:

_easy:_
- [ [`✔️`] `🟢` 1. Two Sum](src/main/java/dev/eugenem/leetcode/TwoSum)
- [ [`✔️`] `🟢` 7. Reverse Integer](src/main/java/dev/eugenem/leetcode/ReverseInteger)
- [ [`✔️`] `🟢` 9. Palindrome Number](src/main/java/dev/eugenem/leetcode/PalindromeNumber)
- [ [`✔️`] `🟢` 13. Roman to Integer](src/main/java/dev/eugenem/leetcode/RomanToInteger)
- [ [`✔️`] `🟢` 20. Valid Parentheses](src/main/java/dev/eugenem/leetcode/ValidParentheses)
- [ [`✔️`] `🟢` 21. Merge Two Sorted Lists](src/main/java/dev/eugenem/leetcode/MergeTwoSortedLists)
- [ [`✔️`] `🟢` 35. Search Insert Position](src/main/java/dev/eugenem/leetcode/SearchInsertPosition)
- [ [`✔️`] `🟢` 53. Maximum Subarray](src/main/java/dev/eugenem/leetcode/MaxSubArray)
- [ [`✔️`] `🟢` 88. Merge Sorted Array](src/main/java/dev/eugenem/leetcode/MergeSortedArray)
- [ [`✔️`] `🟢` 121. Best Time to Buy and Sell Stock](src/main/java/dev/eugenem/leetcode/BestTimeToBuyAndSellStock)
- [ [`✔️`] `🟢` 136. Single Number](src/main/java/dev/eugenem/leetcode/SingleNumber)
- [ [`✔️`] `🟢` 155. Min Stack](src/main/java/dev/eugenem/leetcode/MinStack)
- [ [`✔️`] `🟢` 202. Happy Number](src/main/java/dev/eugenem/leetcode/HappyNumber)
- [ [`✔️`] `🟢` 206. Reverse Linked List](src/main/java/dev/eugenem/leetcode/ReverseLinkedList)
- [ [`❓`] `🟢` 234. Palindrome Linked List](src/main/java/dev/eugenem/leetcode/PalindromeLinkedList) [-] 69/85 test cases passed.
- [ [`✔️`] `🟢` 344. Reverse String](src/main/java/dev/eugenem/leetcode/ReverseString)
- [ [`✔️`] `🟢` 771. Jewels and Stones](src/main/java/dev/eugenem/leetcode/JewelsAndStones)

_medium:_
- [ [`✔️`] `🟡` 2. Add Two Numbers](src/main/java/dev/eugenem/leetcode/AddTwoNumbers)
- [ [`✔️`] `🟡` 3. Longest Substring Without Repeating Characters](src/main/java/dev/eugenem/leetcode/LongestSubstringWithoutRepeatingCharacters)
- [ [`✔️`] `🟡` 48. Rotate Image](src/main/java/dev/eugenem/leetcode/RotateImage)
- [ [`❓`] `🟡` 148. Sort List](src/main/java/dev/eugenem/leetcode/SortList)  26/28 test cases passed
- [ [`❓`] `🟡` 189. Rotate Array](src/main/java/dev/eugenem/leetcode/RotateArray) 37/38 test cases passed.
- [ [`✔️`] `🟡` 198. House Robber](src/main/java/dev/eugenem/leetcode/HouseRobber)
- [ [`✔️`] `🟡` 287. Find the Duplicate Number](src/main/java/dev/eugenem/leetcode/FindtheDuplicateNumber)

_hard:_
- [ [`✔️`] `🔴` 4. Median of Two Sorted Arrays](src/main/java/dev/eugenem/leetcode/MedianOfTwoSortedArrays)
- [ [`✔️`] `🔴` 23. Merge k Sorted Lists](src/main/java/dev/eugenem/leetcode/MergeKSortedLists)

### HackerRank

- [ [`✔️`] `🟢` A very big sum](src/main/java/dev/eugenem/hackerrank/AVeryBigSum.java)
- [ [`✔️`] `🟢` Compare the triplets](src/main/java/dev/eugenem/hackerrank/CompareTheTriplets.java)
