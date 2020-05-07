package cn.wm.community.provider;

import cn.wm.community.dto.AccessTokenDTO;
import cn.wm.community.dto.GithubUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.Arrays;

@Component
public class GithubProvider {

    @Autowired
    private RestTemplate restTemplate;

    public String getAccessToken(AccessTokenDTO accessTokenDTO) {

        String result = restTemplate.postForObject("https://github.com/login/oauth/access_token",
                                                        accessTokenDTO,
                                                        String.class);
        System.out.println(result);

        if (result != null){
            return result.split("&")[0].split("=")[1];
        }
        return null;
    }

    public GithubUser getUser(String accessToken) {
        System.out.println("===========================>"+accessToken);
        GithubUser githubUser = restTemplate.getForObject("https://api.github.com/user?access_token=" + accessToken, GithubUser.class);
        return githubUser;
    }
}
