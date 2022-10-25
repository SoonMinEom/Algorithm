package onclass.t221025;

public class HashFunction {
    public int hash(String key) {
        int asciiSum = 0 ;
        for (int i = 0; i < key.length(); i++) {
            // 입력받은 key를 한 글자씩 아스키 코드(int)로 바꾼다! -> 합쳐서 나온 값으로 키값 찾기
            asciiSum += key.charAt(i);
        }
        return asciiSum % 90;
    }
    public static void main(String[] args) {
        HashFunction hf = new HashFunction();
        hf.hash("soonmin");
    }
}
