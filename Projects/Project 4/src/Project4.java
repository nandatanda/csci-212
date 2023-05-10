public class Project4 {

    public static void main(String[] args) {
        
        RomanNumeral myNum1 = new RomanNumeral("XIV");
        RomanNumeral myNum2 = new RomanNumeral("XV");
        RomanNumeral myNum3 = new RomanNumeral("XVI");

        RomanNumeralList myList = new RomanNumeralList();

        myList.add(myNum3);
        myList.add(myNum2);
        myList.add(myNum1);

        System.out.println(myList.getRomanString());
        System.out.println(myList.getArabicString());
    }
}