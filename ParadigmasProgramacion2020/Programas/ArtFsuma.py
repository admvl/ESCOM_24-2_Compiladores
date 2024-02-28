def f1(x):
    return 6 * x + 3

def f2(x):
    return 4 * x + 11

def opSuma(x,f1,f2):
   return f1(x) + f2(x)
   
reSuma = opSuma(5,f1,f2)
print(reSuma)
