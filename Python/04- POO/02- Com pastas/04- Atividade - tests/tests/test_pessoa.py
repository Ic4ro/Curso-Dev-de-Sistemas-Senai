import pytest
from projeto.models.pessoa import Pessoa
from projeto.models.enums.sexo import Sexo

@pytest.fixture
def pessoa_valida(): 
    pessoa1 = Pessoa("Marta", 19, Sexo.MASCULINO)
    return pessoa1

def test_pessoa_mudar_nome_valido(pessoa_valida):
    pessoa_valida._nome = "Jose"
    assert pessoa_valida._nome== "Jose"

def test_pessoa_nome_valido(pessoa_valida):
    assert pessoa_valida._nome == "Marta"

def test_pessoa_idade_valido(pessoa_valida):
    assert pessoa_valida._idade == 19

def test_pessoa_idade_valido(pessoa_valida):
    pessoa_valida.set_idade(-1)
    assert pessoa_valida._idade == 0