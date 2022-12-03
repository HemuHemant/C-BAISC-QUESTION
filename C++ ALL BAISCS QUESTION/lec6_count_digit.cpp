#include <iostream>
using namespace std;
int main(){
    int r;
    int count =0;
    int n;
    cin>>n;
    while(n>0){
        r=n%10;
        n=n/10;
        count++;
    }
    cout<<"number of digit is  "<<count<<endl;
    return 0;
}