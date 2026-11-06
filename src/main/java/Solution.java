public class Solution {
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * PLEASE REFER TO THE PROBLEMS.MD FILE FOR QUESTION DETAILS
     **/

    public Solution() {}

    public boolean endsLy(String x) {
        if (x.length() < 2) {
            return false;
        } else if (x.indexOf("ly") == (x.length() - 2)) {
            return true;
        } else {
            return false;
        }
    }

    public String conCat(String s1, String s2) {
        if (s1.length() == 0 || s2.length() == 0) {
            return s1 + s2;
        }
        String s1LastLetter = s1.substring(s1.length()-1);
        String s2FirstLetter = s2.substring(0,1);
        if (s1LastLetter.equals(s2FirstLetter)) {
            return s1 + s2.substring(1);
        } else {
            return s1 + s2;
        }
    }

    public String withoutX(String s1) {
        if (s1.substring(0, 1).equals("x")) {
            s1 = s1.substring(1);
        }
        if (s1.substring(s1.length()-1).equals("x")) {
            s1 = s1.substring(0,s1.length()-1);
        }
        return s1;
    }

    public String fizzString(String s1) {
        String result = s1;
        boolean firstLetterIsF = false;
        if (s1.substring(0,1).equals("f")) {
            result = "Fizz";
            firstLetterIsF = true;
        }
        if ((s1.substring(s1.length()-1).equals("b")) && firstLetterIsF) {
            result += "Buzz";
        } else if ((s1.substring(s1.length()-1).equals("b"))) {
            result = "Buzz";
        }
        return result;
    }

    public String fizzString2(int x) {
        String result = x + "";
        if ((x % 3) == 0) {
            result = "Fizz";
        }
        if ((x % 5) == 0) {
            result += "Buzz";
        }
        return result + "!";
    }

}