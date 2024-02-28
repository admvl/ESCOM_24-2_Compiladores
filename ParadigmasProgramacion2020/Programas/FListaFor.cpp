#include <iostream>
#include <list>
 
void print(std::list<std::string> const &list)
{
    for (const auto &i: list) {
        std::cout << i << std::endl;
    }
}
 
int main()
{
    std::list<std::string> list = { "Pepe", "2023100", "9" , "Paco", "2023100", "9" , "Pancho", "2023100", "9" , "Poncho", "2023100", "9"};
    print(list);
 
    return 0;
}
