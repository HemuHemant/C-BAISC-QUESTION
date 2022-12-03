#include <iostream>
using namespace std;

int fact(int n){
    if(n==0){
        return 1;
    }
    return fact(n-1)*n;
}
int main(){
    int n,ans;
    cout<<"enter the value of fact n";
    cin>>n;
    ans=fact(n);
    cout<<ans<<endl;
}