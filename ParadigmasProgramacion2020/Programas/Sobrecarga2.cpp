#include <iostream>

using namespace std;

int miabs(int i);
double miabs(double d);
long miabs(long l);

int main() {
    cout << miabs(-10) << "\n";
    cout << miabs(-11.0) << "\n";
    cout << miabs(-9L) << "\n";

    return 0;
}

int miabs(int i) {
    cout << "miabs() usa enteros: ";
    if(i < 0) return -i;
    else return i;
}

double miabs(double d) {
    cout << "miabs() usa double: ";
    if(d < 0.0) return -d;
    else return d;
}

long miabs(long l) {
    cout << "miabs() usa long: ";
    if(l < 0) return -l;
    else return l;
}
