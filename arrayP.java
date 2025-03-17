import java.util.Scanner;

class arrayP
{
	public static void main (String[] args) 
	{
	Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int arr[] = new int[N];

    for (int i = 0;i < N;i++) {
        arr[i] = sc.nextInt();
    }

    int X = sc.nextInt();
    int newSize = 0;
    for (int i = 0;i < N;i++) {
        if (arr[i] != X) {
            arr[newSize] = arr[i];
            newSize++;
        }
    }
    for (int i = 0;i < newSize;i++) {
        System.out.print(arr[i] + " ");;
    }

	}
}
