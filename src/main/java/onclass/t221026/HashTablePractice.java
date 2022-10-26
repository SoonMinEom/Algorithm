package onclass.t221026;

import java.util.ArrayList;
import java.util.List;

public class HashTablePractice {
    class Node {
        private String key;
        private Integer value;

        public Node(String key, Integer value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public Integer getValue() {
            return value;
        }
    }
    List<Node>[] table = new ArrayList[1000];

    public int hash(String key) {
        int asciiSum = 0;
        for (int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i);
        }
        return asciiSum;
    }

    public void insert(String key, Integer value) {

        if (table[hash(key)] == null) {
            table[hash(key)] = new ArrayList<>();
        }
        table[hash(key)].add(new Node(key,value));
    }

    public Integer get(String key) {
        List<Node> nodes = table[hash(key)];
        for (Node node : nodes) {
            if(key.equals(node.getKey())) {
                return node.getValue();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashTablePractice ht = new HashTablePractice();

        ht.insert("Yoonseo",1);
        ht.insert("Seoyoon", 2);

        int result = ht.get("Yoonseo");

        if(result == 1) {
            System.out.println("테스트 성공");
        } else {
            System.out.printf("테스트 실패 value : %d", result );
        }

    }
}
