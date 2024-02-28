def g(x):
    return 4 * x + 11

def composicion(x, g):
   return 6 * g(x) + 1

a = int(input())   
reSuma = composicion(a, g)
print(reSuma)
