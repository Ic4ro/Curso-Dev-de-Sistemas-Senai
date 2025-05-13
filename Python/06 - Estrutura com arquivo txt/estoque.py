# CRUD
# INTERFACE TEXTO

import time


def adicionar_item():
    print("Adicionar item")
    codigo = input("código do item: ")
    descricao = input("Descrição do produto: ")
    fabricante = input("Fabricante: ")
    preco = input("Preço: ")
    with open("estoque.txt", "a", encoding="utf-8") as arquivo:
        arquivo.write(f'Código: {codigo} \nDescrição: {descricao} \nFabricante: {fabricante} \nR$: {preco} Reais\n\n')
    print("Item adicionado com sucesso")
    time.sleep(2)


def listar_estoque():
    print("\n--- ESTOQUE ATUAL ---")
    try:
        with open("estoque.txt", "r", encoding="utf-8") as arquivo:
            conteudo = arquivo.read()
            if conteudo.strip() == "":
                print("Estoque vazio.")
            else:
                print(conteudo)
    except FileNotFoundError:
        print("Arquivo de estoque não encontrado. Nenhum item foi cadastrado ainda.")
    time.sleep(2)


def alterar_item():
    print("Alterar item")
    codigo = input("Digite o código do item que deseja alterar: ")

    with open("estoque.txt", "r", encoding="utf-8") as arquivo:
        linhas = arquivo.readlines()

    item_encontrado = False
    novo_conteudo = []
    i = 0

    while i < len(linhas):
        linha = linhas[i]

        if linha.startswith(f"Código: {codigo}"):
            item_encontrado = True

            print("\nItem atual:")
            print("".join(linhas[i:i+4]))  # Exibe o bloco do item encontrado

            # Novos dados
            novo_codigo = input("Novo codigo do produto: ")
            nova_descricao = input("Nova descrição do produto: ")
            novo_fabricante = input("Novo fabricante: ")
            novo_preco = input("Novo preço: ")

            # Substitui o bloco antigo pelo novo
            novo_conteudo.append(f"Código: {novo_codigo}\n")
            novo_conteudo.append(f"Descrição: {nova_descricao}\n")
            novo_conteudo.append(f"Fabricante: {novo_fabricante}\n")
            novo_conteudo.append(f"R$: {novo_preco} Reais\n")

            i += 4  # Pula o bloco antigo
        else:
            novo_conteudo.append(linha)
            i += 1

    if not item_encontrado:
        print("Item não encontrado.")
    else:
        with open("estoque.txt", "w", encoding="utf-8") as arquivo:
            arquivo.writelines(novo_conteudo)
        print("Item alterado com sucesso!")

    time.sleep(2)



def remover_item():
    print("Remover item")
    codigo = input("Digite o código do item que deseja remover: ")

    # Lê o arquivo de estoque
    with open("estoque.txt", "r", encoding="utf-8") as arquivo:
        linhas = arquivo.readlines()

    item_encontrado = False
    novo_conteudo = []
    i = 0

    # Procura pelo código do item e remove as 4 linhas correspondentes
    while i < len(linhas):
        if linhas[i].startswith(f"Código: {codigo}"):
            item_encontrado = True
            print(f"\nItem encontrado e removido: {''.join(linhas[i:i+4])}")
            i += 4  # Pula as 4 linhas correspondentes ao item
        else:
            novo_conteudo.append(linhas[i])
            i += 1

    if not item_encontrado:
        print("Item não encontrado no estoque.")
    else:
        # Regrava o arquivo sem o item removido
        with open("estoque.txt", "w", encoding="utf-8") as arquivo:
            arquivo.writelines(novo_conteudo)
        print("Item removido com sucesso!")

    time.sleep(2)


def menu():
    while True:
        print("\n---- MENU ESTOQUE ----")
        print("1 - Adicionar item")
        print("2 - Listar estoque")
        print("3 - Editar item")
        print("4 - Remover item")
        print("5 - Sair")

        try:
            opcao = int(input("Escolha uma opção: "))
        except ValueError:
            print("Por favor, digite um número válido.")
            continue

        if opcao == 1:
            adicionar_item()
        elif opcao == 2:
            listar_estoque()
        elif opcao == 3:
            alterar_item()
        elif opcao == 4:
            remover_item()
        elif opcao == 5:
            print("Saindo do sistema...")
            break
        else:
            print("Opção inválida. Tente novamente.")


menu()
