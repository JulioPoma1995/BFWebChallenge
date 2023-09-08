Feature: Alta de usuario para logeo y compra de producto
  @Singup
  Scenario Outline: Dar de alta a un usuario
      Given Demoblaze url
      When Ingresar al SingUp
      Then Registrar <usuario> y <contraseña>
      Then Click en Sing Up
      And Aceptar Alerta

  Examples:
  |usuario   |contraseña|
  |JulioPoma1|JulioPoma1|

  @LogIn-LogOut
  Scenario Outline: LogIn y LogOut con usuario
      Given Demoblaze url
      When Ingreso al Login
      Then Agrego <usuario> y <contraseña> de usuario creado
      Then Click en LogIn
      And Realizo el Logout
  Examples:
  |usuario   |contraseña|
  |JulioPoma1|JulioPoma1|

  @SeleccionProducto
  Scenario Outline: Agregar Laptop a carrito de compras
      Given Demoblaze url
      When Ingreso al Login
      Then Agrego <usuario> y <contraseña> de usuario creado
      Then Click en LogIn
      And Selecciono el producto
      Then Agrego el producto a la lista de compras
      Then Aceptar Alerta
      And Valido la seleccion de <producto>

  Examples:
  |usuario   |contraseña|producto    |
  |JulioPoma1|JulioPoma1|Sony vaio i5|


