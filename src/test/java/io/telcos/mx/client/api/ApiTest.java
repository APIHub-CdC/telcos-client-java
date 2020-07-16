package io.telcos.mx.client.api;

import io.telcos.mx.client.model.CatalogoEstadoCivil;
import io.telcos.mx.client.model.CatalogoResidencia;
import io.telcos.mx.client.model.CatalogoSexo;
import io.telcos.mx.client.model.CatalogoEstados;
import io.telcos.mx.client.model.CatalogoTipoAsentamiento;
import io.telcos.mx.client.model.CatalogoTipoDomicilio;
import io.telcos.mx.client.model.DomicilioPeticion;
import io.telcos.mx.client.model.PersonaPeticion;
import io.telcos.mx.client.ApiClient;
import io.telcos.mx.client.ApiException;
import io.telcos.mx.client.model.Errores;
import io.telcos.mx.client.model.Peticion;
import io.telcos.mx.client.model.Respuesta;
import io.telcos.mx.interceptor.SignerInterceptor;
import okhttp3.OkHttpClient;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.Assert;
import org.junit.Before;
import java.util.concurrent.TimeUnit;

public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class.getName());

    private final TelcosApi api = new TelcosApi();
    private final SignerInterceptor interceptor = new SignerInterceptor();
    private ApiClient apiClient = null;

    private String xApiKey = "your_api_key";
    private String username = "your_username";
    private String password = "your_password";  
    
    @Before()
    public void setUp() {
        this.apiClient = api.getApiClient();
        this.apiClient.setBasePath("the_url");
        OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
                .readTimeout(30, TimeUnit.SECONDS)
                .addInterceptor(new SignerInterceptor())
                .build();
        apiClient.setHttpClient(okHttpClient);
    }

    @Test
    public void getReporteTest() throws ApiException {

        DomicilioPeticion domicilio = new DomicilioPeticion();
        domicilio.setDireccion(null);
        domicilio.setColoniaPoblacion(null);
        domicilio.setDelegacionMunicipio(null);
        domicilio.setCiudad(null);
        domicilio.setEstado(CatalogoEstados.CDMX);
        domicilio.setCP(null);
        domicilio.setFechaResidencia(null);
        domicilio.setNumeroTelefono(null);
        domicilio.setTipoDomicilio(CatalogoTipoDomicilio.C);
        domicilio.setTipoAsentamiento(CatalogoTipoAsentamiento._1);
        
        PersonaPeticion persona = new PersonaPeticion();
        persona.setPrimerNombre("NOMBRE");
        persona.setSegundoNombre(null);
        persona.setApellidoPaterno("PATERNO");
        persona.setApellidoMaterno("MATERNO");
        persona.setApellidoAdicional(null);
        persona.setFechaNacimiento("1986-06-27");
        persona.setRFC(null);
        persona.setCURP(null);
        persona.setNacionalidad(null);
        persona.setResidencia(CatalogoResidencia.NUMBER_1);
        persona.setEstadoCivil(CatalogoEstadoCivil.D);
        persona.setSexo(CatalogoSexo.M);
        persona.setClaveElectorIFE(null);
        persona.setNumeroDependientes(null);
        persona.setFechaDefuncion(null);
        persona.setDomicilio(domicilio);
        
        Peticion peticion = new Peticion();
        peticion.setFolioOtorgante("1234");
        peticion.setPersona(persona);
        
        try {
            Respuesta response = api.getReporte(xApiKey, username, password, peticion);
            logger.info(response.toString());
            Assert.assertTrue(response != null);
        } catch (ApiException e) {
            Errores errores = interceptor.getErrores();
            logger.info(errores.toString());
        }
    }
    
}
