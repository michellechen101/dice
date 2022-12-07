// class for dice images
public class DiceImage2 {
    public static String displayDice(int roll) {

// switch statement to determine dice image unicode for java
        String imageCode = "";
        switch (roll) {
            case 1:
                imageCode = "\u0031\u20E3\uFE0F";
                break;
            case 2:
                imageCode = "\u0032\u20E3\uFE0F";;
                break;
            case 3:
                imageCode = ("\u0033\u20E3\uFE0F");
                break;
            case 4:
                imageCode = ("\u0034\u20E3\uFE0F");
                break;
            case 5:
                imageCode = ("\u0035\u20E3\uFE0F");
                break;
            case 6:
                imageCode = ("\u0036\u20E3\uFE0F");
                break;
            default: // roll is 1
               imageCode = ("\uD83E\uDD2C");
        }

        return imageCode;
    }


}
