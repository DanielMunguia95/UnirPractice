package com.streamingUnir.Configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.streamingUnir.service.BitacoraService;
import com.streamingUnir.service.CategoriaService;
import com.streamingUnir.service.GeneroService;
import com.streamingUnir.service.MultimediaService;
@Configuration
public class SteamingConfiguration {
	
	@Bean
    public BitacoraService bitacoraBeen() {
        return new BitacoraService();
    }
	 @Bean
	    public MultimediaService multimediaBeen() {
	        return new MultimediaService();
	    }

	 @Bean
	    public CategoriaService categoriaBeen() {
	        return new CategoriaService();
	    }
	 @Bean
	    public GeneroService generoBeen() {
	        return new GeneroService();
	    }

	    @Bean
	    public ModelMapper modelMapperBean() {
	        return new ModelMapper();
	    }
}
