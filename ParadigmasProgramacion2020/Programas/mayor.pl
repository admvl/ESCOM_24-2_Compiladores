numeroMayor(A,B) :- A < B, write("El número mayor es: "), write(B), !.
numeroMayor(A,B) :- A > B, write("El número mayor es: "), write(A).
numeroMayor(A,B) :- A =:= B, write("Son iguales: ").

diferenciaNumeros(C, D, F) :- C >= D, !, F is C - D.
diferenciaNumeros(C, D, F) :- C < D, F is D - C. 
