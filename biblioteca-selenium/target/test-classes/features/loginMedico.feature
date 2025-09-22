@loginMedico
Feature: Login de medico

  Scenario: Login exitoso
    Given que me encuentre en la pagina principal para iniciar sesion
    When ingreso valores de inicio de sesion validos 
    Then aparece un mensaje que dice que las credenciales son correctas

  Scenario: Login fallido
    Given que me encuentre en la pagina principal para iniciar sesion
    When ingreso valores de inicio de sesion invalidos 
    Then validar mensaje de error al tener las credenciales erroneas

