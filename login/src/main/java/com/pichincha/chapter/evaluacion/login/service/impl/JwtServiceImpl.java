package com.pichincha.chapter.evaluacion.login.service.impl;

import com.pichincha.chapter.evaluacion.login.service.JwtService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;

@Service
public class JwtServiceImpl implements JwtService {

    private static final String SECRET_KEY="123445";

    public  String getToken(){
        return getToken(new HashMap<>(),null);
    }

    private  String getToken(HashMap<String,Object> extraCliams, Object o) {

        return Jwts.builder()
                .setClaims(extraCliams)
                .setSubject("user")
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis()+1000*60*30))
                .signWith(getKey(), SignatureAlgorithm.HS256)
                .compact();
    }

    private Key getKey(){
        byte[] keyBytes = Decoders.BASE64.decode(SECRET_KEY);
        return Keys.hmacShaKeyFor(keyBytes);
    }
}
