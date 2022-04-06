# Car Factory
*Producing Cars Everyday! - Developed by Kaan Erol*
## About
This factory project is producing cars depending given types from endpoints. 
Techs used in this project ;
- Java 11
- Spring Boot
- JUnit
- Maven

## Install
After downloading project folder, run maven update. After all configurations and downloads done by maven then you can use the project however you want.

## Usage
The project has an endpoint prefix which is "/v1". This can be changed in application.properties file. In this project we have an endpoint which allows us to produce car with type and we can use it with "/car/getType" path. This path requires "type" parameter. You can fill it with "cabrio","hatchback" or "sedan" values (otherwise a handled error will throw) then the car will be produced. For eazy usage there is a postman json file in project folder.