Feature: Validation de l inexistence des liens tache et deconnexion
           En tant que utilisateur je veux verifier les liens tache et deconnexion sont inexistents

 @navigation
  Scenario: je souhaite verifier que les liens tache et deconnexion sont inexistents
    Given je me rends sur le site todolist "url"
    When je ne suis pas identife
    Then les liens "Tâches" n est pas affiche
    	And le lien "Déconnexion" n est pass affiche