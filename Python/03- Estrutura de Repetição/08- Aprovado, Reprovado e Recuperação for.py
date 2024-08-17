import os
os.system("cls||clear")

soma = 0

for i in range(1,4):
    notas = float(input(f"Digite a {i}ª nota: "))
    soma += notas
    
media = soma / 3

print(f"Média: {media}")

if media >= 7:
    print("Aprovado!")
elif media >= 4.1 and media < 7:
    print("Recuperação!")
else:
    print("Reprovado!")