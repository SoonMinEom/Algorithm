package onclass.t221025;

public class HashTable2 {

    private int size = 10000;
    private int[] table = new int[size];

    public HashTable2() {
    }

    public HashTable2(int size) {
        this.size = size;
        this.table = new int[size];
    }

    public int hash(String key) {
        int asciiSum = 0 ;
        for (int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i);
        }
        return asciiSum%size;
    }

    public void insert(String key, Integer value) {
        this.table[hash(key)] = value;
    }

    public int search(String key) {
        return this.table[hash(key)];
    }

    public static void main(String[] args) {

    }
}
