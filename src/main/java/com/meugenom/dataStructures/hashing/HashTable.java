package com.meugenom.dataStructures.hashing;

public class HashTable {

	private HashNode[] buckets;
	private int numOfBuckets;
	private int size;

	public HashTable() {
		this(10);
	}

	public HashTable(int capacity) {
		this.numOfBuckets = capacity;
		this.buckets = new HashNode[numOfBuckets];
		this.size = 0;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void put(Integer key, String value){
        if(key == null || value == null){
            throw new IllegalArgumentException("Key or Value is null !!!");
        }
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        while(head != null){
            if(head.key.equals(key)){
                head.value = value;
                return;
            }
            head = head.next;
        }
        size++;
        head = buckets[bucketIndex];
        HashNode node = new HashNode(key, value); // (key, value) -> null
        node.next = head;
        buckets[bucketIndex] = node;
    }

    private int getBucketIndex(Integer key){
        return key % numOfBuckets; // buckets.length
    }

    public String get(Integer key){
        if(key == null){
            throw new IllegalArgumentException("Key is null !!!");
        }
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        while(head != null){
            if(head.key.equals(key)){
                return head.value;
            }
            head = head.next;
        }

        return null;
    }

    public String remove(Integer key){
        if(key == null){
            throw new IllegalArgumentException("Key is null !!!");
        }

        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex]; // (21, "Tom") -> (31, "Harry") -> (41, "Sana") -> null
        HashNode previous = null;

        while(head != null){
            if(head.key.equals(key)){
                break;
            }
            previous = head;
            head = head.next;
        }
        if(head == null){
            return null;
        }
        size--;
        if(previous != null){
            previous.next = head.next;
        } else {
            buckets[bucketIndex] = head.next;
        }

        return head.value;
    }


    public static void main(String[] args) {
        
		HashTable table = new HashTable(10);
        table.put(105, "Tom");
        table.put(21, "Harry");
        table.put(31, "Dinesh");
        System.out.println(table.size());// (31, "Dinesh") -> (21, "Harry") -> null
        System.out.println(table.remove(21));
        System.out.println(table.remove(31));
        System.out.println(table.size());
    }

}
