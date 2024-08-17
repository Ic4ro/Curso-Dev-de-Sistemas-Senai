import os 

os.system("clear")

soma: float = 0

for i in range(1,3):
    while True:
        nota = float(input("Digite a uma nota: "))
        if (nota < 0 or nota > 10):
            print("Nota inválida.")
        else:
            soma += nota
            break    


media = soma / 2    

print(f"\nMédia: {media}")    


print("=== Fim ===")