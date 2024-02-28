def ordenSuperior(fun):
   fun()
   
def getImpresion():
   print("Hola")
   
ordenSuperior(getImpresion)

def operacion(x, fun):
   return fun(x)
   
def sqrt(x):
   return x**0.5
   
def AlCuadrado(x):
   return x**2
   
resu1 = operacion(16, sqrt)
print(resu1)

resu2 = operacion(16, AlCuadrado)
print(resu2)

enteros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
pares = list(filter(lambda x: x%2 == 0, enteros))
print(pares)

enteros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
cubicos = list(map(lambda x: x**3, enteros))
print(cubicos)

from functools import reduce
enteros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
sumcum = reduce(lambda a,b: a + b, enteros)
print(sumcum)

def suma(a,b):
   return a + b
   
def opSuma(x,y, fun):
   fun(x,y)
   
reSuma = opSuma(3.4,suma)
print(reSuma)

