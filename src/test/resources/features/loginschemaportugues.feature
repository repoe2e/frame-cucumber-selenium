#language:pt

@loginPortugues @regressivo
Funcionalidade: Login

  @positivo
    Esquema do Cenário: Autenticação
    Dado que o cliente insere o nome de <usuário>
    E o cliente insere a <senha> 
    Quando o cliente clica no botão login
    Então o sistema valida a <mensagem> de inconsistência

    Exemplos:
      | usuário          | senha       | mensagem         |
      | "errado"         | "e2e@123"   |"dados inválidos" |
      | "e2etreinamentos"| "errada"    |"dados inválidos" |
 
 
  Cenário: Autenticação com sucesso
    Dado que o cliente insere o nome de usuário "e2etreinamentos"
    E o cliente insere a senha "e2e@123"
    Quando o cliente clica no botão login
    Então o sistema direciona o cliente para a página logado
