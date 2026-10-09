package Palendrome_Number;

class Palendrome_Number_solution {
    public boolean isPalindrome(int x) {
        String origStr = Integer.toString(x);
        String rev = "";
        for (int i = origStr.length() - 1; i >= 0; i--) {
            rev += origStr.charAt(i);
        }
        if (rev.equals(origStr)) {
            return true;
        } else {
            return false;
        }
    }

}
