package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;

public class DemoblazePage extends BasePage{

    private String SingUpButton = "//a[@id='signin2']";

    private String usuarioText = "//input[@id='sign-username']";
    private String passwordText = "//input[@id='sign-password']";

    private String useraccount = "//input[@id='loginusername']";
    private String passaccount = "//input[@id='loginpassword']";

    private String LogIn = "//a[@id='login2']";

    private String EndButton = "//html/body/div[2]/div/div/div[3]/button[2]";

    private String EndLogIn = "//html/body/div[3]/div/div/div[3]/button[2]";

    private String LogOutButton = "//a[@id='logout2']";

    private String producto = "//html/body/div[5]/div/div[2]/div/div[8]/div/a/img";

    private String addproductobutton = "//html/body/div[5]/div/div[2]/div[2]/div/a";

    private String carritobutton = "//html/body/nav/div/div/ul/li[4]/a";

    private String campoproducto = "/html/body/div[6]/div/div[1]/div/table/tbody/tr/td[2]";


    public DemoblazePage(){
        super(driver);
    }


    public void NavegarEnDemoblaze() {

        navigateTo("https://www.demoblaze.com/index.html");
    }

    public void ClickSingUp(){
        clickElement(SingUpButton);
    }

    public void IngresarDatos(String usuario, String pass)throws InterruptedException{
    try {
        write(usuarioText, usuario);
        write(passwordText,pass);
            }catch (NoSuchElementException e){
        System.out.print("The Webelement Search Field coulnd't be found.");
        e.printStackTrace();
        }
    }

    public void Finalizar(){
        clickElement(EndButton);

    }
    public void AceptarAlerta(){
        AceptAlert();
    }

    public void IngresarUsuario(String username, String password)throws InterruptedException{
        try {
            write(useraccount, username);
            write(passaccount,password);
        }catch (NoSuchElementException e){
            System.out.print("The Webelement Search Field coulnd't be found.");
            e.printStackTrace();
        }
    }

    public void ClickLogin(){

        clickElement(LogIn);

    }

    public void FinalizarLogIn(){

        clickElement(EndLogIn);

    }

    public void RealizarLogOut(){

        clickElement(LogOutButton);

    }

    public void SeleccionarProducto() throws InterruptedException {

        scrolldown();

        clickElement(producto);

    }

    public void AgregaProducto(){
        clickElement(addproductobutton);
    }

    public String ValidarProducto(){

        clickElement(carritobutton);

        return GetValueFromTable(campoproducto);

    }


}
