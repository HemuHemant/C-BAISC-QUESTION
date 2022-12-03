#include <iostream>
using namespace std;
int main(){
    
    int n;
    int rev=0;
    int r;
    cin>>n;
    while(n>0){
        r=n%10;
        n=n/10;
        rev=rev*10+r;
    }
    cout<<"Reverse number is" <<rev<<endl;
    return 0;
}