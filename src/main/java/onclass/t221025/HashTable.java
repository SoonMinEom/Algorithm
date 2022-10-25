package onclass.t221025;

import java.util.HashSet;
import java.util.Set;

public class HashTable {
    private int size = 10000;
    private int[] table = new int[size];

    public HashTable() {
    }

    public HashTable (int size) {
        this.size = size;
        this.table = new int[size];
    }

    public int hash(String key) {
        int asciiSum = 0 ;
        for (int i = 0; i < key.length(); i++) {
            // 입력받은 key를 한 글자씩 아스키 코드(int)로 바꾼다! -> 합쳐서 나온 값으로 키값 찾기
            asciiSum += key.charAt(i);
        }
        //리턴 값을 size로 나눈 나머지 하는 이유 -> 테이블 size를 넘지 않는 키값을 만들기 위해
        return asciiSum % size;
    }

    public void insert(String key, Integer value) {
        this.table[hash(key)] = value;
        System.out.println(hash(key)+"방에 "+key+" 저장이 완료 되었습니다.");
    }

    public int search(String key) {
        return this.table[hash(key)];
    }

    public static void main(String[] args) {
        String[] names = new String[]{"DongyeonKang",
                "SubinKang", "KwanwunKo", "HyunseokKo", "KyoungdukKoo", "YeonjiGu", "SoyeonKown", "OhsukKwon", "GunwooKim", "KiheonKim", "NayeongKim", "DohyeonKim", "MinkyoungKim", "MinjiKim", "SanghoKim", "SolbaeKim", "YejinKim", "EungjunKim", "JaegeunKim", "JeonghyeonKim", "JunhoKim", "JisuKim", "kimjinah", "HaneulKim", "HeejungKim", "KimoonPark", "EunbinPark", "JeongHoonPark", "JeminPark", "TaegeunPark", "JiwonBae", "SeunggeunBaek", "JihwanByeon", "HeungseopByeon", "JeongHeeSeo", "TaegeonSeo", "SeeYunSeok", "SuyeonSeong", "SeyoelSon", "MinjiSong", "JinwooSong", "hyunboSim", "SominAhn", "JiyoungAhn", "ChangbumAn", "SoonminEom",
                "HyeongsangOh", "SuinWoo", "JuwanWoo", "InkyuYoon", "GahyunLee", "DaonLee", "DohyunLee", "SanghunLee", "SujinLee", "AjinLee", "YeonJae", "HyeonjuLee", "HakjunYim", "SeoyunJang", "SeohyeonJang", "JinseonJang", "SujinJeon", "SeunghwanJeon", "DaehwanJung", "JaeHyunJeung", "HeejunJeong", "GukhyeonCho", "MunjuJo", "YejiJo", "ChanminJu", "MinjunChoi", "SujeongChoi", "SeunghoChoi", "AyeongChoi", "GeonjooHan", "JinhyuckHeo", "MinwooHwang", "SieunHwang",
                "JunhaHwang"};

        HashTable ht = new HashTable(200);
        for (int i = 0; i < names.length; i++) {
            ht.insert(names[i], ht.hash(names[i]));
        }



    }
}
