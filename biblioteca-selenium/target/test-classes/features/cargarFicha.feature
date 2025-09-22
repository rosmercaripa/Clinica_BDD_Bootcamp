@cargarFicha
Feature: Cargar ficha clinica
  Scenario Outline: Cargar correctamente la ficha clinica
    When ingresa los datos del paciente "<nombre>", "<diagnostico>", "<edad>", "<tratamiento>"
    Then se muestra un mensaje de confirmación "Ficha registrada con éxito."

    Examples: 

    |nombre | diagnostico   |  edad  |tratamiento           |
    |Daniel | TAB           |  28    |consumo antipsicoticos|
    |Melani | Esquizofrenia |  27    |consumo antipicoticos |
    |Dan    | Diabetes tipo1|  12    |inyeccion de insulina |
