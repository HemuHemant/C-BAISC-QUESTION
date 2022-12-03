#include <iostream>
using namespace std;
int main(){
    
    int n;
    int r;
    int rev=0;
    cin>>n;
    int m=n;
    while(n>0){
        r=n%10;
        n=n/10;
        rev=rev*10+r;
    }
    if(m==rev){
        cout<<"Palidrome"<<endl;
    }
    else {
        cout<<"Not Palidrome"<<endl;
    }
    return 0;
}