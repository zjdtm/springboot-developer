package me.seoyonghyun.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.seoyonghyun.springbootdeveloper.domain.RefreshToken;
import me.seoyonghyun.springbootdeveloper.repository.RefreshTokenRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RefreshTokenService {

    private final RefreshTokenRepository refreshTokenRepository;

    public RefreshToken findByRefreshToken(String refreshToken) {
        return refreshTokenRepository.findByRefreshToken(refreshToken)
                .orElseThrow(() -> new IllegalArgumentException("Unexpected token"));
    }

}
