## Como Rodar

Baixe o driver do JDBC: https://downloads.mysql.com/archives/c-j/ (Platform Independent) e coloque o arquivo (ex. mysql-connector-j-8.2.0.jar) na raiz do projeto.

Garanta que o banco MySQL esteja rodando (Rode `docker-compose up` na raiz do projeto).

Inicialize o banco com o script:

```sh
mysql -h 127.0.0.1 -P 3306 -u root -pifsuldeminas < DAO/hospital.sql
```

Compile e rode:

```sh
javac -cp jsoup-1.11.3.jar **/*.java
java -cp .:./mysql-connector-j-8.2.0.jar view.TelaLoginView
```
