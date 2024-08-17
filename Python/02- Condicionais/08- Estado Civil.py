import os
os.system("cls||clear")

nome = input("Digite o nome: ")
sexo = input("Digite o sexo: ")
estadoCivil = input("Digte o estado civil: ")

sexo = sexo.lower()
estadoCivil = estadoCivil.lower()

if sexo == 'f' and estadoCivil == "casada":
    anos = input("Digite anos de casada: ")

print(f"\nNome: {nome}")

if sexo == 'm':
    print(f"Sexo: Masculino")

elif sexo == 'f':
    print(f"Sexo: Feminino")

else:
    print(f"Sexo inválido.")
    
print(f"Estádo civil: {estadoCivil}")

if sexo == 'f' and estadoCivil == "casada":
    print(f"Anos de casada: {anos}")