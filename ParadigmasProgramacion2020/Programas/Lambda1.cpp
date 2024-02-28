#include <functional>
#include <iostream>

int main()
{

    using namespace std;

    // Asigna la expresión lambda la suma a una variable auto.
    auto f1 = [](int x, int y) { return x + y; };

    cout << f1(2, 3) << endl;

    // Asigna la expresión lambda a una función objecto.
    function<int(int, int)> f2 = [](int x, int y) { return x + y; };

    cout << f2(3, 4) << endl;
}





#include <functional>
#include <iostream>

int main()
{
   using namespace std;

   int i = 3;
   int j = 5;

   // La siguiente expresión lambda captura i por valor y
   // j por referencia.
   function<int (void)> f = [i, &j] { return i + j; };

   // Cambia los valores de i y j.
   i = 22;
   j = 44;

   // Llama f para imprimir el resultado.
   cout << f() << endl;
}
