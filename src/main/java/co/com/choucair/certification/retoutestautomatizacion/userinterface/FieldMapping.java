package co.com.choucair.certification.retoutestautomatizacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FieldMapping {
    public static final Target JOIN_TODAY = Target.the("")
            .located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));

    public static final Target FIRTS_NAME = Target.the("")
            .located(By.id("firstName"));

    public static final Target LAST_NAME = Target.the("")
            .located(By.id("lastName"));

    public static final Target EMAIL = Target.the("")
            .located(By.id("email"));

    public static final Target BIRTHMONTH = Target.the("")
            .located(By.id("birthMonth"));
    public static final Target BIRTHMONTHCLICK = Target.the("")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[1]/select/option[12]"));

    public static final Target BIRTHDAY = Target.the("")
            .located(By.id("birthDay"));
    public static final Target BIRTHDAYCLICK = Target.the("")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[2]/select/option[11]"));

    public static final Target BIRTHYEAR = Target.the("")
            .located(By.id("birthYear"));
    public static final Target BIRTHYEARCLICK = Target.the("")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[3]/select/option[16]"));

    public static final Target LANGUAGES = Target.the("")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[5]/div[2]/div[1]/input"));

    public static final Target LANGUAGESCLICK = Target.the("")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[5]/div[2]/ul/li/div[39]/span/div"));

    public static final Target NEXTLOCATION = Target.the("")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/a/span"));


    // Mapeo segundo formulario -------------------------------------------------------------------

    public static final Target CITY = Target.the("")
            .located(By.id("city"));

    public static final Target ZIP = Target.the("")
            .located(By.id("zip"));

    public static final Target COUNTRY = Target.the("")
            .located(By.id("ui-select-choices-2"));

    public static final Target NEXTDEVICE = Target.the("")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/div/a/span"));



//     Mapeo Tercer formulario

    public static final Target MOVILEDEVICE = Target.the("")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/div[1]/span"));


    public static final Target MOVILEDEVICEAPPLE = Target.the("")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/ul/li/div[5]/span/div"));


    public static final Target MODELDEVICE = Target.the("")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/div[1]/span"));

    public static final Target MODELDEVICECLICK = Target.the("")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/ul/li/div[62]/span/div"));

    public static final Target OSSELECT = Target.the("")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/div[1]/span"));

    public static final Target OSSELECTCLICK = Target.the("")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/ul/li/div[52]/span/div"));

    public static final Target NEXTLASTSTEP = Target.the("")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[2]/div/a"));


    //Mapeo ultimo formulario

    public static final Target PASSWORD = Target.the("")
            .located(By.id("password"));

    public static final Target CONFIRMPASSWORD = Target.the("")
            .located(By.id("confirmPassword"));

    public static final Target TERMSOFUSE1 = Target.the("")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));

    public static final Target TERMSOFUSE2 = Target.the("")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

    public static final Target BTNCOMPLETE = Target.the("")
            .located(By.id("laddaBtn"));























}
