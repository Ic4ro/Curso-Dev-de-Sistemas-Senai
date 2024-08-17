import os 

os.system("clear")

primeiraNota = -1
segundaNota = -1


while (primeiraNota < 0 or primeiraNota > 10) :
    primeiraNota = float(input("Digite a 1º nota: "))

while (segundaNota < 0 or segundaNota > 10) :
    segundaNota = float(input("Digite a 2º nota: "))    

media = (primeiraNota + segundaNota) / 2




print(f"Média: {media}")

print("=== Fim ===")