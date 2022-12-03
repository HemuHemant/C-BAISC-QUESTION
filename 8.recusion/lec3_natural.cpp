#include <iostream>
 using namespace std;

 int num(int n)
 {
    if(n==0){
        return 0;
    }
    cout<<n<<endl;
    return num(n-1);
    //cout<<n<<endl;
 }
 int main(){
    int n,ans;
    cout<<"enter the value of n";
    cin>>n;
    ans=num(n);
    cout<<ans;
 }