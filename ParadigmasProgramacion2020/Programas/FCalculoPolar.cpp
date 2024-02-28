#include <iostream>
#include <cmath>

using namespace std;

void CalculoPolar(double, double, double&, double&);

int main() {
    double d, a;

    CalculoPolar(3.0, 4.0, d, a);

    cout << "r = " << d << endl;
    cout << "ángulo = " << a << endl;

    return 0;
}

void CalculoPolar(double x, double y, double& r, double& theta) {
    const double T = 180.0/3.14159;

    r = sqrt(x + y * y);
    theta = atan(y/x) * T;

    return;
}
