class MyRegex {
    String pattern =
        "^([0-9]{1,2}|[01][0-9]{2}|2[0-4][0-9]|25[0-5])\\." +
        "([0-9]{1,2}|[01][0-9]{2}|2[0-4][0-9]|25[0-5])\\." +
        "([0-9]{1,2}|[01][0-9]{2}|2[0-4][0-9]|25[0-5])\\." +
        "([0-9]{1,2}|[01][0-9]{2}|2[0-4][0-9]|25[0-5])$";
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyRegex regex = new MyRegex();

        while (sc.hasNext()) {
            String ip = sc.next();
            System.out.println(Pattern.matches(regex.pattern, ip));
        }

        sc.close();
    }
}