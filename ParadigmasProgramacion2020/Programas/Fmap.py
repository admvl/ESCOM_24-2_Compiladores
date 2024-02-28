def cuadrado(num):
   return num * num

lista = [1, 2, 3, 4, 5, 6]
resultado = map(cuadrado, lista)

listaResultado = list(resultado)
print(listaResultado)


lista = [1, 2, 3, 4, 5, 6]
resultado = map(lambda num: num * num, lista)

listaResultado = list(resultado)
print(listaResultado)
