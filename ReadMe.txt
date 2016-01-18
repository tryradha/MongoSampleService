1. prerequisites
run mongo
if mongo is not running on local than chane dev-db.properties to approriate mongo host

Run Application
mvn clean package -DskipTests jetty:run -Dspring.profiles.active=dev -U -Djetty.port=8081

when service is up hit 
http://localhost:8081/sampleService?_wadl

check service is up or not 
http://localhost:8081/sampleService/echo

service.xml -> this is having service endpoint related info
mongo-dao.xml-> this is having mongo related info


