#include <iostream>
#include <list>
#include <algorithm>
#include <iterator>
 
void print(std::list<std::string> const &list)
{
    std::copy(list.begin(),
            list.end(),
            std::ostream_iterator<std::string>(std::cout, "\n"));
}
 
int main()
{
    std::list<std::string> list = { "blue", "red", "green" };
    print(list);
 
    return 0;
}
