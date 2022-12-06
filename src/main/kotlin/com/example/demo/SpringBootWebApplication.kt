package com.example.demo
import org.apache.catalina.connector.Connector
import org.apache.coyote.http11.AbstractHttp11Protocol
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.web.embedded.tomcat.TomcatConnectorCustomizer
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory
import org.springframework.context.annotation.Bean


@SpringBootApplication
class SpringBootWebApplication {
    //private val maxUploadSizeInMb = 1000 * 1024 * 1024 // 10 MB

    @Bean
    fun containerFactory(): TomcatServletWebServerFactory? {
        return object : TomcatServletWebServerFactory() {
            override fun customizeConnector(connector: Connector) {
                val maxSize = 1
                super.customizeConnector(connector)
                connector.maxPostSize = maxSize
                connector.maxSavePostSize = maxSize
                if (connector.protocolHandler is AbstractHttp11Protocol<*>) {
                    (connector.protocolHandler as AbstractHttp11Protocol<*>).maxSwallowSize = maxSize
                    logger.info("Set MaxSwallowSize $maxSize")
                }
            }
        }
    }

    companion object {
        @Throws(Exception::class)
        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(SpringBootWebApplication::class.java, *args)
        }
    }
}


class TomcatEmbeddedServletContainerFactory {
    fun addConnectorCustomizers(tomcatConnectorCustomizer: Any) {
        TODO("Not yet implemented")
    }

}