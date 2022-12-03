#include <iostream>
using namespace std;
int main()
{

    int a, b;
    int g = 0;
    cin >> a >> b;
    for (int i = 1; i <= a; i++)
    {
        if (a % i == 0 &&  b%i==0)
        {
            g = i;
            cout<<g<<"  ";
        }
    }
    return 0;
}