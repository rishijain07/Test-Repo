import java.util.Scanner;
class hello{

    public static void main(String[] args) {
        System.out.println("hello world");
        Scanner sc = new Scanner(System.in);
        String myvar = sc.nextLine();
        //yesySystem.out.println(myvar);
        switch (myvar) {
            case "yes":
            System.out.println("yesss");
                
                break;
            case "no": System.out.println("no");
        
            default:
                break;
        }
        sc.close();
    }
}
