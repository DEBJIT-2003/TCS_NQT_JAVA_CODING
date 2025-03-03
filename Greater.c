#include<stdio.h>
int main()
{
	int n;
	printf("enter the size:\n");
	scanf("%d",&n);
	int arr[n];
	printf("enter elements:\n");
	for(int i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
	if(n==0)
	{
		printf("output: 0\n");
		return 0;
	}
	int count=1;
	int max=arr[0];
	for(int i=1;i<n;i++)
	{
		if(arr[i]>max)
		{
			count++;
			max=arr[i];
		}
	}
	printf("output=%d \n",count);
	return 0;
}