# ЭСФ

## Требования для разработки:
* Java 1.8
* Wildfly
* Postgres
* JBoss


## Инструкция для зупска проекта
### 1. Собираем war

### 2. Запускаем админку по адресу http://10.111.12.225:9990

### 3. Заходим в Runtime/Topology нажимаем на esf-node1 далее запускаем нужного дейстивие(start/restart/stop...)
*    Серверы отображаются в соответствии с их статусом
*    error - красный
*    needs reload / restart - оранжевый
*    suspended - синий
*    up and running - зеленый
*    stopped or disabled - серий

### 4. Для проверки успешного запука. 
*    Заходим в сервер (server: 10.111.12.225)
*    Провераем логи по `tail -f /opt/jboss/domain/servers/esf-node1/log/server.log` и ожидаем формиравание хеша

### 5. Для запуска проекта локально необходимо настроить standalone.xml: 
*    настроить datasource/esfDs на локальную базу