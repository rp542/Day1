

public class Bubblesort {

	public static void main(String[] args) {
		int i,j,flag;
int arr[]= {5,12,14,6,78,19,1,23,35,37,7,52,86,47,0};
for(i=0;i<=14;i++) {
for(j=i+1;j<=14;j++) {
	if(arr[i]>arr[j])
	{
		flag=arr[i];
		arr[i]=arr[j];
		arr[j]=flag;
	}
}
}
for(i=0;i<=14;i++)
{
	System.out.println(+arr[i]);
}
}
}
