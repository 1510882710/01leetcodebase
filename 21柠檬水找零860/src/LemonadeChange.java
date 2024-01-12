public class LemonadeChange {

    public static boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;

        for (int bill : bills) {
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                if (five > 0) {
                    five--;
                    ten++;
                } else {
                    return false;
                }
            } else { // bill == 20
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] bills1 = {5, 5, 5, 10, 20}; // 返回 true
        int[] bills2 = {5, 5, 10}; // 返回 true
        int[] bills3 = {10, 10}; // 返回 false
        int[] bills4 = {5, 5, 10, 10, 20}; // 返回 false

        System.out.println(lemonadeChange(bills1));
        System.out.println(lemonadeChange(bills2));
        System.out.println(lemonadeChange(bills3));
        System.out.println(lemonadeChange(bills4));
    }
}
