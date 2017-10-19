import java.util.ArrayList;

public class MyFirstClass {

    public static void main(String[] args){
        intNull();
        square();
        incrDecr();
        logicalOps();
        ternaryOps();
        grading('Ğ');
        whileExample();
        sumOfNaturalNumbers();
        forEachExample();
        forVsForEachI();
        forVsForEachII();
        stringOps();
        localVariables(5<10);

        stringMethods();
        stringMethodsII();
        stringMethodChaining();
        stringBuilderExample();
    }

    public static void intNull(){
        String abc = null;
        System.out.println(abc);
        // int x = null;
    }

    public static void localVariables(boolean check){
        int answer;
        int branch;
        if(check){
            branch = 1;
            answer = 1;
        }
        else{
            answer = 2;
        }
       // System.out.println(branch);
        System.out.println(answer);
    }

    public static void square(){
        int x = 10;
        int y = 3;
        System.out.println(x/y);
    }

    public static void incrDecr(){
        int counter = 0;

        System.out.println(counter);
        System.out.println(++counter);
        System.out.println(counter);
        System.out.println(counter--);
        System.out.println(counter);
    }

    public static void logicalOps(){
        int a = 10;
        int b = 7;

        if(a != 8 && a > 5){
            System.out.println("happy");
        }
        if(a != 10 || a < 5){
            System.out.println("happier");
        }

    }

    public static void ternaryOps(){
        int a = 5;
        int b = 7;

        String result = a > b ? "a is bigger" : "a is smaller";
        System.out.println(result);
    }

    public static void grading(char grade){
        switch (grade) {
            case 'A':
                System.out.println("excellent");
                break;
            case 'B':
                System.out.println("good");
                break;
            default:
                System.out.println("invalid grade");
                break;
        }
    }

    public static void whileExample(){
        int x = 10;
        while(x<=20){
            System.out.println(x);
            x++;
        }
    }

    public static void sumOfNaturalNumbers(){
        int sum = 0;
        for(int i = 1; i<=1000; ++i){
            sum += i;
        }
        System.out.println(sum);
    }

    public static void forEachExample(){
        int[] numbers = {3, 4, -5, 5, 0 , 12};
        int sum = 0;
        for(int number:numbers) {
            sum += number;
            System.out.println(number);
        }
        System.out.println(sum);
    }

    public static void forVsForEachI(){
        java.util.List<String> names = new ArrayList<String>();
        names.add("Muhammed");
        names.add("Aslı");
        names.add("Bedirhan");

        for(int i = 0; i<names.size(); i++){
            String name = names.get(i);
            if(i>0){
                System.out.print(", ");
            }
            System.out.print(name);
        }
    }

    public static void forVsForEachII(){
        System.out.println("");
        java.util.List<String> names = new ArrayList<String>();
        names.add("Muhammed");
        names.add("Aslı");
        names.add("Bedirhan");

        for(String name:names){
            System.out.print(name + ", ");
        }
    }


    public static void stringOps(){
        int sayi1 = 1;
        int sayi2 = 2;

        System.out.println(sayi1 + sayi2);

        String rakam1 = "1";
        String rakam2 = "2";

        System.out.println(rakam1+rakam2);

        System.out.println("1" + sayi2);
        System.out.println(rakam1 + sayi1 + sayi2);
        System.out.println("toplam: " + (sayi1 + sayi2));
    }

    public static void stringMethods(){
        String string1 = "Comodo";

        System.out.println(string1.substring(1,3));
        System.out.println(string1.substring(1));
        System.out.println(string1.length());
        System.out.println(string1.charAt(3));
        System.out.println(string1.toUpperCase());
        System.out.println(string1.toLowerCase());
    }

    public static void stringMethodsII(){
        String string1 = "Comodo";

        System.out.println(string1.equals("Comodo"));
        System.out.println(string1.equalsIgnoreCase("comodo"));
        System.out.println(string1.startsWith("c"));
        System.out.println(string1.contains("5"));
        System.out.println(string1.replace("Co", "Ko"));
        System.out.println(string1);
    }

    public static void stringMethodChaining(){
        java.util.List<String> names = new java.util.ArrayList<String>();
        names.add("Kurt Liz");
        names.add("Alvin Cab ");
        names.add("Roger Joy");

        for (int i = 0; i <names.size(); i++){
            String name = names.get(i);
            name = name.trim();
            name = name.toLowerCase();
            if(name.startsWith("a") && name.endsWith("b") && name.contains("c") && name.length()==9){
                System.out.println(name.toUpperCase());
            }
        }

    }

    public static void stringBuilderExample(){
        StringBuilder string1 = new StringBuilder("Comodo");
        string1.append("bnsdf");
        System.out.println(string1.toString());
    }
}
