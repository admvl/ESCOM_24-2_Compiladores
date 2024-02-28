eliminar(X,[X|C],C).
eliminar(X,[Y|Yo],[Y|Zo]) :- eliminar(X,Yo,Zo).

concatenar([],L,L).
concatenar([X|L1],L2,[X|L3]) :- concatenar(L1,L2,L3).

ultimo(X,[X]).
ultimo(X,[_|Y]) :- ultimo(X,Y).

insertarFinal(X,[X|L1],L2) :- insertarFinal(X,L1,L2).

insertarUltimo(X,[L1|X],L2) :- insertarUltimo(X,L1,L2).

numElementos([],0).
numElementos([_|L],N) :- numElementos(L,T), N is T + 1.
