import os 

os.system("clear")

soma: float = 0
quantidadeDeNotas = 0

while True:
    nota = float(input("Digite a uma nota: "))


    resposta = input("Deseja inserir mais uma nota: ")
    resposta = resposta.upper()
    

    soma += nota    
    quantidadeDeNotas += 1

        

    if resposta == "N":    
        break    

media = soma / quantidadeDeNotas 
 

print(f"\nMédia: {media}")    

if media >= 7:
    print("Aprovado!")
elif media >= 5 and media < 6.9:
    print("Recuperação!")
else:
    print("Reprovado!")

print("=== Fim ===")