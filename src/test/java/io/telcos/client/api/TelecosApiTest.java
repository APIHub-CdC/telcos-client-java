package io.telcos.client.api;

import io.telcos.client.ApiClient;
import io.telcos.interceptor.SignerInterceptor;
import io.telcos.client.ApiException;
import io.telcos.client.model.Errores;
import io.telcos.client.model.PersonaPeticion;
import io.telcos.client.model.Respuesta;
import io.telcos.client.model.CatalogoEstadoCivil;
import io.telcos.client.model.CatalogoEstados;
import io.telcos.client.model.CatalogoResidencia;
import io.telcos.client.model.CatalogoSexo;
import io.telcos.client.model.CatalogoTipoAsentamiento;
import io.telcos.client.model.CatalogoTipoDomicilio;
import io.telcos.client.model.DomicilioPeticion;
import okhttp3.OkHttpClient;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.Assert;
import org.junit.Before;

import java.util.concurrent.TimeUnit;


public class TelecosApiTest {

	private Logger logger = LoggerFactory.getLogger(TelecosApiTest.class.getName());

    private final TelecosApi api = new TelecosApi();
    private final SignerInterceptor interceptor = new SignerInterceptor();
	private ApiClient apiClient = null;

	@Before()
	public void setUp() {
		
		this.apiClient = api.getApiClient();
		this.apiClient.setBasePath("the_url");
    	OkHttpClient insecureClient = ApiClient.getClientNoSSLVerification();
    	OkHttpClient okHttpClient = insecureClient.newBuilder()
    			.readTimeout(60, TimeUnit.SECONDS)
    			.addInterceptor(interceptor)
    			.build();
    	apiClient.setHttpClient(okHttpClient);
	}

    @Test
    public void getReporteTest() throws ApiException {
		String xApiKey = "your_api_key";
		String username = "your_username";
		String password = "your_password";

        DomicilioPeticion domicilio = new DomicilioPeticion();
        domicilio.setDireccion(null);
        domicilio.setColonia(null);
        domicilio.setMunicipio(null);
        domicilio.setCiudad(null);
        domicilio.setEstado(CatalogoEstados.CDMX);
        domicilio.setCodigoPostal(null);
        domicilio.setFechaResidencia(null);
        domicilio.setNumeroTelefono(null);
        domicilio.setTipoDomicilio(CatalogoTipoDomicilio.C);
        domicilio.setTipoAsentamiento(CatalogoTipoAsentamiento._1);
        
        PersonaPeticion persona = new PersonaPeticion();
        persona.setPrimerNombre("NOMBRE");
        persona.setSegundoNombre(null);
        persona.setApellidoPaterno("APELLIDO");
        persona.setApellidoMaterno("MATERNO");
        persona.setApellidoAdicional(null);
        persona.setFechaNacimiento("31-12-1985");
        persona.setRfc(null);
        persona.setCurp(null);
        persona.setNumeroSeguridadSocial(null);
        persona.setNacionalidad("");
        persona.setResidencia(CatalogoResidencia._1);
        persona.setEstadoCivil(CatalogoEstadoCivil.D);
        persona.setSexo(CatalogoSexo.M);
        persona.setClaveElector("");
        persona.setNumeroDependientes("");
        persona.setFechaDefuncion("");
        persona.setDomicilio(domicilio);
        
		try {
	        Respuesta response = api.getReporte(xApiKey, username, password, persona);
	        logger.info(response.toString());
	        Assert.assertTrue(response != null);
		} catch (ApiException e) {
			Errores errores = interceptor.getErrores();
			logger.info(errores.getErrores().get(0).toString());
		}
    }
    
}
