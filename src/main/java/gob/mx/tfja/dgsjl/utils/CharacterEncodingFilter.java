package gob.mx.tfja.dgsjl.utils;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Esta clase es para servlets que codifica la información enviada por un formulario
 * el filtro Character Encoding Filter declarado en el web.xml
 */
public class CharacterEncodingFilter implements Filter {

        public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
                req.setCharacterEncoding("UTF-8");
                resp.setCharacterEncoding("UTF-8");
                chain.doFilter(req, resp);
        }
        public void init(FilterConfig filterConfig) throws ServletException {
                
        }
        public void destroy() {
                
        }
}