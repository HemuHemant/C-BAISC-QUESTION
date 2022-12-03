#include <iostream>
using namespace std;
int sum(int n){
    if(n==1)
    {
        return 1;e
    }
    return sum(n-1)+n;
}
int main()
{
    int n,ans;
    cout<<"enter the value of n";
    cin>>n;
    ans=sum(n);
    cout<<ans;
return 0;
}