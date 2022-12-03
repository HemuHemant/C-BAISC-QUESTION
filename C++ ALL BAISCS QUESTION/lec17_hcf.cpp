#include <iostream>
using namespace std;
int main(){
    int g=0;
    int a,b;
    cin>>a>>b;
    for(int i=1;i<=a;i++){
        if(a%i==0 &&  b%i==0){
            g=i;
        }
    }
    cout<<"Hcf of a and b is => "<<g;
    return 0;
}