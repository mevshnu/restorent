import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Bills> arr = new ArrayList<>();

    public static void main(String[] args) {
        while (true)
        {
        System.out.println("Press 1 to generate bill");
        System.out.println("press 2 to view Transaction");
        System.out.println("press 3 to exit");
        int z = sc.nextInt();
        switch (z) {
            case 1:
                generate();
                break;
            case 2:
                show();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("wrong input");
                break;
        }
    }
    }

    static void generate() {
        int sum = 0;
        System.out.println("enter the Name");
        String name = sc.next();
        System.out.println("enter the Mobile number");
        int mobile = sc.nextInt();
        System.out.println("enter no of Tea");
        int tea = sc.nextInt();
        if(tea>0) {
            sum = sum + (tea * 10);
        }
        System.out.println("enter no of coffee");
        int coffee = sc.nextInt();

        if(coffee>0) {
            sum = sum + (coffee * 15);
        }
        System.out.println("enter no of snacks");
        int snacks = sc.nextInt();
        if(snacks>0) {
            sum = sum + (snacks * 15);
        }
        System.out.println("enter no of idili");
        int idili = sc.nextInt();
        if(idili>0)
        {
            sum = sum + (idili * 15);
        }
        System.out.println("enter no of dosha");
        int dosha = sc.nextInt();
        if (dosha>0)
        {
            sum = sum + (dosha * 15);
        }
        Bills ob = new Bills(name,mobile,tea,coffee,snacks,idili,dosha,sum);
        arr.add(ob);
        System.out.println("successfully added");
        if (tea > 0)
        {
            System.out.println("tea "+tea+" * 10 ="+tea*10);
        }
        if (coffee > 0)
        {
            System.out.println("coffee "+coffee+" * 15 ="+coffee*15);
        }
        if (snacks > 0)
        {
            System.out.println("snacks "+snacks+" * 10 ="+snacks*10);
        }
        if (idili > 0)
        {
            System.out.println("idili "+idili+" * 8 ="+idili*8);
        }
        if (dosha > 0)
        {
            System.out.println("dosha "+dosha+" * 6 ="+dosha*6);
        }
        System.out.println("Sum ="+sum);


    }
    static void show()
    {
        for(int i=0;i< arr.size();i++)
        {
            System.out.println("Name:"+arr.get(i).name);
            System.out.println("sum:"+arr.get(i).sum);
        }
    }
}

