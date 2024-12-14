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

class Aluno(Base): 
    # Definindo atributos da tabela.
    __tablename__ = "alunos"

    # Definindo atributos da tabela.
    ra = Column("R.A.", Integer, primary_key=True, autoincrement=True)
    nome = Column("nome", String)
    idade = Column("idade", String)
    email = Column("email", String)

    # Definindo atributos da classe.
    def __init__(self, nome: str, email: str, idade: str) -> None:
        self.nome = nome
        self.idade = idade
        self.email = email

# Criando tabela banco de dados.
Base.metadata.create_all(bind=db)

#  Salvar no banco de dados.
aluno = Aluno(nome="Icaro", email="Icaro@gmail.com", idade="19")
session.add(aluno)
session.commit()

# Mostrando conteúdo do banco de dados.
lista_alunos = session.query(Aluno).all()

for aluno in lista_alunos: 
    print(f"R.A.: {aluno.ra} - Nome: {aluno.nome} - E-mail: {aluno.email} - Idade: {aluno.idade}")
