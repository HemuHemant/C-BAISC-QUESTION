#include <iostream>
using namespace std;
int main(){
    int a;
    cin>>a;
    int g=0;
    for(int i=1;i<=a;i++){
        if(a%i==0){
            g=i;
            cout<<g<<"  ";
        }
    }
    return 0;
}