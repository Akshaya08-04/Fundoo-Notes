# Spring Cloud Architecture for Fundoo Notes

Fundoo Notes can be extended into a microservices-based system.

## Services

- User Service
- Notes Service
- Reminder Service
- Notification Service
- API Gateway
- Eureka Service Discovery
- Config Server

## Flow

Client -> API Gateway -> Service Discovery -> Microservices -> Database

## Purpose

Spring Cloud helps with:
- Centralized configuration
- Service discovery
- API Gateway routing
- Scalability
- Microservice communication
