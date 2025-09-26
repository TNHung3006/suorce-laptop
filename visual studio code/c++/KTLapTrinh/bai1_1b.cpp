#include <iostream>
using namespace std;
int main(){
    int d;
    cin >> d;
    if(d >= 0) {
        if(d < 50) cout << "Truot";
        else if(d < 65) cout << "Trung binh";
        else if(d < 80) cout << "Kha";
        else cout << "Gioi";
    }
    return 0;
}