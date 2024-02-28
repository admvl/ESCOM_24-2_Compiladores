#include <list>
#include <algorithm>
#include <iostream>

int main()
{
    using namespace std;

    list<int> numbers;
    numbers.push_back(13);
    numbers.push_back(17);
    numbers.push_back(42);
    numbers.push_back(46);
    numbers.push_back(99);

    const list<int>::const_iterator result =
        find_if(numbers.begin(), numbers.end(),[](int n) { return (n % 2) == 0; });

    if (result != numbers.end()) {
        cout << "El primer número par en la lista, es " << *result << "." << endl;
    } else {
        cout << "La lista no contiene números pares." << endl;
    }
}
