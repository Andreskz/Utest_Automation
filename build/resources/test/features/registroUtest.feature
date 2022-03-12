
  # Autor: Johnathan
  @stories
  Feature: Verificar el correcto funcionamiento del formulario de registro
    Yo como usuario quiero ingresar a Utest para completar el registro desde la plataforma web
    @scenario1
    Scenario: Verificar el formulario de registro exitoso
      Given que Johnathan ingresa a la pagina de Utest
      And le da click en el boton JOINTODAY
      When diligencia el formulario en el paso uno
        | firstName | lastName | email                  |
        | andres    | Velez    | avhardcore03@gmail.com |
      And diligencia el formulario del paso dos
        | city     | zip    | country  |
        | Medellín | 055412 | Colombia |
      And diligencia el formulario del paso tres
        | movileDevice | modelDev  | os         |
        | Apple        | iPhone 11 | iOS 15.3.1 |

      And diligencia el formulario del paso cuatro
        | password      | confirmPassword |
        | Choucair2022* | Choucair2022*   |
      Then Verifica que completo el registro