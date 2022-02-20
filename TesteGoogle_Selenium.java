import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteGoogle {
	
	@Test
    public void teste() {
		// System.setProperty("webdriver.gecko.driver", "caminho do drive.exe") - somente se o web drive não tivesse sido informado no SO
    	WebDriver driver = new FirefoxDriver(); // instancia do webdrive do firefox
		driver.get("http://www.google.com"); // pedir para a cessar o google atraves do get informando o site
    //System.out.println(driver.getTitle());  //pedindo para imprimir e informar o titulo da pagina
    	Assert.assertEquals("Google",driver.getTitle());  //validar se o titulo da pagina é o esperado - assert.true : verifica se a express;ao é verdadeira
    	                                                                               // assertEquals compara
	}
}
