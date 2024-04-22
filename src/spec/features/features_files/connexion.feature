Feature: Validation de connexion invalide
           En tant que utilisateur je veux verifier que la connexion est invalide
           
 Background:
    Given je me rends sur le site todolist "url"


  @disbaledButton
  Scenario: Je souhaite verifier que le bouton envoyer est desactive
    When je laisse le champ login vide
    And je laisse le champ password vide
    Then le bouton envoyer est desactive

  @connexionIncorrect
  Scenario: Je souhaite verifier que les identifiants sont incorrectes
    When je remplie le champ avec un email incorrect
    And je remplie le champ avec un password incorrect
    And je clique sur le bouton envoyer
    Then un messgae d'erreur s affiche "Désolé, les identifiants sont incorrects."