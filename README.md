# *Api para consumir Receitas*

### Exemplo de curl GET que pode ser usada para executar testes

```
curl --location 'http://localhost:8080/receitas/carrot' \
--header 'Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7' \
--header 'Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7' \
--header 'Cache-Control: max-age=0' \
--header 'Connection: keep-alive' \
--header 'Sec-Fetch-Dest: document' \
--header 'Sec-Fetch-Mode: navigate' \
--header 'Sec-Fetch-Site: none' \
--header 'Sec-Fetch-User: ?1' \
--header 'Upgrade-Insecure-Requests: 1' \
--header 'User-Agent: Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/130.0.0.0 Safari/537.36' \
--header 'sec-ch-ua: "Not?A_Brand";v="99", "Chromium";v="130"' \
--header 'sec-ch-ua-mobile: ?0' \
--header 'sec-ch-ua-platform: "Linux"'
```
