#include <iostream>
using namespace std;
int main(){
    int n;
    int temp =0;
    cin>>n;
    for(int i=2;i<n-1;i++){
        if(n%i==0){
            temp =temp+1;
            break;
        }
    }
    if(temp>0){
      cout<<"Not Prime Number"<<endl;
    }
    else {
        cout<<"Prime Number";
    }
    return 0;
}