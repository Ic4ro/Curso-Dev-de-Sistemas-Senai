import os
os.system("cls||clear")

produto = input("Digite o nome do produto: ")
quantidade = int(input("Digite a quantidade adquirida: "))
precoUnitario = float(input("Digite o preço unitário: "))
total = quantidade * precoUnitario

if quantidade <= 5 :
    desconto = total * 0.02 
elif quantidade > 5 and quantidade <=10 :
    desconto = total * 0.03 
else :
    desconto = total * 0.05 

totalPagar = total - desconto

print(f"\nTotal: {total}")
print(f"Desconto: {desconto}")
print(f"Total a pagar: {totalPagar}")