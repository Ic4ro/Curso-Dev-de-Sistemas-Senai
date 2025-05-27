def salvar(usuario, senha):
    with open("banco.txt", "a") as arquivo:
        arquivo.write(f"Usuário: {usuario} Senha: {senha}\n")
        print(f"Usuário: {usuario}\nSenha: {senha}")
        print("Dados salvos com sucesso no arquivo banco.txt")
