@InteraccionesdelUsuario
Feature: Registrar un usuario

  @RegistrarUsuario @HappyPath
  Scenario Outline: Registrar de manera existosa a un usuario con credenciales validas
    Given el usuario esta en la pagina de inicio
    And selecciona el boton de registro
    And ingresa un nombre de usuario "<username>" y contrasenia "<password>"
    And selecciona el boton registrar
    Then se realiza el registro de manera exitosa
    Examples:
      | username    | password |
      | usuarioqwer | pass123  |

  @LogearUsuario @HappyPath
  Scenario Outline: Logear a un usuario con sus credenciales de manera exitosa
    Given el usuario esta en la pagina de inicio
    And selecciona el boton de login de la pagina
    And ingresa un nombre de usuario "<usernamelog>" y su password "<passwordlog>" en modal de login
    And selecciona el boton de logeo del modal
    Then se realiza el logeo de manera exitosa
    Examples:
      | usernamelog | passwordlog |  |
      | usuarioqwer | pass123     |  |

  @AgregarProductoaCarrito @HappyPath
  Scenario Outline: Agregar un producto al carrito de manera exitosa
    Given el usuario esta en la pagina de inicio
    And selecciona el Producto "<nombreproducto>" de la pagina
    And Agrega al carrito el producto capturando el texto de la alerta
    Then se agrega el producto de manera exitosa
    Examples:
      | nombreproducto    |  |
      | Samsung galaxy s6 |  |
