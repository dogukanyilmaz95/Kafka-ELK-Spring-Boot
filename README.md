# OVERVIEW
Hi friends, this app helps you to make connection via your spring boot app and kafka with ELK

On this time only use kafka as producer because listener our is Logstash ;)

# HOW IT WORKS ?
On this part our teammate help you an installation with ELK.  
You can check repository below.

`https://github.com/mehmetoguzhanuzun/springboot-elk`


After this article you can follow steps below to integrate Kafta to front of this elk stack. 
## Kafka
`$ docker-compose -f docker-compose-kafka.yml up`

Kafka configuration on application.properties 

`spring.kafka.bootstrap-servers=localhost:9092
 spring.kafka.producer.value-serializer=org.apache.kafka.common.serialization.StringSerializer
 spring.kafka.producer.key-serializer=org.apache.kafka.common.serialization.StringSerializer
`

# TEST
Run on the terminal to make rest request, after that watch your log to visualize with kibana :)

`cUrl localhost:8080/api`

### Enjoy It ;)
