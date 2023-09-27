public class javaLearn {
    public static void main(String[] args) {

        System.out.println("Hello World!");
        System.out.print("This is on a new line, while ");
        System.out.println("this is not.");
        System.out.print("Five multiplied by five is ");
        System.out.println(25);
        int a = 17;
                System.out.println(a);
        String firstName = "Zelimhan ";
        String lastName = "Albogachiev";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        int x = 5, y = 6, z = 50;
        System.out.println(x + y + z);

        byte Seventy = 70;
        System.out.println(Seventy);

        long veryLong = 100000000000L;
        System.out.println(veryLong);

        boolean amIeighteen = true;
        boolean amInineteen = false;
        System.out.println(amIeighteen);
        System.out.println(amInineteen);

        int singleDigit = 7;
        double doubleDigit = singleDigit;
        System.out.println(singleDigit);
        System.out.println(doubleDigit);

        double doubleDigitTwo = 7.45d;
        int singleDigitTwo = (int) doubleDigitTwo;
        System.out.println(doubleDigitTwo);
        System.out.println(singleDigitTwo);

        int sum1 = 600 + 200;
        int sum2 = sum1 + 400;
        int sum3 = sum1 + sum2;
        System.out.println(sum3); //this should equal to 2000 because sum1 = 800, sum2 = 1200, sum3 =2000

        int x2 = 9;
        int y2 = 98;
        System.out.println(y2 < x2); //this is false

        String firstName2 = "Zelimhan";
        System.out.println(firstName2.length());

        String ourProject = "Lack of human interacion and personalised support from teachers: With AI-based personalised learning, students may not have the same level of interaction and support from teachers compared to traditional classroom settings. This can lead to a lack of individualised guidance and feedback, which is crucial for effective learning. This in turn affects the social interaction and collaboration with their peers. This can have a negative impact on the development of social skills, teamwork, and the ability to work effectively in group settings";
        System.out.println(ourProject.length()); //this is how to get the length of a word or document (in characters)

        int integer1 = 67;
        int integer2 = 50;
        String integer3 = "67";
        String integer4 = "50";
        System.out.println(integer1 + integer2); //this will add the two numbers because they are "int"
        System.out.println(integer3 + integer4); //this will combine the two number because they are "String"

        String apostrophe = "This is how you do an apostrophe -> \'";
        String doubleQuotation = "This is how you do double quotations -> \"";
        String backSlash = "This is how you do a back slash -> \\";
        System.out.println(apostrophe);
        System.out.println(doubleQuotation);
        System.out.println(backSlash);

        Math.max(2, 3);

    }
}