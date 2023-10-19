package constantes;

import DAO.PesquisaEmBancoDeDados;
import DTO.Carro;
import DTO.Usuario;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ConstantesCampoBy {
    private WebDriver driver;
    PesquisaEmBancoDeDados pesquisaEmBancoDeDados = new PesquisaEmBancoDeDados();



    private By CampoSearch = By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/ul/li[2]/a");
    private By BotaoSearch = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div[2]/a[2]/label/input");
    private By CampoDeRetornodosCarros = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[3]/div[3]/div/div[1]");
    private By CampoCorViewsDetails = By.xpath("/html/body/div[4]/div/div/div/div[2]/table/tbody/tr[5]/td[2]");
    private By CampoYearNaTelaDePesquisa = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[3]/div[1]/div/div[2]/p[1]");
    private String BotaoViewsDetailsInicio = "/html/body/div[1]/div[2]/div/div/div/div/div[3]/div[";
    private String BotaoViewsDetailsFim = "]/div/div[3]/button[1]";
    private By BotaoClear = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div[2]/a[2]/button");
    private By BotaoDelete = By.cssSelector("body.ng-scope:nth-child(2) div.container.site:nth-child(1) div.ng-scope:nth-child(2) div.row.ng-scope div.ng-scope div.container div.row div.col-sm-9 div.col-sm-4.ng-scope:nth-child(1) div.panel.panel-primary.text-center div.panel-footer > button.center-block.btn.btn-primary.btn-block.btn-xs:nth-child(3)");
    private By botaoAddCar = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div[1]/div/button");
    private By BotaoPopulationFrom = By.xpath("/html/body/div[4]/div/div/div/div[2]/div/button");
    private By BotaoCreate = By.xpath("/html/body/div[4]/div/div/div/div[2]/div/form/div[17]/div/button[2]");
    private By MensagemCarCreated = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div[1]/div/span");
    private By NumerodeCarrosInvenctory = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div[1]/div/text()");
    private By BotaoPrice = By.cssSelector("#price");
    private By TelacomNomedeTodosCarros = By.className("panel-heading");
    private By TelaAdmin = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div[1]/div");
    private By BotaoOkViewsDetaisls = By.xpath("/html/body/div[4]/div/div/div/div[3]/button[3]");
    private By botaoCadeado = By.cssSelector("#admin");
    private By MensagemCarDeleted = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div[1]/div/span");
    private By BotaoCampoSearch = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div[2]/a[2]/label/input");
    private By botaoGuest = By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/ul/li[5]/a/span[1]");
    private By getBotaoGuestComMeunome = By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/ul/li[5]/a/span[1]");
    private By BotaoMake = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div[3]/a[2]");
    private By BotaoModelRLXAWD = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div[4]/a[3]");
    private By BotaoLogin = By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/ul/li[5]/ul/li[1]/a");
    private By campoUsarnameLogin = By.xpath("//*[@id='login-form']/fieldset/div[1]/input");
    private By campoPassowordLogin = By.xpath("//*[@id='login-form']/fieldset/div[2]/input");
    private By botaoSignInPagLogin = By.xpath("//*[@id='login-form']/fieldset/div[3]/button");
    private By BotaoLoanStatus = By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/ul/li[5]/ul/li[3]/a");
    private By botaoRegister = By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/ul/li[5]/ul/li[2]/a");
    private By Campoprice = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[3]/div[1]/div/div[1]");
    private By campoFirstName = By.xpath("//*[@id=\"registration-form\"]/fieldset/div[1]/input");
    private By campoLastName = By.xpath("//*[@id=\"registration-form\"]/fieldset/div[2]/input");
    private By campoUsarname = By.xpath("//*[@id=\"registration-form\"]/fieldset/div[3]/input");
    private By campoPassword = By.xpath("//*[@id=\"registration-form\"]/fieldset/div[4]/input");
    private By botaoRegisterLogin = By.xpath("//*[@id=\"registration-form\"]/fieldset/div[5]/button");
    private By CampoResultadoBusca = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[3]");
    private String CampoYearTelaPesquisaInicio = "/html/body/div[1]/div[2]/div/div/div/div/div[3]/div[";
    private String CampoYearTelaPesquisaFim = "]/div/div[2]/p[1]";
    private By CampoCartaoCarro = By.xpath("//div[contains(@class, 'panel panel-primary text-center')]");
    private By imagemCarroPagInicial = By.xpath("/html/body/div[1]/div[2]/div[1]/img");
    private By botaoDealer = By.xpath("//*[@id=\"field_dealer\"]");
    private By campoModelYear= By.xpath("//*[@id=\"modelYear\"]");
    private String url_esperada = ConstantesFordWardCar.URL_PAGINA_INICIAL;
    private By botaoLogout = By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/ul/li[5]/ul/li[4]/a");

//    public ConstantesCampoBy(WebDriver driver) {
//        this.driver = driver;
//    }

    public void preencherDadosParaCadastro()  {

        try {
            ArrayList<Usuario> lista = pesquisaEmBancoDeDados.pesquisarDadosUsuarios();

            for (int i = 0; i < lista.size(); i++) {

                driver.get(ConstantesFordWardCar.URL_PAGINA_REGISTER);
                driver.findElement(campoFirstName).sendKeys(lista.get(i).getFirstname());
                Thread.sleep(1000);
                driver.findElement(campoLastName).sendKeys(lista.get(i).getLastname());
                Thread.sleep(1000);
                driver.findElement(campoUsarname).sendKeys(lista.get(i).getUsername());
                Thread.sleep(1000);
                driver.findElement(campoPassword).sendKeys(lista.get(i).getPassword());
                Thread.sleep(1000);
                clicarBotaoRegister();
                Thread.sleep(1000);

            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    public void preencherDadosParaLogin() throws InterruptedException {
        try {

            ArrayList<Usuario> lista = pesquisaEmBancoDeDados.pesquisarDadosUsuarios();

            for (int i = 0; i < lista.size(); i++) {

                driver.get(ConstantesFordWardCar.URL_PAGINA_LOGIN);
                Thread.sleep(1000);
                driver.findElement(campoUsarnameLogin).sendKeys(lista.get(i).getUsername());
                Thread.sleep(1000);
                driver.findElement(campoPassowordLogin).sendKeys(lista.get(i).getPassword());
                Thread.sleep(1000);
                clicarBotaoSignIn();
                Thread.sleep(1000);
                if (url_esperada.equals(ConstantesFordWardCar.URL_PAGINA_INICIAL)) {
                    System.out.println(true);
                   break;
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public void clicarBotaoRegister() {
        this.driver.findElement(botaoRegisterLogin).click();
    }
    public void clicarBotaoGuest(WebDriver driver){
        driver.findElement(botaoGuest).click();
    }
    public void clicarBotaoRegisterGuest(){
        driver.findElement(botaoRegister).click();
    }
    public void clicarBotaoSignIn(){
        driver.findElement(botaoSignInPagLogin).click();
    }
    public void clicarCadeado(){driver.findElement(By.id("admin")).click();;}
    public void clicarAddaCar(){driver.findElement(botaoAddCar).click();}
    public void clicarPopulationFrom(){driver.findElement(BotaoPopulationFrom).click();}
    public void preencherCampoPrice(String price){this.driver.findElement(BotaoPrice).sendKeys(price);}
    public void preencherModelYear(String modelYear){this.driver.findElement(campoModelYear).sendKeys(modelYear);}
    public void apagarCampoPrice(){this.driver.findElement(BotaoPrice).clear();;}
    public void apagarModelYear(){this.driver.findElement(campoModelYear).clear();}
    public void clicarCreate(){this.driver.findElement(BotaoCreate).click();}
    public boolean acharBotaoCarCreatedNaTela() {
        return this.driver.findElement(MensagemCarCreated).isDisplayed();}
    public void DigitarCorEncontradanaTabela(String corAtual ) {
        WebElement coratual = driver.findElement(BotaoCampoSearch);
        coratual.clear();
        coratual.sendKeys(corAtual);
    }
    public void clicarBotaoOkViewsDetails() {
        this.driver.findElement(BotaoOkViewsDetaisls).click();
    }
    public void ClicarBotaoClear() {
        this.driver.findElement(BotaoClear).click();
    }
    public void ClicarBotaoViewsDetaisls(String corDigitada) throws InterruptedException {
        List<WebElement> campoViewDetaisls = driver.findElements(CampoCartaoCarro);
        int posicaoBotao;

        for (int i = 0; i < campoViewDetaisls.size(); i++) {
            posicaoBotao = i + 1;
            String botoesViewsDetails = BotaoViewsDetailsInicio + posicaoBotao + BotaoViewsDetailsFim;
            driver.findElement(By.xpath(botoesViewsDetails)).click();
            Thread.sleep(1000);
            String texto = driver.findElement(CampoCorViewsDetails).getText();
            Thread.sleep(1000);
            if (texto.equals(corDigitada)) {
                Thread.sleep(1000);
                clicarBotaoOkViewsDetails();
                System.out.println("true");
            } else {
                System.out.println("false");
                clicarBotaoOkViewsDetails();
            }
        }
    }

    public void digitarAnoDosCarros(String anoDigitado) {
        WebElement anodigitado = driver.findElement(BotaoCampoSearch);
        anodigitado.clear();
        anodigitado.sendKeys(anoDigitado);
    }
    public void pegarTextoDoCampoYear(String anoCarro) throws InterruptedException {
        List<WebElement> campoViewDetaisls = driver.findElements(CampoCartaoCarro);
        int posicaoBotao;

        for (int i = 0; i < campoViewDetaisls.size(); i++) {
            posicaoBotao = i + 1;
            String botoesViewsDetails = CampoYearTelaPesquisaInicio + posicaoBotao + CampoYearTelaPesquisaFim;
            String texto = driver.findElement(By.xpath(botoesViewsDetails)).getText();
            Thread.sleep(3000);
            if (texto.contains(anoCarro)) {
                Thread.sleep(3000);
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }

    }
    public void clicarLogout(){
        driver.findElement(botaoLogout).click();
    }
    public void buscaPelaCor() throws InterruptedException{
        try {
            ArrayList<Carro> lista = pesquisaEmBancoDeDados.pesquisaPorCor();

            for (int i = 0; i < lista.size(); i++) {

                DigitarCorEncontradanaTabela(lista.get(i).getCoresCarro());
                Thread.sleep(1000);
                ClicarBotaoViewsDetaisls(lista.get(i).getCoresCarro());
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void buscaPeloAno() throws InterruptedException{
        try {
            ArrayList<Carro> lista = pesquisaEmBancoDeDados.pesquisaPorAno();

            for (int i = 0; i < lista.size(); i++) {
                digitarAnoDosCarros(lista.get(i).getAnoCarro());
                Thread.sleep(3000);
                pegarTextoDoCampoYear(lista.get(i).getAnoCarro());

            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void cadastrarNovoVeiculo() throws InterruptedException{
        try {
            ArrayList<Carro> lista = pesquisaEmBancoDeDados.pesquisaCamposParaCadastarVeiculo();

            for (int i = 0; i < lista.size(); i++) {
                apagarCampoPrice();
                Thread.sleep(1000);
                preencherCampoPrice(lista.get(i).getCampoPrice());
                Thread.sleep(1000);
                apagarModelYear();
                preencherModelYear(lista.get(i).getModelYear());
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    }



