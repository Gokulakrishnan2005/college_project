import java.util.Scanner;

public class array {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n=in.nextInt();
        double[] num=new double[n];
        System.out.println("Enter the array element : ");
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the number of "+i+" is ");
            num[i]=in.nextDouble();
        }
        double sum=0;
        for (double nums:num)
        {
            sum+=nums;
        }
        double average=sum/n;
        System.out.println("the array elements is : ");
        for(double numk:num);
        {
            System.out.println(num+" ");
        }
        System.out.println("sum : "+sum);
        System.out.println("Avarage is : "+average);


    }
}
