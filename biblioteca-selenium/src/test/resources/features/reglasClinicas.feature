@reglasClinicas
Feture: Validaciones reglas clinicas

  Scenario: Edad menor a 12 
    Given que paciente es menor a 12 anios 
    When intento guardar la ficha
    Then el diagnostico debe ser Pediatrico

  Scenario: No se completa tratamiento
    Given que no se ha ingresado un tratamiento
    When intento guardar la ficha 
    Then el sistema no debe permitir guardarla 
    And debe mostrar el mensaje "Debe ingresar un tratamiento"