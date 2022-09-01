#autor Daniela Valdes
  @stories

  Feature: Registrar usuario en uTest

    @scenario1
    Scenario: Utest
      Given Daniela desea registrarse en la plataforma Utest
      When Daniela ingresa toda la informacioón requerida por la pagina
        | strNombre | strApellido | strEmail                           | strMes  | strDia | strAno | strCuidad | strCodPostal | strCuidad | strComputador | strVersion | strLenguaje | strDispositivo | strModelo | strSistema | strContrasena |
        | Daniela   | Valdes      | danieladayana.valdez2018@gmail.com | January | 12     | 2002   | Ibague    | 730004       | Colombia  | Windows       | 11         | Spanish     | Apple          | Iphone 12 | iOS 15     | Palpito123&%  |
      Then el registro se completa cuando aparece el Boton Complete Setup
        | strFinal       |
        | Complete Setup |