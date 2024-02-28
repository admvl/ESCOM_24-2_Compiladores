sumaN(0,0).
sumaN(N,R) :- T is N - 1, sumaN(T,Rp), R is N + Rp.

natural(M).
natural(N).
suma(0,N,N) :- suma(N,M,F) F is N + M, natural(N), natural(0), natural(M).

lista([Ca|U], L).
lista([U], L=U).
