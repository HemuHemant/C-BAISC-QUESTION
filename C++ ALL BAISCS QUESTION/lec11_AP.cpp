#include <iostream>
using namespace std;
int main(){
    int n;
    int a;
    int d;
    
    cin>>n>>a>>d;
    int term=a;
    cout<<term<<endl;
    for(int i=1;i<=n;i++){
        term=term+d;
        cout<<term<<endl;
    }
    return 0;
}