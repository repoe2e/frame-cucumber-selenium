#language:pt

@login @regressivo
Funcionalidade: Login

	@positivo
  Cenario: Autenticação com sucesso
	Dado o cliente insere o nome de usuário "e2etreinamentos"
	E o cliente insere a senha "e2e@123"
	Quando o cliente clica no botão login
	Entao sistema direciona cliente para a página logado
