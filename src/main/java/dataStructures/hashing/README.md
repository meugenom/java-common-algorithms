### Hash table

In computing, a hash table (hash map) is a data structure that implements an associative array abstract data type, a structure that can map keys to values. A hash table uses a hash function to compute an index, also called a hash code, into an array of buckets or slots, from which the desired value can be found. During lookup, the key is hashed and the resulting hash indicates where the corresponding value is stored.

Ideally, the hash function will assign each key to a unique bucket, but most hash table designs employ an imperfect hash function, which might cause hash collisions where the hash function generates the same index for more than one key. Such collisions are typically accommodated in some way.

In a well-dimensioned hash table, the average cost (number of instructions) for each lookup is independent of the number of elements stored in the table. Many hash table designs also allow arbitrary insertions and deletions of key–value pairs, at constant average cost per operation.

In many situations, hash tables turn out to be on average more efficient than search trees or any other table lookup structure. For this reason, they are widely used in many kinds of computer software, particularly for associative arrays, database indexing, caches, and sets.

Time complexity in big ⭕️ notation:
---------------------------------------------
  Alghorithm | Average | Worst Case
-------------|---------|---------------------
Space		 |	⭕️(N) | ⭕️(N)
Search		 |	⭕️(1) | ⭕️(N)
Insert		 |	⭕️(1) | ⭕️(N)
Delete		 |	⭕️(1) | ⭕️(N)



A small phone book as a hash table:

![visualization](./assets/630px-Hash_table_3_1_1_0_1_0_0_SP.svg.png)


#### Links:
 - [Wiki](https://en.wikipedia.org/wiki/Hash_table)

