import os
os.system("cls||clear")

operacao = input("Digite um código de operação (+, -, * ou /): ")
valorA = int(input("Digite o valor A: "))
valorB = int(input("Digite o valor B: "))

match(operacao):
    case '+':
        resultado = valorA + valorB
    case '-':
        resultado = valorA - valorB
    case '*':
        resultado = valorA * valorB
    case '/':
        resultado = valorA / valorB
    case _:
        print("Código de operação inválido.")

print(f"\nResultado: {valorA} {operacao} {valorB} = {resultado}")