#include <iostream>
#include <list>
#include <algorithm>
 
void print(const int &i) {
    std::cout << i << std::endl;
}
 
struct myclass
{
    void operator() (int i) {
        std::cout << i << std::endl;
    }
} ob;
 
void print_list(std::list<std::string> const &list)
{
    // especificar una expresión lambda
    std::for_each(list.begin(),
                list.end(),
                [](const auto &e) {
                    std::cout << e << std::endl;
                });
 
    // o especificar una función
    // std::for_each(list.begin(), list.end(), print);
 
    // o pasar un objeto de una clase sobrecargando el operador ()
    // std::for_each(list.begin(), list.end(), ob);
}
 
int main()
{
    std::list<std::string> list = { "blue", "red", "green" };
    print_list(list);
 
    return 0;
}
