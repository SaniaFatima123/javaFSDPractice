package com.example.userms.util;

import com.example.userms.exception.InvalidTokenException;
import org.springframework.stereotype.Component;

@Component
public class TokenUtil {
    public String generateToken(String username){
        long currentTime = System.currentTimeMillis();
        long expiryTime = currentTime+(60*60*1000*2);
        String token = username+","+expiryTime;
        return token;
    }
    public String decodeToken(String token) throws InvalidTokenException {
        if(token==null || token.isEmpty()){
            throw new InvalidTokenException("Invalid Token");
        }
        String[] parts = token.split(",");
        if(parts.length<2){
            throw new InvalidTokenException("Invalid Token");
        }
        String username = parts[0];
        String expiry = parts[1];
        long expiryTime = Long.parseLong(expiry);
        long currentTime = System.currentTimeMillis();
        if(currentTime>expiryTime){
            throw new InvalidTokenException("Token Expired, Please Re-login");
        }
        return username;
    }
}
