#language: pt
@Animais
Funcionalidade: Registro de vanicacao para pet

  Cenario de Fundo: Sair de casa
    * Ant4s de sair minha mae me lembro ude pegar meu casaco

  Esquema do Cenario: Vacinacao para <Especie>
    * Como dono de um <Especie> <Cor>
    * Quando a campanha de vacinacao esta em andamento
    * Entao posso fazer o registro para participar
    Exemplos:
      | Especie  | Cor    |
      | cachorro | preto  |
      | gato     | marrom |

  @ApenasSabado
  Cenario: Ir para a vacinacao
    * Como um dono de pet ja registrado
    * Posso comparecer a uma unidade de vacinacao para vacinar meu pet
