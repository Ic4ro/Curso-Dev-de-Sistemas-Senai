import os 

os.system("clear")

soma: float = 0

for i in range(1,4):
    while True:
        nota = float(input("Digite a uma nota: "))
        if (nota < 0 or nota > 10):
            print("Nota inválida.")
        else:
            soma += nota
            break    


media = soma / 3   

print(f"\nMédia: {media}")    

if media >= 7:
    print("Aprovado!")
elif media >= 5 and media < 6.9:
    print("Recuperação!")
else:
    print("Reprovado!")


print("=== Fim ===")