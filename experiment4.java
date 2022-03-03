import java.util.Scanner;
class experiment4 {
public static void main(String[] AKshat){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int n=input.nextInt();
    int a[]=new int[n];
    int i=0,j=0,temp;
    for(i=0;i<n;i++){
        a[i]=input.nextInt();
    }
    System.out.println("The array is ");
    for(i=0;i<n;i++){
        System.out.println(a[i]);
    }
    for(i=0;i<n-1;i++){
        for(j=0;j<n-i-1;j++){
            if(a[j]>a[j+1]){
            temp=a[j];
            a[j]=a[j+1];
            a[j+1]=temp;
            }

        }
    }
    System.out.println("The sorted array is ");
    for(i=0;i<n;i++){
        System.out.println(a[i]);
    }

}
}
