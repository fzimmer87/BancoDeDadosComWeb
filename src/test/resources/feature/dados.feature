#language: pt
Funcionalidade: Testar plataforma da ForwardCar usando Banco de Dados

  @CT001
  Cenario: Realizar cadastro na plataforma ForwardCar
    Dado que preencho os campos Firstname,Lastname,Username e Password com massa de dados
    Quando clico no botao Register na página de registro
    Entao sistema me encaminha para pagina de login

  @CT002
  Cenario: Realizar login sem cadastro
    Dado que preencho os campos Firstname,Lastname,Username e Password com massa de dados
    E clico no botao Register na página de registro
    Quando preencho username e password na pagina de Login com dados cadastrados
    Entao sistema me encaminha para pagina inicial e meu nome aparece no lugar do Guest

  @CT003
  Cenario: Cadastrar novo veiculo
    Dado que estou na pagina inventory da ForwardCar
    E clico no cadeado
    E clico em add a car
    E clico em PopulationFrom
    Quando digito campos price e model year com massa de dados
    E clico em create
    Entao sistema me retorna mensagem car created

  @CT004
  Cenario: Pesquisar carros pela cor
    Dado que digito cores da massa de dados na pagina inventory da ForwardCar
    Entao sistema me retorna modelos da mesma cor digitada

  @CT005
  Cenario: Pesquisar carros pelo ano
    Dado que estou na pagina inventory da ForwardCar
    E digito os anos da massa de dados no campo Search
    Entao sistema me retorna true se modelos do mesmo ano digitado e false se encontra cor diferente


