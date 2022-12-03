#include <iostream>
using namespace std;
int main(){
    int n;
    int a;
    int r;
    cin>>n>>a>>r;
    int term =a;
    cout<<term<<endl;
    for(int i=1;i<=n;i++){
        term=term*r;
        cout<<term<<endl;
    }
    return 0;
}