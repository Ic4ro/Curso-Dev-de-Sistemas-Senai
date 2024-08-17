import os
os.system("cls||clear")

soma = 0

for i in range(1,5):
    notas = float(input(f"Digite a {i}ª nota: "))
    soma += notas
    
media = soma / 4

print(f"Média: {media}")