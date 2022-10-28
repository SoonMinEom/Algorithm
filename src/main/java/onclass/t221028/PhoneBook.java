package onclass.t221028;

import java.util.HashSet;

public class PhoneBook {

    public boolean solution(String[] phone_book) {

        boolean answer = true;

        HashSet<String> hs = new HashSet<>();

        for (String num : phone_book) hs.add(num);

        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 0; j < phone_book[i].length(); j++) {
                if(hs.contains(phone_book[i].substring(0,j))) {
                    answer = false;
                }
            }
        }

        return answer;
    }

}
