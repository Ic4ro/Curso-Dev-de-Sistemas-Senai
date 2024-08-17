
import os
os.system("cls||clear")

pares = 0
impares = 0

for i in range(1,6):
    numeros = int(input("Digite um número inteiro: "))
    
    if numeros % 2 == 0:
        pares += 1
    else:
        impares += 1

print(f"Pares: {pares}")
print(f"Impares: {impares}")
