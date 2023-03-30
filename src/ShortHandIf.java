public class ShortHandIf {
    public static void main(String[] args) {
        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        // use shorthand if to do the same thing
        // syntax variable = (condition) ? expressionTrue :  expressionFalse;
        int temp = 10;
        String result = (temp>100) ? "The water is boiling": "The water is not boiling";
        System.out.println("The water temperature is " + temp + ", " + result);
    }
}
