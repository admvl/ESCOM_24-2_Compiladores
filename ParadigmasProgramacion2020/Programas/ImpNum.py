def impNum(num):
    num = num + 1
    if num <= 100:
        print(num)
        impNum(num)
        
impNum(0)
