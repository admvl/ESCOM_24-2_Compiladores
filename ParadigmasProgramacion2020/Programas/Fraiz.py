import math

def raiz(a, b, c):
   return ((-b + math.sqrt(math.pow(b,2) - (4 * a) * c)) / (2 * a))
   
a = int(input())
b = int(input())
c = int(input())
  
v = raiz(a,b,c)
print(v)
