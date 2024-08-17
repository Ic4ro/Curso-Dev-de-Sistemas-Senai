import os
os.system("cls||clear")

soma = 0

for i in range(1,6):
    numeros = int(input("Digite um número inteiro: "))
    soma += numeros
    
for i in range(1,6):
    print(f"{i}º número inteiro: {numeros}")

print(f"\nSoma: {soma}")