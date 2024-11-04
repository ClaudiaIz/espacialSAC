  #language:en
  @happyPath
  Feature: : Casos de Prueba correspondiente a Registro de Lanzamientos

    Scenario: : Registrar Lanzamiento
      Given que ingresamos a la página web
      When ingreso el nombre del tripulante "Lucia Izurraga Llosa"
      And doy click a Agregar Tripulante
      And selecciono la base "Base Coreana"
      And selecciono el destino "Su corazon <3!!"
      And ingreso la fecha de despegue "11032025"
      And selecciono la ruta "Tierra - Saturno"
      And selecciono la nave "Apolo 21"
      And doy click al boton Enviar
      Then Entonces se muestra el mensaje "Gracias!"