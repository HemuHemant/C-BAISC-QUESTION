#include <iostream>
using namespace std;
int main(){
    int rev=0;
    int n;
    int r;
    cin>>n;
    int m=n;
    while(n>0){
        r=n%10;
        n=n/10;
        rev=rev+r*r*r;
    }
    if(m==rev){
        cout<<"It's Armstrong";
    }
    else {
        cout<<"Not Armstrong";
    }
    return 0;
}