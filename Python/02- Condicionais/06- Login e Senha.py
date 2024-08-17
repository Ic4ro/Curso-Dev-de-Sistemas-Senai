import os
os.system("cls || clear")

# Atribuindo valores.
login = user123 = input('Digite seu Login: ')
senha = senha123 = input('Digite sua Senha: ')

# Exibindo resultados. 
if login == "user123" and senha == "senha123":
    print("Bem vindo.")
else:
    print("Login ou Senha inválidos.")     