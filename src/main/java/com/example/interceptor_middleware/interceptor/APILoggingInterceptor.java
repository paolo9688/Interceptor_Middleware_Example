package com.example.interceptor_middleware.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component // Rende questo interceptor un bean gestito da Spring
public class APILoggingInterceptor implements HandlerInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(APILoggingInterceptor.class);

    /**
     * Metodo chiamato prima che la richiesta venga gestita dal controller.
     * Logga l'header "User-Agent" della richiesta.
     *
     * @param request  L'oggetto HttpServletRequest.
     * @param response L'oggetto HttpServletResponse.
     * @param handler  L'oggetto handler (di solito un metodo del controller).
     * @return true per continuare l'elaborazione della richiesta, false per interromperla.
     * @throws Exception In caso di errori.
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String userAgent = request.getHeader("User-Agent");
        logger.info("API Logging Interceptor: User-Agent = {}", userAgent != null ? userAgent : "N/A");
        return true; // Continua l'elaborazione della richiesta
    }

    /**
     * Metodo chiamato dopo che il controller ha gestito la richiesta ma prima che la vista sia renderizzata.
     *
     * @param request       L'oggetto HttpServletRequest.
     * @param response      L'oggetto HttpServletResponse.
     * @param handler       L'oggetto handler.
     * @param modelAndView  L'oggetto ModelAndView, che può essere modificato.
     * @throws Exception In caso di errori.
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        // Nessuna logica specifica qui per questo esercizio
    }

    /**
     * Metodo chiamato dopo che la richiesta è stata completamente processata, inclusa la renderizzazione della vista.
     * Questo metodo viene chiamato anche in caso di eccezione.
     *
     * @param request  L'oggetto HttpServletRequest.
     * @param response L'oggetto HttpServletResponse.
     * @param handler  L'oggetto handler.
     * @param ex       L'eccezione che si è verificata durante l'esecuzione della richiesta, o null se non c'è stata.
     * @throws Exception In caso di errori.
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        // Nessuna logica specifica qui per questo esercizio
    }
}