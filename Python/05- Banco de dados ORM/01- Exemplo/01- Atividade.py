import os
from sqlalchemy import create_engine, Column, String, Integer
from sqlalchemy.orm import sessionmaker, declarative_base

# Criando banco de dados.
db = create_engine("sqlite:///meubanco.db")

# Conexão com o banco de dados. 
Session = sessionmaker(bind=db)
session = Session()

# Criando tabela.
Base = declarative_base()

class Usuario(Base):
    # Definindo atributos da tabela.
    __tablename__ = "usuarios"

    # Definindo atributos da tabela.
    id = Column("id", Integer, primary_key=True, autoincrement=True)
    nome = Column("nome", String)
    email = Column("email",  String)
    senha = Column("senha", String)

    # Definindo atributos da classe.
    def __init__(self, nome: str, email: str, senha: str) -> None:
        self.nome = nome
        self.email = email
        self.senha = senha

# Criando tabela banco de dados.
Base.metadata.create_all(bind=db)

# Salvar no banco de dados.
# usuario = Usuario(nome="Marta", email="marta@gmail.com", senha="123")
# session.add(usuario)
# session.commit()

for i in range(2): 
    nome = input("Digite seu nome: ")
    email = input("Digite seu e-mail: ")
    senha = input("Digite sua senha: ")

    usuario = Usuario(senha=senha, nome=nome, email=email)
    session.add(usuario)
    session.commit()
    print()

#  Mostrando conteúdo do banco de dados.
print("\nListando usuários do banco de dados.")
lista_usuarios = session.query(Usuario).all()

for usuario in lista_usuarios: 
    print(f"ID: {usuario.id} -Nome: {usuario.nome} - E-mail: {usuario.email}")

# Deletando um usuário. 
print("\nUsuário no banco de dados.")
email_usuario = input("Informe o e-mail do usuário: ")
usuario = session.query(Usuario).filter_by(email=email_usuario).first()
session.delete(usuario)
session.commit()
print(f"\nUsuário {usuario.nome} foi deletado com sucesso.")
lista_usuarios = session.query(Usuario).all()

print("\nListando usuários do banco de dados.")
lista_usuarios = session.query(Usuario).all()

for usuario in lista_usuarios: 
    print(f"ID: {usuario.id} -Nome: {usuario.nome} - E-mail: {usuario.email}")

# Atualizar um usuário.
print("\nAtualizando os dados de um usuário.")

email_usuario = input("Informe o e-mail do usuário: ")


usuario = session.query(Usuario).filter_by(email = email_usuario).first()
if usuario:
    usuario.nome = input("Digite seu nome: ")
    usuario.email = input("Digite seu e-mail: ")
    usuario.senha = input("Digite sua senha: ")
    session.commit()
else:
    print("Usuário não encontrado.")    
    
# Pesquisando um usuário.
print("\nPesquisando um usuário pelo e-mail.")

email_usuario = input("Informe o e-mail do usuário: ")

usuario = session.query(Usuario).filter_by(email = email_usuario).first()

if usuario:
    print(f"ID: {usuario.id} -Nome: {usuario.nome} - E-mail: {usuario.email}")

else:
    print("Usuário não encontrado.")

session.close()
