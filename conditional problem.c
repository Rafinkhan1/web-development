#include<stdio.h>
int main()
{
    int n,s,sum=0,t;
    printf("Input the number=");
    scanf("%d",&t);
    n=t;
    while(n!=0)
    {
        s=n%10;
        sum=sum*10+s;
        n=n/10;
    }
    printf("reverse number=%d",sum);
    return 0;
}
