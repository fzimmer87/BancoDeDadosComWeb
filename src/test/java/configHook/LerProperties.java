package utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class LerProperties {
    String baseUri;
    String register;
    String cadastrarVeiculo;
    String cadastrarUsuario;
    String paginaInventory;
    String
    private Properties prop = new Properties();


    public LerProperties() throws IOException {


        prop.load(Files.newInputStream(Paths.get("src/test/resources/propeties/dados.properties")));

        this.baseUri = prop.getProperty("baseURI");
        this.register = prop.getProperty("register");
        this.cadastrarVeiculo = prop.getProperty("cadastrarVeiculo");
        this.cadastrarUsuario=prop.getProperty("paginaLogin");
        this.paginaInventory = prop.getProperty("paginaInventory");

    }

    public String getBaseUri() {
        return this.baseUri;
    }

    public String getRegister() {
        return this.register;
    }

    public String getCadastrarVeiculo() {
        return this.cadastrarVeiculo;
    }

    public String getCadastrarUsuario() {
        return this.cadastrarUsuario;
    }
    public String getPaginaInventory() {return this.paginaInventory;}
}
