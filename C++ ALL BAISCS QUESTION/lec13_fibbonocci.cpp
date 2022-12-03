#include <iostream>
using namespace std;
int main(){
    int sum=0;
    int n;
    cin>>n;
    int n1=0,n2=1;
    cout<<n1<<","<<n2<<",";

    for(int i=2;i<n;i++){
        sum =n1+n2;
        n1=n2;
        n2=sum;
        cout<<sum<<",";
    }

    return 0;
}