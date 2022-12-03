#include <iostream>
using namespace std;
int main(){
    int g=0;
    int lcm;
    int a,b;
    cin>>a>>b;
    for(int i=1;i<=a;i++){
        if(a%i==0 && b%i==0){
            g=i;
        }
    }
    lcm=(a*b)/g;
    cout<<"Lcm of a and b is => "<<lcm<<endl;
    
    return 0;
}