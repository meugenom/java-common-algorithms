# 🧠 📚 ⏱ Java Data Structures and Algorithms

Implementations of data structures and algorithms in Java.

### 🛠 Use Unit Tests
...


> 📌 *notation keys:*
> - 🍏 - entry Level;
> - 🍎 - advanced Level;
> - `⭕️(1)`, `⭕️log(N)`, `⭕️(N^2)`... - Big O notations;
> - ✍🏻 - by proccess;
> - 🙇🏻‍♂️ - hard to solve;
> - ❓ - has a question;
> - ✔️ - done; 

## List of Implementations:
### Data Structures:

*simple:*

- [Arrays](src/main/java/dev/eugenem/dataStructures/arrays)
    - [ ✔️ 🍏 findMin](src/main/java/dev/eugenem/dataStructures/arrays/Arrays.java#L45)
    - [ ✔️ 🍏 push](src/main/java/dev/eugenem/dataStructures/arrays/Arrays.java#L7)
    - [ ✔️ 🍏 pop](src/main/java/dev/eugenem/dataStructures/arrays/Arrays.java#L20)
    - [ ✔️ 🍏 remove(position)](src/main/java/dev/eugenem/dataStructures/arrays/Arrays.java#L63)
    - [ ✔️ 🍏 size](src/main/java/dev/eugenem/dataStructures/arrays/Arrays.java#L31)
    - [ ✔️ 🍏 reverse](src/main/java/dev/eugenem/dataStructures/arrays/Arrays.java#L87)
    - [ ✔️ 🍏 reverse(start position, end position)](src/main/java/dev/eugenem/dataStructures/arrays/Arrays.java#L102)
    - [ ✔️ 🍏 sort](src/main/java/dev/eugenem/dataStructures/arrays/Arrays.java#L117)
    - ✍🏻 🍏 merge [-]
    
- [Singly Linked List](src/main/java/dev/eugenem/dataStructures/SinglyLinkedList)
    - [ ✔️ 🍏 length](src/main/java/dev/eugenem/dataStructures/SinglyLinkedList/SinglyLinkedList.java#L39)
    - [ ✔️ 🍏 reverse](src/main/java/dev/eugenem/dataStructures/SinglyLinkedList/SinglyLinkedList.java#L7)
    - ✍🏻 🍏 insert (position)
    - ✍🏻 🍏 insertFirst
    - ✍🏻 🍏 insertLast
    - ✍🏻 🍏 delete (position)
    - ✍🏻 🍏 deleteFirst
    - ✍🏻 🍏 deleteLast
    - ✍🏻 🍏 find (value)
    - ✍🏻 🍏 sort
    - ✍🏻 🍏 sortIn (⭕️(n logn) time and ⭕️(1) memory)

- [Double Linked List](src/main/java/dev/eugenem/dataStructures/DoubleLinkedList)
    - ✍🏻 🍏 soon [-]
- [Stack](src/main/java/dev/eugenem/dataStructures/stack)
    1. ListNodeStack :
    - [ ✔️ 🍏 push](src/main/java/dev/eugenem/dataStructures/stack/ListNodeStack.java#L19)
    - [ ✔️ 🍏 pop](src/main/java/dev/eugenem/dataStructures/stack/ListNodeStack.java#L30)
    - [ ✔️ 🍏 peak](src/main/java/dev/eugenem/dataStructures/stack/ListNodeStack.java#L39)
    - [ ✔️ 🍏 getMin](src/main/java/dev/eugenem/dataStructures/stack/ListNodeStack.java#L48)
    
- [Matrix](src/main/java/dev/eugenem/dataStructures/matrix)
    - [ ✔️ 🍏 rotate](src/main/java/dev/eugenem/dataStructures/matrix/Matrix.java#L9)
    - [ ✔️ 🍏 transpose](src/main/java/dev/eugenem/dataStructures/matrix/Matrix.java#L19)
    - [ ✔️ 🍏 reflect](src/main/java/dev/eugenem/dataStructures/matrix/Matrix.java#L33)
### Search
- [ ✔️ 🍏 Binary Search](src/main/java/dev/eugenem/Search/BinarySearch)

### Sorting
- [ ✍🏻 🍏 Bubble Sort](src/main/java/dev/eugenem/Sorting/BubbleSort.java)

### Generics
- [ ✔️ 🍏 GenericArray](src/main/java/dev/eugenem/generics/GenericArray.java)

### Leetcode tasks:

easy:
- [ ✔️ 1. Two Sum](src/main/java/dev/eugenem/leetcode/TwoSum)
- [ ✔️ 7. Reverse Integer](src/main/java/dev/eugenem/leetcode/ReverseInteger)
- [ ✔️ 9. Palindrome Number](src/main/java/dev/eugenem/leetcode/PalindromeNumber)
- [ ✔️ 13. Roman to Integer](src/main/java/dev/eugenem/leetcode/RomanToInteger)
- [ ✔️ 20. Valid Parentheses](src/main/java/dev/eugenem/leetcode/ValidParentheses)
- [ ✔️ 21. Merge Two Sorted Lists](src/main/java/dev/eugenem/leetcode/MergeTwoSortedLists)
- [ ✔️ 35. Search Insert Position](src/main/java/dev/eugenem/leetcode/SearchInsertPosition)
- [ ✔️ 53. Maximum Subarray](src/main/java/dev/eugenem/leetcode/MaxSubArray)
- [ ✔️ 88. Merge Sorted Array](src/main/java/dev/eugenem/leetcode/MergeSortedArray)
- [ ✔️ 121. Best Time to Buy and Sell Stock](src/main/java/dev/eugenem/leetcode/BestTimeToBuyAndSellStock)
- [ ✔️ 136. Single Number](src/main/java/dev/eugenem/leetcode/SingleNumber)
- [ ✔️ 155. Min Stack](src/main/java/dev/eugenem/leetcode/MinStack)
- [ ✔️ 202. Happy Number](src/main/java/dev/eugenem/leetcode/HappyNumber)
- [ ✔️ 206. Reverse Linked List](src/main/java/dev/eugenem/leetcode/ReverseLinkedList)
- [ ❓ 234. Palindrome Linked List](src/main/java/dev/eugenem/leetcode/PalindromeLinkedList) [-] 69/85 test cases passed.
- [ ✔️ 344. Reverse String](src/main/java/dev/eugenem/leetcode/ReverseString)
- [ ✔️ 771. Jewels and Stones](src/main/java/dev/eugenem/leetcode/JewelsAndStones)

medium:
- [ ✔️ 2. Add Two Numbers](src/main/java/dev/eugenem/leetcode/AddTwoNumbers)
- [ ✔️ 3. Longest Substring Without Repeating Characters](src/main/java/dev/eugenem/leetcode/LongestSubstringWithoutRepeatingCharacters)
- [ ✔️ 48. Rotate Image](src/main/java/dev/eugenem/leetcode/RotateImage)
- [ ❓ 148. Sort List](src/main/java/dev/eugenem/leetcode/SortList)  26/28 test cases passed
- [ ❓ 189. Rotate Array](src/main/java/dev/eugenem/leetcode/RotateArray) 37/38 test cases passed.
- [ ✔️ 198. House Robber](src/main/java/dev/eugenem/leetcode/HouseRobber)
- [ ✔️ 287. Find the Duplicate Number](src/main/java/dev/eugenem/leetcode/FindtheDuplicateNumber)

hard:
- [ ✔️ 4. Median of Two Sorted Arrays](src/main/java/dev/eugenem/leetcode/MedianOfTwoSortedArrays)
- [ ✔️ 23. Merge k Sorted Lists](src/main/java/dev/eugenem/leetcode/MergeKSortedLists)

### HackerRank

- [ ✔️ A very big sum](src/main/java/dev/eugenem/hackerrank/AVeryBigSum.java)
- [ ✔️ Compare the triplets](src/main/java/dev/eugenem/hackerrank/CompareTheTriplets.java)
