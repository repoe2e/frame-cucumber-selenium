

@login @regressivo
Feature: Login

	@positivo
  Scenario Outline: Autenticação
	Given o cliente insere o nome de <usuário> 
	And o cliente insere a <senha> 
	When o cliente clica no botão login
	Then valido mensagem de inconsistencia
	
	Examples:
	| usuário          | senha   |
	|"errado"          |"e2e@123"|
	|"e2etreinamentos" |"errada" |
	
	
	Scenario: Autenticação com sucesso
	Given o cliente insere o nome de usuário "e2etreinamentos"
	And o cliente insere a senha "e2e@123"
	When o cliente clica no botão login
	Then sistema direciona cliente para a página logado
	
	
	
