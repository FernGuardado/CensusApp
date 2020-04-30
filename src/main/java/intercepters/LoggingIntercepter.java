package intercepters;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

public class LoggingIntercepter extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // get all cookies

        //log session id

        //log request path

        String sessionId = null;
        if(null==request.getCookies()){
            for(Cookie cookie : request.getCookies()){
                if("JSESSIONID".equals(cookie.getName())){
                    sessionId = cookie.getValue();
                }
            }
        }

        System.out.println("Income request data log " + sessionId +
                " at " + new Date() + " for " + request.getRequestURI());

        return true;

    }
}
