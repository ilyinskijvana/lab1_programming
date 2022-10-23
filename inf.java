import java.util.Scanner;
class inf{
    public static void main(String[] args){
        System.out.println("Введите сообщение из 7 цифр:");
        Scanner sc = new Scanner(System.in);
        String ham = sc.nextLine();
        if (ham.length() !=7) {
            System.out.println("Ошибка");
            System.exit(0);
        }
        int parsedNumber;
        try{
            parsedNumber = Integer.parseInt(ham);
        }
        catch (NumberFormatException e){
            System.out.println("Ошибка");
            System.exit(0);
        }
        char [] c = ham.toCharArray();
        int [] a = new int[7];
        for(int i = 0; i<7; i++){
            a[i] = c[i] - '0';
            switch (a[i]) {
                case 2, 3, 4, 5, 6, 7, 8, 9 -> {
                    System.out.println("Ошибка");
                    System.exit(0);
                }
            }
        }
        int s1;
        s1 = (a[0]+a[2]+a[4]+a[6])%2;
        System.out.print("s1="+s1+ ", ");
        int s2;
        s2 = (a[1]+a[2]+a[5]+a[6])%2;
        System.out.print("s2="+s2+", ");
        int s3;
        s3 = (a[3]+a[4]+a[5]+a[6])%2;
        System.out.println("s3="+s3+".");
        if(s1==0 || s2==0 || s3==0) {
            System.out.println("В сообщении нет ошибок");
            System.exit(0);
        }
        if(s1==0 && s2==0 && s3==1) {
            a[3] = 0;
            System.out.println("Ошибка в бите r3.");
        }
        if(s1==0 && s2==1 && s3==0) {
            a[1] = 0;
            System.out.println("Ошибка в бите r2.");
        }
        if(s1==0 && s2==1 && s3==1) {
            a[5] = 0;
            System.out.println("Ошибка в бите i3.");
        }
        if(s1==1 && s2==0 && s3==0) {
            a[0] = 0;
            System.out.println("Ошибка в бите r1.");
        }
        if(s1==1 && s2==0 && s3==1) {
            a[4] = 0;
            System.out.println("Ошибка в бите i2.");
        }
        if(s1==1 && s2==1 && s3==0) {
            a[2] = 0;
            System.out.println("Ошибка в бите i1.");
        }
        if(s1==1 && s2==1 && s3==1) {
            a[6] = 0;
            System.out.println("Ошибка в бите i4.");
        }
        System.out.println("Правильное сообщение:");
        for(int i = 0; i<7; i++){
            System.out.print(a[i]);
        }
    }
}