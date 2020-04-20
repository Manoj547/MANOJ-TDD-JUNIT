package org.example;

public class RemovingCharacters {

    public String checkString(String str) {
        String res = " ";
        if (str.length() >= 2) {
            char first = str.charAt(0);
            char second = str.charAt(1);
            if (first == 'A' || first == 'a') {
                if (second == 'A' || second == 'a') {
                    res = str.substring(2, str.length());
                } else {
                    res = second + str.substring(2, str.length());;
                }
            } else if (second == 'a' || second == 'A') {
                res = first + str.substring(2, str.length());;
            }
            else {
                res = str;
            }
        }
        else{
            if(str.length() != 0) {
                if (str.charAt(0) == 'A' || str.charAt(0) == 'a') {
                    res = " ";
                } else {
                    res = "" + str.charAt(0);
                }
            }
            else{
                res = " ";
            }
        }
        return res;
    }
}
