#include <iostream>

using namespace std;

int pow(int m,int n){
    if(n==0)
        return 1;
    

    
        return m*pow(m,n-1);
    
}
int main(){
    int m,n,ans;
    cout<<"enter the value of m and n"<<endl;
    cin>>m>>n;
    ans=pow(m,n);
    cout<<ans<<endl;
}