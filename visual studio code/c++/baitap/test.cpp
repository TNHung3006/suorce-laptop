#include <iostream>
using namespace std;
int a= 5, b = 6;
void abc(int a, int &b){
    a = a*2;
    b = b*2;
}
int main(){
    int a = 10;
    cout << a << "\t" << b;
    int x = -1;
    int y = x++;
    cout << x << "\t" << y;
    
}